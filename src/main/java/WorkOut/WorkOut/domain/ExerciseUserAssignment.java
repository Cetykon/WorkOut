package WorkOut.WorkOut.domain;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//this tell the jpa or more specific the persistence api that Contact class should be map to contacts table
@Entity(name="exerciseuserassignment")
public class ExerciseUserAssignment {
		
		private Long id;
		private Long userid;
		private Long workoutid;
		private String repsarray;
		private String timearray;
		private Integer sets;
		private Integer weight;
		private Date lastupdate;
		private Date setday;

		public ExerciseUserAssignment() {

		}
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getUserid() {
			return userid;
		}

		public void setUserid(Long userid) {
			this.userid = userid;
		}

		public Long getWorkoutid() {
			return workoutid;
		}

		public void setWorkoutid(Long workoutid) {
			this.workoutid = workoutid;
		}

		public String getRepsarray() {
			return repsarray;
		}

		public void setRepsarray(String repsarray) {
			this.repsarray = repsarray;
		}

		public String getTimearray() {
			return timearray;
		}

		public void setTimearray(String timearray) {
			this.timearray = timearray;
		}

		public Integer getSets() {
			return sets;
		}

		public void setSets(Integer sets) {
			this.sets = sets;
		}

		public Integer getWeight() {
			return weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public Date getLastupdate() {
			return lastupdate;
		}

		public void setLastupdate(Date lastupdate) {
			this.lastupdate = lastupdate;
		}

		public Date getSetday() {
			return setday;
		}

		public void setSetday(Date setday) {
			this.setday = setday;
		}
}



