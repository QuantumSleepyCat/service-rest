package by.bsuir.books.collections;

import by.bsuir.books.entity.Book;
import by.bsuir.books.entity.News;
import by.bsuir.books.entity.User;

import java.util.List;

/**
 * Created by QuantumCat on 15.05.2017.
 */
public class AdminCollection {

    private List<User> userList=null;
    private List<Book> bookList=null;
    private List<News> newsList=null;

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }
}
