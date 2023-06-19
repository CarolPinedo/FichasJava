import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        //instanciar o Scanner (linha obrigatoria para ler os dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 3 *****");

        //Declarar as variáveis
        double num1, num2, area, perimetro;

        //Ler num 1
        System.out.println("Insira um numero: ");
        num1 = input.nextDouble();

        //Ler num 2
        System.out.println("Insira um numero: ");
        num2 = input.nextDouble();

        //Calcular area
        area = num1 * num2;
        //Apresentar area
        System.out.println("Area e = " + area);

        //Calcular perimetro
        perimetro = (num1 + num2) *2;

        //Apresentar perimetro
        System.out.println("Perimetro e = " + perimetro);


    }
}