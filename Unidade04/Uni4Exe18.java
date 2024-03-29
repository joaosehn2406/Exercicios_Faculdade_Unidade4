package Unidade04;

import java.util.Scanner;

public class Uni4Exe18 {

    public Uni4Exe18() {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da prestação:");
        float valor = in.nextFloat();
        System.out.println("Digite o dia do pagamento:");
        int diaPagamento = in.nextInt();
        int vencimento = 10;

        if (diaPagamento <= vencimento) {
            valor *= 0.9f;
            System.out.println("Pagamento está em dia. Você ganhou 10% de desconto. Valor a pagar: " + valor);
        } else if (diaPagamento <= vencimento + 5) {
            System.out.println("Pagamento atrasado, mas dentro do limite de 5 dias. Valor a pagar: " + valor);
        } else {
            int diasAtraso = diaPagamento - vencimento - 5;
            for (int i = 1; i <= diasAtraso; i++) {
                valor *= 1.02f;
            }
            System.out.println("Pagamento atrasado por mais de 5 dias. Valor a pagar com multa: " + valor);
        }

        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe18();
    }
}
