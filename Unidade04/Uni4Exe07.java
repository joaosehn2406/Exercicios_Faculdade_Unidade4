package Unidade04;

import java.util.Scanner;


public class Uni4Exe07 {

    public Uni4Exe07() {

        Scanner in = new Scanner(System.in);

        System.out.println("Qual o peso da carta? ");
        float pesoCarta = in.nextFloat();
        float valorCarta = pesoCarta * 0.45f; // 22,5 
        float custoExtra = 0;
        float pesoExcedido = 0;
        float valorTotal = valorCarta;

        if (pesoCarta > 50) {
            pesoExcedido -= 50;
            custoExtra = (pesoExcedido / 20) * 0.45f; 
            valorTotal = valorCarta + custoExtra;
            System.out.printf("O custo da carta é %.2f reais", valorTotal);
        } else {
            System.out.printf("O valor da carta é %.2f", valorTotal);
        }
        in.close();
    }

    public static void main(String[] args) {
        new Uni4Exe07();
    }
}
