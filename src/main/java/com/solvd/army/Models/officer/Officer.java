package com.solvd.army.Models.officer;

import com.solvd.army.Models.officer.ranks.Rank;

public class Officer {
	
	private Rank rank;
	private int yearsServed;

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

	public Officer(int yearsServed, Rank rank) {
		this.yearsServed = yearsServed;
		this.rank = rank;
	}
	
	

}
