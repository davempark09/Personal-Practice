package Java_End_of_file;
import java.io.*;
import java.util.*;

public class Solution {

//	The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
            while (scanner.hasNextLine() == true) {
            String newString = scanner.nextLine();
            System.out.println(i + " " +newString);
            i++;
        }
        scanner.close();
    }
}
