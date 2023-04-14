/**
 * 
 */
package com.google.youtube.v3.services;


import com.google.youtube.v3.dto.YouTubeChannelResponse;
import com.google.youtube.v3.dto.YouTubeCommentThreadResponse;
import com.google.youtube.v3.dto.YouTubePlaylistItemsResponse;
import com.google.youtube.v3.dto.YouTubeResource;
import com.google.youtube.v3.dto.YouTubeResponse;
import com.google.youtube.v3.dto.YouTubeSnippet;
import com.google.youtube.v3.dto.YouTubeVideoResponse;


/**
 * The YouTube Data API lets you incorporate functions normally executed on the
 * YouTube website into your own website or application.
 * 
 * @see <a href="https://developers.google.com/youtube/v3/docs/">YouTube Data
 *      API</a>
 * @author gary_kephart
 *
 */
public interface YouTubeService
{

  public static final Integer MAX_RESULTS = Integer.valueOf(50);

  /**
   * @param <CD>
   * @param <S>
   * @param <RS>
   * @param part specifies a comma-separated list of one or more search resource properties that the API response will include. Set the parameter value to snippet. 
   * @param maxResults  specifies the maximum number of items that should be returned in the result set. Acceptable values are 0 to 50, inclusive. The default value is 5.
   * @param pageToken identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
   * @param q specifies the query term to search for.
   * @param type restricts a search query to only retrieve a particular type of resource. The value is a comma-separated list of resource types. The default value is video,channel,playlist.
   * @param fields The fields parameter filters the API response, which only contains the resource parts identified in the part parameter value, so that the response only includes a specific set of fields.
   * @return
   */
  public <S extends YouTubeSnippet, RS extends YouTubeResource<S>> YouTubeResponse<S, RS> search(
    String part,
    Integer maxResults,
    String pageToken,
    String q,
    String type,
    String fields);


  /**
   * Returns a collection of zero or more channel resources that match the request criteria.
   * 
   * A call to this method has a quota cost of 1 unit.
   *  
   * @param part specifies a comma-separated list of one or more channel resource
   *             properties that the API response will include
   * @param id   specifies a comma-separated list of the YouTube channel ID(s) for
   *             the resource(s) that are being retrieved. In a channel resource,
   *             the id property specifies the channel's YouTube channel ID
   * @param maxResults  specifies the maximum number of items that should be returned in the result set. Acceptable values are 0 to 50, inclusive. The default value is 5.
   * @param pageToken identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
   * @param fields The fields parameter filters the API response, which only contains the resource parts identified in the part parameter value, so that the response only includes a specific set of fields.
   * @return
   */
  public YouTubeChannelResponse getChannels(//
    String part,
    String id,
    Integer maxResults,
    String pageToken,
    String fields);


  /**
   * Returns a list of comment threads that match the API request parameters.
   * 
   * A call to this method has a quota cost of 1 unit.
   *  
   * @param part       specifies a comma-separated list of one or more commentThread resource properties that the API response will include.
   * @param channelId  instructs the API to return comment threads containing comments about the specified channel. (The response will not include comments left on videos that the channel uploaded.)
   * @param id         specifies a comma-separated list of comment thread IDs for the resources that should be retrieved.
   * @param videoId    instructs the API to return comment threads associated with the specified video ID.
   * @param maxResults specifies the maximum number of items that should be returned in the result set. Acceptable values are 0 to 50, inclusive. The default value is 5.
   * @param pageToken  identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
   * @param fields     filters the API response, which only contains the resource parts identified in the part parameter value, so that the response only includes a specific set of fields.
   * @return
   */
  public YouTubeCommentThreadResponse getCommentThreads(//
    String part,
    String channelId,
    String id,
    String videoId,
    Integer maxResults,
    String pageToken,
    String fields);


  /**
   * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
   * 
   * A call to this method has a quota cost of 1 unit.
   * 
   * @param part       specifies a comma-separated list of one or more channel resource properties that the API response will include
   * @param playlistId
   * @param maxResults specifies the maximum number of items that should be returned in the result set. Acceptable values are 0 to 50, inclusive. The default value is 5.
   * @param pageToken  identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
   * @param fields     filters the API response, which only contains the resource parts identified in the part parameter value, so that the response only includes a specific set of fields.
   * @return
   */
  public YouTubePlaylistItemsResponse getPlaylistItems(//
    String part,
    String playlistId,
    Integer maxResults,
    String pageToken,
    String fields);


  /**
   * Returns a list of videos that match the API request parameters.
   * 
   * A call to this method has a quota cost of 1 unit.
   * 
   * @param part       specifies a comma-separated list of one or more channel resource properties that the API response will include
   * @param id         specifies a comma-separated list of the YouTube video ID(s) for the resource(s) that are being retrieved. In a video resource, the id property specifies the video's ID.
   * @param maxResults specifies the maximum number of items that should be returned in the result set. Acceptable values are 0 to 50, inclusive. The default value is 5.
   * @param pageToken  identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
   * @param fields     The fields parameter filters the API response, which only contains the resource parts identified in the part parameter value, so that the response only includes a specific set of fields.
   * @return
   */
  public YouTubeVideoResponse getVideos(//
    String part,
    String id,
    Integer maxResults,
    String pageToken,
    String fields);
}
