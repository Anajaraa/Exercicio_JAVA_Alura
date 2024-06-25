//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
import java.util.Scanner;

public class ExA_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        int limitador = numero *10;
        for (int i = 1; i * numero <= limitador; i++) {
            System.out.println(numero + " x " +  i + " = " + i * numero);
        }
        sc.close();
    }
            }

