package by.bsuir.books.service.services.links;

import by.bsuir.books.entity.Links;
import by.bsuir.books.service.util.ServiceResponseEntity;

import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
public interface LinksService {

    ServiceResponseEntity<Links> getLink(int id);
    ServiceResponseEntity<List<Links>> getLinksByBookId(int id);

}
