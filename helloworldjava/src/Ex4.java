import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        //instanciar o Scanner (linha obrigatoria para ler os dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 4 *****");

        //Declarar as variáveis
       final double pi=3.14, area, perimetro, raio;

        //Ler raio
        System.out.println("Insira valor do raio: ");
        raio = input.nextDouble();

        //Calcular area
        area = pi * (raio * raio);

        //Apresentar area
        System.out.println("Area e = " + area);

        //Calcular perimetro
        perimetro = 2 * pi * raio;

        //Apresentar perimetro
        System.out.println("Perimetro e = " + perimetro);

    }
}


