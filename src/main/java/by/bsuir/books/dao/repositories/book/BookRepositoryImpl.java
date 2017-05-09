package by.bsuir.books.dao.repositories.book;

import by.bsuir.books.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
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
        Query query = entityManager.createNativeQuery("SELECT * FROM `book` ORDER BY id DESC LIMIT 3", Book.class);
        List<Book> bookList = query.getResultList();
        if(bookList.size()>0)
        {
            return bookList;
        }
        return null;
    }

    public List<Book> getPage(int numbpage){
        int k=(10*numbpage-10);
        Query query = entityManager.createNativeQuery("SELECT * FROM `book` ORDER BY id DESC LIMIT "+k+",10",Book.class);
        List<Book> list = query.getResultList();
        return (list.size()>0)? list:null;
    }

    public int getCount()
    {
        BigInteger in = (BigInteger) entityManager.createNativeQuery("SELECT count(*) FROM `book`").getSingleResult();
        System.out.println(in.intValue());
        return in.intValue();
    }
}
