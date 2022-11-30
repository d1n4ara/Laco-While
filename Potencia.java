import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

        System.out.println("Digite a base:");
        int b = ler.nextInt();
        System.out.println("Digite o expoente:");
        int e = ler.nextInt();
        int res = 1;

        while (e>0) {
            res = res * b;
            e--;
        }
        System.out.println("O resultado da potência é: " + res);

	}

}
