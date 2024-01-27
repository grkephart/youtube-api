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
  private String id;
  private YouTubeCommentThreadReplies replies;

  /**
   * Returns the ID that YouTube uses to uniquely identify the comment thread.
   * 
   * @return the ID that YouTube uses to uniquely identify the comment thread.
   */
  public String getId()
  {
    return id;
  }


  /**
   * @return the replies
   */
  public YouTubeCommentThreadReplies getReplies()
  {
    return replies;
  }


  /**
   * @param id the id to set
   */
  public void setId(
    String id)
  {
    this.id = id;
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
