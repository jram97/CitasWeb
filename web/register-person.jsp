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
                            <h3 class="card-title">Nuevo Cliente</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                        <form role="form" action="add?param=person" method="post">
                            <div class="card-body">


                                <div class="form-group">
                                    <div class="row">
                                        <div class="col">
                                            <label for="">Nombre: </label>
                                            <input type="text" class="form-control" placeholder="Ingresa tu nombre" name="nombre">
                                        </div>
                                        <div class="col">
                                            <label for="">Apellido: </label>
                                            <input type="text" class="form-control" placeholder="Ingresa tu apellido" name="apellido">
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col">
                                            <label for="">Edad: </label>
                                            <input type="number" class="form-control" placeholder="Ej. 21" name="edad">    
                                        </div>
                                        <div class="col">
                                            <label for="">Telefono: </label>
                                            <input type="text" class="form-control" placeholder="Ingresa tu telefono" name="telefono">    
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="row">
                                        <div class="col">
                                            <label for="">Email: </label>
                                            <input type="text" class="form-control" placeholder="Ingresa tu Email" name="email">
                                        </div>
                                        <div class="col">
                                            <label for="">Pass: </label>
                                            <input type="text" class="form-control" placeholder="Ingresa tu password" name="password">
                                        </div>
                                    </div>
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