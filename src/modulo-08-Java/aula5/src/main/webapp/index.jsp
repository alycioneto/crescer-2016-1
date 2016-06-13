<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    </head>
    <body>
        <form action="" mehotd="POST">
            <div class="form-group col-lg-6">
                Nome: <input class="form-control col-lg-4" type="text" name="nome"/><br/>
                Nome: <input class="form-control col-lg-4" type="text" name="nome"/><br/>
                <input type="radio" name="gender" value="M"> Masculino:<br>
                <input type="radio" name="gender" value="F">Feminino:<br>
                <input type="radio" name="gender" value="O">Outro:<br>
                <input class="btn btn-success" type="submit" value="Adicionar"/>
            </div>
        </form>
        
        <div>
        <table class="table">
                <thead>
                    <tr>
                        <th>Sexo</th>
                        <th>Nome</th>
                        <th>Idade</th>
                    </tr>
                </thead>
                <tbody>    
                    <tr>
                        ${param.list}
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
