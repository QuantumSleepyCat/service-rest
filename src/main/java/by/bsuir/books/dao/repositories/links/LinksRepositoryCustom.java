package by.bsuir.books.dao.repositories.links;

import by.bsuir.books.entity.Book;
import by.bsuir.books.entity.Links;

import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
public interface LinksRepositoryCustom {

    List<Links> getLinksByBookId(long bookId);
}
