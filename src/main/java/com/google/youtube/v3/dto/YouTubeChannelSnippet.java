/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeChannelSnippet extends YouTubeSnippet
{
  private String customUrl;

  /**
   * @return the customUrl
   */
  public String getCustomUrl()
  {
    return customUrl;
  }


  /**
   * @param customUrl the customUrl to set
   */
  public void setCustomUrl(
    String customUrl)
  {
    this.customUrl = customUrl;
  }

}
