/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeVideoStatus
{
  private String embeddable;
  private String privacyStatus;

  /**
   * @return the embeddable
   */
  public String getEmbeddable()
  {
    return embeddable;
  }


  /**
   * @return the privacyStatus
   */
  public String getPrivacyStatus()
  {
    return privacyStatus;
  }


  /**
   * @param embeddable the embeddable to set
   */
  public void setEmbeddable(
    String embeddable)
  {
    this.embeddable = embeddable;
  }


  /**
   * @param privacyStatus the privacyStatus to set
   */
  public void setPrivacyStatus(
    String privacyStatus)
  {
    this.privacyStatus = privacyStatus;
  }

}
