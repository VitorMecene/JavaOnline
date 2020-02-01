package br.com.abc.javacore.polomorfismo.test;

import br.com.abc.javacore.polomorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.polomorfismo.classes.DatabaseDAOImpl;
import br.com.abc.javacore.polomorfismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        /*
        ArquivoDAOImpl arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
         */

        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();

        GenericDAO databaseDAO = new DatabaseDAOImpl();
        databaseDAO.save();
    }
}
