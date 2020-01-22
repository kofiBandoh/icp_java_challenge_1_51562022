//These libraries had to be imported to facilitate the input and output process
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;


public class Essentials{
    // main method fo running the code 
    public static void main(String[] args){
    
 
    Scanner item = new Scanner(System.in);

    System.out.println("Enter Item name: ");
    String i = item.nextLine();
    
    System.out.println("Enter quatity:");
    int q = item.nextInt();

    System.out.println("Enter the price: ");
    double p = item.nextDouble();

    EssProduct Product = new EssProduct(i, q, p);
    System.out.println(Product);

    write(Product); 
    EssBackUp();
    }
    // class created to get the details of the product,and write it to the file.
    // The EssProduct class is called here
    public static void write(EssProduct p){
        String NameItem = p.getNameItem();
        int Qty = p.getQty();
        double Price = p.getPrice();

        PrintWriter print = null;
        
        try{
            print = new PrintWriter(new  FileOutputStream("essentials_stock.txt", true));
        }
        catch(FileNotFoundException e){
            e.getMessage();
        }

        print.printf(NameItem + "," + Qty +  "GHC %.2f", Price);
        print.println();

        print.close();
    }

    //This created a back up file required
    public static void EssBackUp(){
        Path file = Paths.get("essentials_stock.txt");
        Path BackUp = Paths.get("backup_essentials_stock.txt");

        try{
            Files.copy(file,BackUp);

        }
        catch(IOException i){
            i.printStackTrace();
        }
    }
}