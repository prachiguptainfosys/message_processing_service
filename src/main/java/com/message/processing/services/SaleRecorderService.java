/**
 * 
 */
package com.message.processing.services;

import java.util.HashMap;
import java.util.Map;

import com.message.processing.domain.Sale;
import com.message.processing.enums.OperationType;

/**
 * Service to Record the sales
 * 
 * @author Prachi Gupta
 *
 */
public class SaleRecorderService
{
  static Map<String, Sale> productTypeSaleMap = new HashMap<String, Sale>();

  /**
   * Method to record sales
   * 
   * @param sale
   */
  public static void recordSales(Sale sale)
  {
    if(null!=sale)
    {
      if (productTypeSaleMap.containsKey(sale.getProductType()))
      {
        Sale existingSale = productTypeSaleMap.get(sale.getProductType());
        int productCount = existingSale.getProductCount() + sale.getProductCount();
        double productValue = existingSale.getProductValue() + sale.getProductValue();
        Sale newSale = new Sale(sale.getProductType(), productValue, productCount);
        productTypeSaleMap.put(sale.getProductType(), newSale);
      }
      else
      {
        productTypeSaleMap.put(sale.getProductType(), sale);
      }
    }
    
  }

  /**
   * Method to perform Adjustment in Sales
   * @param productType
   * @param operation
   * @param operationValue
   */
  public static void adjustSales(String productType, OperationType operation, double operationValue)
  {
    Sale existingSale = productTypeSaleMap.get(productType);
    if(null!=existingSale)
    {
      double finalSale =existingSale.getProductValue();
      double adjustmentValue = operationValue * existingSale.getProductCount();
      switch (operation)
      {
        case ADD:
          finalSale = finalSale+adjustmentValue;
          break;
        case SUBTRACT:        
          finalSale = finalSale-adjustmentValue;
          break;        
        case MULTIPLY:
          finalSale = finalSale*adjustmentValue;
          break;
        default:
          break;
      }
      existingSale.setProductValue(finalSale);
      productTypeSaleMap.put(productType, existingSale);
    }
    
  }

 
}
