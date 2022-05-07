import java.util.Scanner;

/*
Scrivere un programma C++ che, letti da input due numeri interi A e B, con B diverso da 0, calcoli e stampi il
risultato delle operazioni A+B, A-B, A*B, A/B, e A%B, secondo il formato descritto nel seguente esempio:
Esempio: Se A fosse pari a 5, e B fosse pari a 3, il programma dovrebbe stampare:
Somma: 8
Differenza: 2
Moltiplicazione: 15
Quoziente: 1
Resto: 2
*/
public class n2 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int a = c.nextInt();
        int b = c.nextInt();
        System.out.println("Somma: " + (a+b));
        System.out.println("Differenza: " + (a-b));
        System.out.println("Moltiplicazione: " + (a*b));
        System.out.println("Quoziente: " + (a/b));
        System.out.println("Resto: " + (a%b));
        c.close();
    }
}
