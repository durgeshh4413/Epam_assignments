package HomeTask_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MapProgram {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (n > 0) {
            String name = br.readLine().toLowerCase();
            int phone   = Integer.valueOf(br.readLine());
            map.put(name, phone);
            n--;
        }
        
        /* Read each query and check if its in HashMap */
        String s;
        while((s = br.readLine()) != null) {
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        
        br.close();
    }
}