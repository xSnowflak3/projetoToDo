package toDoProject.util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import toDoProject.model.Tasks;

/**
 * @author Jess
 */


public class DeadlineColumnCellRenderer extends DefaultTableCellRenderer {


    @Override    
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
         
         JLabel label = (JLabel) super.getTableCellRendererComponent(table, 
                                 value, isSelected, hasFocus, row, column);
        label.setHorizontalAlignment(CENTER);
        setValue(value);
        
        
        TaskTableModel taskModel = (TaskTableModel)table.getModel();
        Tasks task = taskModel.getTasks().get(row);
        
        if (task.getDeadline().after(new Date())) {
            label.setBackground(Color.green);
        } else {
            label.setBackground(Color.red);
        }
        return label;
    }
    
    
}
