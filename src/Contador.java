import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("|========= Seja-bem vindo ==========|");
        System.out.println("Digite o primeiro parâmetro");

        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        System.out.println("|===================================|");

        int parametroDois = terminal.nextInt();

        try {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        //realizar o for para imprimir os números com base na variável contagem
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
