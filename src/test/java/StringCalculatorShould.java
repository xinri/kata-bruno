import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorShould {

  public StringCalculator stringCalculator;

  @Before
  public void setup() {
    stringCalculator = new StringCalculator();
  }

  @Test
  public void return_O_when_string_input_is_empty() throws Exception {

    assertThat(stringCalculator.add("")).isEqualTo(0);
  }

  @Test
  public void return_1_when_string_input_is_1() throws Exception {

    assertThat(stringCalculator.add("1")).isEqualTo(1);
  }

  @Test
  public void return_2_when_string_input_is_2() throws Exception {

    assertThat(stringCalculator.add("2")).isEqualTo(2);
  }

  @Test
  public void return_sum_when_string_input_contains_2_number() throws Exception {

    assertThat(stringCalculator.add("1,2")).isEqualTo(3);
  }

  @Test
  public void return_sum_when_string_input_contains_new_line() throws Exception {
    assertThat(stringCalculator.add("1,2\n3")).isEqualTo(6);
  }

  @Test
  public void return_sum_when_string_input_contains_custom_delimiter() throws Exception {
    assertThat(stringCalculator.add("//;\n1;2")).isEqualTo(3);
  }

  @Test
  public void raise_exception_when_string_input_contains_negative_number() {
    assertThatThrownBy(() -> stringCalculator.add("-1,2")).isInstanceOf(Exception.class)
        .hasMessage("Negatives not allowed : -1");
  }

  @Test
  public void raise_exception_when_string_input_contains_multiple_negative_value() {
    assertThatThrownBy(() -> stringCalculator.add("2,-4,3,-5")).isInstanceOf(Exception.class)
        .hasMessage("Negatives not allowed : -4,-5");
  }

  @Test
  public void return_sum_when_string_input_ignore_value_greater_than_one_thousand()
      throws Exception {
    assertThat(stringCalculator.add("1001,2")).isEqualTo(2);
  }

}
