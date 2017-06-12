package by.bsuir.books.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by QuantumCat on 29.04.2017.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id",  nullable = false)
    private long id;

    @Column(name = "login")
    private String login;

    @Column(name = "pass")
    private String pass;

    @Column(name = "role")
    private String role;

    @Column(name = "email")
    private String email;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "user")
    @JsonIgnore
    List<Bookmarks> bookmarksList;

    public List<Bookmarks> getBookmarksList() {
        return bookmarksList;
    }

    public void setBookmarksList(List<Bookmarks> bookmarksList) {
        this.bookmarksList = bookmarksList;
    }

    //    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    private List<News> news;

    public User(){}

    public User(long id, String login, String pass, String role, String email)
    {
        this.id=id;
        this.login=login;
        this.pass=pass;
        this.role=role;
        this.email=email;
    }

//    public void setNews(List<News> news) {
//        this.news = news;
//    }
//
//    public List<News> getNews() {
//        return news;
//    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public String getLogin() {
        return login;
    }

    public long getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }
}
