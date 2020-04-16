import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
    	String smallest = "";
        
        int numberOfSubStr = s.length() - (k-1) ;

        String[] subStrArray = new String[numberOfSubStr];
        for (int i=0;i<numberOfSubStr;i++){
            subStrArray[i] = s.substring(i,i+k);
        }

        smallest = subStrArray[0];
        for (int i=1;i<subStrArray.length;i++){
            if(smallest.compareTo(subStrArray[i])>=0){
                smallest = subStrArray[i];
            }
            
        }

        return smallest;
    }
}