class ExemploSwitch {
    public static void main(String[] args) {
        switch (args[0].charAt(0)) {
            case 'A':
                System.out.println("Vogal A");
                break;
            case 'E':
                System.out.println("Vogal E");
                break;
            default:
                System.out.println("Não é vogal");
        }
    }
}

/*

    O switch é equivalente de maneira lógica a um conjunto
    de cláusulas if organizadas de forma encadeada e isso é
    usualmente mais eficiente durante uma execução de um programa

    Estrutura:
    switch (expressão) {
        case valor1:
            // código
            break;
        case valor2:
            // código
            break;
        default:
            // código
    }

    Iniciadas as cláusulas por "case" e encerrada pelo "break", caso não possuir
    um caso especifíco será executada a cláusula "default"
 */