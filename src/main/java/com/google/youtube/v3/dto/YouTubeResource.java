/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * Breakdown of resource types:
 * 
 * 1 - Channel
 * 
 * - snippet
 * - contentDetails
 *   - relatedPlaylists
 *     - uploads
 * - statistics
 * - topicDetails
 * ...
 * 
 * 2 -Comment
 * 
 * - snippet
 * 
 * 3 - Comment Thread
 * 
 * - snippet
 * - replies
 *   - comments []
 *
 * 4 - Playlist Items
 * 
 * - snippet
 * - contentDetails
 *   - videoId
 * - status
 * 
 * 5 - Video Response
 * 
 * - snippet
 * - contentDetails
 * - status
 * - statistics
 * 
 * @author gary_kephart
 *
 */
public class YouTubeResource<S extends YouTubeSnippet>
{
  private S snippet;

  /**
   * @return
   */
  public S getSnippet()
  {
    return this.snippet;
  }


  /**
   * @param snippet the snippet to set
   */
  public void setSnippet(
    S snippet)
  {
    this.snippet = snippet;
  }
}
