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

  @Test
  public void return_love_fifteen_when_player2_score_1_point() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("love_fifteen");
  }

  @Test
  public void return_fifteen_fifteen_when_the_players_score_1_point_each() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("fifteen_fifteen");
  }

  @Test
  public void return_thirty_fifteen_when_player1_score_2_points_and_player2_score_1_point() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("thirty_fifteen");
  }

  @Test
  public void return_love_fifteen_when_player1_score_1_point_and_player2_score_2_points() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("fifteen_thirty");
  }

  @Test
  public void return_fifteen_fifteen_when_the_players_score_2_point_each() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("thirty_thirty");
  }

  @Test
  public void return_thirty_fifteen_when_player1_score_3_points_and_player2_score_2_point() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("forty_thirty");
  }

  @Test
  public void return_love_fifteen_when_player1_score_2_points_and_player2_score_3_points() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("thirty_forty");
  }


  @Test
  public void return_deuce_when_the_players_score_3_point_each() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("deuce");
  }

  @Test
  public void return_deuce_when_the_players_score_4_point_each() {
    // GIVEN
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");

    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    tennisGame.wonPoint("player1");

    // WHEN
    String score = tennisGame.getScore();

    // THEN
    assertThat(score).isEqualTo("deuce");
  }


  @Test
  public void return_advantage_player1_when_the_player1_score_4_points_and_player2_score_3_points() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");

    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("Advantage player1");
  }

  @Test
  public void return_advantage_player2_when_the_player1_score_3_points_and_player2_score_4_points() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");

    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("Advantage player2");
  }

  @Test
  public void return_advantage_player1_when_the_player1_score_5_points_and_player2_score_4_points() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");

    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player1");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("Advantage player1");
  }

  @Test
  public void return_advantage_player1_when_the_player1_score_4_points_and_player2_score_5_points() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");

    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("Advantage player2");
  }

  @Test
  public void return_win_for_Player1_When_Score_4_Points_and_player2_have_less_than_3_points() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");

    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    tennisGame.wonPoint("player1");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("win for player1");
  }

  @Test
  public void return_win_for_Player2_When_Score_4_Points_and_player1_have_less_than_3_points() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");

    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("win for player2");
  }

  @Test
  public void return_win_for_Player1_When_each_is_greater_than_3_and_2_points_more_for_player1() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");

    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("win for player1");
  }

  @Test
  public void return_win_for_Player2_When_each_is_greater_than_3_and_2_points_more_for_player2() {
    TennisGame tennisGame = new TennisGame("player1", "player2");

    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");
    tennisGame.wonPoint("player1");

    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    tennisGame.wonPoint("player2");
    tennisGame.wonPoint("player2");

    String score = tennisGame.getScore();

    assertThat(score).isEqualTo("win for player2");
  }

}
