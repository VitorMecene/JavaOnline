package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica", "421.051.408-07", 4500d, "6151616");
        Funcionario funcionario2 = new Funcionario();
        //funcionario.init("Chica", "421.051.408-07", 4500d, "6151616");
        funcionario.imprime();
        funcionario2.imprime();
    }
}
