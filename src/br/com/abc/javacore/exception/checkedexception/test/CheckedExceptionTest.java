package br.com.abc.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try{
            criarArquivo();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
        try{
            System.out.println("Aquivo criado?: "+file.createNewFile());
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }

    }
}
