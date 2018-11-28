
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-6">
                    <h1 class="m-0 text-dark">CitasWeb</h1>
                </div><!-- /.col -->
                <div class="col-6">
                    <div class="">
                        <div class="description" style="margin-left: 80%;">
                            <% if (session.getAttribute("login") != null) {%>
                            <span class="d-block"><%=session.getAttribute("login")%></span>
                            <%} else { %>
                            <span class="d-block">Inicia Sesion</span>
                            <%}%>
                        </div>
                    </div>
                </div>
            </div><!-- /.row -->
        </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->