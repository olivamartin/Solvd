package com.solvd.army.Models.officer;

import com.solvd.army.Models.officer.ranks.Rank;

public class Officer {

	private String name;
	private Rank rank;
	private int yearsServed;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public int getYearsServed() {
		return yearsServed;
	}

	public void setYearsServed(int yearsServed) {
		this.yearsServed = yearsServed;
	}

	public Officer() {}

	public Officer(String name,int yearsServed, Rank rank) {
		this.name = name;
		this.yearsServed = yearsServed;
		this.rank = rank;
	}
	
	

}
