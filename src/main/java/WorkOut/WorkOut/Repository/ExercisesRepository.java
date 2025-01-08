package WorkOut.WorkOut.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import WorkOut.WorkOut.domain.Exercises;

@Repository
public interface ExercisesRepository  extends CrudRepository<Exercises, Long>{

	
}