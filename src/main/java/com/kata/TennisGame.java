package com.kata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class TennisGame {

  private Player player1;
  private Player player2;

  private static Map<Integer, String> MAP_OF_POINT =
      new HashMap<>(5);

  private static Map<Integer, String> MAP_OF_ABS_DIF =
      new HashMap<>(2);

  static {
    MAP_OF_POINT.put(0, "love");
    MAP_OF_POINT.put(1, "fifteen");
    MAP_OF_POINT.put(2, "thirty");
    MAP_OF_POINT.put(3, "forty");

    MAP_OF_ABS_DIF.put(1, "Advantage");
    MAP_OF_ABS_DIF.put(2, "win for");
  }

  public TennisGame(String playerName1, String playerName2) {
    this.player1 = new Player(playerName1);
    this.player2 = new Player(playerName2);
  }

  public String getScore() {

    if (player1.getPoint() >= 3 && player2.getPoint() >= 3) {
      int absDiffPoint = Math.abs(player1.getPoint() - player2.getPoint());
      return MAP_OF_ABS_DIF.containsKey(absDiffPoint) ?
          getAfterDeuceMessage(MAP_OF_ABS_DIF.get(absDiffPoint)) : "deuce";
    }

    return Arrays.asList(player1, player2)
        .stream()
        .filter(filterWinner())
        .findFirst()
        .map(mapWithWinnerMessage())
        .orElse(getMessageFromMapOfPoints());
  }

  private Function<Player, String> mapWithWinnerMessage() {
    return player -> "win for " + player.getName();
  }

  private Predicate<Player> filterWinner() {
    return player -> player.getPoint() == 4;
  }

  private String getMessageFromMapOfPoints() {
    return MAP_OF_POINT.get(player1.getPoint()) + "_" +
        MAP_OF_POINT.get(player2.getPoint());
  }


  private String getAfterDeuceMessage(String prefix) {
    if (player1.getPoint() > player2.getPoint()) {
      return prefix + " " + player1.getName();
    }
    return prefix + " " + player2.getName();
  }

  public void wonPoint(String player) {
    if (player1.getName().equals(player)) {
      player1.incrementPoint();
    } else {
      player2.incrementPoint();
    }
  }
}
