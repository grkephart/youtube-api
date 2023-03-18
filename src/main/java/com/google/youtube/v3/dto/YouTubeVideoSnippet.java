/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubeVideoSnippet extends YouTubeSnippet
{
  private YouTubeVideoStatistics statistics;

  /**
   * @return the statistics
   */
  public YouTubeVideoStatistics getStatistics()
  {
    return statistics;
  }


  /**
   * @param statistics the statistics to set
   */
  public void setStatistics(
    YouTubeVideoStatistics statistics)
  {
    this.statistics = statistics;
  }
}
