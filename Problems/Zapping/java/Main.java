/**
 * Problem ID    : 12468                                  
 * Problem Name  : Zapping                  
 * Problem URL   : https://uva.onlinejudge.org/external/124/p12468.pdf
 * Run Time	     : 0.080
 * Author        : Samiul Jahan
 * E-mail        : samiuljahan@gmail.com 
*/



import java.util.Scanner;

public class Main{    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            byte a = cin.nextByte();
            byte b = cin.nextByte();            
            if (a == -1 && b == -1)
                break;
            System.out.println(getTotalPress(a, b));
        }
        cin.close();
    }
    private static byte getTotalPress(byte a, byte b) {
        byte temp = 0;
        if (a > b) {
            temp = b;
            b = a;
            a = temp;          
        }
        byte forward = (byte) (b - a); 
        byte min = 0;       
        byte backward = (byte) (99 - b + a + 1);
        if (backward < forward)
            min = backward;
        else
            min = forward;            
        return min; 
    } 
}