import java.util.HashMap;
import java.util.Map;

public class RomainNumeral {

  private Map<Integer, String> symbols = new HashMap();

  public RomainNumeral() {
    symbols.put(1, "I");
    symbols.put(4, "IV");
    symbols.put(5, "V");
    symbols.put(9, "IX");
    symbols.put(10, "X");
  }

  public String convert(int arabicNumber) {

    String result = "";

    for (int i = arabicNumber; i >= 0; i--) {

      if (symbols.containsKey(i)) {
        result += symbols.get(i);
        arabicNumber-=i;
        break;
      }
    }

    for (int i = 0; i < arabicNumber; i++) {
      result += "I";
    }
    return result;
  }
}
