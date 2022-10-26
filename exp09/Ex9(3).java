/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex093;
import java.io.*;
/**
 *
 * @author affrin
 */
public class Ex093 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException,FileNotFoundException{
       FileOutputStream f =new FileOutputStream("file1.txt");
       String s="oops";
       byte b[]=s.getBytes();
       f.write(b);
       System.out.println("BYTE STREAM");
       System.out.println("");
       System.out.println("file1 created successfully");
       FileInputStream f1 =new FileInputStream("file1.txt");
       int r,a,i=0;
       System.out.println("contents in file1");
       while((a=f1.read())!=-1)
       {
         System.out.print((char)a);  
       }
        System.out.println("");
        System.out.println("*********************");
         System.out.println("");
        System.out.println("CHARACTER STREAM");
         System.out.println("");
        FileWriter f2=new FileWriter("file9.txt");
         f2.write("apple");
         System.out.println("file2 created successfully");
        FileReader f3=new FileReader("file2.txt");
        System.out.println("contents in file2");
       while((a=f3.read())!=-1)
       {
         System.out.print((char)a);  
       }
       System.out.println("");
        f2.close();
        f3.close();
    }
   
}

   
