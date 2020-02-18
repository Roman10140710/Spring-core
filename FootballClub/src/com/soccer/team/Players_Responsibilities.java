package com.soccer.team;

public class Players_Responsibilities implements Assistance_Couch {

	@Override
	public String helpingGoalKeepers() {
		return "All Goal Keepers needs to catch the ball for 30 minutes";
	}

	@Override
	public String helpingDefenders() {
		return "All Defenders must runn 100 meters for 40 minutes";
	}

	@Override
	public String helpingMidFielders() {
		return "All Midfielders need to work with Defenders and forwards";
	}

	@Override
	public String helpingForwards() {
		return "All the forwards need to shoot the ball towrds the goal for 45 minutes";
	}

}
