import java.io.IOException;

//Det här programmet kör Hänga gubbe.

public class HangMan {
    public static void main(String[] args) throws IOException {
        boolean game = true;

        while (game == true) {
            String ord;

            int antal = methods_Christian.antalspelare();

            if (antal >= 2) {
                ord = methods_Christian.ordval();
            } else {
                ord = methods_Rasmus.Dator();
            }

            int resultat = methods_Christian.gissa_ordet(ord);

            methods_Christian.results(resultat);
            System.out.println("The word was:" + ord);
        }


    }
}
