package GUESSINGGAME;
public class Scorerecord {
    private int attempts;

    public void increasedattempts() {
        attempts++;
    }

    public int getScore() {
        return attempts;
    }

    public void restartScore() {
        attempts = 0;
    }
}
