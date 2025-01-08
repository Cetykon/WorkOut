package WorkOut.WorkOut.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import WorkOut.WorkOut.Repository.MongodbUsersRepository;
import WorkOut.WorkOut.domain.MongodbUsers;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mongodbusers")
public class MongodbUsersController {
	@Autowired
    private MongodbUsersRepository userRepository;

    // Get all users
    @GetMapping
    public List<MongodbUsers> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by ID
    @GetMapping("/{id}")
    public ResponseEntity<MongodbUsers> getUserById(@PathVariable String id) {
        Optional<MongodbUsers> user = userRepository.findById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new user
    @PostMapping
    public MongodbUsers createUser(@RequestBody MongodbUsers user) {
        return userRepository.save(user);
    }

    // Update a user
    @PutMapping("/{id}")
    public ResponseEntity<MongodbUsers> updateUser(@PathVariable String id, @RequestBody MongodbUsers userDetails) {
        Optional<MongodbUsers> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
        	MongodbUsers user = optionalUser.get();
            user.setUserId(userDetails.getUserId());
            user.setAccountCreationDate(userDetails.getAccountCreationDate());
            user.setUsername(userDetails.getUsername());
            user.setPassword(userDetails.getPassword());
            user.setExercisesData(userDetails.getExercisesData());
            user.setWeeklyPlans(userDetails.getWeeklyPlans());
            MongodbUsers updatedUser = userRepository.save(user);
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        Optional<MongodbUsers> user = userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.delete(user.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

