import java.util.Scanner;
public class ex_03 {
    public static void main(String[] args) {

        //instanciar o Scanner (linha obrigatoria para ler os dados da consola)
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 3 *****");

        //declarar variavel
        double sal;

        //ler valores do utilizador
        System.out.println("Insira seu salario");

        sal = input.nextInt();

        if (sal <= 15000) { //Se o salario for menor ou igual que 15000 paga taxa de 20%
            System.out.println("O imposto sera de 20%: " + sal * 0.2);
        } else {
            if (sal <= 20000) { //Se o salario for menor ou igual que 20000 paga taxa de 30%
                System.out.println("o imposto sera de 30% " + sal * 0.3);
            } else {
                if (sal <= 25000) { //Se o salario for menor ou igual que 25000 paga taxa de 35%
                    System.out.println("O imposto sera de 35% " + sal * 0.35);
                } else {
                    if (sal > 25000) { //Se o salario for maior que 25000 paga taxa de 40%
                        System.out.println("O imposto sera de 40% " + sal * 0.4);
                    }
                }


            }
        }
    }
}
