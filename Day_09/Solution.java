import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Take Input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
    
   static  int find_gcd(int a,int b){
          //Write the base condition
          if(a == b){
              return a;
          }
          
          else {
              return find_gcd(max(a,b)-min(a,b),min(a,b));
          }     
      }
    
   static int max(int x, int y){
       if (x > y) {
           return x;
       }
       else if (y > x){
           return y;
       }
       else {
           return 0;
       }
   }
   static int min(int x, int y){
       if (x > y) {
           return y;
       }
       else if (y > x){
           return x;
       }
       else {
           return 0;
       }
   }
}

