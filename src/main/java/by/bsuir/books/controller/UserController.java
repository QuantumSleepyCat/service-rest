package by.bsuir.books.controller;

import by.bsuir.books.collections.BookmarksCollection;
import by.bsuir.books.entity.Bookmarks;
import by.bsuir.books.entity.User;
import by.bsuir.books.service.factory.ServiceFactory;
import by.bsuir.books.service.util.ServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {



    @Autowired
    private ServiceFactory serviceFactory;

//    @RequestMapping(method = RequestMethod.POST)
//     public ResponseEntity<User> addUser(@RequestBody User user) {
//        ServiceResponseEntity<User> responseEntity = serviceFactory.getUserService().addUser(user);
//        return new ResponseEntity<User>(responseEntity.getResultBody(), responseEntity.getStatus());
//    }


    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResponseEntity<String> createEmployee(@RequestBody User employee)
    {
        System.out.println(employee.getLogin());
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/authorization", method = RequestMethod.POST)
    public ResponseEntity<User> authorization(@RequestBody User user) {
        System.out.println(user.getLogin());
        ServiceResponseEntity<User> responseEntity = serviceFactory.getUserService().authorization(user);
        return new ResponseEntity<User>(responseEntity.getResultBody(), responseEntity.getStatus());
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public ResponseEntity<User> getUser(@PathVariable int userId) {
        ServiceResponseEntity<User> responseEntity = serviceFactory.getUserService().getUser(userId);
        return new ResponseEntity<User>(responseEntity.getResultBody(), responseEntity.getStatus());
    }

    @RequestMapping(value = "/bo/{bId}", method = RequestMethod.GET)
    public ResponseEntity<Bookmarks> getBookmarks(@PathVariable int bId) {
        ServiceResponseEntity<Bookmarks> responseEntity = serviceFactory.getBookmarksService().getBookmark(bId);
        return new ResponseEntity<Bookmarks>(responseEntity.getResultBody(), responseEntity.getStatus());
    }

    @RequestMapping(value = "/profile/{userId}", method = RequestMethod.GET)
    public ResponseEntity<BookmarksCollection> getUserProfile(@PathVariable int userId) {
        ServiceResponseEntity<User> responseEntity = serviceFactory.getUserService().getUser(userId);
        BookmarksCollection bookmarksCollection= new BookmarksCollection();
        bookmarksCollection.setBookmarksList(responseEntity.getResultBody().getBookmarksList());
        System.out.println(responseEntity.getResultBody().getLogin());
        for(Bookmarks bo: bookmarksCollection.getBookmarksList())
        {
            System.out.println(bo.getBook().getTitle());
        }

        return new ResponseEntity<BookmarksCollection>(bookmarksCollection, HttpStatus.OK);
    }


}
