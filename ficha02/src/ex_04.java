import java.util.Scanner;

public class ex_04 {

    public static void main(String[] args) {

        //instanciar o Scanner (linha obrigatoria para ler os dados no consola)
        Scanner input = new Scanner(System.in);

        System.out.println("***** Exercicio 4 *****");

        //declarar variável
        int lug;

        //ler valores do utilizador
        System.out.println("Insira o seu lugar");

        lug = input.nextInt();

        if (lug == 1) { //Lugar 1 recebe 10 pontos
            System.out.println("Ganhou 10 pontos");
        } else {
            if (lug == 2) { //lugar 2 recebe 8 pontos
                System.out.println("Ganhou 8 pontos");
            } else {
                if (lug == 3) { //lugar 3 recebe 6 pontos
                    System.out.println("Ganhou 6 pontos");
                } else {
                    if (lug == 4) { //lugar 4 recebe 5 pontos
                        System.out.println("Ganhou 5 pontos");
                    } else {
                        if (lug == 5) { //lugar 5 recebe 4 pontos
                            System.out.println("Ganhou 4 pontos");
                        } else {
                            if (lug == 6) { //lugar 6 recebe 3 pontos
                                System.out.println("Ganhou 3 pontos");
                            } else {
                                if (lug == 7) { //lugar 7 recebe 2 pontos
                                    System.out.println("Ganhou 2 pontos");
                                } else {
                                    if (lug == 8) { //lugar 8 recebe 1 ponto
                                        System.out.println("Ganhou 1 ponto");
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
    }
}