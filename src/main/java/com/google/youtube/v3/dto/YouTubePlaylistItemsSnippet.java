/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubePlaylistItemsSnippet extends YouTubeSnippet
{
  private String playlistId;

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
