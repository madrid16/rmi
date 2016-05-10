<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:genericpage>
  <jsp:attribute name="header">
    RMI
  </jsp:attribute>

  <jsp:attribute name="footer">
    <p>© 2016 Company, Inc.</p>
  </jsp:attribute>

  <jsp:body>

    <div class="jumbotron">
      <h1>Java RMI Project</h1>
      <p class="lead">Little project using web application java (jsp, servlet and rmi), with Tomcat as application server for better experience in your life.</p>
    </div>

    <div class="row marketing">
      <div class="col-lg-6">

        <h4>RRHH</h4>
        <p>You have connect with RRHH area and you can get user, delete, update and remove them.</p>
        <p><a class="btn btn-lg btn-success" href="rrhh.jsp" role="button">RRHH Area</a></p>

      </div>

      <div class="col-lg-6">
        <h4>Finance</h4>
        <p>You have connect with Finance area and you can get user, delete, update and remove them.</p>
        <p><a class="btn btn-lg btn-success" href="finance.jsp" role="button">Finance Area</a></p>

      </div>
    </div>
  </jsp:body>
</t:genericpage>
