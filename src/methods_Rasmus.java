import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

public class methods_Rasmus {
    public static String Dator() throws IOException {

        // slumpar rad
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(855);

        // dator väljer ord
        String ord;
        try (Stream<String> lines = Files.lines(Paths.get("res/wordlist.md"))) {
            ord = lines.skip(randomInt).findFirst().get();
        }
        return ord;

    }

    public static void Gubbe() {
        if (falskt = 1) {
            System.out.println("===========");
        }
        else if (falskt = 2){
            System.out.println("| \n"
            + "| \n"
            + "| \n"
            + "| \n"
            + "| \n"
            + "| \n"
            + "| \n"
            + "=========== \n"
            );

        }
        else if (falskt = 3){
            System.out.println(" +-----+ \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "        | \n"
            + "=========== \n"
            );

        }
        else if (falskt = 4){
            System.out.println(" +-----+ \n"
                    + " |    | \n"
                    + " |    |\n"
                    + "      |\n"
                    + "      |\n"
                    + "      |\n"
                    + "      |\n"
                    + "=========== \n"
            );

        }
        else if (falskt = 5){
            System.out.println(System.out.println(" +-----+ \n"
                    + " |    | \n"
                    + " |    |\n"
                    + " o    |\n"
                    + "      |\n"
                    + "      |\n"
                    + "      |\n"
                    + "=========== \n");
        }
        else if (falskt = 6){
            System.out.println(" +-----+ \n"
                    + " |    | \n"
                    + " |    |\n"
                    + " o    |\n"
                    + " |    |\n"
                    + "      |\n"
                    + "      |\n"
                    + "=========== \n");
        }
        else if (falskt = 7){
            System.out.println(" +-----+ \n"
                    + " |    | \n"
                    + " |    |\n"
                    + " o    |\n"
                    + " |    |\n"
                    + "/     |\n"
                    + "      |\n"
                    + "=========== \n");

        }
        else if (falskt = 8){
            System.out.println(" +-----+ \n"
                    + " |    | \n"
                    + " |    |\n"
                    + " o    |\n"
                    + " |    |\n"
                    + "/ \\   |\n"
                    + "      |\n"
                    + "=========== \n");
        }
        else if (falskt = 9){
            System.out.println(" +-----+ \n"
                    + " |    | \n"
                    + " |    |\n"
                    + "\\o    |\n"
                    + " |    |\n"
                    + "/ \\   |\n"
                    + "      |\n"
                    + "=========== \n");

        }
        else if (falskt = 10) {
            System.out.println(" +-----+ \n"
                    + " |    | \n"
                    + " |    |\n"
                    + "\\o/    |\n"
                    + " |    |\n"
                    + "/ \\   |\n"
                    + "      |\n"
                    + "=========== \n");
        }
    }
}
