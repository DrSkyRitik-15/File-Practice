import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("Red.txt");
            // file.createNewFile();
            FileReader hola=new FileReader(file);
            

            ArrayList<Character> lines = new ArrayList<>();
       
            int line;
            while ((line = hola.read()) != -1) {
                lines.add((char)line);
            }

            // Reverse the order of lines
            Collections.reverse(lines);

            // Print the reversed content
            for (Character reversedLine : lines) {
                System.out.print(reversedLine);
            }

            hola.close();
        } catch (IOException e) {
            System.out.println("File not found or error reading the file.");
        }
    }
}
