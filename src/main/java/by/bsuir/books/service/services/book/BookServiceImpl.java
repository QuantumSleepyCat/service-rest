package by.bsuir.books.service.services.book;

import by.bsuir.books.dao.factory.DaoFactory;
import by.bsuir.books.entity.Book;
import by.bsuir.books.service.util.ServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
@Service
public class BookServiceImpl implements BookService{


    @Autowired
    DaoFactory daoFactory;

    @Override
    public ServiceResponseEntity<Book> getBook(int id) {
        Book book = daoFactory.getBookRepository().findOne(Long.valueOf(id));

        return (book == null) ?
                new ServiceResponseEntity<Book>(HttpStatus.NOT_FOUND) :
                new ServiceResponseEntity<>(book, HttpStatus.OK);
    }

    @Override
    public ServiceResponseEntity<List<Book>> getThreeLastBooks() {
        List<Book> bookList = daoFactory.getBookRepository().getThreeLastBooks();

        return (bookList == null) ?
                new ServiceResponseEntity<List<Book>>(HttpStatus.NOT_FOUND) :
                new ServiceResponseEntity<>(bookList, HttpStatus.OK);
    }
}
