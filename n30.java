import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Scrivere un programma C++ che, letta da input una sequenza di caratteri terminata dal tappo *,
stampi SI se la sequenza contiene almeno due caratteri consecutivi uguali e questi sono due lettere
dell’alfabeto inglese entrambe maiuscole o entrambe minuscole. Il programma deve stampare NO
altrimenti. Nel caso di sequenza vuota o contenente un solo elemento il programma deve stampare
NO.
*/
public class n30 {
    public static void main(String[] args) throws IOException {
        Reader input = new InputStreamReader(System.in);
        boolean trovati = false;
        char x = (char)input.read();
        while(x != '*'){
            char tmp = x;
            x = (char)input.read();
            if(tmp == x){
                if(Character.isUpperCase(tmp) || Character.isLowerCase(tmp))
                    trovati = true;
            }
        }
        if(trovati)
            System.out.println("si");
        else
            System.out.println("no");
    }
}
