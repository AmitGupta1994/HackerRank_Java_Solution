import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nfUS.format(payment);
        
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nfIndia.format(payment);

        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfChina.format(payment);

        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nfFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
