/**
 * 
 */
package com.google.youtube.v3.services.impl;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * @author gary_kephart
 *
 */
@FeignClient(value = "googleOAuth2Service", url = "https://oauth2.googleapis.com")
public interface FeignGoogleOAuth2Service
{
  @PostMapping("/revoke")
  public HttpStatus revokeToken(//
    @RequestBody
    String token);


}
