package com.message.processing.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MessageType2Test
{

  @Before
  public void setUp() throws Exception
  {
  }

  @Test
  public void testMessageType2()
  {
    MessageType2 testMessageType =  new MessageType2("testProductType", 20.0, 10);
    assertNotNull("Message Type object is null", testMessageType);
    assertEquals("Product Type is not set properly ", "testProductType", testMessageType.getProductType());
    assertEquals("Single Product Value is not set properly ", 20.0, testMessageType.getSingleProductValue(), 0);
    assertEquals("number of occurences is not set properly", 10, testMessageType.getNoOfOccurences());
  }

  @Test
  public void testGetNoOfOccurences()
  {
    MessageType2 testMessageType =  new MessageType2("testProductType", 20.0, 10);
    assertEquals("number of occurences is not set properly from constructor", 10, testMessageType.getNoOfOccurences());
  }

  @Test
  public void testSetNoOfOccurences()
  {
    MessageType2 testMessageType =  new MessageType2("testProductType", 20.0, 10);
    testMessageType.setNoOfOccurences(30);
    assertEquals("number of occurences is not set properly from setter", 30, testMessageType.getNoOfOccurences());
    
  }

}
