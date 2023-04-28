/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeCommentSnippet extends YouTubeSnippet
{
  private YouTubeCommentAuthorChannelId authorChannelId;
  private String                        authorChannelUrl;
  private String                        authorDisplayName;
  private String                        authorProfileImageUrl;
  private Boolean                       canRate;
  private String                        channelId;
  private Integer                       likeCount;
  private String                        moderationStatus;
  private String                        parentId;
  private String                        textDisplay;
  private String                        textOriginal;
  private String                        updatedAt;
  private String                        videoId;
  private String                        viewerRating;

  /**
   * @return the authorChannelId
   */
  public YouTubeCommentAuthorChannelId getAuthorChannelId()
  {
    return authorChannelId;
  }


  /**
   * @return the authorChannelUrl
   */
  public String getAuthorChannelUrl()
  {
    return authorChannelUrl;
  }


  /**
   * @return the authorDisplayName
   */
  public String getAuthorDisplayName()
  {
    return authorDisplayName;
  }


  /**
   * @return the authorProfileImageUrl
   */
  public String getAuthorProfileImageUrl()
  {
    return authorProfileImageUrl;
  }


  /**
   * @return the canRate
   */
  public Boolean getCanRate()
  {
    return canRate;
  }


  /**
   * @return the channelId
   */
  public String getChannelId()
  {
    return channelId;
  }


  /**
   * @return the likeCount
   */
  public Integer getLikeCount()
  {
    return likeCount;
  }


  /**
   * @return the moderationStatus
   */
  public String getModerationStatus()
  {
    return moderationStatus;
  }


  /**
   * @return the parentId
   */
  public String getParentId()
  {
    return parentId;
  }


  /**
   * @return the textDisplay
   */
  public String getTextDisplay()
  {
    return textDisplay;
  }


  /**
   * @return the textOriginal
   */
  public String getTextOriginal()
  {
    return textOriginal;
  }


  /**
   * @return the updatedAt
   */
  public String getUpdatedAt()
  {
    return updatedAt;
  }


  /**
   * @return the videoId
   */
  public String getVideoId()
  {
    return videoId;
  }


  /**
   * @return the viewerRating
   */
  public String getViewerRating()
  {
    return viewerRating;
  }


  /**
   * @param authorChannelId the authorChannelId to set
   */
  public void setAuthorChannelId(
    YouTubeCommentAuthorChannelId authorChannelId)
  {
    this.authorChannelId = authorChannelId;
  }


  /**
   * @param authorChannelUrl the authorChannelUrl to set
   */
  public void setAuthorChannelUrl(
    String authorChannelUrl)
  {
    this.authorChannelUrl = authorChannelUrl;
  }


  /**
   * @param authorDisplayName the authorDisplayName to set
   */
  public void setAuthorDisplayName(
    String authorDisplayName)
  {
    this.authorDisplayName = authorDisplayName;
  }


  /**
   * @param authorProfileImageUrl the authorProfileImageUrl to set
   */
  public void setAuthorProfileImageUrl(
    String authorProfileImageUrl)
  {
    this.authorProfileImageUrl = authorProfileImageUrl;
  }


  /**
   * @param canRate the canRate to set
   */
  public void setCanRate(
    Boolean canRate)
  {
    this.canRate = canRate;
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
   * @param likeCount the likeCount to set
   */
  public void setLikeCount(
    Integer likeCount)
  {
    this.likeCount = likeCount;
  }


  /**
   * @param moderationStatus the moderationStatus to set
   */
  public void setModerationStatus(
    String moderationStatus)
  {
    this.moderationStatus = moderationStatus;
  }


  /**
   * @param parentId the parentId to set
   */
  public void setParentId(
    String parentId)
  {
    this.parentId = parentId;
  }


  /**
   * @param textDisplay the textDisplay to set
   */
  public void setTextDisplay(
    String textDisplay)
  {
    this.textDisplay = textDisplay;
  }


  /**
   * @param textOriginal the textOriginal to set
   */
  public void setTextOriginal(
    String textOriginal)
  {
    this.textOriginal = textOriginal;
  }


  /**
   * @param updatedAt the updatedAt to set
   */
  public void setUpdatedAt(
    String updatedAt)
  {
    this.updatedAt = updatedAt;
  }


  /**
   * @param videoId the videoId to set
   */
  public void setVideoId(
    String videoId)
  {
    this.videoId = videoId;
  }


  /**
   * @param viewerRating the viewerRating to set
   */
  public void setViewerRating(
    String viewerRating)
  {
    this.viewerRating = viewerRating;
  }
}
