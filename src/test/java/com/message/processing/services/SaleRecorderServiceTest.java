package com.message.processing.services;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.message.processing.domain.Sale;
import com.message.processing.enums.OperationType;

/**
 * Test class for SaleRecorderService
 * @author Prachi Gupta
 *
 */
public class SaleRecorderServiceTest
{

  @Before
  public void setUp() throws Exception
  {
    SaleRecorderService.productTypeSaleMap = new HashMap<String, Sale>();
  }

  @Test
  public void testRecordSales()
  {
    Sale testSale = new Sale("test", 20.0, 4);
    SaleRecorderService.recordSales(testSale);
    assertNotNull(SaleRecorderService.productTypeSaleMap);
    assertEquals("sales is not recorded successfully", testSale, 
        SaleRecorderService.productTypeSaleMap.get("test"));
    Sale secondTestSale = new Sale("test", 60.0, 5);
    SaleRecorderService.recordSales(secondTestSale);
    Sale expectedSale = new Sale("test", 80.0, 9);
    assertEquals("sales is not updated successfully", expectedSale.getProductValue(), 
        SaleRecorderService.productTypeSaleMap.get("test").getProductValue(),0);
    SaleRecorderService.recordSales(null);
    assertEquals("Null Sale is not handled properly ", 1, SaleRecorderService.productTypeSaleMap.size());
  }

  @Test
  public void testAdjustSales()
  {
    SaleRecorderService.productTypeSaleMap.put("test", new Sale("test", 40.0, 8));
    SaleRecorderService.adjustSales("test", OperationType.ADD, 10);
    
    assertEquals("sales is not adjusted successfully after add", 120.0, 
        SaleRecorderService.productTypeSaleMap.get("test").getProductValue(),0);
    
    SaleRecorderService.adjustSales("test", OperationType.SUBTRACT, 5);
    assertEquals("sales is not adjusted successfully after subtract", 80.0, 
        SaleRecorderService.productTypeSaleMap.get("test").getProductValue(),0);
    
    SaleRecorderService.adjustSales("test", OperationType.MULTIPLY, 2);
    assertEquals("sales is not adjusted successfully after multiply", 1280.0, 
        SaleRecorderService.productTypeSaleMap.get("test").getProductValue(),0);
    
  }

}
