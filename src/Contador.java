import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numeroDois = scanner.nextInt();

        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidos e) {
            System.err.println(e.getMessage());
        }

    }
    
        public static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidos {
            if (numeroUm > numeroDois) {
                throw new ParametrosInvalidos("O segundo número deve ser maior que o primeiro");
            }
    
            int diferenca = numeroDois - numeroUm;
    
            for (int i = 1; i <= diferenca; i++) {
                System.out.println("Imprimindo o número " + i);

            }

        }

    }