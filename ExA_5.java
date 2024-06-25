//Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
import java.util.Scanner;

public class ExA_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
        sc.close();
    }
}