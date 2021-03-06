<%-- 
    Document   : CadastrarAluno
    Created on : 05/09/2018, 21:14:43
    Author     : 40249
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cadastrar Aluno</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous">
    </head>
    <body style="background-color: #F5F5F5;">
        <div>
            <div class ="container">
                <div class ="navbar-header">
                    <a href = "index.html" class ="navbar-brand">Sistema Escolar - HOME</a>
                </div>
                <div>
                    <ul class="nav nav-tabs">
                        <li class="nav-item dropdown">
                          <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Alunos</a>
                          <div class="dropdown-menu">
                            <a class="dropdown-item" href="ViewConsultaAluno.jsp">Consultar Alunos</a>   
                            <a class="dropdown-item" href="CadastrarAluno.jsp">Cadastrar Alunos</a>
                            <a class="dropdown-item" href="ViewConsultaAlunoTurma.jsp">Alunos x Turma</a>
                          </div>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Cursos</a>
                            <div class="dropdown-menu">
                                <a class="nav-link disabled" href="ViewConsultaCurso.jsp">Consultar Cursos</a>
                                <a class="nav-link disabled" href="CadastrarCurso.jsp">Cadastrar Cursos</a>
                            </div>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Professores</a>
                            <div class="dropdown-menu">
                                <a class="nav-link disabled" href="ViewConsultaProfessor.jsp">Consultar Professores</a>
                                <a class="nav-link disabled" href="CadastrarProfessor.jsp">Cadastrar Professores</a>
                            </div>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Turmas</a>
                            <div class="dropdown-menu">
                                <a class="nav-link disabled" href="ViewConsultaTurma.jsp">Consultar Turmas</a>
                                <a class="nav-link disabled" href="CadastrarTurma.jsp">Cadastrar Turmas</a>
                                <a class="dropdown-item" href="ViewConsultaAlunoTurma.jsp">Alunos x Turma</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        
        <center>
            <h2>Cadastro de Aluno</h2>
        </center>
        <div class = "container">
            <form class = "container" action="">
                <div class = "container">
                    <div class = "container">
                        <div class="form-group">
                            <label for="cod_aluno">Código Aluno</label>
                            <input type="number" class="form-control" name="cod_aluno" placeholder="Código do Aluno">
                        </div>
                        <div class="form-group">
                            <label for="nome_aluno">Nome do Aluno</label>
                            <input type="text" class="form-control" name="nome_aluno" placeholder="Nome">
                        </div>
                        <div class="form-group">
                            <label for="endereco_aluno">Enderço</label>
                            <input type="text" class="form-control" name="endereco_aluno" placeholder="Endereço">
                        </div>
                        <div class="form-group">
                            <label for="telefone_aluno">Telefone</label>
                            <input type="text" class="form-control" name="telefone_aluno" placeholder="(xx)xxxx-xxxx">
                        </div>
                    </div>
                </div>
                <button type="submit" class="btn btn-default">Confirmar</button>
                <a class="btn btn-default" href = "">Cancelar</a>
                <button class="btn btn-default" >Limpar</button>
            </form>
        </div>
        
        <div class="jumbotron jumbotron-fluid">
            <div class="container">
              <h1 class="display-4">Sistema Escola</h1>
              <p class="lead">Tenho 20 dias para entregar o trabalho. Isso significa que tenho 19 dias para descansar.</p>
            </div>
        </div>
        
        
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>