package br.com.abc.javacore.modificadorestatico.test;

import br.com.abc.javacore.modificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 260);
        Carro c3 = new Carro("Mercedes", 275);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
