package by.bsuir.books.service.services.book;

import by.bsuir.books.entity.Book;
import by.bsuir.books.service.util.ServiceResponseEntity;

import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
public interface BookService {

    ServiceResponseEntity<Book> getBook(int id);
    ServiceResponseEntity<List<Book>> getThreeLastBooks();
    ServiceResponseEntity<List<Book>> getPage(int numbPage);
    ServiceResponseEntity<Integer> getCount();

}
