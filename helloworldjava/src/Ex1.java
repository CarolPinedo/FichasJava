import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        //instanciar o Scanner (linha obrigatoria para ler os dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 1 *****");

        //declarar variável
        int num1, num2, resultado;


        System.out.println("Boa-tarde!!!");

        // Ler num1
        System.out.println("Insira um numero: ");
        num1=input.nextInt();

        // Ler num2
        System.out.println("Insira um numero: ");
        num2=input.nextInt();

        // Somar num1 com num2
        resultado=num1+num2;

        // Apresentar resultado
        System.out.println("Resultado da soma: "+resultado);


    }
}
