        <%@ include file = "common/header.jspf" %>
        <%@ include file = "common/navigation.jspf" %>

        <h1>Manage Your Todos:</h1>
        <div class = "container">
        <table class = "table">
            <thead>
                <tr>
                    <!--<th>Id</th> -->
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>Done?</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var = "todo">
                    <tr>
                        <!--<td>${todo.id}</td>-->
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                        <td><a href = "delete-todo?id=${todo.id}"class="btn btn-warning">DELETE</a>
                        <a href = "update-todo?id=${todo.id}" class="btn btn-success">UPDATE</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
            <div class="mt-3">
                <button class="btn btn-secondary" onclick="history.back()">Back</button>
            </div>
    </div>
    <script src="webjars\bootstrap\5.3.2\js\bootstrap.min.js"></script>
    <script src="webjars\jquery\3.7.1\jquery.min.js"></script>
</body>
</html>