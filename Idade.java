import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int i = 2;

        System.out.println("Escreva o nome do usuário 1:");
        String nome = ler.next();
        String nomeN = nome;
        String nomeV = nome;
        System.out.println("Escreva a idade do usuário 1:");
        int id = ler.nextInt();
        int idN = id;
        int idV = id;

        while (i<=9) {
            System.out.println("Escreva o nome do usuário " + i + ":");
            nome = ler.next();
            System.out.println("Escreva a idade do usuário " + i + ":");
            id = ler.nextInt();
            if (id < idN) {
                nomeN = nome;
                idN = id;
            } else if (id > idV) {
                nomeV = nome;
                idV = id;
            }
            i++;
        }
        System.out.println("O mais novo é " + nomeN + " com " + idN + " anos.");
        System.out.println("O mais velho é " + nomeV + " com " + idV + " anos.");

	}

}
