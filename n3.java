import java.util.Scanner;

/*
Scrivere un programma C++ che, letto da input un intero N verifichi se N è un numero pari o meno. Più in
dettaglio, il programma deve eseguire le seguenti operazioni:
- Leggere N da input
- Se N è pari stampare la stringa “PARI”
- Altrimenti, stampare la stringa “DISPARI”
*/
public class n3 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        if(n%2 == 0)
            System.out.println("Pari");
        else
            System.out.println("Dispari");
        c.close();
    }
}
