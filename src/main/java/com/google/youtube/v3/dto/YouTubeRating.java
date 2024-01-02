/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeRating extends YouTubeResource<YouTubeRatingSnippet>
{
  public static final String DISLIKE     = "dislike";
  public static final String LIKE        = "like";
  public static final String NONE        = "none";
  public static final String UNSPECIFIED = "unspecified";

  private String             rating;
  private String             videoId;

  public YouTubeRating()
  {

  }


  /**
   * @param videoId
   * @param rating
   */
  public YouTubeRating(String videoId, String rating)
  {
    super();
    this.videoId = videoId;
    this.rating  = rating;
  }


  /**
   * @return the rating
   */
  public String getRating()
  {
    return rating;
  }


  /**
   * @return the videoId
   */
  public String getVideoId()
  {
    return videoId;
  }


  /**
   * @return
   */
  public boolean isDislike()
  {
    return DISLIKE.equalsIgnoreCase(rating);
  }


  /**
   * @return
   */
  public boolean isLike()
  {
    return LIKE.equalsIgnoreCase(rating);
  }


  /**
   * @return
   */
  public boolean isNone()
  {
    return NONE.equalsIgnoreCase(rating);
  }


  /**
   * @return
   */
  public boolean isUnspecified()
  {
    return UNSPECIFIED.equalsIgnoreCase(rating);
  }


  /**
   * @param rating the rating to set
   */
  public void setRating(String rating)
  {
    this.rating = rating;
  }


  /**
   * @param videoId the videoId to set
   */
  public void setVideoId(String videoId)
  {
    this.videoId = videoId;
  }
}
