package Unidade04;
import java.util.Scanner;

public class Uni4Exe04 {
    
    public Uni4Exe04(){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número ");
        float numero = in.nextFloat();

        if( numero % 2 != 0) {
            System.out.println("O número foi digitado com casas decimais.");
        } else {
            System.out.println("O número não foi digitado com casas decimais");
        }

        in.close();
    }
    
    
    public static void main(String[] args) {
        new Uni4Exe04();
    }
}
