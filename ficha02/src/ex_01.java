import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {

        //instanciar o Scanner (linha obrigatoria para ler os dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 1 *****");

        //declarar variável
        int a, b;

        //ler valores do utilizador
        System.out.print("Insira um numero: ");
        a= input.nextInt();

        System.out.print("Insira um numero: ");
        b= input.nextInt();

        if(a==b){ // A e B são iguais
            System.out.println("Sao iguais!");
        }else{ // A e B são diferentes

            if(a>b){
                System.out.println("Maior foi o primeiro: "+a);
            }else{
                System.out.println("Maior foi o segundo: "+b);

            }
            }
    }
}
