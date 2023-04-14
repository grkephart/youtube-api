package com.google.youtube.v3.dto;


public class YouTubePlaylistItems extends YouTubeResource<YouTubePlaylistItemsSnippet>
{
  private YouTubePlaylistItemContentDetails contentDetails;
  private String                            id;

  /**
   * @return the contentDetails
   */
  public YouTubePlaylistItemContentDetails getContentDetails()
  {
    return contentDetails;
  }


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
   * @param contentDetails the contentDetails to set
   */
  public void setContentDetails(
    YouTubePlaylistItemContentDetails contentDetails)
  {
    this.contentDetails = contentDetails;
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
