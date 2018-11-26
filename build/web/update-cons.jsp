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
                            <h3 class="card-title">Actualizar Consultorio</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                    <c:forEach items="${consultorios}" var="c">
                        <form role="form" action="update?param=cons" method="post">
                            <div class="card-body">

                                <input type="hidden" name="codigo" value="${c.codigoCons}">


                                <div class="form-group">
                                    <label for="">Nombre:</label>
                                    <input type="text" class="form-control" value="${c.nombreCons}" name="nombre">
                                </div>

                                <div class="form-group">
                                    <label for="">Direccion:</label>
                                    <input type="text" class="form-control" value="${c.direccionCons}" name="direccion">
                                </div>

                                <div class="form-group">
                                    <label for="">Telefono:</label>
                                    <input type="text" class="form-control" value="${c.telefonoCons}" name="telefono">    
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