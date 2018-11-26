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
                      <h3 class="card-title">Hacer Reserva</h3>
                    </div>
                    <!-- /.card-header -->
                    <!-- form start -->
                    <form role="form">
                      <div class="card-body">
                        
                        <div class="form-group">
                            <label for="">Medico:</label>
                            <input type="text" class="form-control" placeholder="Ingresa tu nombre" disabled>
                          </div>

                        <div class="form-group">
                          <label for="">Tu Nombre:</label>
                          <input type="text" class="form-control" placeholder="Ingresa tu nombre" disabled>
                        </div>

                        <div class="form-group">
                                <label for="">Consultorio:</label>
                                <input type="text" class="form-control" placeholder="Ingresa tu nombre" disabled>
                              </div>

                        <div class="form-group">
                            <label>Horarios Disponibles: </label><br>
                            
                            <select class="form-control">
                                <option>12:45 am</option>
                                <option>12:45 am</option>
                                <option>12:45 am</option>
                                <option>12:45 am</option>
                                <option>12:45 am</option>
                                <option>12:45 am</option>
                            </select>
                        </div>

                        <div class="form-group">
                                <label>Contacto:</label>
              
                                <div class="input-group">
                                  <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fa fa-phone"></i></span>
                                  </div>
                                  <input type="text" class="form-control" maxlength="8" data-inputmask='"mask": "(999) 999-9999"' data-mask>
                                </div>
                                <!-- /.input group -->
                        </div>

                      </div>
                      <!-- /.card-body -->
      
                      <div class="card-footer">
                        <button type="submit" class="btn btn-primary">Reservar</button>
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