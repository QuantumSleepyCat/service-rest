package by.bsuir.books.entity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Date;

/**
 * Created by QuantumCat on 05.05.2017.
 */
@Entity
@Table(name = "news")
public class News implements Serializable{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "all_info")
    private String all_info;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Time time;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public News(){}

    public News(long id, String title, String description, String all_info, Date date, User user)
    {
        this.id=id;
        this.title=title;
        this.description=description;
        this.date=date;
        this.all_info=all_info;
        this.date=date;
        this.user=user;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAll_info(String all_info) {
        this.all_info = all_info;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public String getAll_info() {
        return all_info;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

}
