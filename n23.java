import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Scrivere un programma C++ che, letta da input una sequenza di caratteri terminata dal tappo (o valore
sentinella) ‘*’ stampi la stringa “ALMENO 1 VOCALE” se nella sequenza è presente almeno 1 vocale
minuscola ( cioè una tra a, e, i, o, u) e la stringa “NESSUNA VOCALE” altrimenti.
*/
public class n23 {
    public static void main(String[] args) throws IOException {
        Reader input = new InputStreamReader(System.in);
        boolean carattere = false;
        char x = (char)input.read();
        while(x != '*'){
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
                carattere = true;
            x = (char)input.read();
        }
        if(carattere)
            System.out.println("almeno una vocale");
        else
            System.out.println("nessuna vocale");
    }
}
