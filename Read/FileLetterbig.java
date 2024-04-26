
import java.io.*;
import java.util.Scanner;

public class FileLetterbig {
    public static void main(String[] args) {
        try {
            File file = new File("Red.txt");
            
            Scanner kola=new Scanner(file);
            while(kola.hasNext()) 
            {
                StringBuilder as=new StringBuilder();
                String lola=kola.next();
                String O=lola.substring(0,1).toUpperCase()+lola.substring(1);
                as.append(O).append(" ");
                

                System.out.print(as.toString());
            }


           

            // reader.close();
        } catch (IOException e) {
            System.out.println("File not found or error reading the file.");
        }
    }
}
