import java.util.Scanner;

/*
Scrivere un programma C++ che, letta da input una sequenza di numeri interi positivi terminata dal tappo 0
(ZERO) verifichi se nella sequenza sono presenti due numeri consecutivi M e N che soddisfano la seguente
proprietà: M e N sono entrambi pari, oppure la loro somma è multiplo di uno dei due numeri (cioè se M+N
è multiplo di M o di N).
Nel caso in cui la sequenza contenga due numeri consecutivi che soddisfano tale proprietà, il programma
deve stampare su standard output la stringa SI; in caso contrario il programma deve stampare la stringa
NO.
*/
public class n17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean duePari = false;
        boolean dueDivisibili = false;
        int n = s.nextInt();
        int m = 0;
        while(n != 0){
            m = n;
            if(m%2 == 0){
                n = s.nextInt();
                if(n != 0){
                    if (n % 2 == 0)
                        duePari = true;
                    else {
                        int sumP = m + n;
                        if (sumP % m == 0 || sumP % n == 0)
                            dueDivisibili = true;
                    }
                }
                
            }
            else{
                n = s.nextInt();
                if(n != 0){
                   int sum = m+n;
                    if(sum%m == 0 || sum%n == 0)
                        dueDivisibili = true;
                }
            }
        }
        s.close();
        if(duePari == true || dueDivisibili == true)
            System.out.println("si");
        else
            System.out.println("no");
    }
}
