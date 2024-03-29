/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeVideo extends YouTubeResource<YouTubeVideoSnippet>
{
  private YouTubeVideoContentDetails contentDetails;
  private String                     id;
  private YouTubeVideoStatistics     statistics;
  private YouTubeVideoStatus         status;

  public YouTubeVideo()
  {
  }


  public YouTubeVideo(String id)
  {
    this.id = id;
  }


  /**
   * @return the contentDetails
   */
  public YouTubeVideoContentDetails getContentDetails()
  {
    return contentDetails;
  }


  /**
   * @return the id
   */
  public String getId()
  {
    return id;
  }


  /**
   * @return the statistics
   */
  public YouTubeVideoStatistics getStatistics()
  {
    return statistics;
  }


  /**
   * @return the status
   */
  public YouTubeVideoStatus getStatus()
  {
    return status;
  }


  /**
   * @param contentDetails the contentDetails to set
   */
  public void setContentDetails(
    YouTubeVideoContentDetails contentDetails)
  {
    this.contentDetails = contentDetails;
  }


  /**
   * @param id the id to set
   */
  public void setId(
    String id)
  {
    this.id = id;
  }


  /**
   * @param statistics the statistics to set
   */
  public void setStatistics(
    YouTubeVideoStatistics statistics)
  {
    this.statistics = statistics;
  }


  /**
   * @param status the status to set
   */
  public void setStatus(
    YouTubeVideoStatus status)
  {
    this.status = status;
  }
}
