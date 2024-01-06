/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeChannelStatistics extends YouTubeStatistics
{
  private Integer subscriberCount;
  private Integer videoCount;
  private Integer viewCount;

  /**
   * 
   */
  public YouTubeChannelStatistics()
  {
  }


  /**
   * @return the subscriberCount
   */
  public Integer getSubscriberCount()
  {
    return subscriberCount;
  }


  /**
   * @return the videoCount
   */
  public Integer getVideoCount()
  {
    return videoCount;
  }


  /**
   * @return the viewCount
   */
  public Integer getViewCount()
  {
    return viewCount;
  }


  /**
   * @param subscriberCount the subscriberCount to set
   */
  public void setSubscriberCount(
    Integer likeCount)
  {
    this.subscriberCount = likeCount;
  }


  /**
   * @param videoCount the videoCount to set
   */
  public void setVideoCount(
    Integer videoCount)
  {
    this.videoCount = videoCount;
  }


  /**
   * @param viewCount the viewCount to set
   */
  public void setViewCount(
    Integer viewCount)
  {
    this.viewCount = viewCount;
  }

}
