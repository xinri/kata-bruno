import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RomanNumeral {

  LinkedHashMap<Integer, String> symbols = new LinkedHashMap();

  public RomanNumeral() {
    symbols.put(5, "V");
    symbols.put(4, "IV");
    symbols.put(1, "I");
  }

  public String toRoman(int arabicNumber) {
    String romanNumber = "";
    while (arabicNumber > 0) {
      for (Entry<Integer, String> symbol : symbols.entrySet()) {
        if (arabicNumber >= symbol.getKey()) {
          arabicNumber -= symbol.getKey();
          romanNumber += symbol.getValue();
        }
      }
    }
    return romanNumber;
  }
}
