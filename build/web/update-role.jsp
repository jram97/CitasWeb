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
                            <h3 class="card-title">Nuevo Rol</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                    <c:forEach items="${roles}" var="r">
                        <form role="form" action="update?param=roles" method="post">
                            <div class="card-body">
                                
                                <input type="hidden" value="${r.codigoRol}" name="codigo">

                                <div class="form-group">
                                    <label for="">Nombre:</label>
                                    <input type="text" value="${r.nombreRol}" class="form-control" placeholder="Ingresa nombre consultorio" name="nombre">
                                </div>

                                <div class="form-group">
                                    <label for="">Descripcion: (Opcional)</label>
                                    <input type="text" value="${r.descRol}" class="form-control" placeholder="Ingresa la direccion" name="descripcion">
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