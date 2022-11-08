
package toDoProject.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import toDoProject.model.Projects;
import toDoProject.util.ConnectionFactory;

/**
 *
 * @author Jess
 */
public class ProjectController {

    
    //Método Save
    
    public void save(Projects project) {
        String sql = "INSERT INTO projects (name,"
                + "description,"
                + "createdAt,"
                + "updatedAt) VALUES(?,?,?,?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date (project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            
            statement.execute();
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar projeto"
                    + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);

        }

    }
    
    //Método Update
    
     public void updated(Projects project) {

        String sql = "UPDATE tasks SET"
                + "name=?,"
                + "description=?,"
                + "createdAt=?,"
                + "updatedAt=?,"
                + "WHERE id=?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Estabelecendo a conexão com o banco de dados.
            connection = ConnectionFactory.getConnection();
            
            //Preparando a query.
            statement = connection.prepareStatement(sql);
            
            //Setando os valores do statement.
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());
            
            //Executando a query.
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar o projeto"
                    + ex.getMessage(), ex);
        }
        

    }
     //Método DELETE
     public void removeById(int idProject) throws SQLException {
        String sql = "DELETE FROM tasks WHERE id=?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {            
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idProject);
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a o projeto");
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
            }
        }
    
     
     //Método List
     public List<Projects> getAll (){
        String sql = "SELECT * FROM projects";
        List <Projects> projects = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
       
                
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            //Enquanto houverem valores a serem percorridos no resultSet.
            while (resultSet.next()) {
                
                Projects project = new Projects();
                
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));
                
                projects.add(project);
                
            
            }
        } catch (Exception ex){
            throw new RuntimeException("Erro ao listar projetos");
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        //Lista de tarefas que foi criada e carregada do banco de dados.
        return projects;
    }
    
    

}
