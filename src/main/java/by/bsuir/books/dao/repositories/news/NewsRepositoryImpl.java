package by.bsuir.books.dao.repositories.news;

import by.bsuir.books.entity.News;
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
public class NewsRepositoryImpl {

    @Autowired
    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;

    public News getNewsById(long newsId)
    {
        News news = null;
        Query query = entityManager.createNativeQuery("SELECT * FROM `news` WHERE id = ?", News.class);
        query.setParameter(1, newsId);
        System.out.println(query);
        List<News> showings = query.getResultList();
        System.out.println(showings);
        return showings.size()>0 ? showings.get(0) : null;
    }

    public List<News> getThreeLustNews()
    {
        Query query = entityManager.createNativeQuery("Select * from `news` ORDER BY id DESC LIMIT 3", News.class);
        List<News> newsList=query.getResultList();
        return  newsList;
    }
}
