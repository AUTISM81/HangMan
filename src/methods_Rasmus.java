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
}