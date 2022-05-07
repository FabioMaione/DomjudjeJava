import java.util.Scanner;

/*
Scrivere un programma C++ che, letti da input un intero positivo N ed una sequenza di interi
positivi terminata dal tappo -1, verifichi se esistono almeno N elementi consecutivi della sequenza
minori o uguali ad N.
Il programma dovrà stampare la stringa OK se l'intero ricevuto soddisfa la condizione richiesta, NO
altrimenti.
*/
public class n27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int conta = 0;
        int x = s.nextInt();
        while(x != -1){
            if(x > n && conta < n)
                conta = 0;
            else
                conta++;
            x = s.nextInt();
        }
        s.close();
        if(conta >= n)
            System.out.println("ok");
        else
            System.out.println("no");
    }
}
