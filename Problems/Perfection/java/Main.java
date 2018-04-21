/**
 * Problem ID    : 382                                  
 * Problem Name  : Perfection                  
 * Problem URL   : https://uva.onlinejudge.org/external/3/p382.pdf
 * Run Time	     : 0.070
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/



import java.util.Scanner;

public class Main{    
    public static void main(String[] args) {        
        Scanner cin = new Scanner(System.in);
        System.out.println("PERFECTION OUTPUT");
        while (cin.hasNext()) {                     
            int a = cin.nextInt();                       
            if (a == 0)
                break; 
            int number = getSumOfDivisors(a);           
            System.out.printf("%5d", a);
            System.out.printf("  ");
            if (number == a) 
                System.out.printf("PERFECT"); 
            else if (number < a)
                System.out.printf("DEFICIENT"); 
            else
                System.out.printf("ABUNDANT");
                 
            System.out.printf("\n");
        }        
        System.out.println("END OF OUTPUT");
        cin.close();
    }
    private static int getSumOfDivisors(int a) {
        int total = 0;
        int i = 1;
        while (i < a) {
           if (a % i == 0)
               total = total + i;           
            ++i;
        }            
        return total; 
    } 
}