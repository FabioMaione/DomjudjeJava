import java.util.Scanner;

/*
Scrivere un programma C++ che, letto da input un intero N, stampi la stringa SI se tutte le cifre di N
sono diverse da 0 e stampi la stringa NO altrimenti.
*/
public class n11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        boolean zero = false;
        if(n == 0)
            zero = true;
        while(n != 0){
            if(n%10 == 0)
                zero = true;
            n/= 10;
        }
        if(zero)
            System.out.println("no");
        else
            System.out.println("si");
    }
}
