package ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Pessoa P01 = new Pessoa();
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        P01.nome = leia.nextLine();
        
        System.out.println("Digite sua idade: ");
        P01.idade = leia.nextInt(); 
        
        System.out.println("Digite a sua altura: ");
        P01.altura = leia.nextDouble();

        P01.exibirDados();
    
    }
    
}
