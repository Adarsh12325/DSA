import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileHandling1 {
    public static void main(String args[]){
        try{
            File obj = new File("Adarsh.txt");
            obj.createNewFile();
            FileWriter x = new FileWriter(obj);
            x.write("My name is Adarsh");
            x.close();
            Scanner sc = new Scanner(obj);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            
        }
        catch(IOException s){
            System.out.println("Execution error");
        }
    }
}
