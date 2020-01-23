package br.com.abc.javacore.classesabstratas.test;

import br.com.abc.javacore.classesabstratas.classes.Funcionario;
import br.com.abc.javacore.classesabstratas.classes.Gerente;
import br.com.abc.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        //Funcionario f = new Funcionario("Marcos","15151-5",2000);
        //f.calculaSalario();
        //System.out.println(f);

        Gerente g = new Gerente("Ana","12121-5",2000);
        Vendedor v = new Vendedor("Gabi","54845-7",2000,5000);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(g);
        System.out.println(v);
    }
}
