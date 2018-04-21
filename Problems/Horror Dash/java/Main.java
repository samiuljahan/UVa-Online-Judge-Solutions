/**
 * Problem ID    : 11799 - Horror Dash
 * Problem Name  : A Giveaway                 
 * Problem URL   : https://uva.onlinejudge.org/external/117/p11799.pdf
 * Run Time	     : 0.100
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/




import java.util.Scanner;

public class Main{    
    public static void main(String[] args) {        
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        for(int a = 0; a < num; ++a )
        {                     
            int n = cin.nextInt();
            int i = 0;
            int max = 0;
            while (i < n) {
                int s = cin.nextInt();
                if(max < s)
                    max = s;
                ++i;
            }
            System.out.println("Case " + (a + 1) + ":"  + " " + max);
        }
        cin.close(); 
    }
}