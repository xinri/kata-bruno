import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.Test;

public class RomainNumeralShould {

  @Test
  public void return_I_when_input_1() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(1);

    assertThat(actual).isEqualTo("I");
  }

  @Test
  public void return_II_when_input_2() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(2);
    assertThat(actual).isEqualTo("II");
  }

  @Test
  public void return_III_when_input_3() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(3);
    assertThat(actual).isEqualTo("III");
  }

  @Test
  public void return_IV_when_input_4() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(4);
    assertThat(actual).isEqualTo("IV");
  }

  @Test
  public void return_V_when_input_5() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(5);
    assertThat(actual).isEqualTo("V");
  }

  @Test
  public void return_VI_when_input_6() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(6);
    assertThat(actual).isEqualTo("VI");
  }

  @Test
  public void return_VII_when_input_7() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(7);
    assertThat(actual).isEqualTo("VII");
  }

  @Test
  public void return_IX_when_input_9() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(9);
    assertThat(actual).isEqualTo("IX");
  }

  @Test
  public void return_X_when_input_10() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(10);
    assertThat(actual).isEqualTo("X");
  }

  @Test
  public void return_XIV_when_input_14() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(14);
    assertThat(actual).isEqualTo("XIV");
  }

  @Test
  public void return_XV_when_input_15() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(15);
    assertThat(actual).isEqualTo("XV");
  }

  @Test
  public void return_XXIV_when_input_24() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(24);
    assertThat(actual).isEqualTo("XXIV");
  }

  @Test
  public void return_XL_when_input_40() {
    RomainNumeral romainNumeral = new RomainNumeral();
    String actual = romainNumeral.convert(40);
    assertThat(actual).isEqualTo("XL");
  }

}
