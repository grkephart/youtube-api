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
    
commentThread snippet
  "snippet": {
    "channelId": string,
    "videoId": string,
    "topLevelComment": comments Resource,
    "canReply": boolean,
    "totalReplyCount": unsigned integer,
    "isPublic": boolean
  },

comment snippet
  "snippet": {
    "authorDisplayName": string,
    "authorProfileImageUrl": string,
    "authorChannelUrl": string,
    "authorChannelId": {
      "value": string
    },
    "channelId": string,
    "videoId": string,
    "textDisplay": string,
    "textOriginal": string,
    "parentId": string,
    "canRate": boolean,
    "viewerRating": string,
    "likeCount": unsigned integer,
    "moderationStatus": string,
    "publishedAt": datetime,
    "updatedAt": datetime
  }

video snippet
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
    "channelTitle": string,
    "tags": [
      string
    ],
    "categoryId": string,
    "liveBroadcastContent": string,
    "defaultLanguage": string,
    "localized": {
      "title": string,
      "description": string
    },
    "defaultAudioLanguage": string
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
