package br.com.mjc.conexao;

import lombok.Getter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
    public EntityManager conectar() {
        EntityManagerFactory factory = null;
        EntityManager entityManager = null;
        try {
            //Obtém o factory a partir da unidade de persistência.
            factory = Persistence.createEntityManagerFactory("persistencia-jpa");
            //Cria um entity manager.
            entityManager = factory.createEntityManager();
            //Fecha o factory para liberar os recursos utilizado.
        } finally {
            factory.close();
        }
        return entityManager;
    }
}


