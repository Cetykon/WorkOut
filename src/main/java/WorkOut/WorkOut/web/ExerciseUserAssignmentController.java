package WorkOut.WorkOut.web;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import WorkOut.WorkOut.Repository.ExerciseUserAssignmentRepository;
import WorkOut.WorkOut.domain.ExerciseUserAssignment;

@RestController
@RequestMapping("webapi/userexcercise")
public class ExerciseUserAssignmentController {

    @Autowired
    private ExerciseUserAssignmentRepository repository;
    
    // Add new ExerciseUserAssignment
    @PostMapping
    public ResponseEntity<String> addAssignment(@RequestBody ExerciseUserAssignment newAssignment) {
        // Set current date for lastupdate and setday
        newAssignment.setLastupdate(new Date(System.currentTimeMillis()));
        newAssignment.setSetday(new Date(System.currentTimeMillis()));

        // Save the new assignment
        repository.save(newAssignment);  
        return ResponseEntity.ok("Assignment added successfully.");
    }

    // Example of a custom update method
    @PutMapping("/{id}")
    public ResponseEntity<String> updateAssignment(@PathVariable Long id, @RequestBody ExerciseUserAssignment updatedAssignment) {
        Optional<ExerciseUserAssignment> existingAssignment = repository.findById(id);

        if (existingAssignment.isPresent()) {
            ExerciseUserAssignment assignment = existingAssignment.get();
            
            // Set the current date to 'lastupdate' and 'setday'
            assignment.setLastupdate(new Date(System.currentTimeMillis())); // Sets current SQL date

            repository.save(assignment);  // Save updated entity
            return ResponseEntity.ok("Assignment updated successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Assignment not found.");
        }
    }
}
