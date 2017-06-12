package by.bsuir.books.service.services.bookmarks;

import by.bsuir.books.entity.Bookmarks;
import by.bsuir.books.service.util.ServiceResponseEntity;

/**
 * Created by QuantumCat on 15.05.2017.
 */
public interface BookmarksService {

    ServiceResponseEntity<Bookmarks> getBookmark(int id);
}
