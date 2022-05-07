import java.util.Scanner;

/*
Scrivere un programma C++ che, letto da input un numero intero N che rappresenta il voto conseguito
all’esame di Fondamenti, comunica allo studente se l’esame è stato superato o meno. Più in dettaglio, il
programma deve effettuare le seguente operazioni:
- Leggere N da input
- Se N è minore (<) di 0 oppure maggiore di 30 deve stampare la stringa “VOTO NON VALIDO”
- Altrimenti, se N è maggiore o uguale a 18 (>=) il programma deve stampare la stringa “ESAME
SUPERATO”
- Altrimenti, deve stampare la stringa “BOCCIATO”
*/
public class n4 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        
        if(n > 30 || n < 0)
            System.out.println("Voto non valido");
        else if(n >= 18)
            System.out.println("Esame superato");
        else
            System.out.println("Bocciato");
            c.close();
    }
}
