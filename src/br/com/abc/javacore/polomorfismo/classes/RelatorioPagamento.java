package br.com.abc.javacore.polomorfismo.classes;

public class RelatorioPagamento {
/*
    public void relatorioPagamentoGerente(Gerente gerente){
        System.out.println("---- Gerando relatorio de pagamento para a gerencia ----");
        gerente.calcularPagamento();
        System.out.println("Nome: "+gerente.getNome());
        System.out.println("Salario: "+gerente.getSalario());
    }

    public void relatorioPagamentoVendedor(Vendedor vendedor){
        System.out.println("---- Gerando relatorio de pagamento para os vendedores ----");
        vendedor.calcularPagamento();
        System.out.println("Nome: "+vendedor.getNome());
        System.out.println("Salario: "+vendedor.getSalario());
    }
 */

    // Uma variavel mais generica fazer referencia a uma variavel mais especifica


    //                                     Parametros polimorficos
    //                                    |------------------------|
    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("---- Gerando relatorio de pagamento generico----");
        funcionario.calcularPagamento();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salario: "+funcionario.getSalario());
/*
        if(funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario; // aqui é criada uma variavel, caso fosse necessário utilizar esta chamada outras vezes
            System.out.println("Participação nos lucros: "+g.getParticipacaoLucro());
        }
        if(funcionario instanceof Vendedor){
            Vendedor v = (Vendedor) funcionario;
            System.out.println("Total de vendas: "+v.getTotalVendas());
        }
 */
        if(funcionario instanceof Gerente){
            System.out.println("Participação nos lucros: "+((Gerente) funcionario).getParticipacaoLucro());
        }
        if(funcionario instanceof Vendedor){
            System.out.println("Total de vendas: "+((Vendedor) funcionario).getTotalVendas()); // aqui não é criado uma variavel, será executado apenas uma vez
            //                                      |----------------------|-----------------|
            //                                       variavel de referencia     chamada da
            //                                          do tipo vendedor          função
        }

    }
}
