package com.soccer.team;

public class Team extends Players_Responsibilities implements Couch {

	// Injected the Players_Meal Class into Team_Class as a Variable step 7: (Dependency Injection
	private Players_Meal anyVariableName;
	
	// Create constructor for this variable
	public Team(Players_Meal anyVariableName) {
		
		this.anyVariableName = anyVariableName;
	}
	private String teamName;
	private String teamCoach;
	private String teamJerseyColor;
	private String teamStudium;
	private String teamOwner;
	// create getter and setter for all above variables

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCoach() {
		return teamCoach;
	}

	public void setTeamCoach(String teamCoach) {
		this.teamCoach = teamCoach;
	}

	public String getTeamJerseyColor() {
		return teamJerseyColor;
	}

	public void setTeamJerseyColor(String teamJerseyColor) {
		this.teamJerseyColor = teamJerseyColor;
	}

	public String getTeamStudium() {
		return teamStudium;
	}

	public void setTeamStudium(String teamStudium) {
		this.teamStudium = teamStudium;
	}

	public String getTeamOwner() {
		return teamOwner;
	}

	public void setTeamOwner(String teamOwner) {
		this.teamOwner = teamOwner;
	}

	@Override
	public String purchasingPlayers() {
		return "A best coach always buy Best Players";
	}

	@Override
	public String trainTheTeam() {
		return "An Experianced Coach trains the team very Strong";
	}

	@Override
	public String setTheMatches() {
		return "A Good coach always Select best players fot the matches";
	}

	@Override
	public String swapThePlayersInMatches() {
		return "The coach of the team always swap players based on their physics";
	}

	
	// methods from Players_Responsibilities
	
	public String goalKeepers() {
		return helpingGoalKeepers();
		
	}
	public String Defenders() {
		return helpingDefenders();
		
	}
	public String MidFielders() {
		return helpingMidFielders();
		
	}
	public String Forwards() {
		return helpingForwards();
	}
	
	// creating methods for Team_Meal throgh anyVariableName above
	public String playersBreakFast() {
		return anyVariableName.Breakfast();
		
	}
	
	public String playersLunch() {
		return anyVariableName.Lunch();
		
	}
	
	public String playersDinner() {
		return anyVariableName.Dinner();
	}
	
	
	
	
	
	
	
}
