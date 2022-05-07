import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Scrivere un programma C++ che, letta da input una sequenza di caratteri terminata dal tappo *,
stampi SI se la sequenza contiene almeno due elementi consecutivi uguali e NO altrimenti. Nel caso
di sequenza vuota o contenente un solo elemento il programma deve stampare NO.
*/
public class n28 {
    public static void main(String[] args) throws IOException {
        Reader input = new InputStreamReader(System.in);
        char x = (char)input.read();
        boolean consecutivi = false;
        while(x != '*'){
            char tmp = x;
            x = (char)input.read();
            if(tmp == x)
                consecutivi = true;
        }
        if(consecutivi)
            System.out.println("si");
        else
            System.out.println("no");
    }
}
