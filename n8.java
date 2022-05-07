import java.util.Scanner;

/*
Scrivere un programma C++ che, letti da input due interi x e y, stampi su standard output la somma
di tutti i numeri dispari compresi tra x e y (inclusi eventualmente gli estremi). Si può assumere che
y sia sempre maggiore di x.
*/
public class n8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(); int y = s.nextInt();
        s.close();
        int somma = 0;
        for(int i = x; i <= y; i++){
            if(i%2 != 0)
                somma += i;
        }   
        System.out.println(somma);
    }
}
