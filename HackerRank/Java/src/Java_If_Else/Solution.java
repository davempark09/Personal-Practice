package Java_If_Else;
import java.io.*;
import java.util.*;

public class Solution {
	
//	Given an integer, , perform the following conditional actions:
//
//		-If  is odd, print Weird
//		-If  is even and in the inclusive range of  to , print Not Weird
//		-If  is even and in the inclusive range of  to , print Weird
//		-If  is even and greater than , print Not Weird
//	Complete the stub code provided in your editor to print whether or not  is weird.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        if(n%2!=0){
            System.out.println("Weird");
        }
        else if (2<=n&&n<=5){
            System.out.println("Not Weird");
        }
        else if (6<=n&&n<=20){
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }
        
    }
}
