<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Shared/header.jsp"></jsp:include>

    <!-- Main content -->
    <section class="content">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-3">

                <c:forEach items="${findall}" var="doc">
                    <!-- Profile Image -->
                    <div class="card card-primary card-outline">
                        <div class="card-body box-profile">
                            <div class="text-center">
                                <img class="profile-user-img img-fluid img-circle"
                                     src="images/${doc.persona.foto}" width="128px" height="128px"
                                     >
                            </div>

                            <h3 class="profile-username text-center">${doc.persona.nombre} ${doc.persona.apellido}</h3>

                            <p class="text-muted text-center">${doc.especialidad.nombreEsp}</p>

                            <a href="create.jsp?doc=${doc.codigoDoctor}&user=${doc.persona.codigo}" class="btn btn-outline-primary btn-block"><b>Hacer Cita</b></a>
                        </div>
                        <!-- /.card-body -->
                    </div>
                    <!-- /.card -->

                    <!-- About Me Box -->
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title">Más Info</h3>
                            <div class="card-tools">
                                <button type="button" class="btn btn-tool" data-widget="collapse">
                                    <i class="fa fa-minus"></i>
                                </button>

                            </div>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <strong><i class="fa fa-book mr-1"></i> Educación</strong>

                            <p class="text-muted">
                                ${doc.estudio}
                            </p>

                            <hr>

                            <strong><i class="fa fa-map-marker mr-1"></i> Locación</strong>

                            <p class="text-muted">
                                ${doc.location}
                            </p>
                            
                        </div>
                        <!-- /.card-body -->
                    </div>
                    <!-- /.card -->
                </div>
                <!-- /.col -->
                <div class="col-md-9">
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title">Descripcion</h3>
                            <div class="card-tools">
                                <button type="button" class="btn btn-tool" data-widget="collapse">
                                    <i class="fa fa-minus"></i>
                                </button>

                            </div>
                        </div><!-- /.card-header -->
                        <div class="card-body">
                            <div class="tab-content">
                                <div class="active tab-pane" id="activity">
                                    <!-- Post -->
                                    <div class="post">
                                        <div class="user-block">
                                            <img class="img-circle img-bordered-sm" src="images/${doc.persona.foto}" width="128px" height="128px">
                                            <span class="username">
                                                <a href="#">${doc.persona.nombre} ${doc.persona.apellido}</a>
                                            </span>
                                            <span class="description">${doc.persona.email}</span>
                                        </div>
                                        <!-- /.user-block -->
                                        <p>
                                           

                                        </p>
                                    </div>
                                    <!-- /.post -->
                                </div>
                                <!-- /.row -->
                            </div>
                            <!-- /.col -->
                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- /.post -->
                </div>
            </div>
            <!-- /.tab-content -->
        </div><!-- /.card-body -->
        </c:forEach>
    </div>
    <!-- /.nav-tabs-custom -->
</div>
<!-- /.col -->
</div>
<!-- /.row -->
</div><!-- /.container-fluid -->
</section>
<!-- /.content -->
</div>


<jsp:include page="Shared/footer.jsp"></jsp:include>    