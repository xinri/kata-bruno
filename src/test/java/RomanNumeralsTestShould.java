import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.Test;

public class RomanNumeralsTestShould {

  @Test
  public void return_1_when_input_is_I(){
    RomanNumeral romanNumeral = new RomanNumeral();
    String actual = romanNumeral.toRoman(1);

    assertThat(actual).isEqualTo("I");
  }

  @Test
  public void return_2_when_input_is_II(){
    RomanNumeral romanNumeral = new RomanNumeral();
    String actual = romanNumeral.toRoman(2);

    assertThat(actual).isEqualTo("II");
  }

  @Test
  public void return_3_when_input_is_III(){
    RomanNumeral romanNumeral = new RomanNumeral();
    String actual = romanNumeral.toRoman(3);

    assertThat(actual).isEqualTo("III");
  }

  @Test
  public void return_4_when_input_is_IV(){
    RomanNumeral romanNumeral = new RomanNumeral();
    String actual = romanNumeral.toRoman(4);

    assertThat(actual).isEqualTo("IV");
  }

  @Test
  public void return_5_when_input_is_V(){
    RomanNumeral romanNumeral = new RomanNumeral();
    String actual = romanNumeral.toRoman(5);

    assertThat(actual).isEqualTo("V");
  }

  @Test
  public void return_6_when_input_is_VI(){
    RomanNumeral romanNumeral = new RomanNumeral();
    String actual = romanNumeral.toRoman(6);

    assertThat(actual).isEqualTo("VI");
  }

}
