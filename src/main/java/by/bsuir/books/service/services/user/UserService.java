package by.bsuir.books.service.services.user;

import by.bsuir.books.entity.User;
import by.bsuir.books.service.util.ServiceResponseEntity;

public interface UserService {

//    ServiceResponseEntity<User> addUser(User user);
//    ServiceResponseEntity<User> authorization(User user);
    ServiceResponseEntity<User> getUser(int userId);

}
