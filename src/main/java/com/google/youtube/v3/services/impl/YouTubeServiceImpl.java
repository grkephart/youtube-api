/**
 * 
 */
package com.google.youtube.v3.services.impl;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.youtube.v3.dto.YouTubeChannel;
import com.google.youtube.v3.dto.YouTubeChannelResponse;
import com.google.youtube.v3.dto.YouTubeCommentThreadResponse;
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
  @Value("${google.apiKey}")
  private String              key;
  @Autowired
  private FeignYouTubeService service;

  /* (non-Javadoc)
   * @see com.google.youtube.v3.services.YouTubeService#getChannels(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String)
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


  /* (non-Javadoc)
   * @see com.google.youtube.v3.services.YouTubeService#getChannels(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String)
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


  /* (non-Javadoc)
   * @see com.google.youtube.v3.services.YouTubeService#getChannels(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String)
   */
  @Override
  public YouTubeCommentThreadResponse getCommentThreads(
    String part,
    String channelId,
    String id,
    String videoId,
    Integer maxResults,
    String pageToken,
    String fields)
  {
    return this.service.getCommentThreads(part, channelId, id, videoId, maxResults, pageToken, this.key,
      fields);
  }


  /* (non-Javadoc)
   * @see com.google.youtube.v3.services.YouTubeService#getPlaylistItems(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String)
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


  /* (non-Javadoc)
   * @see com.google.youtube.v3.services.YouTubeService#getVideoRating(java.lang.String, java.lang.String)
   */
  @Override
  public YouTubeRatingResponse getVideoRating(
    String accessToken,
    String videoId)
  {
    return this.service.getVideoRating("Bearer " + accessToken, videoId, this.key);
  }


  /* (non-Javadoc)
   * @see com.google.youtube.v3.services.YouTubeService#getVideos(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String)
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
   * @see com.google.youtube.v3.services.YouTubeService#rateVideo(java.lang.String, com.google.youtube.v3.services.YouTubeService.Rating)
   */
  @Override
  public void rateVideo(//
    String id, //
    Rating rating,
    String fields)
  {
    this.service.rateVideo(id, rating.toString(), this.key, fields);
  }


  /* (non-Javadoc)
   * @see com.google.youtube.v3.services.YouTubeService#search(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
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
