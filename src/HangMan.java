import java.io.IOException;

public class HangMan {
    public static void main(String[] args) throws IOException {
        int antal = methods_Christian.antalspelare();
        String ord;

        methods_Christian.antalspelare();
        if (antal >= 2){
            methods_Christian.ordval();
            ord = methods_Christian.ordval();
        } else {
            methods_Rasmus.Dator();
            ord = methods_Rasmus.Dator();
        }

        methods_Christian.gissa_ordet(ord);
    }
}
