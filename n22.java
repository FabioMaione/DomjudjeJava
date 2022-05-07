import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Scrivere un programma C++ che, letta da input una sequenza di caratteri terminata dal carattere ‘.’,
stampi la stringa SI se la sequenza se la sequenza contiene almeno una lettera dell'alfabeto inglese
e la stringa NO altrimenti. Se la sequenza è vuota stampare NO.
*/
public class n22 {
    public static void main(String[] args) throws IOException {
        Reader input = new InputStreamReader(System.in);
        boolean carattere = false;
        char x = (char)input.read();
        while(x != '.'){
            if( (x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z') )
                carattere = true;
            x = (char)input.read();
        }
        if(carattere == true)
            System.out.println("si");
        else
            System.out.println("no");
    }
}
