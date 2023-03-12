package com.google.youtube.v3.dto;


public class YouTubeRelatedPlaylists
    extends YouTubeResource<YouTubeRelatedPlaylistsContentDetails, YouTubeSnippet>
{
  private String likes;
  private String uploads;

  /**
   * The ID of the playlist that contains the channel's liked videos. Use the playlistItems.insert and playlistItems.delete methods to add or remove items from that list.
   * 
   * @return the likes
   */
  public String getLikes()
  {
    return likes;
  }


  /**
   * The ID of the playlist that contains the channel's uploaded videos. Use the videos.insert method to upload new videos and the videos.delete method to delete previously uploaded videos.
   * 
   * @return the uploads
   */
  public String getUploads()
  {
    return uploads;
  }


  /**
   * @param likes the likes to set
   */
  public void setLikes(
    String likes)
  {
    this.likes = likes;
  }


  /**
   * @param uploads the uploads to set
   */
  public void setUploads(
    String uploads)
  {
    this.uploads = uploads;
  }
}
