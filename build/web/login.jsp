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
                            <h3 class="card-title">Inicia Sesion</h3>
                        </div>
                        <!-- /.card-header -->
                        <!-- form start -->
                        <form role="form" action="login?param=login" method="post">
                            <div class="card-body">


                                <div class="form-group">
                                    <label for="">Email: </label>
                                    <input type="email" class="form-control" placeholder="Ingresa tu email" name="email">


                                </div>

                                <div class="form-group">
                                    <label for="">Password: </label>
                                    <input type="password" class="form-control" placeholder="Ingresa tu password" name="pass">
                                </div>

                            </div>
                            <!-- /.card-body -->

                            <div class="card-footer">
                                <button type="submit" class="btn btn-primary">Ingresar</button>
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