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
                        <h3 class="card-title">Nuevo Doctor</h3>
                    </div>
                    <!-- /.card-header -->
                    <!-- form start -->
                    <form role="form" action="add?param=doctor" method="post">
                        <div class="card-body">


                            <div class="form-group">
                                <div class="row">
                                    <div class="col">
                                        <label for="">Nombre:</label>
                                        <input type="text" class="form-control" placeholder="Ingresa tu nombre" name="nombre">
                                    </div>
                                    <div class="col">
                                        <label for="">Apellido:</label>
                                        <input type="text" class="form-control" placeholder="Ingresa tu apellido" name="apellido">
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col">
                                        <label for="">Edad:</label>
                                        <input type="number" class="form-control" placeholder="Ej. 21" name="edad">    
                                    </div>
                                    <div class="col">
                                        <label for="">Telefono:</label>
                                        <input type="text" class="form-control" placeholder="Ingresa tu telefono" name="telefono">    
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col">
                                        <label for="">Email:</label>
                                        <input type="text" class="form-control" placeholder="Ingresa tu Email" name="email">
                                    </div>
                                    <div class="col">
                                        <label for="">Pass:</label>
                                        <input type="text" class="form-control" placeholder="Ingresa tu password" name="password">
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col">
                                        <jsp:include page="combo/consultorio.jsp"></jsp:include>
                                    </div>
                                    <div class="col">
                                        <jsp:include page="combo/especialidad.jsp"></jsp:include>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col">
                                        <label for="">Tiempo De Doctor:</label>
                                        <input type="number" class="form-control" placeholder="Ejem. 2" name="tiempo">    
                                    </div>
                                    <div class="col">
                                        <label for="">Locacion:</label>
                                        <input type="text" class="form-control" name="locacion" placeholder="Ejem. 'San Salvador'">   
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <label>Lugar Estudio</label>
                                <input type="text" name="estudio" class="form-control">
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