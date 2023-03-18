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
   * @param viewCount the viewCount to set
   */
  public void setViewCount(
    Integer viewCount)
  {
    this.viewCount = viewCount;
  }

}
