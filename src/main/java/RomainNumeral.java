import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RomainNumeral {

  private Map<Integer, String> symbols = new LinkedHashMap<>();

  public RomainNumeral() {
    symbols.put(40, "XL");
    symbols.put(10, "X");
    symbols.put(9, "IX");
    symbols.put(5, "V");
    symbols.put(4, "IV");
    symbols.put(1, "I");

  }

  public String convert(int arabicNumber) {
    String result = "";
    for (Entry<Integer, String> symbolEntry : symbols.entrySet()) {
      while (symbolEntry.getKey() <= arabicNumber) {
        result += symbolEntry.getValue();
        arabicNumber -= symbolEntry.getKey();
      }
    }
    return result;
  }
}
