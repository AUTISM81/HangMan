import java.util.Scanner;

public class methods_Christian {
    public static int antalspelare(String[] args) {
        //scanner
        Scanner kb = new Scanner(System.in);

        //antalspelare val
        System.out.println("Skulle du vela spela med en eller två spelare?");

        int antal = kb.nextInt();

        return antal;
    }

    public static String ordval(String[] args) {
        //scanner
        Scanner kb = new Scanner(System.in);

        //ordvalet
        String ord = kb.nextLine();

        return ord;
    }

    public static int gissa_ordet(String[] args) {
        //scanner
        Scanner kb = new Scanner(System.in);

        //points
        int correct = 0;
        int falskt = 0;

        String ord = "gay";

        int längd = ord.length();

        String check = "";

        while (falskt < 10 && correct < längd) {
            System.out.println("Gissa en bokstav");
            char bokstav = kb.next().charAt(0);

            int indexC = check.indexOf(bokstav);

            if (indexC < 0) {
                int index = ord.indexOf(bokstav);
                if (index >= 0) {
                    correct++;
                } else {
                    falskt++;
                }
            } else {
                System.out.println("Du har redan gissat det");
            }
            check += bokstav;
        }

        int result;

        if (correct == 10)
            result = correct;
        else
            result = falskt;

        return result;
    }

    
}
