
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class printer {

    public static void main(String[] args) {
        Scanner x = new Scanner();
        File file = new File("programa.txt");
        StringBuffer arquivo = new StringBuffer("");
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            int line;
            while ((line = br.read()) != -1) {

                    arquivo.append((char)line);
            }
                x.scan(arquivo);
                
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
