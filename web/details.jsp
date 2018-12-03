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

                                </div>

                                <h3 class="profile-username text-center">${doc.persona.nombre} ${doc.persona.apellido}</h3>

                                <p class="text-muted text-center">${doc.especialidad.nombreEsp}</p>

                                <a href="add?param=cita&codigomedico=${doc.persona.codigo}&codigopersona=<%=session.getAttribute("login")%>" class="btn btn-outline-primary btn-block"><b>Hacer Cita</b></a>
                            </div>
                            <!-- /.card-body -->
                        </div>
                        <!-- /.card -->


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
                                                Nombre Completo: <span class="">${doc.persona.nombre} ${doc.persona.apellido}</span> <br>
                                                Email: <span class="">${doc.persona.email}</span><br>
                                                Locacion: <span>${doc.location}</span><br>
                                                Estudio: <span>${doc.estudio}</span>
                                            </div>
                                            <!-- /.user-block -->

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