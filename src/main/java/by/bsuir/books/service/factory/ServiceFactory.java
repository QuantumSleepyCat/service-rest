package by.bsuir.books.service.factory;



import by.bsuir.books.entity.Bookmarks;
import by.bsuir.books.service.services.book.BookService;
import by.bsuir.books.service.services.bookmarks.BookmarksService;
import by.bsuir.books.service.services.comments.CommentsService;
import by.bsuir.books.service.services.links.LinksService;
import by.bsuir.books.service.services.news.NewsService;
import by.bsuir.books.service.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {
    @Autowired
    private UserService userService;

    @Autowired
    private NewsService newsService;

    @Autowired
    private BookService bookService;

    @Autowired
    private LinksService linksService;

    @Autowired
    private CommentsService commentsService;

    @Autowired
    private BookmarksService bookmarksService;

    public BookmarksService getBookmarksService() {
        return bookmarksService;
    }


    public CommentsService getCommentsService() {
        return commentsService;
    }

    public LinksService getLinksService() {
        return linksService;
    }

    public BookService getBookService() {
        return bookService;
    }

    public NewsService getNewsService() {
        return newsService;
    }

    public UserService getUserService() {
        return userService;
    }


}
