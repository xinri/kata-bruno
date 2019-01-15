import static org.assertj.core.api.Assertions.assertThat;

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
    assertThat(result).isEqualTo(15);
  }



}
