//Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.


import java.util.Scanner;

public class ExA_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Digite dois números inteiros: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");
        } else if (numero1 < numero2) {
            System.out.println("O segundo número é maior");
        } else {
            System.out.println("Os dois números são iguais");
        }
        sc.close();;
    }
}
