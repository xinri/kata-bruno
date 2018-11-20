import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArabicNumerals {


  Map<String, Integer> symbols = new LinkedHashMap<>();

  public ArabicNumerals() {
    symbols.put("V", 5);
    symbols.put("IV", 4);
    symbols.put("I", 1);
  }

  public int toArabic(String romanNumber) {
    int arabicNumber = 0;
    while (romanNumber.length() > 0) {
      for (Entry<String, Integer> symbol : symbols.entrySet()) {
        if (romanNumber.startsWith(symbol.getKey())) {
          romanNumber = romanNumber.substring(symbol.getKey().length());
          arabicNumber += symbol.getValue();
        }
      }
    }
    return arabicNumber;
  }
}
