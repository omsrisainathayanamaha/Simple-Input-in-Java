import java.lang.System;
import java.util.Scanner;
  
  public class useScanner{
    public static void main(String [] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String x = scan.nextLine();
    System.out.println("Hi "+x+"!");
    }


}