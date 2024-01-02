/**
 * 
 */
package com.google.youtube.v3.services.impl;


import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.youtube.v3.dto.YouTubeChannelResponse;
import com.google.youtube.v3.dto.YouTubeCommentThreadResponse;
import com.google.youtube.v3.dto.YouTubePlaylistItemsResponse;
import com.google.youtube.v3.dto.YouTubeRatingResponse;
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
@FeignClient(value = "youTubeService", url = "https://www.googleapis.com/youtube/v3")
public interface FeignYouTubeService
{

  public static final Integer MAX_RESULTS = Integer.valueOf(50);

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
   * @param key  Google API key
   * @param fields The fields parameter filters the API response, which only contains the resource parts identified in the part parameter value, so that the response only includes a specific set of fields.
   * @return
   */
  @GetMapping("/channels")
  public YouTubeChannelResponse getChannels(//
    @RequestParam("part")
    String part, //
    @RequestParam("id")
    String id, //
    @RequestParam("maxResults")
    Integer maxResults, //
    @RequestParam("pageToken")
    String pageToken, //
    @RequestParam("key")
    String key, //
    @RequestParam("fields")
    String fields);


  /**
  * @param part specifies a comma-separated list of one or more channel resource properties that the API response will include
  * @param maxResults  specifies the maximum number of items that should be returned in the result set. Acceptable values are 0 to 50, inclusive. The default value is 5.
  * @param pageToken identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
  * @param key        Google API key
  * @param fields The fields parameter filters the API response, which only contains the resource parts identified in the part parameter value, so that the response only includes a specific set of fields.
  * @return
  */
  @GetMapping("/commentThreads")
  public YouTubeCommentThreadResponse getCommentThreads(//
    @RequestParam("part")
    String part, //
    @RequestParam(value = "channelId", required = false)
    String channelId, //
    @RequestParam(value = "id", required = false)
    String id, //
    @RequestParam(value = "videoId", required = false)
    String videoId, //
    @RequestParam("maxResults")
    Integer maxResults, //
    @RequestParam("pageToken")
    String pageToken, //
    @RequestParam("key")
    String key, //
    @RequestParam("fields")
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
   * @param key        Google API key
   * @param fields     The fields parameter filters the API response, which only contains the resource parts identified in the part parameter value, so that the response only includes a specific set of fields.
   * @return
   */
  @GetMapping("/playlistItems")
  public YouTubePlaylistItemsResponse getPlaylistItems(//
    @RequestParam("part")
    String part, //
    @RequestParam("playlistId")
    String playlistId, //
    @RequestParam("maxResults")
    Integer maxResults, //
    @RequestParam("pageToken")
    String pageToken, //
    @RequestParam("key")
    String key, //
    @RequestParam("fields")
    String fields);


  /**
  * Retrieves the ratings that the authorized user gave to a list of specified videos
  * 
  * @param accessToken
  * @param id          the video ID
  * @param key         Google API key
  * @return the ratings that the authorized user gave to a list of specified videos
  */
  @GetMapping("/videos/getRating")
  YouTubeRatingResponse getVideoRating(//
    @RequestHeader(name = "Authorization")
    String accessToken,
    @RequestParam("id")
    String videoId, //
    @RequestParam("key")
    String key);


  /**
   * Returns a list of videos that match the API request parameters.
   * 
   * A call to this method has a quota cost of 1 unit.
   * 
   * @param part       specifies a comma-separated list of one or more channel resource properties that the API response will include
   * @param id         specifies a comma-separated list of the YouTube video ID(s) for the resource(s) that are being retrieved. In a video resource, the id property specifies the video's ID.
   * @param maxResults specifies the maximum number of items that should be returned in the result set. Acceptable values are 0 to 50, inclusive. The default value is 5.
   * @param pageToken  identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
   * @param key        Google API key
   * @param fields     The fields parameter filters the API response, which only contains the resource parts identified in the part parameter value, so that the response only includes a specific set of fields.
   * @return
   */
  @GetMapping("/videos")
  public YouTubeVideoResponse getVideos(//
    @RequestParam("part")
    String part, //
    @RequestParam("id")
    String id,
    @RequestParam("maxResults")
    Integer maxResults, //
    @RequestParam("pageToken")
    String pageToken, //
    @RequestParam("key")
    String key, //
    @RequestParam("fields")
    String fields);


  /**
   * Add a like or dislike rating to a video or remove a rating from a video.
   * 
   * @param id     The id parameter specifies the YouTube video ID of the video that is being rated or having its rating removed.
   * @param rating Specifies the rating to record. Acceptable values are:
   * @param key    Google API key
   * 
   * <ul>
   *   <li>dislike – Records that the authenticated user disliked the video.</li>
   *   <li>like – Records that the authenticated user liked the video.</li>
   *   <li>none – Removes any rating that the authenticated user had previously set for the video.</li>
   * </ul>
   */
  @PostMapping("/videos/rate")
  public void rateVideo(//
      @RequestHeader(name = "Authorization") String authToken, Map<String, Object> values);


  /**
   * @param <R>
   * @param part specifies a comma-separated list of one or more search resource properties that the API response will include. Set the parameter value to snippet. 
   * @param maxResults  specifies the maximum number of items that should be returned in the result set. Acceptable values are 0 to 50, inclusive. The default value is 5.
   * @param pageToken identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
   * @param q specifies the query term to search for.
   * @param type restricts a search query to only retrieve a particular type of resource. The value is a comma-separated list of resource types. The default value is video,channel,playlist.
   * @param key Google API key
     * @param fields The fields parameter filters the API response, which only contains the resource parts identified in the part parameter value, so that the response only includes a specific set of fields.
   * @return
   */
  @GetMapping("/search")
  public <S extends YouTubeSnippet, RS extends YouTubeResource<S>> YouTubeResponse<S, RS> search(//
    @RequestParam("part")
    String part, //
    @RequestParam("maxResults")
    Integer maxResults, //
    @RequestParam("pageToken")
    String pageToken, //
    @RequestParam("q")
    String q, //
    @RequestParam("type")
    String type, //
    @RequestParam("key")
    String key, //
    @RequestParam("fields")
    String fields);
}
