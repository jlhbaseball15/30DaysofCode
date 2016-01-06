import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++){
            for(int j = n - i; j > 0; j-- ){
            System.out.print(" ");
            }
            for(int k = i; k > 0; k--){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
