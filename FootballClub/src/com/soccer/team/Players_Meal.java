package com.soccer.team;

public class Players_Meal implements Team_Meal {

	// implemented Team_Meal Interface Methods
	@Override
	public String Breakfast() {
		return "Egg, Butter, Bread";
	}

	@Override
	public String Lunch() {
		return "Vegitables, Meat, Steak";
	}

	@Override
	public String Dinner() {
		return "Qabeli Palaw, Bean";
	}

}
