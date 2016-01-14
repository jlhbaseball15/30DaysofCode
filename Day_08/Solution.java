import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      Map m1 = new HashMap();
      
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         m1.put(name,phone);
         
      }
      
      while(in.hasNext())
      {
         String s=in.nextLine();
      
         if (m1.containsKey(s)){
             System.out.println(s + "=" + m1.get(s));
         }
         else {
             System.out.println("Not found");
         }
      }
   }
}
