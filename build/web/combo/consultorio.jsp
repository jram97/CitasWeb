<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="form-group">
    <label>Consultorio: </label><br>
    <select name="cons" class="form-control">
        <c:forEach items="${consultorios}" var="c">
            <option value="${c.codigoCons}"><c:out value="${c.nombreCons}" /></option>
        </c:forEach>
     </select>
</div>