package Section05Expressions;

public class MethodExample {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        System.out.println("Your final score was " + finalScore);

        // arguments are the values which are passed to the methode
        int newScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + newScore);

        // you can reuse the return of a methode directly
        System.out.println("Your final score was " +
                calculateScore(gameOver, score, levelCompleted, bonus));

        System.out.println("Your Position is " +
                calculateHighScorePosition(newScore));

    }

    // method with return value ? >> call it a function
    // method without a return value ? >> some call it procedure
    // parameters are defined in the function declaration
    private static int calculateScore(boolean gameOver, int score,
            int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }
        return finalScore;

    }

    // challenge
    private static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;

    }

}
