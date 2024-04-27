/* 
import java.io.*;
class create{
    public static void main(String[] args) {
        try{
        File Can=new File("Red.txt");
        Can.createNewFile();

        if (Can.exists()) {
            System.out.println("File is here");
        }
        else
        {
            System.out.println("File not here");
        }
    }
    catch(Exception e)
    {
        System.out.println("File not here");
    }
    }
} */
////////////////////////////////////////////////////////////////////////////////////
/*import java.io.*;
class create{
    public static void main(String[] args) {
        try{
        File Can=new File("Red.txt");
        // Can.createNewFile();
        FileReader hh=new FileReader(Can);
        int i;
        while((i=hh.read())!=-1)
        {
            System.out.print((char)i);
        }

    }
    catch(Exception e)
    {
        System.out.println("File not here");
    }
    }
}*/
import java.io.*;
import java.util.Scanner;

public class ReverseFileContent {
    public static void main(String[] args) {
        try {
            File file = new File("Red.txt");
            
            // System.out.println(line);
            Scanner kola=new Scanner(file);
            while(kola.hasNextLine())          // line reverse
            {
                StringBuilder as=new StringBuilder(kola.nextLine());
                as.reverse();

                System.out.print(as);
            }


           

            // reader.close();/
        } catch (IOException e) {
            System.out.println("File not found or error reading the file.");
        }
    }
}
