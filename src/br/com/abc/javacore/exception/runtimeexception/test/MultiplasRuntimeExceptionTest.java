package br.com.abc.javacore.exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try{
            throw  new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }
        System.out.println("final do programa");
        // se as exceções pertencer a mesma filiação, sempre colocar a exceção mais generica por ultimo

        try{
            talvezLanceExeception();
        }catch (SQLException | IOException e){

        }
    }
    private static void talvezLanceExeception() throws  SQLException, FileNotFoundException{

    }
}