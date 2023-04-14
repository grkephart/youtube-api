/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeChannel extends YouTubeResource<YouTubeChannelSnippet>
{
  YouTubeChannelContentDetails     contentDetails;
  private String                   id;
  private String                   kind;
  private YouTubeChannelStatistics statistics;

  /**
   * @return the contentDetails
   */
  public YouTubeChannelContentDetails getContentDetails()
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
   * @return the kind
   */
  public String getKind()
  {
    return kind;
  }


  /**
   * @return the statistics
   */
  public YouTubeChannelStatistics getStatistics()
  {
    return statistics;
  }


  /**
   * @param contentDetails the contentDetails to set
   */
  public void setContentDetails(
    YouTubeChannelContentDetails contentDetails)
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
   * @param kind the kind to set
   */
  public void setKind(
    String kind)
  {
    this.kind = kind;
  }


  /**
   * @param statistics the statistics to set
   */
  public void setStatistics(
    YouTubeChannelStatistics statistics)
  {
    this.statistics = statistics;
  }

}
