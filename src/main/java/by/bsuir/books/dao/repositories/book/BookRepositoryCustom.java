package by.bsuir.books.dao.repositories.book;

import by.bsuir.books.entity.Book;

import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
public interface BookRepositoryCustom {

    List<Book> getThreeLastBooks();
    List<Book> getPage(int numbpage);
    int getCount();
}
