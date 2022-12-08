package Section05Expressions;

public class ExpressionsAndWhitespace {

    public static void main(String[] args) {

        // count the number of expressions

        int highscore = 60; // 1 expression
        int health = 100; // 1 expression

        if ((health < 25) && (highscore > 1000)) { // 3 expression
            highscore = highscore - 1000; // 2 expression
        }

        // whitespace is ignored in java, but improves human readability

        System.out.println("This print spans " +
                "across several lines of code, " +
                "but end in this third one.");

    }

}
