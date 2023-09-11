import java.util.Scanner;
public class MediaNota {
    public static void main(String[] args) {
        String nome, disc, opc;
        float nota1, nota2, nota3, media;
        
        while(true) {

            System.out.println("\nBem vindo a calculadora de media escolar");

            System.out.print("\nDigite seu nome: ");
            Scanner leia = new Scanner(System.in);
            nome = leia.nextLine();

            System.out.print("Digite o nome da disciplina: ");
            disc = leia.nextLine(); 

            System.out.print("\nDigite a primeira nota: ");
            nota1 = leia.nextFloat(); 

            while (nota1 < 0 || nota1 > 10) {
                System.out.print("Entrada invalida! A nota deve estar em um intervalo de 0 a 10.");
                System.out.print("\nDigite a primeira nota: ");
                nota1 = leia.nextFloat(); 
            }        

            System.out.print("Digite a segunda nota: ");
            nota2 = leia.nextFloat(); 

            while (nota2 < 0 || nota2 > 10) {
                System.out.print("Entrada invalida! A nota deve estar em um intervalo de 0 a 10.");
                System.out.print("\nDigite a segunda nota: ");
                nota2 = leia.nextFloat(); 
            }

            System.out.print("Digite a terceira nota:");
            nota3 = leia.nextFloat(); 

            while (nota3 < 0 || nota3 > 10) {
                System.out.print("Entrada invalida! A nota deve estar em um intervalo de 0 a 10.");
                System.out.print("\nDigite a terceira nota: ");
                nota3 = leia.nextFloat(); 
            }

            media = (nota1 + nota2 + nota3) / 3;
        
            if (media >= 7) {
                System.out.print("\nA media do aluno "+nome+" foi: "+media+"\nO aluno esta APROVADO.");
            } else { 
                System.out.println("\nA media do aluno "+nome+" foi: "+media+"\nO aluno esta REPROVADO.");
            } 
            
            System.out.print("\nDeseja calcular a media em outra disciplina? (S/N) ");
            Scanner read = new Scanner(System.in);
            opc = read.nextLine();

            if ("N".equals(opc)) break;
        }
    }
}
