/**
 * 
 */
package com.google.youtube.v3.services.impl;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.google.youtube.v3.dto.YouTubeChannelResponse;
import com.google.youtube.v3.services.YouTubeService;


/**
 * @author gary_kephart
 *
 */
@EnableFeignClients
@RunWith(MockitoJUnitRunner.class)
public class FeignYouTubeServiceTest
{
  private static final String CHANNEL_FIELDS = "nextPageToken,items(id,contentDetails(relatedPlaylists(uploads)),snippet(customUrl,description,thumbnails(default,medium,high),title),statistics(subscriberCount,viewCount))";
  private static final String CHANNEL_PARTS  = "id,contentDetails,snippet,statistics";
  @Value("${google.apiKey}")
  private String key;

  private FeignYouTubeService service;

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception
  {
  }


  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception
  {
  }


  @Ignore
  @Test
  public void testGetChannels()
  {
    String pageToken = null;
    String commaSeparatedIds = "UC7xTERSqzzI2craBm-EPE-g";

    // Arrange
    
    //  Act
    YouTubeChannelResponse channelResponse = this.service.getChannels(CHANNEL_PARTS,
      commaSeparatedIds, YouTubeService.MAX_RESULTS, pageToken, key, CHANNEL_FIELDS);
    
    // Assert
    
  }

}
