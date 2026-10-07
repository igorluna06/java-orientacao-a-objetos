import java.util.Scanner;

class QuartoPrograma{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Entradas do sistema (System.in)
        System.out.println("Digite um número: ");

        //Lendo o número digitado no teclado
        int valor = entrada.nextInt();
        System.out.println("O número digitado foi: " + valor);
    }
}

/*
    O método nextInt() da variável de entrada, o valor digitado
    pelo usuário será atribuido à variável "valor".
 */