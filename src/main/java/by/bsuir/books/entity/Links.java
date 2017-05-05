package by.bsuir.books.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by QuantumCat on 05.05.2017.
 */
@Entity
@Table(name = "links")
public class Links implements Serializable{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "link")
    private String link;

    @ManyToOne
    @JoinColumn(name = "id_book",  referencedColumnName = "id")
    private Book book;

    public Links(){}

    public Links(long id, String link, Book book)
    {
        this.id=id;
        this.link=link;
        this.book=book;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public long getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public String getLink() {
        return link;
    }
}
