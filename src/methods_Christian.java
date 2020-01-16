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

    public static void gissa_ordet(String[] args) {
        //scanner
        Scanner kb = new Scanner(System.in);

        //points
        int correct = 0;
        int falskt = 0;

        int längd = ord.length();

        while (falskt < 10 || correct < längd) {
            System.out.println("Gissa en bokstav");
            char bokstav = kb.next().charAt(0);

            int index = ord.indexOf(bokstav);
            if (index >= 0) {
                correct++;
            } else {
                falskt++;
            }
        }
        System.out.println("Congrats");
    }
}
