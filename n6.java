import java.util.Scanner;

/*
« Un anno è bisestile se il suo numero è divisibile per 4, con l'eccezione degli anni secolari (quelli divisibili
per 100) che non sono divisibili per 400. »
Scrivere un programma C++ che, letto da input un intero positivo che rappresenta un anno, stampi la
stringa “BISESTILE” se l’anno introdotto è bisestile e la stringa “NON BISESTILE” altrimenti.
*/
public class n6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        if((n%4 != 0) || ((n%4 == 0) && (n%100 == 0 && n%400 != 0)))
            System.out.println("Non Bisestile");
        else
            System.out.println("Bisestile");
    }
}
