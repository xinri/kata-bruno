public class Year {

  public boolean isLeap(int year) {
    return (isDivisibleBy(year, 4) && !(isDivisibleBy(year, 100))) || (isDivisibleBy(year, 400));
  }

  private boolean isDivisibleBy(int year, int modulo) {
    return (year % modulo) == 0;
  }
}
