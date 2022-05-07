import java.util.Scanner;

/*
Si scriva un programma completo in C++ che, letta da input una sequenza di cifre [0-9] e terminata da tre 9
consecutivi, stampi su standard output il numero di sottosequenze costituite da tre cifre uguali consecutive.
ESEMPIO: data la sequenza { 1 2 2 2 2 0 0 3 3 3 7 9 9 9 }, si individuano le sottosequenze: {2
2 2}, {2 2 2}, {3 3 3} – Pertanto, il programma dovrebbe stampare su standard output il numero 3, pari al
numero di sottosequenze presenti.
*/
public class n15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean dueNove = false; boolean dueContinui = false; boolean fine = false;
        int conta = 0;
        int prec = 0;
        int n;
        n = s.nextInt();
        while(fine != true){
            prec = n;
            if(prec == 9){
                n = s.nextInt();
                if(n == 9 && dueNove == false)
                    dueNove = true;
                else if(n == 9 && dueNove == true)
                    fine = true;
                if(n != 9)
                    dueNove = false;
            }
            else {
                dueNove = false;
                n = s.nextInt();
                if (prec == n && dueContinui == true)
                    conta++;
                else if (prec == n && dueContinui == false)
                    dueContinui = true;
                else if (n != prec)
                    dueContinui = false;
            }
        }
        s.close();
        System.out.println(conta);
    }
}
