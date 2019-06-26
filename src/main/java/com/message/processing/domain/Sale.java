/**
 * 
 */
package com.message.processing.domain;

/**
 * Domain class for capturing sale of a product
 * @author Prachi Gupta
 *
 */
public class Sale
{
  private String productType;
  private double productValue;
  private int productCount;
  
  /**
   * Default Constructor
   */
  public Sale()
  {
    // TODO Auto-generated constructor stub
  }
  
  /**
   * Parameterized constructor
   * @param productType
   * @param productValue
   */
  public Sale(String productType, double productValue, int productCount)
  {
    this.productType = productType;
    this.productValue = productValue;
    this.productCount = productCount;
  }
  
  /**
   * @return the productType
   */
  public String getProductType()
  {
    return productType;
  }
  /**
   * @param productType the productType to set
   */
  public void setProductType(String productType)
  {
    this.productType = productType;
  }
  /**
   * @return the productValue
   */
  public double getProductValue()
  {
    return productValue;
  }
  /**
   * @param productValue the productValue to set
   */
  public void setProductValue(double productValue)
  {
    this.productValue = productValue;
  }

  /**
   * @return the productCount
   */
  public int getProductCount()
  {
    return productCount;
  }

  /**
   * @param productCount the productCount to set
   */
  public void setProductCount(int productCount)
  {
    this.productCount = productCount;
  }
  
  

}
