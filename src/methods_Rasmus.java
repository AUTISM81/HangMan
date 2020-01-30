import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

public class methods_Rasmus {
    public static String Dator() throws IOException {

        // Dator slumpar rad
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(855);

        // Dator väljer ord som är på den slumpade raden
        String ord;
        try (Stream<String> lines = Files.lines(Paths.get("res/wordlist.md"))) {
            ord = lines.skip(randomInt).findFirst().get();
        }
        return ord;

    }

    // Dator printar ut ASCII Art beroende på antal fel
    public static void Gubbe(int falskt) {
        if (falskt == 1) {
            System.out.println("===========");
        }
        else if (falskt == 2){
            System.out.println("        | \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "=========== \n"
            );

        }
        else if (falskt == 3){
            System.out.println(" +------+ \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "=========== \n"
            );

        }
        else if (falskt == 4){
            System.out.println(" +------+ \n"
                    + " |      | \n"
                    + " |      |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "=========== \n"
            );

        }
        else if (falskt == 5){
            System.out.println(" +------+ \n"
                    + " |      | \n"
                    + " |      |\n"
                    + " o      |\n"
                    + "        |\n"
                    + "        |\n"
                    + "        |\n"
                    + "=========== \n");
        }
        else if (falskt == 6){
            System.out.println(" +------+ \n"
                    + " |      | \n"
                    + " |      |\n"
                    + " o      |\n"
                    + " |      |\n"
                    + "        |\n"
                    + "        |\n"
                    + "=========== \n");
        }
        else if (falskt == 7){
            System.out.println(" +------+ \n"
                    + " |      | \n"
                    + " |      |\n"
                    + " o      |\n"
                    + " |      |\n"
                    + "/       |\n"
                    + "        |\n"
                    + "=========== \n");

        }
        else if (falskt == 8){
            System.out.println(" +------+ \n"
                    + " |      | \n"
                    + " |      |\n"
                    + " o      |\n"
                    + " |      |\n"
                    + "/ \\     |\n"
                    + "        |\n"
                    + "=========== \n");
        }
        else if (falskt == 9){
            System.out.println(" +------+ \n"
                    + " |      | \n"
                    + " |      |\n"
                    + "\\o      |\n"
                    + " |      |\n"
                    + "/ \\     |\n"
                    + "        |\n"
                    + "=========== \n");

        }
        else if (falskt == 10) {
            System.out.println(" +------+ \n"
                    + " |      | \n"
                    + " |      |\n"
                    + "\\o/     |\n"
                    + " |      |\n"
                    + "/ \\     |\n"
                    + "        |\n"
                    + "=========== \n");
        }
    }
}
