public class Section05 {

    public static void main(String[] args) {

        // count the number of expressions

        int highscore = 60; // 1 expression
        int health = 100; // 1 expression

        if ((health < 25) && (highscore > 1000)) { // 3 expression
            highscore = highscore - 1000; // 2 expression
        }

    }

}
