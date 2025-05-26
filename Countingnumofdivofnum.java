import java.util.*;
public class Countingnumofdivofnum {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();  
        for (int i = 0; i < t; i++) {
            int c = 0;
            int n = s.nextInt();  
            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    c += 1;
                }
            }
            System.out.println(c);  
        }
    }
}
