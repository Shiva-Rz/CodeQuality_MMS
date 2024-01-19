package com.mms.bean;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

// Movie Id, Movie Name, Movie Type, Movie Language and Movie Durations.

@Entity
@Table(name = "tbl_movie")
public class Movie {

	@Id
	@Column(name = "mid")
	private int id;

	@Column(name = "mname")
	private String moviename;

	@Column(name = "mtype")
	private String movietype;

	@Column(name = "mlanguage")
	private String movielanguage;

	@Column(name = "mduration")
	private float movieduration;

	public Movie() {
		super();

	}

	public Movie(int id, String moviename, String movietype, String movielanguage, float movieduration) {
		super();
		this.id = id;
		this.moviename = moviename;
		this.movietype = movietype;
		this.movielanguage = movielanguage;
		this.movieduration = movieduration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getMovietype() {
		return movietype;
	}

	public void setMovietype(String movietype) {
		this.movietype = movietype;
	}

	public String getMovielanguage() {
		return movielanguage;
	}

	public void setMovielanguage(String movielanguage) {
		this.movielanguage = movielanguage;
	}

	public float getMovieduration() {
		return movieduration;
	}

	public void setMovieduration(float movieduration) {
		this.movieduration = movieduration;
	}

}
