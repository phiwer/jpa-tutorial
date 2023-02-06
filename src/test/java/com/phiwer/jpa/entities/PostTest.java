package com.phiwer.jpa.entities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    void test() {
        // Arrange
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("jpa-local");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        // Act
        entityManager.persist(new Post());

        transaction.commit();

        // Assert

    }

}