/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubePlaylistItemsResponse extends
    YouTubeResponse<YouTubePlaylistItemContentDetails, YouTubePlaylistItemsSnippet, YouTubePlaylistItems>
{
  private String playlistId;

  
  /**
   * 
   */
  public YouTubePlaylistItemsResponse()
  {
    
  }
  
  
  public YouTubePlaylistItemsResponse(String playListId)
  {
    this.playlistId = playListId;
  }


  /**
   * @return the playlistId
   */
  public String getPlaylistId()
  {
    return playlistId;
  }


  /**
   * @param playlistId the playlistId to set
   */
  public void setPlaylistId(
    String playlistId)
  {
    this.playlistId = playlistId;
  }
}
