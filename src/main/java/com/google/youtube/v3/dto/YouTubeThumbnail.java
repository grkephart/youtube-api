package com.google.youtube.v3.dto;

public class YouTubeThumbnail {
	private Integer height;
	private String url;
	private Integer width;

	/**
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
}
