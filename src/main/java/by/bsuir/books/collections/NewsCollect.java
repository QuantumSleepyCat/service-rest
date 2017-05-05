package by.bsuir.books.collections;

import by.bsuir.books.entity.News;
import by.bsuir.books.service.factory.ServiceFactory;
import by.bsuir.books.service.util.ServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by QuantumCat on 05.05.2017.
 */
public class NewsCollect {

    public NewsCollect(){}
    private List<News> list = null;

    public void setList(List<News> list) {
        this.list = list;
    }

    public List<News> getList() {
        return list;
    }
}
