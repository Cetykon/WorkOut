        <section class="projects-section bg-light" id="exercises">
			<div class="container px-4 px-lg-5">
			    <div class="row gx-0 mb-5 mb-lg-0 justify-content-center">
			        <button class="btn btn-primary" type="button" data-bs-toggle="collapse" data-bs-target="#allExercises" aria-expanded="false" aria-controls="allExercises">
			            Show All Exercises
			        </button>
			        <div class="collapse" id="allExercises">
			            <div class="card card-body">
			                <h1>All Exercises:</h1>
			                <table>
			                    <thead>
			                        <tr>
			                           <th>Picture</th>
						    			<th>Work Out</th>
							    		<th>Reps</th>
						    			<th>Sets</th>
						    			<th>Weight</th>
						    			<th>Last Update</th>
						    			<th>Set Day</th>
						    			<th></th>
			                           
			                        </tr>
			                    </thead>
			                    <tbody id="postBody">
			                        <!-- Add your table rows here -->
			                    </tbody>
			                </table>
			            </div>
			        </div>
			        
			        <div id="editModal" class="modal fade" tabindex="-1">
	        	<div class="modal-dialog">
	        		<div class="modal-content">
	        			<div class="modal-header">
	        				<h5 class="modal-title">Edit Exercise</h5>
	        				<button type="button" class="close" data-bs-dismiss="modal">&times;</button>
	        			</div>
	        			<div class="modal-body">
	        				<div class="form-group col-lg-6 col-centered">
							    <label for="exercisesIDModal">ID</label>
							    <input type="text" class="form-control" id="exercisesIDModal" readonly>
							</div>
	        				<div class="form-group col-lg-6 col-centered">
							    <label for="exercisesWorkOutModal">WorkOut</label>
							    <input type="text" class="form-control" id="exercisesWorkOutModal">
							</div>
							<div class="form-group col-lg-6 col-centered">
							    <label for="exercisesRepsModal">Reps</label>
							    <input type="text" class="form-control" id="exercisesRepsModal">
							</div>
							<div class="form-group col-lg-6 col-centered">
							    <label for="exercisesSetsModal">Sets</label>
							    <input type="text" class="form-control" id="exercisesSetsModal">
							</div>
							<div class="form-group col-lg-6 col-centered">
							    <label for="exercisesWeightModal">Weight</label>
							    <input type="text" class="form-control" id="exercisesWeightModal">
							</div>
							<div class="form-group col-lg-6 col-centered">
							    <label for="exercisesLastUpdateModal">Last Update</label>
							    <input type="text" class="form-control" id="exercisesLastUpdateModal">
							</div>
							<div class="form-group col-lg-6 col-centered">
							    <label for="exercisesSetDayModal">Set Day</label>
							    <input type="text" class="form-control" id="exercisesSetDayModal">
							</div>
							<div class="form-group col-lg-6 col-centered">
							    <label for="exercisesImageModal">Set Image</label>
							    <input type="text" class="form-control" id="exercisesImageModal">
							</div>
	        			</div>
	        			<div class="modal-footer">
	        				<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
	        				<button class="btn btn-primary" type="submit" onclick="updateExercise()" id="updateExercise" data-toggle="tooltip" title="Update Exercise">Update Exercise</button>
	        			</div>
	        		</div>
	        	</div>
	        </div>
         </section>