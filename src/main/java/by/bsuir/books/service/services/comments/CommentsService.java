package by.bsuir.books.service.services.comments;

import by.bsuir.books.entity.Comments;
import by.bsuir.books.service.util.ServiceResponseEntity;

/**
 * Created by QuantumCat on 12.05.2017.
 */
public interface CommentsService {

    ServiceResponseEntity<Comments> addComment(Comments comments);
}
