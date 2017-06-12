package by.bsuir.books.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


/**
 * Created by QuantumCat on 05.05.2017.
 */

@Entity
@Table(name = "book")
public class Book implements Serializable{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "description")
    private String description;

    @Column(name = "year")
    private int year;

    @Column(name = "date")
    private Date date;

    @Column(name="time")
    private Time time;

    @Column(name = "edition")
    private String edition;

    @Column(name = "reit")
    private float reit;

    @Column(name = "count_people")
    private int count_people;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "book")
    @JsonIgnore
    private List<Links> linksList = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "book")
    @JsonIgnore
    private List<Comments> commentsList;//=new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "book")
    @JsonIgnore
    private List<Bookmarks> bookmarksList;

    public List<Bookmarks> getBookmarksList() {
        return bookmarksList;
    }

    public void setBookmarksList(List<Bookmarks> bookmarksList) {
        this.bookmarksList = bookmarksList;
    }

    public Book(){}

    public Book(long id, String title, String author, String genre, String description, int year, Date date, Time time, String edition, float reit,int count_people, User user)
    {
        this.id=id;
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.description=description;
        this.year=year;
        this.date=date;
        this.time=time;
        this.edition=edition;
        this.reit=reit;
        this.count_people=count_people;
        this.user=user;
    }

    public void setCommentsList(List<Comments> commentsList) {
        this.commentsList = commentsList;
    }


    public List<Comments> getCommentsList() {
        return commentsList;
    }

    public void setComment(String comment, User userCom)
    {
        Comments comments = new Comments();
        comments.setMessage(comment);
        comments.setUser(userCom);
        commentsList.add(comments);
    }


    public void setLinksList(List<Links> linksList) {
        this.linksList = linksList;
    }

    public List<Links> getLinksList() {
        return linksList;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCount_people(int count_people) {
        this.count_people = count_people;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(long id) {
        this.id = id;
    }


    public void setYear(int year) {
        this.year = year;
    }



    public void setReit(float reit) {
        this.reit = reit;
    }

    public String getTitle() {
        return title;
    }

    public Time getTime() {
        return time;
    }

    public User getUser() {
        return user;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public float getReit() {
        return reit;
    }

    public int getCount_people() {
        return count_people;
    }

    public int getYear() {
        return year;
    }

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getEdition() {
        return edition;
    }

    public String getGenre() {
        return genre;
    }



}
