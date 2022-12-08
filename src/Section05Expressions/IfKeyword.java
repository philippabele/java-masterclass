package Section05Expressions;

public class IfKeyword {
    public static void main(String[] args) {

        int score = 4000;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Score is okay, but still a long way to the top");
        } else if (bonus > 60) {
            System.out.println("Luky Luke, you have a bonus to go on");
        } else {
            System.out.println("Game Over, try again");
        }

    }
}
