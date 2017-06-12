package by.bsuir.books.service.services.bookmarks;

import by.bsuir.books.dao.factory.DaoFactory;
import by.bsuir.books.entity.Bookmarks;
import by.bsuir.books.service.util.ServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * Created by QuantumCat on 15.05.2017.
 */
@Service
public class BookmarksServiceImpl implements BookmarksService{

    @Autowired
    DaoFactory daoFactory;

    @Override
    public ServiceResponseEntity<Bookmarks> getBookmark(int id) {
        Bookmarks bookmarks = daoFactory.getBookmarksRepository().findOne(Long.valueOf(id));
        return new ServiceResponseEntity<>(bookmarks, HttpStatus.FOUND);
    }
}
