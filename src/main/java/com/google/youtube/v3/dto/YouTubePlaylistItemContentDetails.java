package com.google.youtube.v3.dto;


public class YouTubePlaylistItemContentDetails extends YouTubeContentDetails
{
  private String videoId;

  public YouTubePlaylistItemContentDetails()
  {
  }


  /**
   * @return the videoId
   */
  public String getVideoId()
  {
    return videoId;
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
