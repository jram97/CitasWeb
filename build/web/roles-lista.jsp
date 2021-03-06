<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Shared/header.jsp"></jsp:include>


<!-- /.col -->
<div class="col-md-12">
    <div class="card">
        <div class="card-header">
            <h3 class="card-title">Listado Roles</h3>
        </div>
        <!-- /.card-header -->
        <div class="card-body p-0">
            <table class="table">
                <tr>
                    <th style="width: 80px">Opt</th>
                    <th style="width: 20px">#</th>
                    <th>Nombre</th>
                    <th>Descripcion</th>
                </tr>
            <c:forEach items="${roles}" var="r">
                <tr>
                    <td><a href="view?param=updrole&codigo=${r.codigoRol}"><i class="nav-icon fa fa-pencil-square-o"></i> </a> - 
                        <a href="delete?param=delete_role&codigo=${r.codigoRol}"><i class="nav-icon fa fa-trash-o"></i> </a></td>
                    <td>${r.codigoRol}</td>
                    <td>${r.nombreRol}</td>
                    <td>${r.descRol}</td>
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