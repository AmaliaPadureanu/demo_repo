import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class ReadContentsFile {
    public static void main (String[] args) {
        Path filePathHello = Paths.get("C:/Users/Amalia/OneDrive/Desktop/hello.txt");
        try {
            String contents = Files.readString(filePathHello);
                System.out.println(contents);
        }
        catch (IOException err) {
            err.printStackTrace();
        }
    }
}
