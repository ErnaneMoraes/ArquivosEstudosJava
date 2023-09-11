import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 
public class EscreverTexto {
    public static void main(String[] args) {
        String conteudo = "Olá, este é um exemplo de escrita em arquivo de texto!";
        String nomeArquivo = "arquivo_texto.txt";
 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write(conteudo);
            System.out.println("Texto escrito no arquivo com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
