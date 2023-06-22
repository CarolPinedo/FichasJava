import java.util.Scanner;

public class ex_05 {

    public static void main(String[] args) {

        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 5 *****");

        //declarar  variável
        int num1,num2;

        //ler valores do utilizador
        System.out.println("insira um numero");
        num1= input.nextInt();

        System.out.println("Insira outro valor");
        num2= input.nextInt();

        //comparar num1 com num2
        if(num1<num2) {
            System.out.println(num1 + " " + num2);
        }else{
            System.out.println(num2 +""+num1);
        }

    }
}
