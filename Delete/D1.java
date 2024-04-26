import java.io.*;
import java.util.*;

public class D1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("RITIK.txt");
            File f2 = new File("JANUf2.txt");
            if(f1.exists())
            {
                System.out.println(f1.renameTo(f2));

            }
        } catch (Exception e)

        {
            System.out.println("Apple ");
        }

    }
}
