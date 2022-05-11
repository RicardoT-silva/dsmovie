package com.devsuperior.dsmovie.dto;

public class ScoreDTO {
	
	private Long movie_id;
	private String email;
	private Double score;
	
	public ScoreDTO() {}

	public Long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Long movie_id) {
		this.movie_id = movie_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setSocre(Double score) {
		this.score = score;
	}
}
