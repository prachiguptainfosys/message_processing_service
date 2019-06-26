/**
 * 
 */
package com.message.processing.domain;

/**
 * Class to hold message type 2 
 * @author Prachi Gupta
 *
 */
public class MessageType2 extends MessageType
{
  

  private int noOfOccurences;
  
  public MessageType2(String productType, double singleProductValue, int noOfOccurences)
  {
    super(productType, singleProductValue);
    this.noOfOccurences = noOfOccurences;
    // TODO Auto-generated constructor stub
  }

  /**
   * @return the noOfOccurences
   */
  public int getNoOfOccurences()
  {
    return noOfOccurences;
  }


  /**
   * @param noOfOccurences the noOfOccurences to set
   */
  public void setNoOfOccurences(int noOfOccurences)
  {
    this.noOfOccurences = noOfOccurences;
  }
}
