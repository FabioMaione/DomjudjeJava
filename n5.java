import java.util.Scanner;

/*
Scrivere un programma C++ che, letti da input tre interi positivi, A, B e C verifichi se questi possono
rappresentare le lunghezze dei lati di un triangolo, e in caso affermativo, stabilisca di che tipo di triangolo si
tratta. Più in dettaglio, il programma deve effettuare le seguente operazioni:
- Leggere A, B e C da input
- Controllare che ognuno dei tre valori sia minore della somma degli altri due
- Se il controllo precedente restituisce false (falso), il programma deve stampare la stringa “NO”
- Altrimenti,
o il programma stabilisce di che tipo di triangolo si tratta e stampa una tra le seguenti
stringhe “TRIANGOLO EQUILATERO”, “TRIANGOLO ISOSCELE” o “TRIANGOLO SCALENO”, a
seconda del tipo.
*/
public class n5 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int a = c.nextInt(); int b = c.nextInt(); int x = c.nextInt();
        c.close();
        if (
            (a >= (b+x) )|| 
            (b >= (a+x) )|| 
            (x >= (a+b) )
            )
            System.out.println("No");
        else{
            if(a == b && a == x)
                System.out.println("Equilatero");
            else if(a != b && a != x && x != b)
                System.out.println("Scaleno");
            else if((a == b && b != x) || (a == x && b !=x) || (b == x && a!=x))
                System.out.println("Isoscele");
        }
    }
}
