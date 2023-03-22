package com.sophossolutions.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Rates {

	private double gbp;

	private double usd;


    @JsonCreator
	public Rates(@JsonProperty("GBP") double gbp,@JsonProperty("USD") double usd) {
		super();
		this.gbp = gbp;
		this.usd = usd;
	}


	public double getGbp() {
		return gbp;
	}


	public void setGbp(double gbp) {
		this.gbp = gbp;
	}


	public double getUsd() {
		return usd;
	}


	public void setUsd(double usd) {
		this.usd = usd;
	}



	
}
