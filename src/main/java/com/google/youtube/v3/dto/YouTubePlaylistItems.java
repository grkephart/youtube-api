package com.google.youtube.v3.dto;


public class YouTubePlaylistItems
    extends YouTubeResource<YouTubePlaylistItemContentDetails, YouTubePlaylistItemsSnippet>
{
  private String id;

  /**
   * The ID that YouTube uses to uniquely identify the playlist item.
   * 
   * @return the id
   */
  public String getId()
  {
    return id;
  }


  /**
   * @param id the id to set
   */
  public void setId(
    String id)
  {
    this.id = id;
  }

}
