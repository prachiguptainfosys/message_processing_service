/**
 * 
 */
package com.message.processing;

import com.message.processing.domain.MessageType1;
import com.message.processing.domain.MessageType2;
import com.message.processing.domain.MessageType3;
import com.message.processing.enums.OperationType;
import com.message.processing.services.MessageProcessingService;

/**
 * Main Class for Message Processing Application
 * @author Prachi Gupta
 *
 */
public class MessageProcessingApplication
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    MessageType2 msg = new MessageType2("apples", 10, 2);
    MessageProcessingService msgProcessingService = new MessageProcessingService();
    msgProcessingService.processMessage(msg);
    
    MessageType1 msgType = new MessageType1("bags",20);
    msgProcessingService.processMessage(msgType);
    
    MessageType1 msgType1 = new MessageType1("bags",40);
    msgProcessingService.processMessage(msgType1);    
    
    MessageType3 msgType3 = new MessageType3("bags", OperationType.ADD, 20); 
    MessageType2 msgType2 = new MessageType2("apples", 20, 2);
    msgProcessingService.processMessage(msgType2); 
    msgProcessingService.processMessage(msgType3); 
    MessageType1 msgType6 = new MessageType1("abc",20);
    msgProcessingService.processMessage(msgType6); 
  }

}
