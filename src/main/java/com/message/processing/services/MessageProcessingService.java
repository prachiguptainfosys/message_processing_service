/**
 * 
 */
package com.message.processing.services;

import java.util.ArrayList;
import java.util.List;

import com.message.processing.domain.MessageType;
import com.message.processing.domain.MessageType1;
import com.message.processing.domain.MessageType2;
import com.message.processing.domain.MessageType3;
import com.message.processing.domain.Sale;

/**
 * Service to handle processing of messages
 * @author Prachi Gupta
 *
 */
public class MessageProcessingService
{

  public static int counter = 0;
  private static List<String> adjustmentLogsList = new ArrayList<String>();

  /**
   * method to process messages
   * @param message
   */
  public void processMessage(MessageType message)
  {
    if(processCount())
    {
      if (message instanceof MessageType1)
      {
        processMessageType1(message);
      }
      else if (message instanceof MessageType2)
      {
        processMessageType2(message);
      }
      else if (message instanceof MessageType3)
      {
        processMessageType3(message);
      }
    }
    
  }

  /**
   * @param message
   */
  public void processMessageType1(MessageType message)
  {
    Sale sale = new Sale(message.getProductType(), message.getSingleProductValue(), 1);
    SaleRecorderService.recordSales(sale);
  }

  /**
   * @param message
   */
  public void processMessageType3(MessageType message)
  {
    MessageType3 details = (MessageType3) message;
    adjustmentLogsList.add("Adjustment of " + details.getOperationValue() + " made for product "
        + details.getProductType() + " with an operation of " + details.getOperationType());
    SaleRecorderService.adjustSales(details.getProductType(), details.getOperationType(),
        details.getOperationValue());
  }

  /**
   * @param message
   */
  public void processMessageType2(MessageType message)
  {
    MessageType2 details = (MessageType2) message;
    double totalValue = details.getSingleProductValue() * details.getNoOfOccurences();
    Sale saleType2 = new Sale(message.getProductType(), totalValue, details.getNoOfOccurences());
    SaleRecorderService.recordSales(saleType2);
  }

  /**
   * Process the count of messages 
   * @return
   */
  public boolean processCount()
  {    
    if (counter % 10 == 0 && counter < 50)
    {
      displayNumberOfSales();
    }
    if (counter >= 50)
    {
      stopProcessingMessages();
      return false;
    }
    counter++;
    return true;
  }

  /**
   * method to stop processing messages and display all the adjustments 
   */
  private void stopProcessingMessages()
  {
    System.out.println("Application is being paused");
    displayAllAdjustments();

  }

  /**
   * method to display all adjustments
   */
  private void displayAllAdjustments()
  {
    System.out.println("---------------All the adjustments made till now------------");
    adjustmentLogsList.forEach(System.out::println);
  }

  /**
   * display total sales
   */
  public static void displayNumberOfSales()
  {
    SaleRecorderService.productTypeSaleMap.forEach((productType, sale) -> {
      System.out.println(
          "Item : " + productType + " Count : " + sale.getProductCount() + " value : " + sale.getProductValue());
    });
  }

}
