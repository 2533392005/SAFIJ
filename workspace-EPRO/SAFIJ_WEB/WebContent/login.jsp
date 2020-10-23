<%@page contentType="text/html" pageEncoding="UTF-8"%>﻿
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Sistema Transaccional de Activo Fijo</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
    <style>
        .logo {
            height: 70px;
            width: auto;
            margin-top: -10px;
        }
    </style>
        <style type="text/css">
            img {
                width: 100%;
                max-width: 70px;
                height: auto;
            }
            body {
/*                 background-image: url(assets/img/) !important; */
                background-size: cover !important;
                background-attachment: fixed !important;
                background-position: center center !important;
            }
        </style>
</head>
<body>
     
       
    <div id="wrapper">
        
        <style>
    #page-wrapper2 {
        padding: 15px 0px;
    }
    #page-inner2 {
        width: 500px;
        margin: 10px 20px 10px 0px;
        background-color: #fff !important;
        border: 1px solid rgb(118, 5, 5);
        padding: 10px;
    }
        </style>
        <div id="page-wrapper2" align="center">
            <div id="page-inner2" >
                <div class="row">
                    <div class="col-lg-12" style="text-align: center;">
                     <h2>INICIO DE SESION</h2>  
                     <img src="assets/img/logo.png" class="logo" />
                     <hr />
                    </div>
                </div>              
                           
                             
                    <form action="index.jsp" method="post">
                        <div class="form-group has-feedback">
                            <input required="true" type="text" class="form-control  input-lg" placeholder="credencial">
                                <span class="glyphicon glyphicon-user form-control-feedback" style="margin-top: -25px;"></span>
                        </div>
                        <div class="form-group has-feedback">
                            <input  required="true" type="password" class="form-control  input-lg" placeholder="password">
                                <span class="glyphicon glyphicon-lock form-control-feedback" style="margin-top: -25px;"></span>
                        </div>
                        <div class="row">
                            <div class="col-xs-8">
                                <div class="checkbox icheck">
                                    <label>
                                    </label>
                                </div>
                            </div>
                            <!-- /.col -->
                            <div class="col-xs-4">
                                <hr />
                                <button type="submit" class="btn btn-primary btn-block btn-flat">Ingresar</button>
                            </div>
                            <!-- /.col -->
                        </div>
                    </form>
                    
             <!-- /. PAGE INNER  -->
            </div>
 
        
         <!-- /. PAGE WRAPPER  -->
        </div>          

     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
   
</body>
</html>
