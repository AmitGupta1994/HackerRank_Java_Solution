import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static boolean flag = initializeFlag();
	public static int B;
	public static int H;

	public static boolean initializeFlag(){
	    Scanner scanner = new Scanner(System.in);
	    B= scanner.nextInt();
	    H= scanner.nextInt();
	    if(B>0 && H>0){
	        return true;
	    }else {
	        System.out.print("java.lang.Exception: Breadth and height must be positive");
	        return false;
	    }
	}

	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}
