/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeCommentThreadSnippet extends YouTubeSnippet
{
  private Boolean        canReply;
  private String         channelId;
  private Boolean        isPublic;
  private YouTubeComment topLevelComment;
  private Integer        totalReplyCount;
  private String         videoId;

  /**
   * @return the canReply
   */
  public Boolean getCanReply()
  {
    return canReply;
  }


  /**
   * @return the channelId
   */
  public String getChannelId()
  {
    return channelId;
  }


  /**
   * @return the isPublic
   */
  public Boolean getIsPublic()
  {
    return isPublic;
  }


  /**
   * @return the topLevelComment
   */
  public YouTubeComment getTopLevelComment()
  {
    return topLevelComment;
  }


  /**
   * @return the totalReplyCount
   */
  public Integer getTotalReplyCount()
  {
    return totalReplyCount;
  }


  /**
   * @return the videoId
   */
  public String getVideoId()
  {
    return videoId;
  }


  /**
   * @param canReply the canReply to set
   */
  public void setCanReply(
    Boolean canReply)
  {
    this.canReply = canReply;
  }


  /**
   * @param channelId the channelId to set
   */
  public void setChannelId(
    String channelId)
  {
    this.channelId = channelId;
  }


  /**
   * @param isPublic the isPublic to set
   */
  public void setIsPublic(
    Boolean isPublic)
  {
    this.isPublic = isPublic;
  }


  /**
   * @param topLevelComment the topLevelComment to set
   */
  public void setTopLevelComment(
    YouTubeComment topLevelComment)
  {
    this.topLevelComment = topLevelComment;
  }


  /**
   * @param totalReplyCount the totalReplyCount to set
   */
  public void setTotalReplyCount(
    Integer totalReplyCount)
  {
    this.totalReplyCount = totalReplyCount;
  }


  /**
   * @param videoId the videoId to set
   */
  public void setVideoId(
    String videoId)
  {
    this.videoId = videoId;
  }
}
