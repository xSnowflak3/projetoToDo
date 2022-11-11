package toDoProject.view;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import toDoProject.controller.TaskController;
import toDoProject.model.Tasks;
import java.util.Date;
import toDoProject.model.Projects;

/**
 *
 * @author Jess
 */
public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController controller;
    Projects project;

    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskToolbar = new javax.swing.JPanel();
        taskTitle = new javax.swing.JLabel();
        taskSaveIcon = new javax.swing.JLabel();
        taskContent = new javax.swing.JPanel();
        taskName = new javax.swing.JLabel();
        taskTextName = new javax.swing.JTextField();
        taskDescription = new javax.swing.JLabel();
        taskDescriptionArea = new javax.swing.JScrollPane();
        taskTextDescription = new javax.swing.JTextArea();
        taskDeadline = new javax.swing.JLabel();
        taskNotesArea = new javax.swing.JScrollPane();
        taskTextNotes = new javax.swing.JTextArea();
        taskNotes = new javax.swing.JLabel();
        taskTextDeadline = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        taskToolbar.setBackground(new java.awt.Color(0, 102, 51));

        taskTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        taskTitle.setForeground(new java.awt.Color(255, 255, 255));
        taskTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taskTitle.setText("Nova Tarefa");

        taskSaveIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        taskSaveIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taskSaveIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout taskToolbarLayout = new javax.swing.GroupLayout(taskToolbar);
        taskToolbar.setLayout(taskToolbarLayout);
        taskToolbarLayout.setHorizontalGroup(
            taskToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskToolbarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(taskTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskSaveIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        taskToolbarLayout.setVerticalGroup(
            taskToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taskToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taskSaveIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(taskTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        taskName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        taskName.setText("Nome*:");

        taskTextName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        taskDescription.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        taskDescription.setText("Descri��o:");

        taskTextDescription.setColumns(20);
        taskTextDescription.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        taskTextDescription.setRows(5);
        taskDescriptionArea.setViewportView(taskTextDescription);

        taskDeadline.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        taskDeadline.setText("Prazo:");

        taskTextNotes.setColumns(20);
        taskTextNotes.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        taskTextNotes.setRows(5);
        taskNotesArea.setViewportView(taskTextNotes);

        taskNotes.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        taskNotes.setText("Notas:");

        taskTextDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        taskTextDeadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskTextDeadlineActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Campos com asterisco (*) s�o obrigat�rios.");

        javax.swing.GroupLayout taskContentLayout = new javax.swing.GroupLayout(taskContent);
        taskContent.setLayout(taskContentLayout);
        taskContentLayout.setHorizontalGroup(
            taskContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(taskContentLayout.createSequentialGroup()
                .addGroup(taskContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taskTextName)
                    .addComponent(taskDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(taskDescriptionArea, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(taskDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(taskNotesArea)
                    .addComponent(taskNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(taskTextDeadline)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        taskContentLayout.setVerticalGroup(
            taskContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taskContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taskDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskDescriptionArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taskDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taskTextDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(taskNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskNotesArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(taskToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taskSaveIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taskSaveIconMouseClicked

        try {

            if (!taskTextName.getText().equals("")
                    && !taskTextDeadline.getText().equals("")) {

                Tasks task = new Tasks();

                task.setIdProject(project.getId());
                task.setName(taskTextName.getText());
                task.setDescription(taskTextDescription.getText());
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/y");
                Date deadline = null;
                deadline = dateFormat.parse(taskTextDeadline.getText());
                task.setDeadline(deadline);
                task.setNotes(taskTextNotes.getText());
                task.setCompleted(false);
                controller.save(task);
                JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "O projeto n�o foi salvo"
                        + " pois existem campos obrigat�rios a serem preenchidos");
            }

            }catch (Exception ex){
            JOptionPane.showMessageDialog (rootPane,ex.getMessage());
        }
            

    }//GEN-LAST:event_taskSaveIconMouseClicked

    private void taskTextDeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskTextDeadlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskTextDeadlineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java Swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel taskContent;
    private javax.swing.JLabel taskDeadline;
    private javax.swing.JLabel taskDescription;
    private javax.swing.JScrollPane taskDescriptionArea;
    private javax.swing.JLabel taskName;
    private javax.swing.JLabel taskNotes;
    private javax.swing.JScrollPane taskNotesArea;
    private javax.swing.JLabel taskSaveIcon;
    private javax.swing.JFormattedTextField taskTextDeadline;
    private javax.swing.JTextArea taskTextDescription;
    private javax.swing.JTextField taskTextName;
    private javax.swing.JTextArea taskTextNotes;
    private javax.swing.JLabel taskTitle;
    private javax.swing.JPanel taskToolbar;
    // End of variables declaration//GEN-END:variables

    public void setProject(Projects project) {
        this.project = project;
    }

}
