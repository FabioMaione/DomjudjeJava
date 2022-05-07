
/*
Si scriva un programma C++ che letti da input due numeri naturali, sia in grado di dire se i due numeri sono primi
gemelli o no. Due numeri naturali M e N sono primi gemelli se sono entrambi primi, e |M-N|=2 (ossia, il valore
assoluto della loro differenza è pari a 2). Ad esempio 5 e 7, 11 e 13 sono due coppie di primi gemelli. 
*/

import java.util.Scanner;

public class n13 {
    public static boolean isPrime(int x){
        boolean primo = true;
        if(x == 1)
            primo = false;
        else{
            for(int i = 2; i < x/2; ++i){
                if(x%i == 0)
                    primo = false;
            }
        }
        if(x == 2)
            primo = true;
        return primo;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt(); int n = s.nextInt();
        s.close();
        if(!isPrime(m) || !isPrime(n))
            System.out.println("Non entrambi primi");
        else{
            int dif = Math.abs(m-n);
            if(dif == 2)
                System.out.println("Primi gemelli");
            else
                System.out.println("Non gemelli");
        }
    }
}
