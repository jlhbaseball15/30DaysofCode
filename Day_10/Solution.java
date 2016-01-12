import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for (int i = 0; i < t; i++){
            int n = input.nextInt();
            System.out.println(convertToBinary(n));
        }
    }
    public static String convertToBinary(int n){   
        if (n == 0){
            return "0";
        }
        
        String binary = "";
        
        while (n > 0){
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        } 
        
        return binary;
    }
    
}
