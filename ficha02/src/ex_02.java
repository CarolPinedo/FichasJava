import java.util.Scanner;
public class ex_02 {
    public static void main(String[] args) {

        //instanciar o Scanner (linha obrigatoria para ler os dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 2 *****");

        //declarar variável
        double sal;

        //ler valores do utilizador
        System.out.println("Insira seu salario");

        sal= input.nextInt();

        if(sal<=15000) { //Se o salario for menor ou igual que 15000 paga taxa de 20%
            System.out.println("O imposto sera de 20%: "+sal*0.2);
        }else{ //Salario maior que 15000 paga 30%)
            System.out.println("O imposto sera de 30%: "+sal*0.3);


        }

    }
}
