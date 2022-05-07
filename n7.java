import java.util.Scanner;

/*
Scrivere un programma C++ che, letta da input una sequenza di numeri interi terminata dal tappo (o valore
sentinella) 5 stampi la stringa “NESSUNO” se nella sequenza non è presente alcun numero che sia un
multiplo di 5 e la stringa “ALMENO 1” altrimenti.
ESEMPI:
se la sequenza in input fosse -3 42 37 28 5, il programma dovrebbe stampare “NESSUNO”, poiché nessuno
dei numeri introdotti da input è multiplo di 5 (si noti che il tappo non va preso in considerazione per la
verifica della proprietà)
se la sequenza in input fosse -3 40 37 2 -8 5, il programma dovrebbe stampare “ALMENO 1”, poiché è
presente il 40 che è un multiplo di 5.
se la sequenza in input fosse 5 (ossia, sequenza vuota), il programma dovrebbe stampare “NESSUNO”,
*/
public class n7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean almenoUno = false;
        int x = s.nextInt();
        while(x != 5){
            if(x%5 == 0)
                almenoUno = true;   
            x = s.nextInt();
        }
        s.close();
        if(almenoUno)
            System.out.println("Almeno 1");
        else
            System.out.println("Nessuno");
    }
}
