import java.util.Scanner;
import java.util.Base64;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int testcase = 1; testcase <= T; testcase++) {
            String encode = sc.next();
            String decode = new String(Base64.getDecoder().decode(encode));
            System.out.println("#" + testcase + " " + decode);
        }
    }
}