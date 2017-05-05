package by.bsuir.books.dao.factory;


import by.bsuir.books.dao.repositories.book.BookRepository;
import by.bsuir.books.dao.repositories.links.LinksRepository;
import by.bsuir.books.dao.repositories.news.NewsRepository;
import by.bsuir.books.dao.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoFactory {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private LinksRepository linksRepository;

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public LinksRepository getLinksRepository() {
        return linksRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public NewsRepository getNewsRepository() {
        return newsRepository;
    }
}
