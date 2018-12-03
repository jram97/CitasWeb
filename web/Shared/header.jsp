<jsp:useBean id="Login" scope="session" class="com.jram.Entity.Login"></jsp:useBean>
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <meta http-equiv="x-ua-compatible" content="ie=edge">
            <meta http-equiv="Expires" content="0">

            <meta http-equiv="Last-Modified" content="0">

            <meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">

            <meta http-equiv="Pragma" content="no-cache">


            <title>Citas Web</title>

            <!-- Font Awesome Icons -->
            <link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
            <!-- Theme style -->
            <link rel="stylesheet" href="dist/css/adminlte.min.css">
            <!-- Google Font: Source Sans Pro -->
            <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">


        </head>
        <body class="hold-transition sidebar-mini">

            <div class="wrapper">
                <!-- Navbar -->
                <nav class="main-header navbar navbar-expand bg-white navbar-light border-bottom">
                    <!-- Left navbar links -->
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" data-widget="pushmenu" href="#"><i class="fa fa-bars"></i></a>
                        </li>
                        <li class="nav-item d-none d-sm-inline-block">
                            <a href="home" class="nav-link">Home</a>
                        </li>
                    </ul>

                    <!-- SEARCH FORM -->
                    <form class="form-inline ml-3">
                        <div class="input-group input-group-sm">
                            <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
                            <div class="input-group-append">
                                <button class="btn btn-navbar" type="submit">
                                    <i class="fa fa-search"></i>
                                </button>
                            </div>
                        </div>
                    </form>  

                </nav>
                <!-- /.navbar -->

                <!-- Main Sidebar Container -->
                <aside class="main-sidebar sidebar-dark-primary elevation-4">
                    <!-- Brand Logo -->
                    <a href="home" class="brand-link">
                        <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                             style="opacity: .8">
                        <span class="brand-text font-weight-light">Citas Web</span>
                    </a>

                    <!-- Sidebar -->
                    <div class="sidebar">
                        <!-- Sidebar user panel (optional) -->


                        <nav class="mt-2">
                            <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">

                            <%
                                if (session.getAttribute("login") == null && Login.getRolCode() == 0) {
                            %>

                            <li class="nav-item">
                                <a href="home" class="nav-link">
                                    <i class="nav-icon fa fa-home"></i>
                                    <p>Inicio</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="login" class="nav-link">
                                    <i class="nav-icon fa fa-sign-in"></i>
                                    <p>Iniciar Sesion</p>
                                </a>
                            </li>
                            
                            <li class="nav-item">
                                <a href="add?param=horario" class="nav-link">
                                    <i class="nav-icon fa fa-sign-in"></i>
                                    <p>Agregar Horario</p>
                                </a>
                            </li>
                            
                            <li class="nav-item">
                                <a href="view?param=horario" class="nav-link">
                                    <i class="nav-icon fa fa-sign-in"></i>
                                    <p>Lista Horario</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="add?param=person" class="nav-link">
                                    <i class="nav-icon fa fa-home"></i>
                                    <p>Nuevo Cliente</p>
                                </a>
                            </li>
                            
                            <li class="nav-item">
                                <a href="add?param=doctor" class="nav-link">
                                    <i class="nav-icon fa fa-plus-square-o"></i>
                                    <p>Nuevo Doctor</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="view?param=doct" class="nav-link">
                                    <i class="nav-icon fa fa-list-ul"></i>
                                    <p>Ver Doctores</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fa fa-list-alt"></i>
                                    <p>Tus Citas</p>
                                </a>
                            </li>


                            <li class="nav-item">
                                <a href="add?param=cons" class="nav-link">
                                    <i class="nav-icon fa fa-plus-square-o"></i>
                                    <p>Agregar Consultorio</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="add?param=espe" class="nav-link">
                                    <i class="nav-icon fa fa-plus-square-o"></i>
                                    <p>Especialidad nuevo</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="view?param=espe" class="nav-link">
                                    <i class="nav-icon fa fa-list-ul"></i>
                                    <p>Ver Especialidad</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="view?param=cons" class="nav-link">
                                    <i class="nav-icon fa fa-list-ul"></i>
                                    <p>Ver Consultorios</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="add?param=roles" class="nav-link">
                                    <i class="nav-icon fa fa-plus-square-o"></i>
                                    <p>Nuevo Rol</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="view?param=roles" class="nav-link">
                                    <i class="nav-icon fa fa-list-ul"></i>
                                    <p>Ver Roles</p>
                                </a>
                            </li>
                            
                                                                                  

                            

                            <%} else { %>
                            <li class="nav-item">
                                <a href="login?param=logout" class="nav-link">
                                    <i class="nav-icon fa fa-sign-out"></i>
                                    <p>Cerrar Sesion</p>
                                </a>
                            </li> 

                            <%}%>

                        </ul>
                    </nav>
                    <!-- /.sidebar-menu -->
                </div>
                <!-- /.sidebar -->
            </aside>

            <jsp:include page="../session/session.jsp"></jsp:include>
