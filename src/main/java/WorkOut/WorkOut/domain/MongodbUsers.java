package WorkOut.WorkOut.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "users")
public class MongodbUsers {
	@Id
	private String id; // Maps to _id.$oid
	@Field("user_id")
	private String userId;
	@Field("account_creation_date")
	private String accountCreationDate;
	private String username;
	private String password;
	@Field("exercises_data")
	private List<ExerciseData> exercisesData;
	@Field("weekly_plans")
	private List<WeeklyPlan> weeklyPlans;

    public MongodbUsers() {
    }

    public MongodbUsers(String id, String userId, String accountCreationDate, String username, String password, List<ExerciseData> exercisesData, List<WeeklyPlan> weeklyPlans) {
        this.id = id;
        this.userId = userId;
        this.accountCreationDate = accountCreationDate;
        this.username = username;
        this.password = password;
        this.exercisesData = exercisesData;
        this.weeklyPlans = weeklyPlans;
    }

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccountCreationDate() {
		return accountCreationDate;
	}

	public void setAccountCreationDate(String accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<ExerciseData> getExercisesData() {
		return exercisesData;
	}

	public void setExercisesData(List<ExerciseData> exercisesData) {
		this.exercisesData = exercisesData;
	}

	public List<WeeklyPlan> getWeeklyPlans() {
		return weeklyPlans;
	}

	public void setWeeklyPlans(List<WeeklyPlan> weeklyPlans) {
		this.weeklyPlans = weeklyPlans;
	}

	@Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", accountCreationDate='" + accountCreationDate + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", exercisesData=" + exercisesData +
                ", weeklyPlans=" + weeklyPlans +
                '}';
    }
}

class ExerciseData {
    private String date;
    private List<ExerciseDone> data;

    public ExerciseData() {
    }

    public ExerciseData(String date, List<ExerciseDone> data) {
        this.date = date;
        this.data = data;
    }
    

    public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<ExerciseDone> getData() {
		return data;
	}

	public void setData(List<ExerciseDone> data) {
		this.data = data;
	}

	@Override
    public String toString() {
        return "ExerciseData{" +
                "date='" + date + '\'' +
                ", data=" + data +
                '}';
    }
}

class ExerciseDone {
	@Field("id")
    private String id;
    private String name;
    private String category;
    private List<String> tags;
    private int sets;
    private List<Integer> reps;
    @Field("duration_seconds")
    private Integer durationSeconds; // Optional field for exercises like Plank

    public ExerciseDone() {
    }

    public ExerciseDone(String id, String name, String category, List<String> tags, int sets, List<Integer> reps, Integer durationSeconds) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.tags = tags;
        this.sets = sets;
        this.reps = reps;
        this.durationSeconds = durationSeconds;
    }

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public List<Integer> getReps() {
		return reps;
	}

	public void setReps(List<Integer> reps) {
		this.reps = reps;
	}

	public Integer getDurationSeconds() {
		return durationSeconds;
	}

	public void setDurationSeconds(Integer durationSeconds) {
		this.durationSeconds = durationSeconds;
	}

	@Override
    public String toString() {
        return "Exercise Done {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", tags=" + tags +
                ", sets=" + sets +
                ", reps=" + reps +
                ", durationSeconds=" + durationSeconds +
                '}';
    }
}

class WeeklyPlan {
    private String name;
    @Field("start_date")
    private String startDate;
    private String goal;
    private List<WorkoutDay> workouts;

    public WeeklyPlan() {
    }

    public WeeklyPlan(String name, String startDate, String goal, List<WorkoutDay> workouts) {
        this.name = name;
        this.startDate = startDate;
        this.goal = goal;
        this.workouts = workouts;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public List<WorkoutDay> getWorkouts() {
		return workouts;
	}

	public void setWorkouts(List<WorkoutDay> workouts) {
		this.workouts = workouts;
	}

	@Override
    public String toString() {
        return "WeeklyPlan{" +
                "name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", goal='" + goal + '\'' +
                ", workouts=" + workouts +
                '}';
    }
}

class WorkoutDay {
    private String day;
    private List<Workout> exercises;

    public WorkoutDay() {
    }

    public WorkoutDay(String day, List<Workout> exercises) {
        this.day = day;
        this.exercises = exercises;
    }

    public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public List<Workout> getExercises() {
		return exercises;
	}

	public void setExercises(List<Workout> exercises) {
		this.exercises = exercises;
	}

	@Override
    public String toString() {
        return "WorkoutDay{" +
                "day='" + day + '\'' +
                ", exercises=" + exercises +
                '}';
    }
}

class Workout {
    private String workout;
    private Integer sets;
    private List<Integer> reps;
    private List<Integer> weight; // Optional for exercises like Dumbbells
    @Field("duration_seconds")
    private Integer durationSeconds; // Optional for exercises like Treadmill
    @Field("speed_mph")
    private Integer speedMph; // Optional for exercises like Treadmill
    private String status;

    public Workout() {
    }
   
    public Workout(String workout, Integer sets, List<Integer> reps, List<Integer> weight, Integer durationSeconds, Integer speedMph, String status) {
        this.workout = workout;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.durationSeconds = durationSeconds;
        this.speedMph = speedMph;
        this.status = status;
    }

    public String getWorkout() {
		return workout;
	}

	public void setWorkout(String workout) {
		this.workout = workout;
	}

	public Integer getSets() {
		return sets;
	}

	public void setSets(Integer sets) {
		this.sets = sets;
	}

	public List<Integer> getReps() {
		return reps;
	}

	public void setReps(List<Integer> reps) {
		this.reps = reps;
	}

	public List<Integer> getWeight() {
		return weight;
	}

	public void setWeight(List<Integer> weight) {
		this.weight = weight;
	}

	public Integer getDurationSeconds() {
		return durationSeconds;
	}

	public void setDurationSeconds(Integer durationSeconds) {
		this.durationSeconds = durationSeconds;
	}

	public Integer getSpeedMph() {
		return speedMph;
	}

	public void setSpeedMph(Integer speedMph) {
		this.speedMph = speedMph;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
    public String toString() {
        return "Workout{" +
                "workout='" + workout + '\'' +
                ", sets=" + sets +
                ", reps=" + reps +
                ", weight=" + weight +
                ", durationSeconds=" + durationSeconds +
                ", speedMph=" + speedMph +
                ", status='" + status + '\'' +
                '}';
    }
}