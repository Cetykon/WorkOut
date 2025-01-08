
	       <section class="projects-section bg-light" id="costumeExercise">
		       <button class="btn btn-secondary" type="button" data-bs-toggle="collapse" data-bs-target="#addExercise" aria-expanded="false" aria-controls="addExercise">
		            Schedule Exercise
		        </button>
		        <div class="collapse" id="addExercise">
			            <div class="text-center mt-5">
			                    <h1>Add Exercise</h1>
						   <div class="form-group col-lg-3 col-centered">
							    <label for="exercisesWorkOut">Work Out</label>
							    <input type="text" class="form-control" id="exercisesWorkOut" autofocus required>
							</div>
							<div class="form-group col-lg-3 col-centered">
							    <label for="exercisesReps">Repetitions</label>
							    <input type="text" class="form-control" id="exercisesReps" required>
							</div>
							<div class="form-group col-lg-3 col-centered">
							    <label for="exercisesSets">Sets</label>
							    <input type="text" class="form-control" id="exercisesSets" required >
							</div>
							<div class="form-group col-lg-3 col-centered">
							    <label for="exercisesWeight">Weight</label>
							    <input type="text" class="form-control" id="exercisesWeight" required >
							</div>
							<div class="form-group col-lg-3 col-centered">
							    <label for="exercisesLastUpdate">Last Update</label>
							    <input type="text" class="form-control" id="exercisesLastUpdate" required >
							</div>
							<div class="form-group col-lg-3 col-centered">
							    <label for="exercisesSetDay">Set Day</label>
							    <input type="text" class="form-control" id="exercisesSetDay" required >
							</div>
							<div class="form-group">
							 <span>
							     <button class="btn btn-primary" type="submit" onclick="addExercise()" id="addExercise" data-toggle="tooltip" title="Add Exercise">Add Exercise</button>
							 </span>
							 <span>
							     <button class = "btn btn-secondary" type="button" onclick="clearAddExercisesInterface()" data-toggle="tooltip" title="Clear">Clear</button>
							   </span>
							</div>
						</div>
					</div>
			</section>
			
             
       
