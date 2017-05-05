package by.bsuir.books.dao.repositories.links;

import by.bsuir.books.entity.Links;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by QuantumCat on 05.05.2017.
 */
public interface LinksRepository extends PagingAndSortingRepository<Links, Long>, LinksRepositoryCustom {
}
