package br.com.abc.javacore.exception.checkedexception.classes;

import br.com.abc.javacore.exception.customexceptions.classes.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws FileNotFoundException, RuntimeException {

    }
}
