/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeCommentThread
    extends YouTubeResource<YouTubeCommentThreadSnippet>
{
  private YouTubeCommentThreadReplies replies;

  /**
   * @return the replies
   */
  public YouTubeCommentThreadReplies getReplies()
  {
    return replies;
  }


  /**
   * @param replies the replies to set
   */
  public void setReplies(
    YouTubeCommentThreadReplies replies)
  {
    this.replies = replies;
  }
}
