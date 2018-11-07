public class Wrapper {

  public static String wrap(String text, int columnNumber) {
    if (isUnbreakable(text, columnNumber)) {
      return text;
    }

    BreakOnSpaceAttempt breakOnSpaceAttempt = attemptToBreakOnSpace(text, columnNumber);

    if (breakOnSpaceAttempt.isSuccess) {
      return breakOnSpaceAttempt.brokenText;
    }

    return text.substring(0, columnNumber) + "\n" + wrap(text.substring(columnNumber),
        columnNumber);
  }

  private static BreakOnSpaceAttempt attemptToBreakOnSpace(String text, int columnNumber) {

    for (int i = columnNumber; i >= 0; i--) {
      if (text.charAt(i) == ' ') {
        return new BreakOnSpaceAttempt(
            text.substring(0, i) + "\n" + wrap(text.substring(i + 1), columnNumber));
      }
    }

    return new BreakOnSpaceAttempt();
  }

  private static boolean isUnbreakable(String text, int columnNumber) {
    return text.length() <= columnNumber;
  }
}

class BreakOnSpaceAttempt {

  public boolean isSuccess;
  public String brokenText;

  BreakOnSpaceAttempt() {
    this(null);
  }

  BreakOnSpaceAttempt(String brokenText) {
    this.brokenText = brokenText;
    this.isSuccess = brokenText != null;
  }
}