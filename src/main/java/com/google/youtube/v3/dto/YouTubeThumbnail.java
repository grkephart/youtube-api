package com.google.youtube.v3.dto;


public class YouTubeThumbnail
{
  public static final String DEFAULT_KEY  = "default";
  public static final String HIGH_KEY     = "high";
  public static final String MAXRES_KEY   = "maxres";
  public static final String MEDIUM_KEY   = "medium";
  public static final String STANDARD_KEY = "standard";

  private Integer            height;
  /**
   * Not populated by YT, but can be used during system import.
   */
  private String             key;
  private String             url;
  private Integer            width;

  /**
   * @return the height
   */
  public Integer getHeight()
  {
    return height;
  }


  /**
  * @return the key
  */
  public String getKey()
  {
    return key;
  }


  /**
   * @return the url
   */
  public String getUrl()
  {
    return url;
  }


  /**
   * @return the width
   */
  public Integer getWidth()
  {
    return width;
  }


  /**
   * @param height the height to set
   */
  public void setHeight(
    Integer height)
  {
    this.height = height;
  }


  /**
  * @param key the key to set
  */
  public void setKey(
    String key)
  {
    this.key = key;
  }


  /**
   * @param url the url to set
   */
  public void setUrl(
    String url)
  {
    this.url = url;
  }


  /**
   * @param width the width to set
   */
  public void setWidth(
    Integer width)
  {
    this.width = width;
  }
}
