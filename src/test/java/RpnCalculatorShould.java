import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.Test;

public class RpnCalculatorShould {

  @Test
  public void return_1_when_input_is_1() {
    // given
    RnpCalculator rnpCalculator = new RnpCalculator();

    // when
    String result = rnpCalculator.calculate("1");

    // then
    assertThat(result).isEqualTo("1");
  }

  @Test
  public void return_2_when_input_is_1_1_plus() {
    // given
    RnpCalculator rnpCalculator = new RnpCalculator();

    // when
    String result = rnpCalculator.calculate("1 1 +");

    // then
    assertThat(result).isEqualTo("2");
  }

  @Test
  public void return_4_when_input_is_2_2_multiply() {
    // given
    RnpCalculator rnpCalculator = new RnpCalculator();

    // when
    String result = rnpCalculator.calculate("2 2 *");

    // then
    assertThat(result).isEqualTo("4");
  }

  @Test
  public void return_3_when_input_is_9_3_divide() {
    // given
    RnpCalculator rnpCalculator = new RnpCalculator();

    // when
    String result = rnpCalculator.calculate("9 3 /");

    // then
    assertThat(result).isEqualTo("3");
  }

  @Test
  public void return_3_when_input_is_1_1_1_add_add() {
    // given
    RnpCalculator rnpCalculator = new RnpCalculator();

    // when
    String result = rnpCalculator.calculate("1 1 1 + +");

    // then
    assertThat(result).isEqualTo("3");
  }

  @Test
  public void return_5_when_input_is_1_2_3_add_multiply() {
    // given
    RnpCalculator rnpCalculator = new RnpCalculator();

    // when
    String result = rnpCalculator.calculate("1 2 3 + *");

    // then
    assertThat(result).isEqualTo("5");
  }

  @Test
  public void return_9_when_input_is_1_2_plus_3_multiply() {
    // given
    RnpCalculator rnpCalculator = new RnpCalculator();

    // when
    String result = rnpCalculator.calculate("1 2 + 3 *");

    // then
    assertThat(result).isEqualTo("9");
  }

  @Test
  public void return_141_when_input_is_1_2_8_multiply_7_plus_multiply() {
    // given
    RnpCalculator rnpCalculator = new RnpCalculator();

    // when
    String result = rnpCalculator.calculate("3 5 8 * 7 + *");

    // then
    assertThat(result).isEqualTo("141");
  }

  @Test
  public void return_3_when_input_is_4_2_add_3_substract() {
    // given
    RnpCalculator rnpCalculator = new RnpCalculator();

    // when
    String result = rnpCalculator.calculate("4 2 + 3 -");

    // then
    assertThat(result).isEqualTo("3");
  }


}
