import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}
		Collections.sort(list);
		
		List<Integer> differenceList = new ArrayList<Integer>();
		int diff = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			diff = Math.abs(list.get(i) - list.get(i + 1));
			differenceList.add(diff);
		}

		Collections.sort(differenceList);

		
		
		for (int i = 0; i < list.size() - 1; i++) {
			if (Math.abs((list.get(i) - list.get(i + 1))) == differenceList.get(0)) {
				
				System.out.print(list.get(i) + " " + list.get(i + 1) + " ");
				
			}
		}
    }
}
