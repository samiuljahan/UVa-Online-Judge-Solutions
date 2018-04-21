/**
 * Problem ID    : 13148                                  
 * Problem Name  : A Giveaway                 
 * Problem URL   : https://uva.onlinejudge.org/external/131/13148.pdf
 * Run Time	     : 0.130
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/




import java.util.Scanner;

public class Main{    
    public static void main(String[] args) {        
        Scanner cin = new Scanner(System.in);        
        while (cin.hasNext()) {                     
            long n = cin.nextLong();
            if (n == 0)
                break;
            if ((Math.sqrt(n) % 1 == 0) && (Math.cbrt(n) % 1 == 0))
                System.out.println("Special");
            else
                System.out.println("Ordinary");     
        }
        cin.close(); 
    }
}