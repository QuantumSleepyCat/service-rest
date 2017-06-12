package by.bsuir.books.controller;

import by.bsuir.books.collections.AdminCollection;
import by.bsuir.books.entity.Book;
import by.bsuir.books.entity.News;
import by.bsuir.books.entity.User;
import by.bsuir.books.service.factory.ServiceFactory;
import by.bsuir.books.service.util.ServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by QuantumCat on 15.05.2017.
 */
@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private ServiceFactory serviceFactory;

    @RequestMapping("/getall")
    public ResponseEntity<AdminCollection> getAll()
    {
        ServiceResponseEntity<List<Book>> bookList=serviceFactory.getBookService().getAll();
        ServiceResponseEntity<List<User>> userList=serviceFactory.getUserService().getAll();
        ServiceResponseEntity<List<News>> newsList=serviceFactory.getNewsService().getAll();

        AdminCollection adminCollection=new AdminCollection();
        adminCollection.setBookList(bookList.getResultBody());
        adminCollection.setNewsList(newsList.getResultBody());
        adminCollection.setUserList(userList.getResultBody());

        return new ResponseEntity<AdminCollection>(adminCollection, HttpStatus.OK);

    }


}
