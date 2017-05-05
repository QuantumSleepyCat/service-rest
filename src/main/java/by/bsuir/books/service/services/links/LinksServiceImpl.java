package by.bsuir.books.service.services.links;

import by.bsuir.books.dao.factory.DaoFactory;
import by.bsuir.books.entity.Links;
import by.bsuir.books.service.util.ServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
@Service
public class LinksServiceImpl implements LinksService {

    @Autowired
    DaoFactory daoFactory;

    @Override
    public ServiceResponseEntity<Links> getLink(int id) {
        Links links = daoFactory.getLinksRepository().findOne(Long.valueOf(id));
        return (links == null) ?
                new ServiceResponseEntity<Links>(HttpStatus.NOT_FOUND) :
                new ServiceResponseEntity<>(links, HttpStatus.OK);
    }

    @Override
    public ServiceResponseEntity<List<Links>> getLinksByBookId(int id) {
        List<Links>links = daoFactory.getLinksRepository().getLinksByBookId(Long.valueOf(id));
        return (links == null) ?
                new ServiceResponseEntity<List<Links>>(HttpStatus.NOT_FOUND) :
                new ServiceResponseEntity<>(links, HttpStatus.OK);
    }
}
