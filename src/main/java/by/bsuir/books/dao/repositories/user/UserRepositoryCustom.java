package by.bsuir.books.dao.repositories.user;

import by.bsuir.books.entity.User;

import java.util.List;

public interface UserRepositoryCustom {
    void getFirstName(String login);
    List<User> authorization(User user);
}
