package by.bsuir.books.dao.repositories.bookmarks;

import by.bsuir.books.entity.Bookmarks;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by QuantumCat on 15.05.2017.
 */
public interface BookmarksRepository extends PagingAndSortingRepository<Bookmarks, Long>, BookmarksRepositoryCustom{
}
