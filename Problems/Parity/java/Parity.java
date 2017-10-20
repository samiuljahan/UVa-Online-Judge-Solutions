/**
 * Problem ID    : 10931                                 
 * Problem Name  : Parity                  
 * Problem URL   : https://uva.onlinejudge.org/external/109/10931.pdf
 * Run Time	     : 0.370
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/



import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLong()) {          
            long n = cin.nextLong();
            if (n == 0) 
                 break;

            long binary[] = new long [31]; 
            long parity = 0;
            int count = 0;
            while (true) {                
                binary[count] = n % 2;
                if (n < 2) 
                    break;
                n /= 2; 
                count++;
            }

            System.out.print("The parity of ");           
            for(; count >= 0;  --count)
            {
               System.out.print(binary[count]);
               parity += binary[count];
            }
            System.out.println(" is " + parity + " (mod 2).");
        } 
              
    }

}