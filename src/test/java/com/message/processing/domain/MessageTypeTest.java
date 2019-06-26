/**
 * 
 */
package com.message.processing.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vw659d
 *
 */
public class MessageTypeTest
{

  private MessageType testMessageType;
  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception
  {
    testMessageType = new MessageType("testProductType", 20.0);
  }

   /**
   * Test method for {@link com.message.processing.domain.MessageType#getProductType()}.
   */
  @Test
  public void testGetProductType()
  {
    assertEquals("@GetProductType is not working properly", "testProductType", testMessageType.getProductType());
  }

  /**
   * Test method for {@link com.message.processing.domain.MessageType#setProductType(java.lang.String)}.
   */
  @Test
  public void testSetProductType()
  {
    testMessageType.setProductType("changedTestProductType");
    assertEquals("Product Type is not set properly", "changedTestProductType", testMessageType.getProductType());
  }

  /**
   * Test method for {@link com.message.processing.domain.MessageType#getSingleProductValue()}.
   */
  @Test
  public void testGetSingleProductValue()
  {
    assertEquals("@GetSingleProductValue is not set properly", 20.0, testMessageType.getSingleProductValue(),0);
  }

  /**
   * Test method for {@link com.message.processing.domain.MessageType#setSingleProductValue(double)}.
   */
  @Test
  public void testSetSingleProductValue()
  {
    testMessageType.setSingleProductValue(30.0);
    assertEquals("Product Value is not set properly", 30.0, testMessageType.getSingleProductValue(),0);
  }

}
