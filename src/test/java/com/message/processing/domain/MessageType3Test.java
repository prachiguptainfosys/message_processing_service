package com.message.processing.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.message.processing.enums.OperationType;

public class MessageType3Test
{

  @Before
  public void setUp() throws Exception
  {
  }

  @Test
  public void testMessageType3()
  {
    MessageType3 testMessageType =  new MessageType3("testProductType", OperationType.ADD, 10);
    assertNotNull("Message Type object is null", testMessageType);
    assertEquals("Product Type is not set properly ", "testProductType", testMessageType.getProductType());
    assertEquals("Single Product Value is not set properly ", 0.0, testMessageType.getSingleProductValue(), 0);
    assertEquals("operation type is not set properly", OperationType.ADD, testMessageType.getOperationType());
    assertEquals("operation value is not set properly", 10, testMessageType.getOperationValue(), 0);
  }

  @Test
  public void testGetOperationType()
  {
    MessageType3 testMessageType =  new MessageType3("testProductType", OperationType.ADD, 10);
    assertEquals("operation type is not set properly with constructor", OperationType.ADD, testMessageType.getOperationType());
  }

  @Test
  public void testSetOperationType()
  {
    MessageType3 testMessageType =  new MessageType3("testProductType", OperationType.ADD, 10);
    testMessageType.setOperationType(OperationType.MULTIPLY);
    assertEquals("operation type is not set properly", OperationType.MULTIPLY, testMessageType.getOperationType());
  }

  @Test
  public void testGetOperationValue()
  {
    MessageType3 testMessageType =  new MessageType3("testProductType", OperationType.ADD, 10);
    assertEquals("operation value is not set properly with constructor", 10, testMessageType.getOperationValue(), 0);
  }

  @Test
  public void testSetOperationValue()
  {
    MessageType3 testMessageType =  new MessageType3("testProductType", OperationType.ADD, 10);
    testMessageType.setOperationValue(20);
    assertEquals("operation type is not set properly",20, testMessageType.getOperationValue(), 0);
  }

}
