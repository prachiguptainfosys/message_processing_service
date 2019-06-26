/**
 * 
 */
package com.message.processing.domain;

/**
 * Base Class for MessageType
 * @author Prachi Gupta
 *
 */
public class MessageType
{
  
  private String productType;
  
  private double singleProductValue;
  /**
   * @param productType
   * @param singleProductValue
   */
  public MessageType(String productType, double singleProductValue)
  {
    this.productType = productType;
    this.singleProductValue = singleProductValue;
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
   * @return the singleProductValue
   */
  public double getSingleProductValue()
  {
    return singleProductValue;
  }

  /**
   * @param singleProductValue the singleProductValue to set
   */
  public void setSingleProductValue(double singleProductValue)
  {
    this.singleProductValue = singleProductValue;
  }
}
