package by.bsuir.books.dao.repositories.user;

import by.bsuir.books.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class UserRepositoryImpl implements UserRepositoryCustom{

    @Autowired
    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void getFirstName(String login) {
        Query query = entityManager.createNativeQuery("some query with ? ", User.class);
        query.setParameter(1, login);
    }
}
