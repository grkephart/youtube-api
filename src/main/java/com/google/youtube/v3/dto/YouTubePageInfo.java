/**
 * 
 */
package com.google.youtube.v3.dto;


/**
 * @author gary_kephart
 *
 */
public class YouTubePageInfo
{
  private int resultsPerPage;
  private int totalResults;
  /**
   * @return the resultsPerPage
   */
  public int getResultsPerPage()
  {
    return resultsPerPage;
  }


  /**
   * @return the totalResults
   */
  public int getTotalResults()
  {
    return totalResults;
  }


  /**
   * @param resultsPerPage the resultsPerPage to set
   */
  public void setResultsPerPage(
    int resultsPerPage)
  {
    this.resultsPerPage = resultsPerPage;
  }


  /**
   * @param totalResults the totalResults to set
   */
  public void setTotalResults(
    int totalResults)
  {
    this.totalResults = totalResults;
  }
}
