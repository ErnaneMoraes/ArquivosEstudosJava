import java.util.Scanner;
public class SeEntaoSenao {
    public static void main(String[] args) {
        int idade;
        
        System.out.print("Digite uma idade: ");
        Scanner leia = new Scanner(System.in);
        idade = leia.nextInt();
        
        if (idade > 1 && idade <17){
            System.out.print("Criança. ");
        } else if (idade >= 18 && idade <=65) {
            System.out.print("Adulto. ");
        } else {
            System.out.print("Criança. ");
        }
    }
}