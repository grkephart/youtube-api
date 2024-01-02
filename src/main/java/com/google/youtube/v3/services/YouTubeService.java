/**
 * 
 */
package com.google.youtube.v3.services;


import java.util.List;

import com.google.youtube.v3.dto.YouTubeChannel;
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
public interface YouTubeService
{

  public enum Rating
  {
    DISLIKE("dislike"), LIKE("like"), NONE("none");

    /**
     * @param ratingName
     * @return
     */
    public static Rating getValue(String ratingName)
    {
      for (Rating rating : Rating.values())
      {
        if (rating.value.equalsIgnoreCase(ratingName))
          return rating;
      }
      
      return null;
    }

    private String value;


    Rating(String value)
    {
      this.value = value;
    }


    public String toString()
    {
      return this.value;
    }
  }

  public static final Integer MAX_RESULTS = Integer.valueOf(50);;

  /**
   * Returns a collection of zero or more channel resources that match the request
   * criteria.
   * 
   * A call to this method has a quota cost of 1 unit.
   * 
   * @param part       specifies a comma-separated list of one or more channel
   *                   resource properties that the API response will include
   * @param id         specifies a comma-separated list of the YouTube channel
   *                   ID(s) for the resource(s) that are being retrieved. In a
   *                   channel resource, the id property specifies the channel's
   *                   YouTube channel ID
   * @param maxResults specifies the maximum number of items that should be
   *                   returned in the result set. Acceptable values are 0 to 50,
   *                   inclusive. The default value is 5.
   * @param pageToken  identifies a specific page in the result set that should be
   *                   returned. In an API response, the nextPageToken and
   *                   prevPageToken properties identify other pages that could be
   *                   retrieved.
   * @param fields     The fields parameter filters the API response, which only
   *                   contains the resource parts identified in the part
   *                   parameter value, so that the response only includes a
   *                   specific set of fields.
   * @return
   */
  public YouTubeChannelResponse getChannels(//
      String part, String id, Integer maxResults, String pageToken, String fields);


  /**
   * Returns a collection of zero or more channel resources that match the request
   * criteria.
   * 
   * @param part   specifies a comma-separated list of one or more channel
   *               resource properties that the API response will include
   * @param id     specifies a comma-separated list of the YouTube channel ID(s)
   *               for the resource(s) that are being retrieved. In a channel
   *               resource, the id property specifies the channel's YouTube
   *               channel ID
   * @param fields The fields parameter filters the API response, which only
   *               contains the resource parts identified in the part parameter
   *               value, so that the response only includes a specific set of
   *               fields.
   * @return
   */
  public List<YouTubeChannel> getChannels(String part, String id, String fields);


  /**
   * Returns a list of comment threads that match the API request parameters.
   * 
   * A call to this method has a quota cost of 1 unit.
   * 
   * @param part       specifies a comma-separated list of one or more
   *                   commentThread resource properties that the API response
   *                   will include.
   * @param channelId  instructs the API to return comment threads containing
   *                   comments about the specified channel. (The response will
   *                   not include comments left on videos that the channel
   *                   uploaded.)
   * @param id         specifies a comma-separated list of comment thread IDs for
   *                   the resources that should be retrieved.
   * @param videoId    instructs the API to return comment threads associated with
   *                   the specified video ID.
   * @param maxResults specifies the maximum number of items that should be
   *                   returned in the result set. Acceptable values are 0 to 50,
   *                   inclusive. The default value is 5.
   * @param pageToken  identifies a specific page in the result set that should be
   *                   returned. In an API response, the nextPageToken and
   *                   prevPageToken properties identify other pages that could be
   *                   retrieved.
   * @param fields     filters the API response, which only contains the resource
   *                   parts identified in the part parameter value, so that the
   *                   response only includes a specific set of fields.
   * @return
   */
  public YouTubeCommentThreadResponse getCommentThreads(//
      String part, String channelId, String id, String videoId, Integer maxResults, String pageToken, String fields);


  /**
   * Returns a collection of playlist items that match the API request parameters.
   * You can retrieve all of the playlist items in a specified playlist or
   * retrieve one or more playlist items by their unique IDs.
   * 
   * A call to this method has a quota cost of 1 unit.
   * 
   * @param part       specifies a comma-separated list of one or more channel
   *                   resource properties that the API response will include
   * @param playlistId
   * @param maxResults specifies the maximum number of items that should be
   *                   returned in the result set. Acceptable values are 0 to 50,
   *                   inclusive. The default value is 5.
   * @param pageToken  identifies a specific page in the result set that should be
   *                   returned. In an API response, the nextPageToken and
   *                   prevPageToken properties identify other pages that could be
   *                   retrieved.
   * @param fields     filters the API response, which only contains the resource
   *                   parts identified in the part parameter value, so that the
   *                   response only includes a specific set of fields.
   * @return
   */
  public YouTubePlaylistItemsResponse getPlaylistItems(//
      String part, String playlistId, Integer maxResults, String pageToken, String fields);


  /**
   * Retrieves the ratings that the authorized user gave to a list of specified
   * videos
   * 
   * @param accessToken the Authorization token of the user (without "Bearer ")
   * @param videoId     specifies a comma-separated list of the YouTube video
   *                    ID(s) for the resource(s) for which you are retrieving
   *                    rating data. In a video resource, the id property
   *                    specifies the video's ID.
   * @return the ratings that the authorized user gave to a list of specified
   *         videos
   */
  YouTubeRatingResponse getVideoRating(//
      String accessToken, String videoId);


  /**
   * Returns a list of videos that match the API request parameters.
   * 
   * A call to this method has a quota cost of 1 unit.
   * 
   * @param part       specifies a comma-separated list of one or more channel
   *                   resource properties that the API response will include
   * @param id         specifies a comma-separated list of the YouTube video ID(s)
   *                   for the resource(s) that are being retrieved. In a video
   *                   resource, the id property specifies the video's ID.
   * @param maxResults specifies the maximum number of items that should be
   *                   returned in the result set. Acceptable values are 0 to 50,
   *                   inclusive. The default value is 5.
   * @param pageToken  identifies a specific page in the result set that should be
   *                   returned. In an API response, the nextPageToken and
   *                   prevPageToken properties identify other pages that could be
   *                   retrieved.
   * @param fields     The fields parameter filters the API response, which only
   *                   contains the resource parts identified in the part
   *                   parameter value, so that the response only includes a
   *                   specific set of fields.
   * @return
   */
  public YouTubeVideoResponse getVideos(//
      String part, String id, Integer maxResults, String pageToken, String fields);

  /**
   * Add a like or dislike rating to a video or remove a rating from a video.
   * 
   * @param accessToken the Authorization token of the user (without "Bearer ")
   * @param videoId     the id parameter specifies the YouTube video ID of the video that is being rated or having its rating removed.
   * @param rating      specifies the rating to record. Acceptable values are:
   * 
   *               <ul>
   *               <li>dislike – Records that the authenticated user disliked the
   *               video.</li>
   *               <li>like – Records that the authenticated user liked the
   *               video.</li>
   *               <li>none – Removes any rating that the authenticated user had
   *               previously set for the video.</li>
   *               </ul>
   */
  public void rateVideo(//
      String accessToken, String videoId, //
      Rating rating);


  /**
   * @param <CD>
   * @param <S>
   * @param <RS>
   * @param part       specifies a comma-separated list of one or more search
   *                   resource properties that the API response will include. Set
   *                   the parameter value to snippet.
   * @param maxResults specifies the maximum number of items that should be
   *                   returned in the result set. Acceptable values are 0 to 50,
   *                   inclusive. The default value is 5.
   * @param pageToken  identifies a specific page in the result set that should be
   *                   returned. In an API response, the nextPageToken and
   *                   prevPageToken properties identify other pages that could be
   *                   retrieved.
   * @param q          specifies the query term to search for.
   * @param type       restricts a search query to only retrieve a particular type
   *                   of resource. The value is a comma-separated list of
   *                   resource types. The default value is
   *                   video,channel,playlist.
   * @param fields     The fields parameter filters the API response, which only
   *                   contains the resource parts identified in the part
   *                   parameter value, so that the response only includes a
   *                   specific set of fields.
   * @return
   */
  public <S extends YouTubeSnippet, RS extends YouTubeResource<S>> YouTubeResponse<S, RS> search(String part,
      Integer maxResults, String pageToken, String q, String type, String fields);
}
