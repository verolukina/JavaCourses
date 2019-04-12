package ru.java.courses.sport.team.football;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Coach coach = new Coach("Vero Luki", 5);
        Player player = new Player("Fitcha", 0, PlayerRole.FORWARD, true);
        Player player2 = new Player("Enya", 0, PlayerRole.GOALKEEPER, false);
        FootballTeam team = new FootballTeam("Beasts", coach, new ArrayList<Player>());

        team.addPlayers(player);
        team.addPlayers(player2);

        player.score();
        player.score();
        player2.score();

        System.out.println(team.getScore());
    }
}