import static org.assertj.core.api.Assertions.assertThat;

import com.kata.TennisGame;
import org.junit.Test;

public class TennisGameShould {


  @Test
  public void return_love_love_when_game_begins() {

    TennisGame tennisGame = new TennisGame("player1", "player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("love_love");

  }

  @Test
  public void return_fifteen_love_when_player1_score_1_point() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("fifteen_love");
  }

}
