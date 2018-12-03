<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<select name="doct" class="form-control">
    <c:forEach items="${doctores}" var="c">
        <option value="${c.codigoDoctor}"><c:out value="${c.persona.nombre} ${c.persona.apellido}" /></option>
    </c:forEach>
</select>
