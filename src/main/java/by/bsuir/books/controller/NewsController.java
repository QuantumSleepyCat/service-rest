package by.bsuir.books.controller;

import by.bsuir.books.collections.NewsCollect;
import by.bsuir.books.entity.News;
import by.bsuir.books.entity.User;
import by.bsuir.books.service.factory.ServiceFactory;
import by.bsuir.books.service.util.ServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
@RestController
@RequestMapping(value = "/news",  produces = MediaType.APPLICATION_JSON_VALUE)
public class NewsController {

    @Autowired
    private ServiceFactory serviceFactory;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<NewsCollect> getThreeNews(){
        ServiceResponseEntity<List<News>> news = serviceFactory.getNewsService().getThreeLustNews();
//        return new ResponseEntity<List<News>>(news.getResultBody(), news.getStatus());
        NewsCollect newsCollect = new NewsCollect();
        newsCollect.setList(news.getResultBody());

        return new ResponseEntity<NewsCollect>(newsCollect,HttpStatus.OK);
    }

    @RequestMapping(value = "/{newsId}", method = RequestMethod.GET)
    public ResponseEntity<News> getNews(@PathVariable int newsId){
        ServiceResponseEntity<News> news = serviceFactory.getNewsService().getNews(newsId);
        return new ResponseEntity<News>(news.getResultBody(), news.getStatus());

    }



}
