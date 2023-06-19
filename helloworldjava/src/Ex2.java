import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        //instanciar o Scanner (linha obrigatoria para ler os dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 2 *****");

        //Declarar as variáveis
        double num1, num2, soma, subtracao, multiplicacao, divisao;

        System.out.println("Boa-tarde!!!");

        //Ler num 1
        System.out.println("Insira um numero: ");
        num1 = input.nextDouble();

        //Ler num2
        System.out.println("Insira um numero: ");
        num2 = input.nextInt();

        //Somar num1 com num2
        soma=num1+num2;

        //Apresentar o resultado da soma
        System.out.println("O resultado da soma: " + soma);

        //Subtrair num1 com num2
        subtracao=num1-num2;

        //Apresentar o resultado da subtração
        System.out.println("O resultado da subtracao: " + subtracao);

        //Multiplicar num1 com num2
        multiplicacao=num1*num2;

        //Apresentar o resultado da multiplicação
        System.out.println("O resultado da multiplicacao: " + multiplicacao);

        //Dividir num1 com num2
        divisao=num1/num2;

        //Apresentar o resultado da divisão
        System.out.println("O resultado da divisao: " + divisao);


    }
}
