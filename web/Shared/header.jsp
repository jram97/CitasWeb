<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        
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
                    <li class="nav-item d-none d-sm-inline-block">
                        <a href="register.jsp" class="nav-link">Login</a>
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
                <a href="index3.html" class="brand-link">
                    <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                         style="opacity: .8">
                    <span class="brand-text font-weight-light">Citas Web</span>
                </a>

                <!-- Sidebar -->
                <div class="sidebar">
                    <!-- Sidebar user panel (optional) -->
                    <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                        <div class="image">
                            <img src="dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
                        </div>
                        <div class="info">
                            <a href="#" class="d-block">Javier Ramírez</a>
                        </div>
                    </div>

                    <!-- Sidebar Menu -->
                    <nav class="mt-2">
                        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">

                            <li class="nav-item">
                                <a href="home" class="nav-link">
                                    <i class="nav-icon fa fa-th"></i>
                                    <p>Home</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="view?param=doct" class="nav-link">
                                    <i class="nav-icon fa fa-th"></i>
                                    <p>Ver Doctor</p>
                                </a>
                            </li>
                            
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fa fa-th"></i>
                                    <p>Tus Citas</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="add?param=doctor" class="nav-link">
                                    <i class="nav-icon fa fa-th"></i>
                                    <p>Nuevo Doctor</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="add?param=cons" class="nav-link">
                                    <i class="nav-icon fa fa-th"></i>
                                    <p>Consultorio nuevo</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="add?param=espe" class="nav-link">
                                    <i class="nav-icon fa fa-th"></i>
                                    <p>Especialidad nuevo</p>
                                </a>
                            </li>
                            
                            <li class="nav-item">
                                <a href="view?param=espe" class="nav-link">
                                    <i class="nav-icon fa fa-th"></i>
                                    <p>Ver Especialidad</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="view?param=cons" class="nav-link">
                                    <i class="nav-icon fa fa-th"></i>
                                    <p>Ver Consultorios</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="add?param=roles" class="nav-link">
                                    <i class="nav-icon fa fa-th"></i>
                                    <p>Nuevo Rol</p>
                                </a>
                            </li>

                            <li class="nav-item">
                                <a href="view?param=roles" class="nav-link">
                                    <i class="nav-icon fa fa-th"></i>
                                    <p>Ver Roles</p>
                                </a>
                            </li>


                        </ul>
                    </nav>
                    <!-- /.sidebar-menu -->
                </div>
                <!-- /.sidebar -->
            </aside>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1 class="m-0 text-dark">CitasWeb</h1>
                            </div><!-- /.col -->
                        </div><!-- /.row -->
                    </div><!-- /.container-fluid -->
                </div>
                <!-- /.content-header -->

