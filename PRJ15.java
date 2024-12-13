import java.lang.System;
import java.util.Scanner;
import java.util.IllegalFormatException;

public class PRJ15{
    public static void main(String[] args) {
        
        String red = "\u001b[31m";
        String green= "\u001B[32m";
        String yellow ="\u001b[33m";
        String blue = "\u001B[34";
        String reset= "\u001B[0m";

Scanner input = new Scanner(System.in);
System.out.println("Enter Your Name to get the Assignment Details,Nirmal / Andrews/ Raphael");
String a= input.nextLine().toUpperCase();

if (a.equals("NIRMAL"))
     {
        System.out.println(red + "1.Go to School " + reset);
        System.out.println(red + "2.Attend class " + reset);
        System.out.println(red + "3.the come back to home " + reset );
    }

else if (a.equals("ANDREWS"))
      {
        System.out.println(green + "1.Go to OFFICE " + reset );
         System.out.println(green + "2.Attend meeting " + reset);
         System.out.println(green + "3.the come back to home " + reset);
     } 

else if(a.equals("RAPHAEL"))

    {
        System.out.println(blue + "1.Go to Delhi" + reset);
        System.out.println(blue + "2.Attend BRDA " + reset);
        System.out.println(blue + "3.the come back to home " + reset);

    }
else    
    {
        throw new IllegalArgumentException("INVALID Input: Please Enter Only Nirmal /Andrews/ or Raphael");
    }

    }
}