import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;

public class GameShould {

  @Test
  public void return_score_of_0_when_roll_20_times_and_no_pin_down() {
    // given
    Game game = new Game();

    for (int i = 0; i < 20; i++) {
      game.roll(0);
    }

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(0);
  }

  @Test
  public void return_score_of_20_when_roll_20_times_and_one_pin_down_for_each_roll() {
    // given
    Game game = new Game();

    for (int i = 0; i < 20; i++) {
      game.roll(1);
    }

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(20);
  }

  @Test
  public void return_score_of_15_when_roll_6_times_with_pin_down_1_1_1_9_1_1() {
    // given
    Game game = new Game();

    game.roll(1);
    game.roll(1);

    game.roll(1);
    game.roll(9);

    game.roll(1);
    game.roll(1);

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(15);
  }

  @Test
  public void return_score_of_16_when_roll_5_times_with_pin_down_1_1_10_1_1() {
    // given
    Game game = new Game();

    game.roll(1);
    game.roll(1);

    game.roll(10);

    game.roll(1);
    game.roll(1);

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(16);
  }

  @Test
  public void return_score_of_30_when_roll_5_times_with_pin_down_1_1_10_5_4() {
    // given
    Game game = new Game();

    game.roll(1);
    game.roll(1);

    game.roll(10);

    game.roll(5);
    game.roll(4);

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(30);
  }

  @Test
  public void return_score_of_28_when_roll_3_times_with_pin_down_10_5_4() {
    // given
    Game game = new Game();

    game.roll(10);

    game.roll(5);
    game.roll(4);

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(28);
  }

  @Test
  public void return_score_55_when_roll_8_times_with_1_1_strike_strike_5_1_5_1() {
    // given
    Game game = new Game();

    game.roll(1);
    game.roll(1);

    game.roll(10);
    game.roll(10);

    game.roll(5);
    game.roll(1);

    game.roll(5);
    game.roll(1);

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(55);
  }

  @Test
  public void return_score_81_when_roll_7_times_with_3_strike_3_3_3_3() {
    // given
    Game game = new Game();

    game.roll(10);
    game.roll(10);
    game.roll(10);

    game.roll(3);
    game.roll(3);

    game.roll(3);
    game.roll(3);

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(81);
  }

  @Test
  public void return_score_42_when_roll_6_times_with_pin_down_8_2_5_5_8_1() {
    // given
    Game game = new Game();

    game.roll(8);
    game.roll(2);

    game.roll(5);
    game.roll(5);

    game.roll(8);
    game.roll(1);

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(42);
  }

  @Test
  public void return_score_76_when_roll_6_times_with_spare_strike_strike_8_1() {
    // given
    Game game = new Game();

    game.roll(8);
    game.roll(2);

    game.roll(10);
    game.roll(10);

    game.roll(8);
    game.roll(1);

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(76);
  }

  @Test
  public void return_score_3_when_every_roll_is_0_and_2_last_roll_is_3() {
    // given
    Game game = new Game();

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(3);
    game.roll(3);

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(6);
  }

  @Test
  public void return_score_15_when_every_roll_is_0_and_last_roll_are_7_3_5() {
    // given
    Game game = new Game();

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(0);
    game.roll(0);

    game.roll(7);
    game.roll(3);
    game.roll(5);

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(15);
  }

  @Test
  public void return_score_of_300_when_roll_full_strike() {
    // given
    Game game = new Game();

    game.roll(10);
    game.roll(10);
    game.roll(10);
    game.roll(10);
    game.roll(10);
    game.roll(10);
    game.roll(10);
    game.roll(10);
    game.roll(10);
    game.roll(10);
    game.roll(10);
    game.roll(10);

    // when
    int score = game.score();

    // then
    assertThat(score).isEqualTo(300);
  }

  @Test
  public void return_score_of_106_when_roll_a_game() {
    // given
    Game game = new Game();

    game.roll(1);
    game.roll(1);

    game.roll(10);

    game.roll(10);

    game.roll(1);
    game.roll(1);

    game.roll(1);
    game.roll(1);

    game.roll(10);

    game.roll(2);
    game.roll(3);

    game.roll(9);
    game.roll(1);

    game.roll(8);
    game.roll(2);

    game.roll(8);
    game.roll(2);
    game.roll(1);

    // when
    int result = game.score();

    // then
    assertThat(result).isEqualTo(106);
  }

}
