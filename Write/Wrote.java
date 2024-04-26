
import java.io.*;
import java.util.Scanner;

public class Wrote {
    public static void main(String[] args) {
        try {
            File file = new File("Red.txt");

            FileWriter fw = new FileWriter(file);
            fw.write("Hello World");
            fw.close();

            File file2 = new File("Red.txt");
            FileReader lola = new FileReader(file2);

            Scanner kola = new Scanner(lola);
            while (kola.hasNext()) // word reverse
            {
                StringBuilder as = new StringBuilder(kola.next());
                as.reverse();

                System.out.print(as + " ");
            }

            lola.close();
        } catch (IOException e) {
            System.out.println("File not found or error reading the file.");
        }
    }
}
