/**
 * 
 */
package com.google.youtube.v3.services.impl;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.youtube.v3.dto.YouTubeChannel;
import com.google.youtube.v3.dto.YouTubeChannelResponse;
import com.google.youtube.v3.dto.YouTubeComment;
import com.google.youtube.v3.dto.YouTubeCommentSnippet;
import com.google.youtube.v3.dto.YouTubeCommentThread;
import com.google.youtube.v3.dto.YouTubeCommentThreadResponse;
import com.google.youtube.v3.dto.YouTubeCommentThreadSnippet;
import com.google.youtube.v3.dto.YouTubePlaylistItemsResponse;
import com.google.youtube.v3.dto.YouTubeRatingResponse;
import com.google.youtube.v3.dto.YouTubeResource;
import com.google.youtube.v3.dto.YouTubeResponse;
import com.google.youtube.v3.dto.YouTubeSnippet;
import com.google.youtube.v3.dto.YouTubeVideoResponse;
import com.google.youtube.v3.services.YouTubeService;


/**
 * @author gary_kephart
 *
 */
@Service
public class YouTubeServiceImpl implements YouTubeService
{
  private static final Log    log = LogFactory.getLog(YouTubeServiceImpl.class);
  @Value("${google.apiKey}")
  private String              key;
  @Autowired
  private FeignYouTubeService service;

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.google.youtube.v3.services.YouTubeService#getChannels(java.lang.String,
   * java.lang.String, java.lang.Integer, java.lang.String, java.lang.String,
   * java.lang.String)
   */
  @Override
  public YouTubeChannelResponse getChannels(
    String part,
    String id,
    Integer maxResults,
    String pageToken,
    String fields)
  {
    return this.service.getChannels(part, id, maxResults, pageToken, this.key, fields);
  }


  /*
   * (non-Javadoc)
   * 
   * @see
   * com.google.youtube.v3.services.YouTubeService#getChannels(java.lang.String,
   * java.lang.String, java.lang.Integer, java.lang.String, java.lang.String,
   * java.lang.String)
   */
  @Override
  public List<YouTubeChannel> getChannels(
    String part,
    String id,
    String fields)
  {
    List<YouTubeChannel> channels = new ArrayList<YouTubeChannel>();
    String pageToken = null;

    do
    {
      YouTubeChannelResponse channelResponse = this.service.getChannels(part, id,
        YouTubeService.MAX_RESULTS, pageToken, this.key, fields);

      channels.addAll(Arrays.asList(channelResponse.getItems()));

      pageToken = channelResponse.getNextPageToken();

    } while (pageToken != null);

    return channels;
  }


  /*
   * (non-Javadoc)
   * 
   * @see
   * com.google.youtube.v3.services.YouTubeService#getChannels(java.lang.String,
   * java.lang.String, java.lang.Integer, java.lang.String, java.lang.String,
   * java.lang.String)
   */
  @Override
  public YouTubeCommentThreadResponse getCommentThreads(
    String accessToken,
    String part,
    String channelId,
    String id,
    String videoId,
    Integer maxResults,
    String pageToken,
    String fields)
  {
    return this.service.getCommentThreads(accessToken, part, channelId, id, videoId, maxResults,
      pageToken, this.key, fields);
  }


  /*
   * (non-Javadoc)
   * 
   * @see
   * com.google.youtube.v3.services.YouTubeService#getPlaylistItems(java.lang.
   * String, java.lang.String, java.lang.Integer, java.lang.String,
   * java.lang.String, java.lang.String)
   */
  @Override
  public YouTubePlaylistItemsResponse getPlaylistItems(
    String part,
    String playlistId,
    Integer maxResults,
    String pageToken,
    String fields)
  {
    return this.service.getPlaylistItems(part, playlistId, maxResults, pageToken, this.key, fields);
  }


  /*
   * (non-Javadoc)
   * 
   * @see com.google.youtube.v3.services.YouTubeService#getVideoRating(java.lang.
   * String, java.lang.String)
   */
  @Override
  public YouTubeRatingResponse getVideoRating(
    String accessToken,
    String videoId)
  {
    String bearerAccessToken = "Bearer " + accessToken;

    log.info("[getVideoRating] bearerAccessToken=" + bearerAccessToken);

    return this.service.getVideoRating(bearerAccessToken, videoId, this.key);
  }


  /*
   * (non-Javadoc)
   * 
   * @see
   * com.google.youtube.v3.services.YouTubeService#getVideos(java.lang.String,
   * java.lang.String, java.lang.Integer, java.lang.String, java.lang.String,
   * java.lang.String)
   */
  @Override
  public YouTubeVideoResponse getVideos(
    String part,
    String id,
    Integer maxResults,
    String pageToken,
    String fields)
  {
    return this.service.getVideos(part, id, maxResults, pageToken, this.key, fields);
  }


  /* (non-Javadoc)
   * @see com.google.youtube.v3.services.YouTubeService#insertCommentThread(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
   */
  @Override
  public YouTubeCommentThread insertCommentThread(
    String accessToken,
    String channelId,
    String videoId,
    String text)
  {
    String bearerAccessToken = "Bearer " + accessToken;
    YouTubeCommentThread resource = new YouTubeCommentThread();
    YouTubeCommentThreadSnippet threadSnippet = new YouTubeCommentThreadSnippet();
    YouTubeComment comment = new YouTubeComment();
    YouTubeCommentSnippet commentSnippet = new YouTubeCommentSnippet();
    String part = "snippet";

    commentSnippet.setTextOriginal(text);
    comment.setSnippet(commentSnippet);
    threadSnippet.setChannelId(channelId);
    threadSnippet.setVideoId(videoId);
    threadSnippet.setTopLevelComment(comment);
    resource.setSnippet(threadSnippet);

    return this.service.insertCommentThread(bearerAccessToken, part, resource);
  }


  /*
   * (non-Javadoc)
   * 
   * @see
   * com.google.youtube.v3.services.YouTubeService#rateVideo(java.lang.String,
   * com.google.youtube.v3.services.YouTubeService.Rating)
   */
  @Override
  public void rateVideo(//
    String accessToken, //
    String videoId, //
    Rating rating)
  {
    String bearerAccessToken = "Bearer " + accessToken;
    Map<String, Object> values = new HashMap<>();

    values.put("id", videoId);
    values.put("rating", rating.toString());
    values.put("key", this.key);

    this.service.rateVideo(bearerAccessToken, values);
  }


  /*
   * (non-Javadoc)
   * 
   * @see com.google.youtube.v3.services.YouTubeService#search(java.lang.String,
   * java.lang.Integer, java.lang.String, java.lang.String, java.lang.String,
   * java.lang.String, java.lang.String)
   */
  @Override
  public <S extends YouTubeSnippet, RS extends YouTubeResource<S>> YouTubeResponse<S, RS> search(
    String part,
    Integer maxResults,
    String pageToken,
    String q,
    String type,
    String fields)
  {
    return this.service.search(part, maxResults, pageToken, q, type, this.key, fields);
  }

}
