package Java_Datatypes;
import java.io.*;
import java.util.*;

public class Solution {
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myTest = scanner.nextInt();
        for(int i=1;i<=myTest;i++) {
        	try {
        		long n = scanner.nextLong(); 
        		  if (n >= -128 && n <= 127) {
                      System.out.println(n + " can be fitted in:");
                      System.out.println("* byte");
                      System.out.println("* short");
                      System.out.println("* int");
                      System.out.println("* long");
                  }
                  else if (n >= -32768 && n <= 32767) {
                      System.out.println(n + " can be fitted in:");
                      System.out.println("* short");
                      System.out.println("* int");
                      System.out.println("* long");
                  }
                  else if (n >= -2147483648 && n <= 2147483647) {
                      System.out.println(n + " can be fitted in:");
                      System.out.println("* int");
                      System.out.println("* long");
                  }
                  else if (n >= -9223372036854775808L && n <= 9223372036854775807L) {
                      System.out.println(n + " can be fitted in:");
                      System.out.println("* long");
                  }
        	}
        	catch(Exception e) {
        		System.out.println(scanner.next() + " can't be fitted anywhere.");
        	}       
        }
        scanner.close();

    }
}
