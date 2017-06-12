package by.bsuir.books.dao.repositories.bookmarks;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by QuantumCat on 15.05.2017.
 */
@Repository
public class BookmarksRepositoryImpl {

    @Autowired
    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;

}
