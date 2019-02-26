public class Game {

  private int[] pinsDown = new int[21];
  private int currentRoll = 0;

  public void roll(int nbPinDown) {
    if ((currentRoll % 2 == 0) && nbPinDown == 10 && currentRoll < 18) {
      pinsDown[currentRoll++] = nbPinDown;
      currentRoll++;
    } else {
      pinsDown[currentRoll++] = nbPinDown;
    }
  }

  public int score() {
    int score = 0;
    for (int i = 0; i < 20; i += 2) {
      int frame = getScoreFrame(i);
      score += frame;
      if (isStrike(i)) {
        score += getStrikeBonus(i);
      } else if (isSpare(frame)) {
        score += getSpareBonus(i);
      }
    }
    return score;
  }

  private int getScoreFrame(int currentRoll) {
    if (currentRoll == 18 && pinsDown[currentRoll] == 10) {
      return pinsDown[currentRoll];
    }
    return pinsDown[currentRoll] + pinsDown[currentRoll + 1];
  }

  private int getStrikeBonus(int currentRoll) {
    if (currentRoll == 18) {
      return pinsDown[currentRoll + 1] + pinsDown[currentRoll + 2];
    }

    if (pinsDown[currentRoll + 2] == 10) {
      return pinsDown[currentRoll + 2] + pinsDown[currentRoll + 4];
    }

    return pinsDown[currentRoll + 2] + pinsDown[currentRoll + 3];
  }

  private int getSpareBonus(int currentRoll) {
    return pinsDown[currentRoll + 2];
  }

  private boolean isSpare(int frame) {
    return frame == 10;
  }

  private boolean isStrike(int firstRoll) {
    return pinsDown[firstRoll] == 10 && firstRoll <= 18;
  }
}
