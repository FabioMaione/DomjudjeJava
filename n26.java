import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Scrivere un programma C++ che, letta da input una sequenza di caratteri terminata dal tappo * (ASTERISCO)
verifichi se nella sequenza sono presenti due caratteri consecutivi, M e N, che soddisfano la seguente
proprietà: M e N sono entrambe lettere maiuscole dell'alfabeto inglese, oppure devono essere due lettere
minuscole uguali.
Nel caso in cui la sequenza contenga due caratteri consecutivi che soddisfano tale proprietà, il programma
deve stampare su standard output la stringa SI; in caso contrario il programma deve stampare la stringa
NO.
*/
public class n26 {
    public static void main(String[] args) throws IOException {
        Reader input = new InputStreamReader(System.in);
        boolean maiusc = false;
        boolean doppioMaiuscolo = false;
        boolean doppieUguali = false;
        char x = (char)input.read();

        while(x != '*'){
            if (Character.isLowerCase(x)) {
                maiusc = false;
                char tmp = x;
                x = (char) input.read();
                if (Character.isLowerCase(x) && x == tmp)
                    doppieUguali = true;
            } else {
                if (maiusc && Character.isUpperCase(x))
                    doppioMaiuscolo = true;
                else if (!maiusc && Character.isUpperCase(x))
                    maiusc = true;
                x = (char) input.read();
            }
        }
        if(doppioMaiuscolo || doppieUguali)
            System.out.println("ok");
        else
            System.out.println("no");
    }
}
