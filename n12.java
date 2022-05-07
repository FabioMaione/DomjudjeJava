import java.util.Scanner;

/*
Scrivere un programma che letto da input un numero intero positivo N stampi su standard output la stringa
si se N è un numero primo, la stringa no altrimenti. ESEMPIO: se il numero letto N fosse pari a 17, il
programma dovrà stampare si perché 17 è un numero primo; se invece N fosse pari a 49 il programma
dovrebbe stampare no poiché 49=7*7 e quindi non è un numero primo.
*/
public class n12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        boolean primo = true;
        if(n == 1)
            primo = false;
        else{
            for(int i = 2; i < n/2; ++i){
                if(n%i == 0)
                    primo = false;
            }
        }
        if(n == 2)
            primo = true;

        if(primo)
            System.out.println("Primo");
        else
            System.out.println("Non primo");
    }
}
