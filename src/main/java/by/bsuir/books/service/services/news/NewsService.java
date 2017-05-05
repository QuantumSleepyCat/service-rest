package by.bsuir.books.service.services.news;

import by.bsuir.books.entity.News;
import by.bsuir.books.service.util.ServiceResponseEntity;

import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
public interface NewsService {

    ServiceResponseEntity<News> getNews(int newsId);
    ServiceResponseEntity<News> getNewsById(int newsId);
    ServiceResponseEntity<List<News>> getThreeLustNews();
}
