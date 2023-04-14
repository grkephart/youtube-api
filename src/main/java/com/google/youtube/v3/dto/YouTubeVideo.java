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
}
