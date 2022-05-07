import java.util.Scanner;

/*
Scrivere un programma che, data in input una sequenza di caratteri terminata da un tappo pari alla coppia
di caratteri consecutivi 'o' 'k', stampi il numero di elementi presenti nella sequenza (con esclusione del
tappo). Ad esempio, se la sequenza introdotta in input fosse: a b c o k, il programma dovrebbe stampare 3. 
*/
public class n18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contaLettere = 0;
        boolean fine = false;
        char lettera = s.next().charAt(0);
        while(fine != true){
            contaLettere++;
            if(lettera == 'o'){
                lettera = s.next().charAt(0);
                if(lettera == 'k'){
                    contaLettere--;
                    fine = true;
                }
            }
            else
                lettera = s.next().charAt(0);
        }
        s.close();
        System.out.println(contaLettere);
    }
}
