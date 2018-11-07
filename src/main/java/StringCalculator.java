public class StringCalculator {

  public int add(String stringInput) throws Exception {
    if (stringInput.isEmpty()) {
      return 0;
    }

    String delimiter = ",";

    if (stringInput.startsWith("//")) {
      delimiter = String.valueOf(stringInput.charAt(2));
      stringInput = stringInput.substring(4);
    }

    int sum = 0;

    String[] tokens = stringInput.split(delimiter + "|\n");
    String negativeValue="";

    for (String token : tokens) {
      Integer tokenValue = Integer.valueOf(token);

      if (tokenValue < 0) {
        negativeValue += "," + tokenValue;
      }

      if (tokenValue <= 1000) {
        sum += tokenValue;
      }
    }

    if (!negativeValue.isEmpty()) {
      throw new Exception("Negatives not allowed : " + negativeValue.substring(1));
    }

    return sum;
  }
}
