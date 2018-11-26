<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Shared/header.jsp"></jsp:include>


    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <!-- left column -->
                <div class="col-md-12">
                    <!-- general form elements -->
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title">Actualizar Especialidad </h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                    <c:forEach items="${especialidad}" var="e">
                        <form role="form" action="update?param=espe" method="post">
                            <div class="card-body">
                                <input type="hidden" name="codigo" value="${e.codigoEsp}">
                                <div class="form-group">
                                    <label for="">Nombre Especialidad:</label>
                                    <input type="text" class="form-control" value="${e.nombreEsp}" name="nombre">
                                </div>
                            </div>
                            <!-- /.card-body -->

                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary">Actualizar</button>
                            </div>
                        </form>
                        </c:forEach>
                    </div>
                    <!-- /.card -->
                </div>
            </div>
        </div>
    </section>
</div>



<jsp:include page="Shared/footer.jsp"></jsp:include> 