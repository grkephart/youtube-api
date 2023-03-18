/**
 * 
 */
package com.google.youtube.v3.dto;

/**
 * @author gary_kephart
 *
 */
public class YouTubeThumbnails
{
  private YouTubeThumbnail def;
  private YouTubeThumbnail high;
  private YouTubeThumbnail maxres;
  private YouTubeThumbnail medium;
  private YouTubeThumbnail standard;

  /**
   * @return the def
   */
  public YouTubeThumbnail getDefault()
  {
    return def;
  }


  /**
   * @return the high
   */
  public YouTubeThumbnail getHigh()
  {
    return high;
  }


  /**
   * @return the maxres
   */
  public YouTubeThumbnail getMaxres()
  {
    return maxres;
  }


  /**
   * @return the medium
   */
  public YouTubeThumbnail getMedium()
  {
    return medium;
  }


  /**
   * @return the standard
   */
  public YouTubeThumbnail getStandard()
  {
    return standard;
  }


  /**
   * @param def the def to set
   */
  public void setDefault(
    YouTubeThumbnail def)
  {
    this.def = def;
  }


  /**
   * @param high the high to set
   */
  public void setHigh(
    YouTubeThumbnail high)
  {
    this.high = high;
  }


  /**
   * @param maxres the maxres to set
   */
  public void setMaxres(
    YouTubeThumbnail maxres)
  {
    this.maxres = maxres;
  }


  /**
   * @param medium the medium to set
   */
  public void setMedium(
    YouTubeThumbnail medium)
  {
    this.medium = medium;
  }


  /**
   * @param standard the standard to set
   */
  public void setStandard(
    YouTubeThumbnail standard)
  {
    this.standard = standard;
  }}
