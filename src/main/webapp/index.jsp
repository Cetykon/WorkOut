<%@include file=".\includes\header.jsp" %>


<div class="container-fluid">

<%
	//<% allows you to add java 
	if(view == null){
		view = "";
	}

	if(view.equals("StartPage")){%>
		<%@include file=".\includes\startingPage.jsp"%>
		
	<%}else if(view.equals("weeks")){ %>
	<%@include file=".\includes\weekPlan.jsp" %>
	
	<%}else if(view.equals("Search")){ %>
	<%@include file=".\includes\search.jsp" %>
	
	<%}else if(view.equals("exercises")){ %>
	<%@include file=".\includes\workoutList.jsp" %>
	
	<%}else if(view.equals("costumExercise")){ %>
	<%@include file=".\includes\costumExercise.jsp" %>
	
	<%}else if(view.equals("logout")){ %>
	<%@include file=".\includes\logout.jsp" %>
	
	<%}else{%>
	<%@include file=".\includes\startingPage.jsp" %> 
	
	<%}%>

</div> <!-- /.container-fluid -->

<%@include file=".\includes\footer.jsp" %>
