package WorkOut.WorkOut.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import WorkOut.WorkOut.domain.ExerciseUserAssignment;

@Repository
public interface ExerciseUserAssignmentRepository  extends CrudRepository<ExerciseUserAssignment, Long>{

	
}