/**
 * Problem ID    : 10055                                 
 * Problem Name  : Hashmat the Brave Warrior                  
 * Problem URL   : https://uva.onlinejudge.org/external/100/p10055.pdf
 * Run Time	     : 1.100
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/

import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLong()) {          
            long i = cin.nextLong(), j = cin.nextLong();
            long diff = 0;
            diff = i - j;
            if (diff < 0) {
                diff = diff * (-1);
            }
            System.out.println (diff);
        }        
    }   
}