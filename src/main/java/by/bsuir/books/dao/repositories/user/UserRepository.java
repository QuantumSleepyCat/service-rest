package by.bsuir.books.dao.repositories.user;

import by.bsuir.books.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface UserRepository extends PagingAndSortingRepository<User, Long>, UserRepositoryCustom {

   // List<User> findByEmail(String email);

}
