/**
 * Problem ID    : 11877                                 
 * Problem Name  : The Coco-Cola Store                  
 * Problem URL   : https://uva.onlinejudge.org/external/118/p11877.pdf
 * Run Time	     : 0.60
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/


import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {        
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {          
            int n = cin.nextInt();
            int totalBottles = countFullBootles(n); 
            System.out.println(totalBottles);
        }              
    }
    
    public static int countFullBootles(int n)
    {
        int bottles = 0;        
        int remainder = 0; 
        int borrow = 0;
        if (n == 0) 
            System.exit(0);
             
        while (true) {        
           remainder = n % 3 ; 
           n = n / 3; 
           if (borrow != 0) {
            if (n != borrow) 
                break;             
          }

          bottles = bottles + n;
          n = n + remainder;        
          if (n < 3) {
            borrow =  3 - n;
            n = n + borrow; 
           }
        }
        return bottles;
    }
}