import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class methods_Christian {
    public static int antalspelare() {
       /* Denna kod bestämmer hur många som ska spela ett spel.*/

        //scanner
        Scanner kb = new Scanner(System.in);

        //antalspelare val
        System.out.println("would you like to play one or two players?");

        //val av antalspelare
        int antal = kb.nextInt();

        return antal;
    }

    public static String ordval() {
        /*Det här är om det är en person som ska välja ett ord.*/

        //scanner
        Scanner kb = new Scanner(System.in);

        //ordvalet
        System.out.println("Write the word you would like your opponent to guess!");
        String ord = kb.nextLine();

        //massvis med rader för att personen som ska gissa ordet inte ska kunna se detta ord.
        for (int i = 0; i < 100; i++){
            System.out.println();
        }
        return ord;
    }

    public static int gissa_ordet(String ord) {
        /* Det här är koden som gör att personen kan gissa bokstäver. Denna person kan även gissa hela ordet och kunna få rätt för det.*/

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

        //antalet bokstäver som är i ordet skrivet ut i bindesträck.
        for (int i = 0; i < array.length; i++){
            array[i] = '-';
        }
        System.out.println();

        //koden som körs när personen ska gissa bokstäver eller hela ordet.
        while (falskt < 10 && correct < längd) {
            System.out.println("Guess a letter or the word");
            String gissning = kb.next();
            gissning.toLowerCase();

            char bokstav = gissning.charAt(0);

            int indexC = check.indexOf(bokstav);

            int count = 0;

            //Den här koden testar ifall gissningen var rätt eller inte.
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

                        //den här for loopen byter ut din gissning ifall den var rätt i array så att du kan se alla dina rätta gissningar.
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

                        //printar ut ASCII version av en hängd gubbe rätt emot hur måpnga fel man har.
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

                //skriver ut alla rätta gissningar och hur många bokstäver det är kvar i ordet som inte har gissats
                System.out.print("word:");
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
                }
                System.out.println();
            } else {
                //ifall hela ordet har gissats så vinner man direkt.
                correct = längd;
            }
        }

        int resultat;

        //kollar om du har klarat av att gissa hela ordet och skickar variabel resultat till nästa metod.
        if (correct == längd)
            resultat = correct;
        else
            resultat = falskt * -1;

        return resultat;
    }

    public static void results(int resultat) {


        //skriver ut om du har vunnit eller inte.
        if (resultat > 0)
            System.out.println("You won the game!" + "\n" + "Congratulations!");
        else
            System.out.println("Game over" + "\n" + "Better luck next time!");
    }

    public static boolean Restart(){
        //scanner
        Scanner kb = new Scanner(System.in);

        System.out.print("Would you like to play another game? Yes or no?");

        String ans = kb.nextLine();
        ans.toLowerCase();
        if (!ans.equals("yes")){
            game = false;
        }
        return  game;
    }
}
