import java.util.Scanner;

/*
Scrivere un programma C++ che, letta da input una sequenza di interi positivi terminata dal tappo
0, conti gli elementi dispari della sequenza che sono divisibili per 3, e stampi il risultato del conteggio
su standard output.
*/
public class n9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int conto = 0;
        int x = s.nextInt();
        while(x != 0){
            if(x%2 != 0 && x%3 == 0)
                conto++;
            x = s.nextInt();
        }
        s.close();
        System.out.println(conto);
    }
}
