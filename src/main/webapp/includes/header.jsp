<%
	String view = request.getParameter("view");
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Workout Tracker</title>
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version) -->
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts -->
        <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap) -->
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.1.min.js"></script>
    </head>
    <body id="page-top">
        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
            <div class="container px-4 px-lg-5">
                <a class="navbar-brand" href="#page-top">Workout Tracker</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item"><a class="nav-link" href="./index.jsp?view=StartPage">StartPage</a></li>
                        <li class="nav-item"><a class="nav-link" href="./index.jsp?view=weeks">Week Plan</a></li>
                        <li class="nav-item"><a class="nav-link" href="./index.jsp?view=Search">Search</a></li>
                        <li class="nav-item"><a class="nav-link" href="./index.jsp?view=exercises">List of Workouts</a></li>
                        <li class="nav-item"><a class="nav-link" href="./index.jsp?view=costumExercise">Add Workout</a></li>
                        <li class="nav-item"><a class="nav-link" href="./index.jsp?view=logout">Log Out</a></li>
                    </ul>
                </div>
            </div>
        </nav>