import java.io.*;
public class A01 {
    public static void main(String[] args) {
        try{
        FileReader fr=new FileReader("Ritik.txt");
        FileWriter jn=new FileWriter("JANU.txt");
        int i;
        while((i=fr.read())!=-1){
            jn.write(i);
        }
        fr.close();
        jn.close();
        System.out.println("File copied");
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
