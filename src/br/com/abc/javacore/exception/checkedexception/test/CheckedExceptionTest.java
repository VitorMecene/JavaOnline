package br.com.abc.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
/*
        try{
            criarArquivo();
        }catch (IOException e){
            e.printStackTrace();
        }
*/

        abrirArquivo();
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

    public static String abrirArquivo() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Executando leitura do arquivo");
            //throw new Exception();
            System.out.println("Escrevendo no arquivo");
            return "valor";
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Fechando arquivo");
        }
        return null;
        // cria-se sempre um try/catch ou try/finally ou também try/catch/finally
    }
}
