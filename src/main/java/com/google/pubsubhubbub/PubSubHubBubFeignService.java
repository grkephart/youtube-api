/**
 * 
 */
package com.google.pubsubhubbub;


import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

import feign.Headers;


/**
 * @author gary_kephart
 *
 */
@FeignClient(value = "pubsubhubbubService", url = "https://pubsubhubbub.appspot.com")
public interface PubSubHubBubFeignService
{
  public static final String CALLBACK_KEY      = "hub.callback";
  public static final String LEASE_SECONDS_KEY = "hub.lease_seconds";
  public static final String MODE_KEY          = "hub.mode";
  public static final String SUBSCRIBE_MODE    = "subscribe";
  public static final String TOPIC_KEY         = "hub.topic";

  /**
   * @param hubMode "subscribe", "unsubscribe" or "publish"
   * @param hubTopic URL of feed, such as "https://www.youtube.com/xml/feeds/videos.xml?channel_id=UCygn9pOnMw5St5Mva69z5nA"
   * @param hubCallback URL of callback, such as "https://reactrax.com/reactions/youtube-push"
   * @return 202 upon success
   */
  @PostMapping(value = "/subscribe", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  @Headers("Content-Type: multipart/form-data")
  public HttpStatus subscribe(
    Map<String, ?> data);

}
