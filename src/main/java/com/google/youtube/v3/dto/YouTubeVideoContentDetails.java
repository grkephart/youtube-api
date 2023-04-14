package com.google.youtube.v3.dto;


public class YouTubeVideoContentDetails extends YouTubeContentDetails
{
  private String duration;

  /**
   * @return the duration
   */
  public String getDuration()
  {
    return duration;
  }


  /**
   * @param duration the duration to set
   */
  public void setDuration(
    String duration)
  {
    this.duration = duration;
  }
}
