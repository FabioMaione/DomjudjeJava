import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Scrivere un programma C++ che, letta da input una sequenza di caratteri terminata dal carattere
‘.’, stampi la stringa SI se la sequenza contiene solo lettere dell'alfabeto inglese e la stringa NO
altrimenti. Se la sequenza è vuota stampare SI.
*/
public class n20 {
    public static void main(String[] args) throws IOException {
        Reader input = new InputStreamReader(System.in);
        boolean nonChar = false;
        char x = (char)input.read();
        while(x != '.'){
            if( !(x >= 'A' && x <= 'Z') && !(x >= 'a' && x <= 'z') )
                nonChar = true;
            x = (char)input.read();
        }
        if(nonChar == true)
            System.out.println("no");
        else
            System.out.println("si");
    }
}
