package com.message.processing.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SaleTest
{

  @Before
  public void setUp() throws Exception
  {
  }

  @Test
  public void testSale()
  {
    Sale testSale = new Sale("testSaleType", 20.0,4);
    assertNotNull("Sale Type object is null", testSale);
    assertEquals("Sale Type is not set properly ", "testSaleType", testSale.getProductType());
    assertEquals("Product Value is not set properly ", 20.0, testSale.getProductValue(), 0);
    assertEquals("Product Count is not set properly ", 4, testSale.getProductCount());
  }

  @Test
  public void testGetProductType()
  {
    Sale testSale = new Sale("testSaleType", 20.0,4);
    assertEquals("Sale Type is not set properly ", "testSaleType", testSale.getProductType());
  }

  @Test
  public void testSetProductType()
  {
    Sale testSale = new Sale("testSaleType", 20.0,4);
    testSale.setProductType("new sale product type");
    assertEquals("Sale Type is not set properly ", "new sale product type", testSale.getProductType());
  }

  @Test
  public void testGetProductValue()
  {
    Sale testSale = new Sale("testSaleType", 20.0,4);
    assertEquals("Product Value is not set properly ", 20.0, testSale.getProductValue(), 0);
  }

  @Test
  public void testSetProductValue()
  {
    Sale testSale = new Sale("testSaleType", 20.0,4);
    testSale.setProductValue(40.0);
    assertEquals("Product Value is not set properly ", 40.0, testSale.getProductValue(), 0);
  }

  @Test
  public void testGetProductCount()
  {
    Sale testSale = new Sale("testSaleType", 20.0,4);
    assertEquals("Product Count is not set properly ", 4, testSale.getProductCount());
  }

  @Test
  public void testSetProductCount()
  {
    Sale testSale = new Sale("testSaleType", 20.0,4);
    testSale.setProductCount(6);
    assertEquals("Product Count is not set properly ", 6, testSale.getProductCount());
    
  }

}
