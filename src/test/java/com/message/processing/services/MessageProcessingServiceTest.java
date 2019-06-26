package com.message.processing.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.message.processing.domain.MessageType1;
import com.message.processing.domain.MessageType2;
import com.message.processing.domain.MessageType3;
import com.message.processing.enums.OperationType;

public class MessageProcessingServiceTest
{

  MessageProcessingService msgProcessingService = new MessageProcessingService();
  @Before
  public void setUp() throws Exception
  {
  }

  @Test
  public void testProcessMessage()
  { 
    
    MessageType1 testMessageType1 =  new MessageType1("testProductType1", 20.0);
    msgProcessingService.processMessage(testMessageType1);
    assertTrue(SaleRecorderService.productTypeSaleMap.containsKey("testProductType1"));
    
    MessageType2 testMessageType2=  new MessageType2("testProductType2", 20.0, 10);
   
    msgProcessingService.processMessage(testMessageType2);
    assertTrue(SaleRecorderService.productTypeSaleMap.containsKey("testProductType2"));
    
    MessageType3 testMessageType3 =  new MessageType3("testProductType2", OperationType.ADD, 10);
    msgProcessingService.processMessage(testMessageType3);
    assertTrue(SaleRecorderService.productTypeSaleMap.containsKey("testProductType2"));
    
  }

  @Test
  public void testProcessMessageType1()
  {
    MessageType1 testMessageType1 =  new MessageType1("testProductType1", 20.0);
    msgProcessingService.processMessage(testMessageType1);
    assertTrue(SaleRecorderService.productTypeSaleMap.containsKey("testProductType1"));
  }

  @Test
  public void testProcessMessageType3()
  {
    MessageType2 testMessageType2=  new MessageType2("testProductType2", 20.0, 10);
    
    msgProcessingService.processMessage(testMessageType2);
    
    MessageType3 testMessageType3 =  new MessageType3("testProductType2", OperationType.ADD, 10);
    msgProcessingService.processMessage(testMessageType3);
    assertTrue(SaleRecorderService.productTypeSaleMap.containsKey("testProductType2"));
  }

  @Test
  public void testProcessMessageType2()
  {
    MessageType2 testMessageType2=  new MessageType2("testProductType2", 20.0, 10);
    
    msgProcessingService.processMessage(testMessageType2);
    assertTrue(SaleRecorderService.productTypeSaleMap.containsKey("testProductType2"));
  }

  @Test
  public void testProcessCount()
  {
    MessageProcessingService msgProcessingService = new MessageProcessingService();
    assertTrue(msgProcessingService.processCount());
    assertEquals("counter is not set properly", 1, MessageProcessingService.counter );
    
  }


}
