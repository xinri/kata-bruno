public class Game {

  private int[] pinsDown = new int[21];
  private int currentRoll = 0;

  public void roll(int nbPinDown) {
    pinsDown[currentRoll++] = nbPinDown;
  }

  public int score() {
    int score = 0;
    for (int i = 0; i < currentRoll; i += 2) {
      int frame = getScoreFrame(i);
      score += frame;
      if (isStrike(i)) {
        score += getStrikeBonus(i);
      }
      else if (isSpare(frame)) {
        score += getSpareBonus(i);
      }
    }
    return score;
  }

  private int getScoreFrame(int currentRoll) {
    return pinsDown[currentRoll] + pinsDown[currentRoll+1];
  }

  private int getStrikeBonus(int currentRoll) {
    return pinsDown[currentRoll+2] + pinsDown[currentRoll + 3];
  }

  private int getSpareBonus(int currentRoll) {
    return pinsDown[currentRoll + 2];
  }

  private boolean isSpare(int frame) {
    return frame == 10;
  }

  private boolean isStrike(int firstRoll) {
    return pinsDown[firstRoll] == 10;
  }
}
