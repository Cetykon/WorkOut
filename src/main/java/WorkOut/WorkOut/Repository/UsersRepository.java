package WorkOut.WorkOut.Repository;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import WorkOut.WorkOut.domain.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {

//    @Query("SELECT * FROM Users WHERE username = ?1")
//    Users findByName(String username);
}
