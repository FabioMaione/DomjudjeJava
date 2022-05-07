import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Scrivere un programma C++ che, letta da input una sequenza di caratteri terminata dal tappo *,
stampi NESSUNA se la sequenza non contiene alcuna cifra (0-9) e la stringa ALMENO UNA altrimenti. 
*/
public class n19 {
    public static void main(String[] args) throws IOException {
        Reader input = new InputStreamReader(System.in);
        char x = (char)input.read();
        boolean cifra = false;
        while(x != '*'){
            if(x >= '0' && x <= '9')
                cifra = true;
            x = (char)input.read();
        }
        
        if(cifra == false)
            System.out.println("nessuna");
        else
            System.out.println("almeno 1");
    }
}
