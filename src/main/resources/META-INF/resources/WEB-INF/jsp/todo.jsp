        <%@ include file = "common/header.jspf" %>
        <%@ include file = "common/navigation.jspf" %>

        <div class = "container">
            <h1>Enter Todo Details</h1>
            <form:form method = "post" modelAttribute = "todo">

                <fieldset class = "mb-3">
                    <form:label path="description">Description</form:label>
                    <form:input type = "text" path = "description" name="description" required =  "required"/>
                </fieldset>

                <fieldset class = "mb-3">
                    <form:label path="targetDate">Target Date</form:label>
                    <form:input type = "date" path = "targetDate" name="targetDate" required =  "required"/>
                </fieldset>

                <form:errors path="description" cssClass = "text-danger"/>

                <div class="d-inline-flex gap-2 justify-content-between align-items-center">

                    <button class="btn btn-secondary" onclick="history.back()">Back</button>

                    <c:if test="${Updating}">
                        <c:set var="buttonClass" value="${todo.done ? 'btn-danger' : 'btn-success'}"/>
                        <c:set var="buttonText" value="${todo.done ? 'Not Done' : 'Done'}"/>
                        <c:set var="newStatus" value="${todo.done eq true ? false : true}"/>

                        <button type="submit" class="btn ${buttonClass}" name="done" value="${newStatus}">
                            ${buttonText}
                        </button>
                    </c:if>


                    <input type = "submit" class = "btn btn-primary"  value = "Save"/>
                </div>

            </form:form>

            <c:if test="${fn:contains(pageContext.request.requestURI, '/update-todo') and not empty param.id}">
                <button class="btn btn-success">Done</button>
            </c:if>
        </div>

        <script>
                    // Prevent past dates in the date picker
                    document.addEventListener("DOMContentLoaded", function () {
                        let today = new Date().toISOString().split("T")[0]; // Get today's date in YYYY-MM-DD format
                        document.getElementById("targetDate").setAttribute("min", today);
                    });
        </script>
<%@ include file = "common/footer.jspf" %>
