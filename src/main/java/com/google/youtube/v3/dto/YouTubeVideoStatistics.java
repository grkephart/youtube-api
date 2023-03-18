/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeVideoStatistics extends YouTubeStatistics
{
  private Integer likeCount;
  private Integer viewCount;

  /**
   * 
   */
  public YouTubeVideoStatistics()
  {
  }


  /**
   * @return the likeCount
   */
  public Integer getLikeCount()
  {
    return likeCount;
  }


  /**
   * @return the viewCount
   */
  public Integer getViewCount()
  {
    return viewCount;
  }


  /**
   * @param likeCount the likeCount to set
   */
  public void setLikeCount(
    Integer likeCount)
  {
    this.likeCount = likeCount;
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
