import java.util.Scanner;

/*
Scrivere un programma C++ che, letta da input una sequenza di interi terminata da un tappo pari a 0
(ZERO), stampi SI se la sequenza ha un andamento strettamente crescente fino ad un certo punto e un
andamento strettamente decrescente dal quel punto in poi; stampi NO altrimenti.
*/
public class n32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean crescente = false;
        boolean decrescente = false;
        boolean ok = false;
        boolean ok2 = true;

        int x = s.nextInt();
        int tmp;
        while(x != 0){
            tmp = x;
            x = s.nextInt();
            if(ok && x != 0){
                if(x == tmp)
                    ok2 = false;
                if(x > tmp)
                    crescente = true;
                if(crescente && x < tmp)
                    decrescente = true;
                if(crescente && decrescente)
                    ok = true;
                if(decrescente && x >= tmp){
                    ok = false;
                    ok2 = false;
                }
            }
        }
        if(ok && ok2)
            System.out.println("SI");
        else 
            System.out.println("NO");

        s.close();
    }
}
//todo::correggere