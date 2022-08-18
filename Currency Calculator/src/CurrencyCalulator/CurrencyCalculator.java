
//Currency Calculator
package CurrencyCalulator; 
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Locale;

import java.io.*;

public class CurrencyCalculator {
    public static void main(String[] args) {
   
    	//Currency being used
        double amount, dollar, pound,  code, euro, yen,  rupee, won, yuan;
        
        //Money format

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, Welcome to the Currency converter!");

        System.out.println("Which currency You want to convert ? ");

        System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Won \t7:Yuan ");
        code = sc.nextInt();

        System.out.println("How much Money you want to convert ?");
        amount = sc.nextFloat();
        
        // currency Symbols//

        Currency us = Currency.getInstance(Locale.US);

        char pd = '\u00A3';
        char eu = '\u20AC';
        char jap = '\u00A5';
        char kor = '\u20A9';
        char ind = '\u20A8';



        // For Ruppe Conversion
        if (code == 1) {

            dollar = amount / 74.39;
            System.out.println("Your " + ind + amount + " Rupee is : " + us.getSymbol() + f.format(dollar) + " Dollar");

            pound = amount / 101.73;
            System.out.println("Your "  + ind + amount + " Rupee is : " + pd + f.format(pound) + " Pound");

            euro = amount / 84.91;
            System.out.println("Your " + ind + amount + " Rupee is : " + eu + f.format(euro) + " Euro");

            yen = amount / 0.63;
            System.out.println("Your " + ind + amount + " Rupee is : " + jap + f.format(yen) + " Yen");

            won = amount / .65;
            System.out.println("Your" + ind + amount + "Rupee is:" + kor + f.format(won) + " Won");

            yuan = amount/ 11.71;
            System.out.println("Your" + ind + amount + "Rupee is:" + jap + f.format(yuan) + " Yuan");


        } else if (code == 2) {
        	
        	
            // For Dollar Conversion

            rupee = amount * 70;
            System.out.println("Your " + us.getSymbol() +amount + " Dollar is : " + ind + f.format(rupee) + " Ruppes");

            pound = amount * 0.78;
            System.out.println("Your " + us.getSymbol() + amount +" Dollar is : " + pd + f.format(pound) + " Pound");

            euro = amount * 0.88;
            System.out.println("Your " + us.getSymbol() + amount  +" Dollar is : " + eu + f.format(euro) + " Euro");

            yen = amount * 156.15;
            System.out.println("Your " + us.getSymbol() + amount +" Dollar is : " + jap + f.format(yen) + " Yen");

            won = amount * 1190.26;
            System.out.println("Your " + us.getSymbol() + amount  +" Dollar is : " + kor + f.format(won) + " Won");

            yuan = amount * 6.35;
            System.out.println("Your "+  us.getSymbol() + amount +" Dollar is : " + jap + f.format(yuan) + " Yuan");


        } else if (code == 3) {
        	
        	
            // For Pound Conversion


            rupee = amount * 101.73;
            System.out.println("Your " + pd + amount  + " pound is : " + ind + f.format(rupee) + " Ruppes");

            dollar = amount * 1.37;
            System.out.println("Your " + pd + amount + " pound is : " + us.getSymbol() + f.format(dollar) + " Dollar");

            euro = amount * 1.20;
            System.out.println("Your " + pd + amount + " pound is : " + eu + f.format(euro) + " Euro");

            yen = amount * 156.22;
            System.out.println("Your " + pd + amount + " pound is : " + jap + f.format(yen) + " Yen");

            won = amount * 1627.62;
            System.out.println("Your " + pd + amount + " pound is:" + kor + f.format(won) + " Won");

            yuan = amount * 8.69;
            System.out.println("Your " + pd + amount + " pound is:" + jap + f.format(yuan) + " Yuan");


        } else if (code == 4) {
            // For Euro Conversion

            rupee = amount * 84.91;
            System.out.println("Your " + eu + amount + " euro is : " + ind + f.format(rupee) + " Ruppes");

            dollar = amount * 1.14;
            System.out.println("Your " + eu + amount + " euro is : " + us.getSymbol() + f.format(dollar) +  " Dollar");
 
            pound = amount * 0.83;
            System.out.println("Your " + eu + amount + " euro is : "  + pd + f.format(pound) + " Pound");

            yen = amount * 130.39;
            System.out.println("Your " + eu + amount + " euro is : " + jap + f.format(yen) + " Yen");

            won = amount * 1358.72;
            System.out.println("Your " + eu + amount + " euro is: "  + kor + f.format (won) + " Won");

            yuan = amount * 7.25;
            System.out.println("Your " + eu +amount + " euro is" + jap + f.format(yuan) + " Yuan");

        } else if (code == 5) {

            // For  Japan Yen Conversion

            rupee = amount * 0.65;
            System.out.println("Your " + jap + amount + " yen is : " + ind + f.format(rupee) + " Ruppes");

            dollar = amount * 0.0088;
            System.out.println("Your " + jap + amount + " yen is : " + us.getSymbol() + f.format(dollar) + " Dollar");

            pound = amount * 0.0064;
            System.out.println("Your " + jap + amount + " yen is : " + pd + f.format(pound) + " Pound");

            euro = amount * 0.0077;
            System.out.println("Your " + jap + amount + " yen is : " + eu + f.format(euro) + " Euro");

            won = amount * 10.42;
            System.out.println("Your " + jap + amount + " Yen is: " + kor + f.format(won) + " Won");

            yuan = amount * .056;
            System.out.println("Your " + jap + amount + " Yen is " + jap + f.format(yuan) + " Yuan");

            //  For Korean Won Conversion
        }else if (code == 6) {

            rupee = amount * 0.062;
            System.out.println("Your " + kor + amount + " Won is : " + ind + f.format(rupee) + " Ruppes");

            dollar = amount * 0.00084;
            System.out.println("Your " + kor + amount + " Won is : " + us.getSymbol() + f.format(dollar)  + " Dollar");

            pound = amount * 0.00061;
            System.out.println("Your " + kor + amount + " Won is : " + pd + f.format(pound) + " Pound");

            euro = amount * 0.00074;
            System.out.println("Your " + kor + amount + " Won is : " + eu + f.format(euro) + " Euro");

            yuan = amount * .0053;
            System.out.println("Your " + kor + amount + " Won is " + jap + f.format(yuan) + " Yuan");

            // Chiness Yuan Conversion

        }else if (code == 7) {

            rupee = amount * 11.71;
            System.out.println("Your " + jap + amount + " Yuan is : " + ind + f.format(rupee) + " Ruppes");

            dollar = amount * 0.16;
            System.out.println("Your " + jap + amount + " Yuan is : " + us.getSymbol() + f.format(dollar)  + " Dollar");

            pound = amount * 0.12;
            System.out.println("Your " + jap + amount + " Yuan is : " + pd + f.format(pound) + " Pound");

            euro = amount * 0.14;
            System.out.println("Your " + jap + amount + " Yuan is : " + eu + f.format(euro) + " Euro");

            won = amount / 187.37;
            System.out.println("Your " + jap + amount + " Yen is:" + kor +f.format(won) + "Won");

        } else {
            System.out.println("Invalid input");
        }
    }
}