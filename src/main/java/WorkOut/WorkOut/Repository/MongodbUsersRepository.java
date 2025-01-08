package WorkOut.WorkOut.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import WorkOut.WorkOut.domain.MongodbUsers;

public interface MongodbUsersRepository extends MongoRepository<MongodbUsers, String> {
	
    // Custom query methods can be added here if needed
}
