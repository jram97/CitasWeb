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
                        <form role="form" action="add?param=roles" method="post">
                            <div class="card-body">


                                <div class="form-group">
                                    <label for="">Nombre:</label>
                                    <input type="text" class="form-control" placeholder="Ingresa nombre rol" name="nombre">


                                </div>

                                <div class="form-group">
                                    <label for="">Descripcion: (Opcional)</label>
                                    <input type="text" class="form-control" placeholder="Ingresa descripcion" name="descripcion">
                                </div>

                            </div>
                            <!-- /.card-body -->

                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary">Registrar</button>
                            </div>
                        </form>
                    </div>
                    <!-- /.card -->
                </div>
            </div>
        </div>
    </section>
</div>



<jsp:include page="Shared/footer.jsp"></jsp:include> 