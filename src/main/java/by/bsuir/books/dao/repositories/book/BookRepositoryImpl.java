package by.bsuir.books.dao.repositories.book;

import by.bsuir.books.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */

@Repository
public class BookRepositoryImpl{

    @Autowired
    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;


    public List<Book> getThreeLastBooks() {
        Query query = entityManager.createNativeQuery("SELECT * FROM `book` ORDER BY id DESC LIMIT 3");
        List<Book> bookList = query.getResultList();
        if(bookList.size()>0)
        {
            return bookList;
        }
        return null;
    }
}
