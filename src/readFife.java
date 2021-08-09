import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class readFife {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testfile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("test row 1 ");
        pw.println("test row 2");

        pw.close();
    }
}
