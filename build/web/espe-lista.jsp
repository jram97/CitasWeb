<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Shared/header.jsp"></jsp:include>


<!-- /.col -->
<div class="col-md-12">
    <div class="card">
        <div class="card-header">
            <h3 class="card-title">Listado Especialidades</h3>
        </div>
        <!-- /.card-header -->
        <div class="card-body p-0">
            <table class="table">
                <tr>
                    <th style="width: 80px">Opt</th>
                    <th style="width: 20px">#</th>
                    <th>Nombre Especialidad</th>
                </tr>
            <c:forEach items="${especialidad}" var="e">
                <tr>
                    <td><a href="view?param=updespe&codigo=${e.codigoEsp}"><i class="nav-icon fa fa-pencil-square-o"></i> </a> - 
                        <a href="delete?param=delete_espe&codigo=${e.codigoEsp}"><i class="nav-icon fa fa-trash-o"></i> </a></td>
                    <td>${e.codigoEsp}</td>
                    <td>${e.nombreEsp}</td>
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