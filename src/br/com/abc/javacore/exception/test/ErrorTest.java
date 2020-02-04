package br.com.abc.javacore.exception.test;

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

    // stack:
}
