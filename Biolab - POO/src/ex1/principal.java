package ex1;

import java.awt.image.ImagingOpException;
import java.util.Scanner;

public class principal {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Digite o nome");
        String nome = sc.next();
        IO.println("Digite a idade");
        int idade = sc.nextInt();
        IO.println("Digite o sexo");
        String sexo = sc.next();
        IO.println("Digite a raça");
        String raca = sc.next();

        cachorro cachorro = new cachorro(nome,idade,sexo,raca);

        gato gato = new gato(nome,idade,sexo,raca);
    }
}
