package com.boraozgur.generics;

public class Driver {
	public static void main(String[] args) {
		League<Team<FootballPlayer>> footballLeague = new League<Team<FootballPlayer>>("Turkcell Super League");

		Team<FootballPlayer> ronaldo = new Team<FootballPlayer>("Ronaldo");
		Team<FootballPlayer> cristian = new Team<FootballPlayer>("Cristian");
		Team<FootballPlayer> alex = new Team<FootballPlayer>("Alex");

		footballLeague.add(ronaldo);
		footballLeague.add(cristian);
		footballLeague.add(alex);
		
		//define league results
		
		footballLeague.showLeagueTable();
		

	}
}
