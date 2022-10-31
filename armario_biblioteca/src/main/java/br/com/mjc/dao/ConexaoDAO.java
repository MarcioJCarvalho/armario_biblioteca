package br.com.mjc.dao;

import lombok.Getter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoDAO {
    @Getter
    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;

    public ConexaoDAO(){
        entityManagerFactory = Persistence.createEntityManagerFactory("persistencia-jpa");
        entityManager = entityManagerFactory.createEntityManager();
    }
}
