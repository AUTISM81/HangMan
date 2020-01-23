import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class methods_Christian {
    public static int antalspelare() {
        //scanner
        Scanner kb = new Scanner(System.in);

        //antalspelare val
        System.out.println("would you like to play one or two players?");

        int antal = kb.nextInt();

        return antal;
    }

    public static String ordval() {
        //scanner
        Scanner kb = new Scanner(System.in);

        //ordvalet
        System.out.println("Write the word you would like your opponent to guess!");
        String ord = kb.nextLine();

        return ord;
    }

    public static int gissa_ordet(String ord) {
        //scanner
        Scanner kb = new Scanner(System.in);

        //points
        int correct = 0;
        int falskt = 0;

        int längd = ord.length();

        String check = "";
        String word = "";
        String right = "";

        while (falskt < 10 && correct < längd) {
            System.out.println("Guess a letter");
            char bokstav = kb.next().charAt(0);

            int indexC = check.indexOf(bokstav);

            if (indexC < 0) {
                int index = ord.indexOf(bokstav);
                if (index >= 0) {
                    correct++;
                    System.out.println("Guess was Correct");
                    right += " " + bokstav;
                } else {
                    falskt++;
                    System.out.println("Wrong, try again");
                }
            } else {
                System.out.println("You have already guessed that");
            }
            word += " " + bokstav;
            check += bokstav;
            System.out.println("So long you have guessed: " + word);
            System.out.println("out of all these guesses the correct is: " + right);
        }

        int resultat;

        if (correct == 10)
            resultat = correct;
        else
            resultat = falskt * -1;

        return resultat;
    }

    public static void results(int resultat) {

        if (resultat > 0)
            System.out.println("You won the game");
        else
            System.out.println("You lost the game");
    }
}
