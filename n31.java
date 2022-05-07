import java.util.Scanner;

/*
Scrivere un programma C++ che, letto da input un numero positivo X, stampi su standard output degli
asterischi su X linee successive, secondo il seguente schema:
*
**
...
**** ( X asterischi sull’ultima linea)
*/
public class n31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        s.close();
        for(int i = 0; i < x; i++){
            for(int j = 0; j < x; j++){
                if(j <= i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
