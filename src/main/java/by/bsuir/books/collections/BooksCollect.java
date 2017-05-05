package by.bsuir.books.collections;

import by.bsuir.books.entity.Book;

import java.security.PublicKey;
import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
public class BooksCollect {

    public BooksCollect(){}

    private List<Book> booksCollects=null;

    public void setBooksCollects(List<Book> booksCollects) {
        this.booksCollects = booksCollects;
    }

    public List<Book> getBooksCollects() {
        return booksCollects;
    }
}
