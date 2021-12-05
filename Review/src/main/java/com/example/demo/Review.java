package com.example.demo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Review {


	private Long reviewID;
	private String content;
	private Integer movieRating;
	private Long dateTimeMilli;
	private Integer likes;


	public Review() {

	}

	public Review(long i, String string, int j, long k, int l) {
		// TODO Auto-generated constructor stub
		this.reviewID = i;
		this.content = string;
		this.movieRating = j;
		this.dateTimeMilli = k;
		this.likes = l;

	}

	public Long getReviewID() {
		return reviewID;
	}

	public void setReviewID(Long reviewID) {
		this.reviewID = reviewID;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getMovieRating() {
		return movieRating;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}



	public long getDateTimeMilli() {
		return dateTimeMilli;
	}

	public void setDateTimeMilli(Long dateTimeMilli) {
		this.dateTimeMilli = dateTimeMilli;

	}


	public String getDateTimeString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		LocalDateTime ldt = LocalDateTime.ofInstant(Instant.ofEpochMilli(getDateTimeMilli()), ZoneId.systemDefault());

		return ldt.format(formatter);
	}

	@Override
	public String toString() {
		return "Review [reviewID=" + reviewID + ", content=" + content + ", movieRating=" + movieRating
				+ ", dateTimeMilli=" + dateTimeMilli + ", likes=" + likes + "]";
	}



}
