package by.bsuir.books.dao.repositories.comments;

import by.bsuir.books.entity.Comments;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by QuantumCat on 12.05.2017.
 */
public interface CommentsRepository extends PagingAndSortingRepository<Comments, Long>, CommentsRepositoryCustom {
}
