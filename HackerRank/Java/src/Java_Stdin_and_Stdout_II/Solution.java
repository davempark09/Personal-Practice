package Java_Stdin_and_Stdout_II;
import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
//		There are three lines of input:
//			1.The first line contains an integer.
//			2.The second line contains a double.
//			3.The third line contains a String.
		
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();
        scanner.close();
        
//        There are three lines of output:
//        	1.On the first line, print String: followed by the unaltered String read 
//        	from stdin.
//        	2.On the second line, print Double: followed by the unaltered double read 
//        	from stdin.
//        	3.On the third line, print Int: followed by the unaltered integer read 
//        	from stdin.
        
        System.out.println("String: " + s);
        System.out.println("Double: " + x);
        System.out.println("Int: " + n);
        
	}

}
