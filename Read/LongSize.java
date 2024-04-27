import java.io.*;
import java.util.*;
public class LongSize {
    public static void main(String[] args) {
        try{
        File f1=new File("Red.txt");
        FileReader kola=new FileReader(f1);

        Scanner jola=new Scanner(kola);
        String s1=" ";
        while (jola.hasNext()) {
            String s2=jola.next();
            
            if(s1.length()<s2.length())
            {
                s1=s2;
            }
        }
        System.out.println(s1);

        }
        catch(Exception e)
        {
            System.out.println("Anythink");
        }

    }
}
