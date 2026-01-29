package aula2;

import java.util.Scanner;

public class IMC {
    static void main() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
       String nome = sc.next();

        System.out.println("Digite sua altura");
       double altura = sc.nextDouble();

        System.out.println("Digite sua idade");
       int idade = sc.nextInt();

        System.out.println("Digite seu peso");
       double peso = sc.nextDouble();

        System.out.println("Seu IMC é:");
        System.out.println(peso/(altura*altura));


    }
}