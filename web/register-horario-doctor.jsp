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
                            <h3 class="card-title">Nueva Horario</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                        <form role="form" action="add?param=horario" method="post">
                            <div class="card-body">
                                <div class="form-group">
                                    <label for="">Nombre Doctor:</label>
                                    <jsp:include page="combo/doctores.jsp"></jsp:include>
                                </div>
                                <div class="form-control">
                                    <label for="">Horario:</label>
                                    <input type="text" name="horario" class="form-control" placeholder="(Anio)-(Mes)-(Dia) (Hora):(Minutos):(Segundos)">
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