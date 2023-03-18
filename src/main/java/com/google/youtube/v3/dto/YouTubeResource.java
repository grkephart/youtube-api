/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeResource<CD extends YouTubeContentDetails, S extends YouTubeSnippet>
{
  private CD contentDetails;
  private S  snippet;

  /**
   * @return the contentDetails
   */
  public CD getContentDetails()
  {
    return contentDetails;
  }


  /**
   * @return
   */
  public S getSnippet()
  {
    return this.snippet;
  }


  /**
   * @param contentDetails the contentDetails to set
   */
  public void setContentDetails(
    CD contentDetails)
  {
    this.contentDetails = contentDetails;
  }


  /**
   * @param snippet the snippet to set
   */
  public void setSnippet(
    S snippet)
  {
    this.snippet = snippet;
  }
}
