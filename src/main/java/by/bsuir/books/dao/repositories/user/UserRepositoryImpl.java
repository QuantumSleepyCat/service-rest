package by.bsuir.books.dao.repositories.user;

import by.bsuir.books.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

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

    @Override
    public List<User> authorization(User user) {
        Query query = entityManager.createNativeQuery("SELECT * FROM `user` WHERE login = ?", User.class);
        query.setParameter(1,user.getLogin());
        List<User> userList = query.getResultList();

        for(User u:userList)
        {
            System.out.println(u.getLogin());
        }

       return userList;
    }


}
