
package toDoProject.controller;

import model.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import toDoProject.util.ConnectionFactory;


/**
 * @author Jess
 */
public class TaskController {
    
    public void save (Task task){
        String sql = "INSERT IN TO tasks (idProject" +
"name," +
"description," +
"completed," +
"notes," +
"deadeline," +
"createdAt," +
"updateAt) VALUES(?,?,?,?,?,?,?,?)";
        
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1,task.getidProject());
            statement.setString (2,task.getname());
            statement.setString (3,task.getdescription());
            statement.setBoolean (4,task.getcompleted());
            statement.setString(5,task.getnotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate (7,new Date (task.getCreatedAt().getTime()));
            statement.setDate(8, new Date (task.getupdatedAt().getTime()));
        }catch (Exception ex){
            throw new RuntimeException ("Erro ao salvar tarefa" 
                    + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection);
           
        }       
    }

    public void update(Task task){
    
    }
    
    public void removeById (int taskId) throws SQLException{
        String sql = "DELETE FROM tasks WHERE id=?";
       
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();                       
        } catch (SQLException e){
            throw new SQLException ("Erro ao deletar a tarefa");
                } finally {
            ConnectionFactory.closeConnection(conn);            
        }
        
        
    }
    
    public List<Task> getAll(int idProject){
        return null;
    
    }


}
