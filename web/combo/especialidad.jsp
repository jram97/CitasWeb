<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="form-group">
    <label>Especialidades: </label><br>
    <select name="esp" class="form-control">
        <c:forEach items="${especialidades}" var="c">
            <option value="${c.codigoEsp}"><c:out value="${c.nombreEsp}" /></option>
        </c:forEach>
     </select>
</div>