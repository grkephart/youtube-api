/**
 * 
 */
package com.google.youtube.v3.services;


import org.springframework.http.HttpStatus;


/**
 * The YouTube Data API lets you incorporate functions normally executed on the
 * YouTube website into your own website or application.
 * 
 * @see <a href="https://developers.google.com/youtube/v3/docs/">YouTube Data
 *      API</a>
 * @author gary_kephart
 *
 */
public interface GoogleOAuth2Service
{
  /**
   * @param token
   * @return
   */
  public HttpStatus revokeToken(//
    String token);


}
