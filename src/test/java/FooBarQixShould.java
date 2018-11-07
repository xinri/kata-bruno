import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.Test;

public class FooBarQixShould {

  @Test
  public void return_regular_number_when_regular_number_given_1_case() {
    FooBarQix fooBarQix = new FooBarQix();
    assertThat(fooBarQix.generate(1)).isEqualTo("1");
  }

  @Test
  public void return_regular_number_when_regular_number_given_2_case() {
    FooBarQix fooBarQix = new FooBarQix();
    assertThat(fooBarQix.generate(2)).isEqualTo("2");
  }

  @Test
  public void return_foofoo_when_number_is_divisible_by_3_and_contains_3() {
    FooBarQix fooBarQix = new FooBarQix();
    assertThat(fooBarQix.generate(3)).isEqualTo("foofoo");
  }

  @Test
  public void return_barbar_when_number_is_divisible_by_5_and_contains_5() {
    FooBarQix fooBarQix = new FooBarQix();
    assertThat(fooBarQix.generate(5)).isEqualTo("barbar");
  }

  @Test
  public void return_qixqix_when_number_is_divisible_by_7_and_contains_7() {
    FooBarQix fooBarQix = new FooBarQix();
    assertThat(fooBarQix.generate(7)).isEqualTo("qixqix");
  }
}

