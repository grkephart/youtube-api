/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeResponse<CD extends YouTubeContentDetails, S extends YouTubeSnippet, R extends YouTubeResource<CD, S>>
{
  private R[]             items;
  private String          kind;
  private String          nextPageToken;
  private YouTubePageInfo pageInfo;
  private String          pageToken;
  private String          prevPageToken;

  /**
   * @return the items
   */
  public R[] getItems()
  {
    return items;
  }


  /**
   * @return the kind
   */
  public String getKind()
  {
    return kind;
  }


  /**
   * @return the nextPageToken
   */
  public String getNextPageToken()
  {
    return nextPageToken;
  }


  /**
   * @return the pageInfo
   */
  public YouTubePageInfo getPageInfo()
  {
    return pageInfo;
  }


  /**
   * @return the pageToken
   */
  public String getPageToken()
  {
    return pageToken;
  }


  /**
   * @return the prevPageToken
   */
  public String getPrevPageToken()
  {
    return prevPageToken;
  }


  /**
   * @return
   */
  public boolean hasItems()
  {
    return this.items != null && this.items.length > 0;
  }


  /**
   * @param items the items to set
   */
  public void setItems(
    R[] items)
  {
    this.items = items;
  }


  /**
   * @param kind the kind to set
   */
  public void setKind(
    String kind)
  {
    this.kind = kind;
  }


  /**
   * @param nextPageToken the nextPageToken to set
   */
  public void setNextPageToken(
    String nextPageToken)
  {
    this.nextPageToken = nextPageToken;
  }


  /**
   * @param pageInfo the pageInfo to set
   */
  public void setPageInfo(
    YouTubePageInfo pageInfo)
  {
    this.pageInfo = pageInfo;
  }


  /**
   * @param pageToken the pageToken to set
   */
  public void setPageToken(
    String pageToken)
  {
    this.pageToken = pageToken;
  }


  /**
   * @param prevPageToken the prevPageToken to set
   */
  public void setPrevPageToken(
    String prevPageToken)
  {
    this.prevPageToken = prevPageToken;
  }
}
