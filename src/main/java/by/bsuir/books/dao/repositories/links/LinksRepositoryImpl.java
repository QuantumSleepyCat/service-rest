package by.bsuir.books.dao.repositories.links;

import by.bsuir.books.entity.Book;
import by.bsuir.books.entity.Links;
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
public class LinksRepositoryImpl {

    @Autowired
    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;

    public List<Links> getLinksByBookId(long bookId)
    {
        Query query = entityManager.createNativeQuery("SELECT * FROM `links` WHERE id=?", Links.class);
        query.setParameter(1,bookId);
        List<Links> linksList = query.getResultList();
        if(linksList.size()!=0)
        {
            return linksList;
        }
        return null;
    }

}
