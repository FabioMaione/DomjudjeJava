import java.util.Scanner;

/*
Si scriva un programma C++ che, letti da input un numero intero X e una sequenza di numeri interi
terminata da un tappo pari a “-1”, stampi la stringa OK se nella sequenza sono presenti almeno X “0”
(zero) consecutivi, e stampi la stringa NO altrimenti.
ESEMPIO: se l’intero X fosse pari a 3, e la sequenza fosse 1 5 -3 0 0 6 0 9 0 0 0 0 14 -1, il
programma dovrebbe stampare OK poiché esiste una sequenza di zero consecutivi di lunghezza
almeno 3 (quattro, in questo caso).
*/
public class n16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contaZero = 0;
        int x = s.nextInt();
        int n = s.nextInt();
        while(n != -1){
            if(n == 0)
                contaZero++;
            else if(n != 0 && contaZero < x)
                contaZero = 0;
            n = s.nextInt();
        }
        s.close();
        if(contaZero >= x)
            System.out.println("si");
        else
            System.out.println("no");
    }
}
