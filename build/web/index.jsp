<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Shared/header.jsp"></jsp:include>

<div class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <div class="card-header">
                    <h5 class="card-title">Nuestros Doctores</h5>

                    <div class="card-tools">
                        <button type="button" class="btn btn-tool" data-widget="collapse">
                            <i class="fa fa-minus"></i>
                        </button>

                    </div>
                </div>
                <!-- /.card-header -->
                <div class="card-body">
                    <ul class="users-list clearfix">
                    <c:forEach items="${doctores}" var="doc">
                        
                        <li>
                            <img src="images/${doc.persona.foto}" width="128px" height="128px">
                            <a class="users-list-name" href="home?doc=${doc.codigoDoctor}">${doc.persona.nombre} ${doc.persona.apellido}</a>
                            <span class="users-list-date">${doc.persona.email}</span>
                        </li> 

                    </c:forEach>  
                </ul>

            </div>
            <!-- /.card-footer -->
        </div>
        <!-- /.card -->
    </div>
    <!-- /.col -->
</div>
<!-- /.row -->

</div>

</div>
</section>

<jsp:include page="Shared/footer.jsp"></jsp:include>    