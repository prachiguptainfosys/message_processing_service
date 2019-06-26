/**
 * 
 */
package com.message.processing.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Prachi Gupta
 *
 */
public class MessageType1Test
{

   /**
   * Test method for {@link com.message.processing.domain.MessageType1#MessageType1(java.lang.String, double)}.
   */
  @Test
  public void testMessageType1()
  {
    MessageType1 testMessageType =  new MessageType1("testProductType", 20.0);
    assertNotNull("Message Type object is null", testMessageType);
    assertEquals("Product Type is not set properly ", "testProductType", testMessageType.getProductType());
    assertEquals("Single Product Value is not set properly ", 20.0, testMessageType.getSingleProductValue(), 0);
  }

}
