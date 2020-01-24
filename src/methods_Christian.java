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

        for (int i = 0; i < 100; i++){
            System.out.println();
        }
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
        char[] array = new char[längd];
        ord.toLowerCase();

        for (int i = 0; i < array.length; i++){
            array[i] = '-';
        }
        System.out.println();

        while (falskt < 10 && correct < längd) {
            System.out.println("Guess a letter or the word");
            String gissning = kb.next();
            gissning.toLowerCase();
            
            char bokstav = gissning.charAt(0);

            int indexC = check.indexOf(bokstav);

            int count = 0;


            if (!gissning.equals(ord)) {
                for (int i = 0; i < längd; i++) {
                    if (ord.charAt(i) == bokstav) {
                        count++;
                    }
                }

                if (1 < count) {
                    correct++;
                }

                if (indexC < 0) {
                    int index = ord.indexOf(bokstav);
                    if (index >= 0) {
                        correct++;
                        System.out.println("Your guess was correct, nice job!" + "\n");

                        for (int i = 0; i < array.length; i++) {
                            if (bokstav == ord.charAt(i)) {
                                array[i] = bokstav;
                            }
                        }
                        System.out.println("");

                    } else {
                        falskt++;
                        System.out.println("Your guess was incorrect, try again!" + "\n");
                        word += " " + bokstav;

                        methods_Rasmus.Gubbe(falskt);

                        if (falskt == 1) {
                            System.out.println("");
                        }
                    }
                } else {
                    System.out.println("This letter has already been guessed, guess another letter!" + "\n");
                }

                check += bokstav;
                System.out.println("guesses: " + word);

                System.out.print("word:");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
                }
                System.out.println();
            } else {
                correct = längd;
            }
        }

        int resultat;

        if (correct == längd)
            resultat = correct;
        else
            resultat = falskt * -1;

        return resultat;
    }

    public static void results(int resultat) {

        if (resultat > 0)
            System.out.println("You won the game!" + "\n" + "Congratulations!");
        else
            System.out.println("Game over" + "\n" + "Better luck next time!");
    }
}
