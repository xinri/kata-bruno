import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ArabicNumeralsShould {

  @Test
  public void return_1_when_input_is_I() {
    ArabicNumerals arabicNumerals = new ArabicNumerals();
    int actual = arabicNumerals.toArabic("I");
    assertThat(actual).isEqualTo(1);
  }

  @Test
  public void return_2_when_input_is_II() {
    ArabicNumerals arabicNumerals = new ArabicNumerals();
    int actual = arabicNumerals.toArabic("II");
    assertThat(actual).isEqualTo(2);
  }

  @Test
  public void return_3_when_input_is_III() {
    ArabicNumerals arabicNumerals = new ArabicNumerals();
    int actual = arabicNumerals.toArabic("III");
    assertThat(actual).isEqualTo(3);
  }


  @Test
  public void return_4_when_input_is_IV() {
    ArabicNumerals arabicNumerals = new ArabicNumerals();
    int actual = arabicNumerals.toArabic("IV");
    assertThat(actual).isEqualTo(4);
  }

  @Test
  public void return_5_when_input_is_V() {
    ArabicNumerals arabicNumerals = new ArabicNumerals();
    int actual = arabicNumerals.toArabic("V");
    assertThat(actual).isEqualTo(5);
  }

  @Test
  public void return_6_when_input_is_VI() {
    ArabicNumerals arabicNumerals = new ArabicNumerals();
    int actual = arabicNumerals.toArabic("VI");
    assertThat(actual).isEqualTo(6);
  }


}
