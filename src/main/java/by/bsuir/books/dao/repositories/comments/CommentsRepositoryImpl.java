package by.bsuir.books.dao.repositories.comments;

import by.bsuir.books.entity.Comments;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by QuantumCat on 12.05.2017.
 */
@Repository
public class CommentsRepositoryImpl {

    @Autowired
    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;


}
