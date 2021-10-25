package Java_Output_Formatting;
import java.io.*;
import java.util.*;

public class Solution {
	
//	In each line of output there should be two columns:
//	The first column contains the String and is left justified using exactly  characters.
//	The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

    public static void main(String[] args) {
        
        String lineCross = "================================"; 
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.next();
        int num1 = scanner.nextInt();
        String line2 = scanner.next();
        int num2 = scanner.nextInt();
        String line3 = scanner.next();
        int num3 = scanner.nextInt();
        scanner.close();
        
        System.out.printf("%s\n%-14s %03d \n%-14s %03d \n%-14s %03d \n%s", lineCross, line1, num1, line2, num2, line3, num3, lineCross);

    }
}