# yit
package beginner;
import java.io.*;
import java.util.Scanner;
public class countword {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String[] Arr = s.split(" ");
	 int n=Arr.length;
	System.out.println("NUMBER OF WORDS IS: "+n);
	}
	
}
