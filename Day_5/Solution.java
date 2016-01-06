import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        
        for (int i = 0; i < t; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            
            int total = a + b;
            System.out.print(total + " ");
            for (int j = 1; j < n; j++){
                total += (Math.pow(2,j)) * b;
                System.out.print(total + " ");
            }
            System.out.println();
        }
        
    }
}
