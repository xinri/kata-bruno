import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FooBarQix {

  private final Map<Integer, String> mapNumberToFigure;

  public FooBarQix() {
    mapNumberToFigure = new HashMap<>();
    mapNumberToFigure.put(3, "foo");
    mapNumberToFigure.put(5, "bar");
    mapNumberToFigure.put(7, "qix");
  }

  public String generate(int number) {

    String result = "";

    for (Entry<Integer, String> integerStringEntry : mapNumberToFigure.entrySet()) {
      if (number % integerStringEntry.getKey() == 0) {
        result += integerStringEntry.getValue();
      }
    }

    String numberAsString = String.valueOf(number);
    for (Entry<Integer, String> integerStringEntry : mapNumberToFigure.entrySet()) {
      if (numberAsString.contains(String.valueOf(integerStringEntry.getKey()))) {
        result += integerStringEntry.getValue();
      }
    }

    return result.isEmpty() ? String.valueOf(number) : result;
  }
}
