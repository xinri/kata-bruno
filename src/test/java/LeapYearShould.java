import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.Test;

public class LeapYearShould {

  @Test
  public void return_false_when_year_is_typical_common_year() {
    Year year = new Year();

    assertThat(year.isLeap(2001)).isFalse();
  }

  @Test
  public void return_true_when_year_is_a_typical_year() {
    Year year = new Year();

    assertThat(year.isLeap(1996)).isTrue();
  }

  @Test
  public void return_false_when_year_is_an_atypical_common_year() {
    Year year = new Year();

    assertThat(year.isLeap(1900)).isFalse();
  }

  @Test
  public void return_true_when_year_is_an_atypical_leap_year() {
    Year year = new Year();

    assertThat(year.isLeap(2000)).isTrue();
  }
}
