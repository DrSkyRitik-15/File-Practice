
import java.io.*;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        try {
            File file = new File("Red.txt");
            FileReader file2 = new FileReader(file);
            
            // System.out.println(line);
            // Scanner kola=new Scanner(file);
            // while(kola.hasNextLine())          // word reverse  ///////////////////////////////// hole line 
            // {
            //     StringBuilder as=new StringBuilder(kola.nextLine());
            //     as.reverse();

            //     System.out.print(as+" ");
            // }
            /////////////////////////////////////////////////////////////////////////////////Only word
            // Scanner sc=new Scanner(file);
            // while(sc.hasNext()){
            //     StringBuilder O=new StringBuilder(sc.next());
            //     O.reverse();
            //     System.out.print(O+" ");
            // }
            /////////////////////////////////////////////////////////////////////////////////////// Charcter
            // int i;
            // while ((i=file2.read())!=-1) {
            //     System.out.print((char)(i));
                
            // }
            ///////////////////////////////////////////////////////////////////////////////////////// First letter Big 
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                StringBuilder as=new StringBuilder();
                String g=sc.next();
                String O=g.substring(0,1).toUpperCase()+g.substring(1);
               
                
                System.out.print(O+" ");
            }
            

            // reader.close();
        } catch (IOException e) {
            System.out.println("File not found or error reading the file.");
        }
    }
}
