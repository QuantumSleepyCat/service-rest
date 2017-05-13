package by.bsuir.books.service.services.comments;

import by.bsuir.books.dao.factory.DaoFactory;
import by.bsuir.books.entity.Comments;
import by.bsuir.books.service.util.ServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * Created by QuantumCat on 12.05.2017.
 */
@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    DaoFactory daoFactory;

    @Override
    public ServiceResponseEntity<Comments> addComment(Comments comments) {
        comments = daoFactory.getCommentsRepository().save(comments);
        return new ServiceResponseEntity<>(comments, HttpStatus.CREATED);
    }
}
