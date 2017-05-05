package by.bsuir.books.dao.repositories.book;

import by.bsuir.books.entity.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by QuantumCat on 05.05.2017.
 */
public interface BookRepository extends PagingAndSortingRepository<Book, Long>,BookRepositoryCustom  {
}
