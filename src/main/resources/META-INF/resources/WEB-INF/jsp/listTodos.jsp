    <%@ include file = "common/header.jspf" %>
    <%@ include file = "common/navigation.jspf" %>
    <div class="text-center">
        <h3>Welcome ${name}</h3>
    </div>

        <div class = "container">
        <h5>Your Todos:</h5>

        <table class = "table">
            <thead>
                <tr>
                    <!--<th>Id</th> -->
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Done?</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var = "todo">
                    <tr>
                        <!--<td>${todo.id}</td>-->
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div class="d-flex justify-content-between align-items-center">
            <button class="btn btn-secondary" onclick="history.back()">Back</button>
            <div>
                <a href="add-todo" class="btn btn-success me-2">ADD</a>
                <a href="manage-todo" class="btn btn-primary">MANAGE</a>
            </div>
        </div>
    </div>
    <script src="webjars\bootstrap\5.3.2\js\bootstrap.min.js"></script>
    <script src="webjars\jquery\3.7.1\jquery.min.js"></script>
</body>
</html>