package by.bsuir.books.service.services.user;

import by.bsuir.books.dao.factory.DaoFactory;
import by.bsuir.books.entity.User;
import by.bsuir.books.service.util.ServiceResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private DaoFactory daoFactory;

//    public ServiceResponseEntity<User> addUser(User user) {
//        if (user.getEmail().isEmpty() || user.getLogin().isEmpty()) {
//            return new ServiceResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
//        }
//
//        if (daoFactory.getUserRepository().findByEmail(user.getEmail()) == null) {
//            return new ServiceResponseEntity<>(HttpStatus.CONFLICT);
//        }
//
//        user =  daoFactory.getUserRepository().save(user);
//        return new ServiceResponseEntity<>(user, HttpStatus.CREATED);
//    }
//
//    @Override
//    public ServiceResponseEntity<User> authorization(User user) {
//        User response = null;
//        List <User> userList = new ArrayList<>();
//        daoFactory.getUserRepository().findAll().forEach(userList::add);
//
//        for(User user1 : userList) {
//            if(user1.getLogin().equals(user.getLogin()) && //TODO: null проверки
//                    user1.getPassword().equals(user.getPassword())) {
//                response = user1;
//            }
//        }
//        System.out.println("RESPONSE: "+response);
//        return new ServiceResponseEntity<>(response, response == null ? HttpStatus.NOT_FOUND : HttpStatus.FOUND);
//    }

    public ServiceResponseEntity<User> getUser(int userId) {

        /*Page<User> userPages = userRepository.findAll(new PageRequest(1, 20));
        List<User> users = userPages.getContent();*/

        User user = daoFactory.getUserRepository().findOne(Long.valueOf(userId));

        return (user == null) ?
                new ServiceResponseEntity<User>(HttpStatus.NOT_FOUND) :
                new ServiceResponseEntity<>(user, HttpStatus.OK);

    }

    @Override
    public ServiceResponseEntity<User> authorization(User user) {
        List<User> userAuth= daoFactory.getUserRepository().authorization(user);

        User userRes=null;
        for(User us:userAuth)
        {
            if(us.getLogin().equals(user.getLogin())&& us.getPass().equals(user.getPass()))
            {
                userRes=us;
            }
        }

        return (userRes==null) ? new ServiceResponseEntity<User>(HttpStatus.NOT_FOUND):
                new ServiceResponseEntity<>(userRes, HttpStatus.FOUND);
    }
}
