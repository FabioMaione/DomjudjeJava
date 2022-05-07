import java.util.Scanner;

/*
Scrivere un programma che, letto da input un intero positivo N stampi il valore N-Ninv, dove Ninv è l’intero
che si ottiene da N invertendo le sue cifre.
*/
public class n10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = n;
        s.close();
        int ninv = 0;
        while(n != 0){
            ninv *= 10;
            ninv += (n%10);
            n /= 10;
        }
        System.out.println(t - ninv);
    }
}
