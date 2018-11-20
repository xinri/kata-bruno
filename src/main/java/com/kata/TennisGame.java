package com.kata;

public class TennisGame {

  private String playerName1;
  private String playerName2;
  private int player1Points = 0;
  private int player2Points = 0;


  public TennisGame(String playerName1, String playerName2) {
    this.playerName1 = playerName1;
    this.playerName2 = playerName2;
  }

  private String player;

  public String getScore() {
    if (player1Points == 1 && player2Points == 0) {
      return "fifteen_love";
    }

    if (player1Points == 0 && player2Points == 0) {
      return "love_love";
    }
    return "love_love";
  }

  public void wonPoint(String player) {
    if (playerName1.equals(player)) {
      player1Points++;
    } else {
      player2Points++;
    }
  }
}
