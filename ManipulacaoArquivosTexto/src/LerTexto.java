import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class LerTexto {
    public static void main(String[] args) {
        String nomeArquivo = "arquivo_texto.txt";
 
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            System.out.println("Conteúdo do arquivo de texto:");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
