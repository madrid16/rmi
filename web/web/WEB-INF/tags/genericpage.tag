<%@tag description="Base template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@attribute name="js" fragment="true" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><jsp:invoke fragment="header"/></title>
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>


<div class="container">
    <div class="header clearfix">
        <nav>
            <ul class="nav nav-pills pull-right">
                <li role="presentation" class="active"><a href="#">Home</a></li>
                <li role="presentation"><a href="#">About</a></li>
            </ul>
        </nav>
        <h3 class="text-muted">RMI Project</h3>
    </div>

    <jsp:doBody />

    <footer class="footer">
        <jsp:invoke fragment="footer"/>
    </footer>

</div>

<script src="assets/js/jquery.1.11.3.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<jsp:invoke fragment="js"/>
</body>
</html>