package by.bsuir.books.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by QuantumCat on 12.05.2017.
 */
@Entity
@Table(name = "comments")
public class Comments implements Serializable{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "message")
    private String message;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Time time;

    @Column(name = "type")
    private int type;

    @ManyToOne
    @JoinColumn(name = "id_book")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public void setBook(Book book) {
        this.book = book;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Time getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }
}
