import java.util.HashMap;
import java.util.Map;

public class RomainNumeral {

  private Map<Integer, String> symbols = new HashMap();

  public RomainNumeral() {
    symbols.put(1, "I");
    symbols.put(4, "IV");
    symbols.put(5, "V");
  }

  public String convert(int arabicNumber) {

    if (symbols.containsKey(arabicNumber)) {
      return symbols.get(arabicNumber);
    }

    String result = "";
    for (int i = 0; i < arabicNumber; i++) {
      result += "I";
    }
    return result;
  }
}
