class ExemploWhile {
    public static void main(String[] args) {
        int j = 10;

        while(j < Integer.parseInt(args[0])){
            System.out.println(j);
            j--;
        }
    }
}

/*
    While = ENQUANTO

    Consiste em uma cláusula na qual seu bloco será executado durante
    ou ENQUANTO a expressão lógica a ser testada for verdadeira

    Estrutura:

    While(expressão lógica){
        Sequeência;
    }
 */