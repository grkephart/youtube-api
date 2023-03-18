/**
 * 
 */
package com.google.youtube.v3.dto;


import java.util.Date;

/*
channel snippet
  "snippet": {
    "title": string,
    "description": string,
    "customUrl": string,
    "publishedAt": datetime,
    "thumbnails": {
      (key): {
        "url": string,
        "width": unsigned integer,
        "height": unsigned integer
      }
    },

playlist snippet
  "snippet": {
    "publishedAt": datetime,
    "channelId": string,
    "title": string,
    "description": string,
    "thumbnails": {
      (key): {
        "url": string,
        "width": unsigned integer,
        "height": unsigned integer
      }
    },

playlistitem snippet
  "snippet": {
    "publishedAt": datetime,
    "channelId": string,
    "title": string,
    "description": string,
    "thumbnails": {
      (key): {
        "url": string,
        "width": unsigned integer,
        "height": unsigned integer
      }
    },

 */


/**
 * @author gary_kephart
 *
 */
public class YouTubeSnippet
{
  private String            channelId;
  private String            channelTitle;
  private String            description;
  private Date              publishedAt;
  private YouTubeThumbnails thumbnails;
  private String            title;

  public String getChannelId()
  {
    return channelId;
  }


  /**
   * @return the channelTitle
   */
  public String getChannelTitle()
  {
    return channelTitle;
  }


  /**
   * @return the description
   */
  public String getDescription()
  {
    return description;
  }


  /**
   * @return the publishedAt
   */
  public Date getPublishedAt()
  {
    return publishedAt;
  }


  /**
   * @return the thumbnails
   */
  public YouTubeThumbnails getThumbnails()
  {
    return thumbnails;
  }


  /**
   * @return the title
   */
  public String getTitle()
  {
    return title;
  }


  public void setChannelId(
    String channelId)
  {
    this.channelId = channelId;
  }


  /**
   * @param channelTitle the channelTitle to set
   */
  public void setChannelTitle(
    String channelTitle)
  {
    this.channelTitle = channelTitle;
  }


  /**
   * @param description the description to set
   */
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  /**
   * @param publishedAt the publishedAt to set
   */
  public void setPublishedAt(
    Date publishedAt)
  {
    this.publishedAt = publishedAt;
  }


  /**
   * @param thumbnails the thumbnails to set
   */
  public void setThumbnails(
    YouTubeThumbnails thumbnails)
  {
    this.thumbnails = thumbnails;
  }


  /**
   * @param title the title to set
   */
  public void setTitle(
    String title)
  {
    this.title = title;
  }

}
