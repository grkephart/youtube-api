package com.google.youtube.v3.dto;

/**
 * @author gary_kephart
 *
 */
public class YouTubeChannelContentDetails  extends YouTubeContentDetails
{
  private YouTubeRelatedPlaylists relatedPlaylists;

  /**
   * @return the relatedPlaylists
   */
  public YouTubeRelatedPlaylists getRelatedPlaylists()
  {
    return relatedPlaylists;
  }


  /**
   * @param relatedPlaylists the relatedPlaylists to set
   */
  public void setRelatedPlaylists(
    YouTubeRelatedPlaylists relatedPlaylists)
  {
    this.relatedPlaylists = relatedPlaylists;
  }
}
