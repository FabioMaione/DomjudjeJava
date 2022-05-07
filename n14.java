import java.util.Scanner;

/*
Scrivere un programma C++ che, letta da input una sequenza di interi terminata da -1, controlli che siano
tutte cifre decimali (0-9), calcoli il numero che si ottiene giustapponendo le cifre, e verifichi se il numero
ottenuto è divisibile per 3. Più in dettaglio, l’output del programma deve rispettare le seguenti condizioni:
1) Se uno dei valori inseriti da input non è una cifra decimale, deve essere stampata esclusivamente la
stringa ERRORE, senza endl, né spaziature.
ESEMPIO: Se la sequenza in input fosse 2 5 9 15 1 -1 il programma dovrebbe stampare:
ERRORE
2) Se i valori inseriti sono tutte cifre decimali, deve essere inviato in stampa il numero che si ottiene
giustapponendo le cifre, e sulla riga successiva, la stringa SI (senza endl, né spaziature) se il numero
è divisibile per 3, la stringa NO (senza endl, né spaziature), altrimenti.
ESEMPIO: Se la sequenza in input fosse 2 5 9 1 1 -1 il programma dovrebbe stampare:
25911
SI
ESEMPIO: Se la sequenza in input fosse 2 5 9 1 -1 il programma dovrebbe stampare:
2591
NO
3) Se la sequenza in input è vuota, stampare esclusivamente la stringa VUOTO, senza endl, né
spaziature.
ESEMPIO: Se la sequenza in input fosse -1 il programma dovrebbe stampare:
VUOTO
*/
public class n14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean cifra = true;
        int tot = 0;
        int n = s.nextInt();
        while(n != -1){
            if(n < 0 || n > 9)
                cifra = false;
            else{
                tot *= 10;
                tot += n;
            }
            n = s.nextInt();
        }
        s.close();
        if(cifra == false)
            System.out.println("errore");
        else{
            if(tot == 0)
                System.out.println("vuoto");
            else{
                System.out.println(tot);
                if(tot%3 == 0)
                    System.out.println("si");
                else
                    System.out.println("no"); 
            }
        }
            
    }
}
