package by.bsuir.books.dao.repositories.news;

import by.bsuir.books.entity.News;

import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
public interface NewsRepositoryCustom {
    News getNewsById(long idNews);
    List<News> getThreeLustNews();
}
