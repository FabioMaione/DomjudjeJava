import java.util.ArrayList;
import java.util.Scanner;

/*
Si scriva un programma che, letta da input una sequenza di numeri interi terminata da una coppia di zeri, individui
tutte le sottosequenze separate da uno zero e, per ognuna di esse, calcoli la somma degli elementi e stampi il valore
ottenuto su standard output, uno per riga
*/
public class n25{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int somma = 0;
        ArrayList<Integer> ris = new ArrayList<Integer>();
        boolean zero = false;
        boolean fine = false;
        //Integer prec;
        Integer x = s.nextInt();
        if(x == 0)
            ris.add(0);
        while(fine != true){
            if(x == 0){
                zero = true;
                ris.add(somma);
                somma = 0;
                x = s.nextInt();
                if(x == 0)
                    fine = true;
                else
                    zero = false;
            }
            else{
                somma += x;
                x = s.nextInt();
                if(x == 0 && zero == true)
                    fine = true;
            }
        }
        s.close();
        for(int i = 0; i < ris.size(); ++i)
            System.out.println(ris.get(i));
    }
}