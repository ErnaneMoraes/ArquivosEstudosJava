import java.util.Scanner;
public class EscolhaCaso {
    public static void main(String[] args) {
    String diaDaSemana;
    
    System.out.print("Digite o dia da semana: ");
    Scanner leia = new Scanner(System.in);
    diaDaSemana = leia.nextLine();
    
    switch (diaDaSemana) {
        case "1":
            System.out.print("Olá");
    }
    }
    
}