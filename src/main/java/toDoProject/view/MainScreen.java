/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toDoProject.view;


import java.awt.Color;
import java.awt.Font;


/**
 *
 * @author Jess
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        decorateTasksTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTaskEmpityList = new javax.swing.JPanel();
        empityListTasksIcon = new javax.swing.JLabel();
        empityListTasksTitle = new javax.swing.JLabel();
        empityListTasksSubTitle = new javax.swing.JLabel();
        panelToolbar = new javax.swing.JPanel();
        toolbarTitle = new javax.swing.JLabel();
        toolbarSubTitle = new javax.swing.JLabel();
        panelProjects = new javax.swing.JPanel();
        projectsTitle = new javax.swing.JLabel();
        projectsAddIcon = new javax.swing.JLabel();
        panelTasks = new javax.swing.JPanel();
        tasksTitle = new javax.swing.JLabel();
        tasksAddIcon = new javax.swing.JLabel();
        panelLists = new javax.swing.JPanel();
        panelProjectsLists = new javax.swing.JScrollPane();
        projectsLists = new javax.swing.JList<>();
        panelTasksList = new javax.swing.JPanel();
        jTasksTable = new javax.swing.JScrollPane();
        tasksTable = new javax.swing.JTable();

        empityListTasksIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empityListTasksIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        empityListTasksTitle.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        empityListTasksTitle.setForeground(new java.awt.Color(0, 102, 51));
        empityListTasksTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empityListTasksTitle.setText("Nenhuma tarefa por aqui!");

        empityListTasksSubTitle.setFont(new java.awt.Font("Trebuchet MS", 2, 12)); // NOI18N
        empityListTasksSubTitle.setForeground(new java.awt.Color(102, 102, 102));
        empityListTasksSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empityListTasksSubTitle.setText("Clique no \"+\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout panelTaskEmpityListLayout = new javax.swing.GroupLayout(panelTaskEmpityList);
        panelTaskEmpityList.setLayout(panelTaskEmpityListLayout);
        panelTaskEmpityListLayout.setHorizontalGroup(
            panelTaskEmpityListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTaskEmpityListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTaskEmpityListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empityListTasksSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(empityListTasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empityListTasksIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTaskEmpityListLayout.setVerticalGroup(
            panelTaskEmpityListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTaskEmpityListLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(empityListTasksIcon)
                .addGap(20, 20, 20)
                .addComponent(empityListTasksTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empityListTasksSubTitle)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 800));

        panelToolbar.setBackground(new java.awt.Color(0, 102, 51));

        toolbarTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        toolbarTitle.setForeground(new java.awt.Color(255, 255, 255));
        toolbarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        toolbarTitle.setText("  TO DO APP");

        toolbarSubTitle.setBackground(new java.awt.Color(255, 255, 255));
        toolbarSubTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        toolbarSubTitle.setForeground(new java.awt.Color(204, 255, 255));
        toolbarSubTitle.setText("Anote tudo, não esqueça nada");

        javax.swing.GroupLayout panelToolbarLayout = new javax.swing.GroupLayout(panelToolbar);
        panelToolbar.setLayout(panelToolbarLayout);
        panelToolbarLayout.setHorizontalGroup(
            panelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelToolbarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toolbarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toolbarSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelToolbarLayout.setVerticalGroup(
            panelToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelToolbarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(toolbarTitle)
                .addGap(18, 18, 18)
                .addComponent(toolbarSubTitle)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelProjects.setBackground(new java.awt.Color(255, 255, 255));
        panelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        projectsTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        projectsTitle.setForeground(new java.awt.Color(0, 102, 51));
        projectsTitle.setText("Projetos");

        projectsAddIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        projectsAddIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectsAddIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelProjectsLayout = new javax.swing.GroupLayout(panelProjects);
        panelProjects.setLayout(panelProjectsLayout);
        panelProjectsLayout.setHorizontalGroup(
            panelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(projectsAddIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelProjectsLayout.setVerticalGroup(
            panelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProjectsLayout.createSequentialGroup()
                        .addComponent(projectsAddIcon)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addComponent(projectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelTasks.setBackground(new java.awt.Color(255, 255, 255));
        panelTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tasksTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        tasksTitle.setForeground(new java.awt.Color(0, 102, 51));
        tasksTitle.setText("Tarefas");

        tasksAddIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        tasksAddIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tasksAddIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTasksLayout = new javax.swing.GroupLayout(panelTasks);
        panelTasks.setLayout(panelTasksLayout);
        panelTasksLayout.setHorizontalGroup(
            panelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tasksAddIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTasksLayout.setVerticalGroup(
            panelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tasksAddIcon)
                    .addComponent(tasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelLists.setBackground(new java.awt.Color(255, 255, 255));
        panelLists.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        projectsLists.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        projectsLists.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        projectsLists.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        projectsLists.setFixedCellHeight(30);
        projectsLists.setSelectionBackground(new java.awt.Color(0, 102, 51));
        panelProjectsLists.setViewportView(projectsLists);

        javax.swing.GroupLayout panelListsLayout = new javax.swing.GroupLayout(panelLists);
        panelLists.setLayout(panelListsLayout);
        panelListsLayout.setHorizontalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProjectsLists)
                .addContainerGap())
        );
        panelListsLayout.setVerticalGroup(
            panelListsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProjectsLists)
                .addContainerGap())
        );

        panelTasksList.setBackground(new java.awt.Color(255, 255, 255));
        panelTasksList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tasksTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tasksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Editar", "Excluir", "Tarefa Concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tasksTable.setRowHeight(30);
        tasksTable.setSelectionBackground(new java.awt.Color(0, 153, 0));
        tasksTable.setShowVerticalLines(false);
        jTasksTable.setViewportView(tasksTable);

        javax.swing.GroupLayout panelTasksListLayout = new javax.swing.GroupLayout(panelTasksList);
        panelTasksList.setLayout(panelTasksListLayout);
        panelTasksListLayout.setHorizontalGroup(
            panelTasksListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTasksListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTasksTable, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTasksListLayout.setVerticalGroup(
            panelTasksListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTasksListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTasksTable)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelToolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTasksList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTasksList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projectsAddIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsAddIconMouseClicked
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, true);
        projectDialogScreen.setVisible(true);
    }//GEN-LAST:event_projectsAddIconMouseClicked

    private void tasksAddIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tasksAddIconMouseClicked
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, true);
        taskDialogScreen.setVisible(true);
    }//GEN-LAST:event_tasksAddIconMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel empityListTasksIcon;
    private javax.swing.JLabel empityListTasksSubTitle;
    private javax.swing.JLabel empityListTasksTitle;
    private javax.swing.JScrollPane jTasksTable;
    private javax.swing.JPanel panelLists;
    private javax.swing.JPanel panelProjects;
    private javax.swing.JScrollPane panelProjectsLists;
    private javax.swing.JPanel panelTaskEmpityList;
    private javax.swing.JPanel panelTasks;
    private javax.swing.JPanel panelTasksList;
    private javax.swing.JPanel panelToolbar;
    private javax.swing.JLabel projectsAddIcon;
    private javax.swing.JList<String> projectsLists;
    private javax.swing.JLabel projectsTitle;
    private javax.swing.JLabel tasksAddIcon;
    private javax.swing.JTable tasksTable;
    private javax.swing.JLabel tasksTitle;
    private javax.swing.JLabel toolbarSubTitle;
    private javax.swing.JLabel toolbarTitle;
    // End of variables declaration//GEN-END:variables

    public void decorateTasksTable(){
        tasksTable.getTableHeader().setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        tasksTable.getTableHeader().setBackground (new Color(0,153,102));
        tasksTable.getTableHeader().setForeground (new Color(255,255,255));
        
        tasksTable.setAutoCreateRowSorter(true);
    }

}
