import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.Test;

public class WrapperShould {

  @Test
  public void return_text_when_column_number_is_greater_than_text_length() {
    String text = "test";
    String result = Wrapper.wrap(text, 5);
    assertThat(result).isEqualTo(text);
  }

  @Test
  public void return_break_word_in_the_middle_when_column_number_is_in_the_space() {
    String result = Wrapper.wrap("Hello World", 5);
    assertThat(result).isEqualTo("Hello\nWorld");
  }

  @Test
  public void return_break_in_the_middle_when_column_number_is_greater_than_the_space(){
    String result = Wrapper.wrap("Bonjour monde", 9);
    assertThat(result).isEqualTo("Bonjour\nmonde");
  }

  @Test
  public void return_break_twice_when_column_number_is_greater_than_the_two_space() {
    String result = Wrapper.wrap("Hello World Hello", 6);
    assertThat(result).isEqualTo("Hello\nWorld\nHello");
  }

  @Test
  public void return_break_once_when_column_number_is_in_after_the_second_space() {
    String result = Wrapper.wrap("Hello World Hello World", 11);
    assertThat(result).isEqualTo("Hello World\nHello World");
  }

  @Test
  public void return_break_at_column_number_when_there_is_no_space() {
    String result = Wrapper.wrap("HelloWorldHelloWorld", 5);
    assertThat(result).isEqualTo("Hello\nWorld\nHello\nWorld");
  }
}
