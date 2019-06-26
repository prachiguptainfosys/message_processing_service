/**
 * 
 */
package com.message.processing.domain;

import com.message.processing.enums.OperationType;

/**
 * Class to hold message type for performing operations
 * @author Prachi Gupta
 *
 */
public class MessageType3 extends MessageType
{
  private OperationType operationType;
  private double operationValue;

  public MessageType3(String productType, OperationType operationType, double operationValue)
  {
    super(productType, 0.0);
    this.operationType = operationType;
    this.operationValue = operationValue;
  }

  /**
   * @return the operationType
   */
  public OperationType getOperationType()
  {
    return operationType;
  }

  /**
   * @param operationType
   *          the operationType to set
   */
  public void setOperationType(OperationType operationType)
  {
    this.operationType = operationType;
  }

  /**
   * @return the operationValue
   */
  public double getOperationValue()
  {
    return operationValue;
  }

  /**
   * @param operationValue
   *          the operationValue to set
   */
  public void setOperationValue(double operationValue)
  {
    this.operationValue = operationValue;
  }

}
