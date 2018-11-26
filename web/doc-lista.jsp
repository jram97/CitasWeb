<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Shared/header.jsp"></jsp:include>


<!-- /.col -->
<div class="col-md-12">
    <div class="card">
        <div class="card-header">
            <h3 class="card-title">Listado Doctores</h3>
        </div>
        <!-- /.card-header -->
        <div class="card-body p-0">
            <table class="table">
                <tr>
                    <th style="width: 80px">Opt</th>
                    <th style="width: 20px">#</th>
                    <th>Nombre</th>
                    <th>Email</th>
                    <th>Especialidad</th>
                </tr>
            <c:forEach items="${doctores}" var="d">
                <tr>
                    <td><a href="view?param=upddoct&codigo=${d.codigoDoctor}"><i class="nav-icon fa fa-pencil-square-o"></i> </a> - 
                        <a href=""><i class="nav-icon fa fa-trash-o"></i> </a></td>
                    <td>${d.codigoDoctor}</td>
                    <td>${d.persona.nombre} ${d.persona.apellido}</td>
                    <td>${d.persona.email}</td>
                    <td>${d.especialidad.nombreEsp}</td>
                </tr>
            </c:forEach>
            </table>
        </div>
        <!-- /.card-body -->
    </div>

    <!-- /.card -->
</div>
</div>
</section>

<jsp:include page="Shared/footer.jsp"></jsp:include> 