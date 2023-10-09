/**
 * 
 */
package com.google.youtube.v3.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.google.youtube.v3.services.GoogleOAuth2Service;


/**
 * @author gary_kephart
 *
 */
@Service
public class GoogleOAuth2ServiceImpl implements GoogleOAuth2Service
{
  @Autowired
  private FeignGoogleOAuth2Service service;

  /* (non-Javadoc)
   * @see com.google.youtube.v3.services.GoogleOAuth2Service#revokeToken(java.lang.String)
   */
  @Override
  public HttpStatus revokeToken(
    String token)
  {
    return this.service.revokeToken("{token: '" + token + "'}");
  }

}
