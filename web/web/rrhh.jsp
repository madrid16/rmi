<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:genericpage>
    <jsp:attribute name="header">
        RMI
    </jsp:attribute>

    <jsp:attribute name="footer">
        <p>© 2016 Company, Inc.</p>
    </jsp:attribute>
    <jsp:attribute name="js">
        <script src="assets/js/rrhh.js"></script>
    </jsp:attribute>
    <jsp:body>
        <div class="row">

            <div id="methodGet" class="col-md-3">
                <form method="get" action="/rrhh" class="form-horizontal">
                    <div class="form-group">
                        <label for="inputGetName" class="col-sm-2 control-label">Name</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputGetName" placeholder="Name" required>
                        </div>
                    </div>
                    <button id="getData" type="submit" class="btn btn-primary btn-lg btn-block">Get Event</button>
                </form>
                <div id="userViaGet" class="row" style="display: none;">
                    <p>User find: <span></span></p>
                </div>
            </div>

            <div id="methodPost" class="col-md-3">
                <form method="post" action="/rrhh" class="form-horizontal">
                    <div class="form-group">
                        <label for="inputPostName" class="col-sm-2 control-label">Name</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputPostName" placeholder="Name" required>
                        </div>
                    </div>
                    <button id="postData" type="submit" class="btn btn-primary btn-lg btn-block">Post Event</button>
                </form>
                <div id="postMessage" class="alert alert-success" role="alert" style="display: none;"></div>
            </div>

            <div id="methodDelete" class="col-md-3">
                <form method="delete" action="/rrhh" class="form-horizontal">
                    <div class="form-group">
                        <label for="inputDeleteName" class="col-sm-2 control-label">Name</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputDeleteName" placeholder="Name" required>
                        </div>
                    </div>
                    <button id="deleteData" type="submit" class="btn btn-primary btn-lg btn-block">Delete Event</button>
                </form>
                <div id="deleteMessage" class="alert alert-success" role="alert" style="display: none;"></div>
            </div>


            <div id="methodPut" class="col-md-3">
                <form method="put" action="/rrhh" class="form-horizontal">
                    <div class="form-group">
                        <label for="inputPutOriginalName" class="col-sm-2 control-label">Original</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputPutOriginalName" placeholder="Original Name" required>
                        </div>
                        <label for="inputPutNewName" class="col-sm-2 control-label">New</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="inputPutNewName" placeholder="New Name" required>
                        </div>
                    </div>
                    <button id="putData" type="submit" class="btn btn-primary btn-lg btn-block">Put Event</button>
                </form>
                <div id="putMessage" class="alert alert-success" role="alert" style="display: none;"></div>
            </div>

        </div>

    </jsp:body>
</t:genericpage>
