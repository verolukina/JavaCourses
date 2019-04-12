package ru.java.courses.sport.team.football;

import java.util.ArrayList;

public class FootballTeam {
    private String name;
    private Coach coach;
    private ArrayList<Player> players;
    private int goalsCount;

    public FootballTeam(String name, Coach coach, ArrayList<Player> players) {
        this.name = name;
        this.coach = coach;
        this.players = players;
    }

    public void addPlayers(Player player) {
        if (players.size() <= 20) {
            players.add(player);
        }
    }

    public void deletePlayers(Player player) {
        players.remove(player);
    }

    public int getPlayersCount() {
        return players.size();
    }

    public int getScore() {
        for (Player player : players
        ) {
            goalsCount = goalsCount + player.goals;
        }
        return goalsCount;
    }
}
