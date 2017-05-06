package by.bsuir.books.service.services.news;

import by.bsuir.books.dao.factory.DaoFactory;
import by.bsuir.books.entity.News;
import by.bsuir.books.service.util.ServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private DaoFactory daoFactory;

    @Override
    public ServiceResponseEntity<News> getNews(int newsId) {
        News news = daoFactory.getNewsRepository().findOne(Long.valueOf(newsId));

        return (news == null) ?
                new ServiceResponseEntity<News>(HttpStatus.NOT_FOUND) :
                new ServiceResponseEntity<>(news, HttpStatus.OK);
    }

    @Override
    public ServiceResponseEntity<News> getNewsById(int newsId) {

        News news = daoFactory.getNewsRepository().getNewsById(Long.valueOf(newsId));
        return (news == null) ?
                new ServiceResponseEntity<News>(HttpStatus.NOT_FOUND) :
                new ServiceResponseEntity<>(news, HttpStatus.OK);
    }

    @Override
    public ServiceResponseEntity<List<News>> getThreeLustNews() {
        List<News> newsList = daoFactory.getNewsRepository().getThreeLustNews();
        //System.out.println(newsList.get(0).getTitle()+"!!!!!!!!!!!!!");
        return (newsList == null)?
                new ServiceResponseEntity<List<News>>(HttpStatus.NOT_FOUND):
                new ServiceResponseEntity<>(newsList, HttpStatus.OK);

    }


}
