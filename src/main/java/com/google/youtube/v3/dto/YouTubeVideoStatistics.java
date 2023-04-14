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
  private Integer commentCount;
  private Integer likeCount;
  private Integer viewCount;

  /**
   * 
   */
  public YouTubeVideoStatistics()
  {
  }


  /**
   * @return the commentCount
   */
  public Integer getCommentCount()
  {
    return commentCount;
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
   * @param commentCount the commentCount to set
   */
  public void setCommentCount(
    Integer commentCount)
  {
    this.commentCount = commentCount;
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
