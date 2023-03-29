package HomeTask_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListProgram {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.nextLine();
    ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>(n);
    for (int i = 0; i < n; i++) {
        s = sc.nextLine();
        a.add(i, new ArrayList<String>(Arrays.asList(s.split("\\s"))));
    }
    System.out.println("Arraylist is : "+a);
    
    int m = sc.nextInt();
    for (int i = 0; i < m; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x <= a.size() && y < a.get(x-1).size() && y >= 0) {
            System.out.println(a.get(x-1).get(y));
        } else {
            System.out.println("ERROR!");
        }
    }
}
}
