
import java.io.*;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        try {
            File file = new File("Red.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            // System.out.println(line);
            Scanner kola=new Scanner(file);
            while(kola.hasNext())          // word reverse
            {
                StringBuilder as=new StringBuilder(kola.next());
                as.reverse();

                System.out.print(as+" ");
            }


           

            reader.close();
        } catch (IOException e) {
            System.out.println("File not found or error reading the file.");
        }
    }
}
