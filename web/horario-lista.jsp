<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Shared/header.jsp"></jsp:include>


<!-- /.col -->
<div class="col-md-12">
    <div class="card">
        <div class="card-header">
            <h3 class="card-title">Listado Horario</h3>
        </div>
        <!-- /.card-header -->
        <div class="card-body p-0">
            <table class="table">
                <tr>
                    <th style="width: 80px">Opt</th>
                    <th style="width: 20px">#</th>
                    <th style="width: 80px"># Doct</th>
                    <th  style="width: 700px">Horas Disponibles</th>
                    <th>Disponible</th>
                </tr>
            <c:forEach items="${horarios}" var="h">
                <tr>
                    <td><a href="view?param=updhorario&codigo=${h.codigoHorario}"><i class="nav-icon fa fa-pencil-square-o"></i> </a> - 
                        <a href="delete?param=delete_horario&codigo=${h.codigoHorario}"><i class="nav-icon fa fa-trash-o"></i> </a></td>
                    <td>${h.codigoHorario}</td>
                    <td>${h.codigoDoctor}</td>
                    <td>${h.horas}</td>
                    <td>${h.disponible}</td>
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