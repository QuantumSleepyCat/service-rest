package by.bsuir.books.dao.repositories.news;

import by.bsuir.books.entity.News;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by QuantumCat on 05.05.2017.
 */
public interface NewsRepository extends PagingAndSortingRepository<News, Long>, NewsRepositoryCustom {


}
