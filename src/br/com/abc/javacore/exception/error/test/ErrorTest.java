package br.com.abc.javacore.exception.error.test;

public class ErrorTest {

    /*
    Exceções são fluxo anormais, "coisas que não deveria acontecer no codigo"

    Exceções são classes e todas elas são filhas da classe throwable
    que significa "todas exeções que poder ser lançada"

    throwable tem dois filhos: Error e Exeption

    Error e Exeption são lançados

    Exceções poder ser tratadas, tem como se prevenir

    Error não há tratamento, o programa para de funcionar
     */

    public static void main(String[] args) {
        stackOverflowError();
    }

    public static void stackOverflowError(){
        stackOverflowError();
    }

    // CHECKED -> Exceções que será obrigatório a criação de algum tipo de tratamento para aquela exceção
    // Exceções de tipo "Exception" e filhas do tipo "Exception" são consideradas CHECKED

    // UNCHECKED -> Exceções que não necessita de criação de tratamento
    // Exceções de tipo "RuntimeException" e filhas do tipo "RuntimeException" são consideradas UNCHECKED

}
