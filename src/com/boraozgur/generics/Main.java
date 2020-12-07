package com.boraozgur.generics;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");

		Team<SoccerPlayer> fenerbahce = new Team<SoccerPlayer>("Fenerbahce");
		fenerbahce.addPlayer(beckham);
		fenerbahce.addPlayer(ronaldo);

		System.out.println(fenerbahce.numPlayers());

		Team<BaseballPlayer> baseBallTeam = new Team<BaseballPlayer>("Chicago Cubs");
		baseBallTeam.addPlayer(pat);
		
		System.out.println("Rankings");
		System.out.println(fenerbahce.getName() + ": "+fenerbahce.ranking());
		
	}

}
