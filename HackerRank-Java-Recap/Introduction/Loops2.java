package Introduction;

import java.util.Scanner;

public class Loops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int prev = a;
            for(int i = 0; i < n; i++){
                int curr = (int)(Math.pow(2,i)*b);
                System.out.print(prev + curr);
                prev+=curr;
                System.out.print(" ");
            }
            System.out.println("");
        }
        in.close();
    }
}
