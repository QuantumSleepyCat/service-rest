package by.bsuir.books.controller;

import by.bsuir.books.collections.BooksCollect;
import by.bsuir.books.entity.Book;
import by.bsuir.books.service.factory.ServiceFactory;
import by.bsuir.books.service.util.ServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping(value = "/books")
public class BooksController {

    @Autowired
    private ServiceFactory serviceFactory;


    @RequestMapping(value = "/{idBook}",method = RequestMethod.GET)
    public ResponseEntity<Book> getBook(@PathVariable int idBook)
    {
        ServiceResponseEntity<Book> book = serviceFactory.getBookService().getBook(idBook);
        return new  ResponseEntity<Book>(book.getResultBody(), book.getStatus());
    }

    @RequestMapping(value = "/forindex", method = RequestMethod.GET)
    public ResponseEntity<BooksCollect> getThreeBook()
    {
        ServiceResponseEntity<List<Book>> books = serviceFactory.getBookService().getThreeLastBooks();
        BooksCollect booksCollect = new BooksCollect();
        booksCollect.setBooksCollects((List<Book>)books.getResultBody());
        if(booksCollect!=null){
        return new ResponseEntity<BooksCollect>(booksCollect, HttpStatus.OK);}
        return new ResponseEntity<BooksCollect>(HttpStatus.NOT_FOUND);
    }


    @RequestMapping(value = "/page/{pageNumb}", method = RequestMethod.GET)
    public ResponseEntity<BooksCollect> getPage(@PathVariable int pageNumb)
    {
        ServiceResponseEntity<List<Book>> books = serviceFactory.getBookService().getPage(pageNumb);
        BooksCollect booksCollect =new BooksCollect();
        booksCollect.setBooksCollects(books.getResultBody());
        return (booksCollect!=null) ?  new ResponseEntity<BooksCollect>(booksCollect,HttpStatus.OK):
        new ResponseEntity<BooksCollect>(HttpStatus.NOT_FOUND);

    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public ResponseEntity<Integer> getCount()
    {
        ServiceResponseEntity<Integer> count = serviceFactory.getBookService().getCount();
        return new ResponseEntity<Integer>(count.getResultBody(), count.getStatus());
    }
}
