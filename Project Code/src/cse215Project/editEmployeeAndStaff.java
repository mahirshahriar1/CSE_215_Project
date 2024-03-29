/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cse215Project;

import javax.swing.JOptionPane;

/**
 *
 * @author Mahir
 */
public class editEmployeeAndStaff extends javax.swing.JFrame {

    Admin e;
    User x;
    String[] empArray;
    String [] stfArray;
    public editEmployeeAndStaff() {
    }

    public editEmployeeAndStaff(User x) {
        this.x = x;
        initComponents();
        e = new Admin();
        if (x instanceof Employee) {
            e.populateArrayListEmployee();
      
            empArray = new String[e.employees.size()];

            for (int i = 0; i < e.employees.size(); i++) {
                empArray[i] = e.employees.get(i).getName();
            }

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(empArray));

        }
        else if(x instanceof Staff){
         e.populateArrayListStaff();

         stfArray = new String[e.staffs.size()];

            for (int i = 0; i < e.staffs.size(); i++) {
                stfArray[i] = e.staffs.get(i).getName();
            }

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(stfArray));
        
        
        }
            

        jComboBox1.setSelectedIndex(0);
                 if(x instanceof Employee)
            jLabel5.setText("Edit Employee ");
        else
            jLabel5.setText("  Edit Staff  ");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Pics/Back.png"))); // NOI18N
        jButton1.setToolTipText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Select Employee:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Id:");

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Password:");

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Pics/saveee.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Pics/delete.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setText("Edit Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(120, 120, 120)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(150, 150, 150))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton3)))
                        .addGap(173, 173, 173))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        adminframe temp = new adminframe();
        temp.setVisible(true);
        temp.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        int selectedIndex = jComboBox1.getSelectedIndex();

        if (x instanceof Employee) {
            jTextField1.setText(e.employees.get(selectedIndex).getName());
            jTextField2.setText(e.employees.get(selectedIndex).getId() + "");
            jTextField3.setText(e.employees.get(selectedIndex).getPassword() + "");

        } else if (x instanceof Staff) {
            jTextField1.setText(e.staffs.get(selectedIndex).getName());
            jTextField2.setText(e.staffs.get(selectedIndex).getId() + "");
            jTextField3.setText(e.staffs.get(selectedIndex).getPassword() + "");
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()
                || jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields");
        } else {
            int ind = jComboBox1.getSelectedIndex();
            int id = -1;
            boolean flag = true;
            try {
                id = Integer.parseInt(jTextField2.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ID should only consist of digits");
                flag = false;
            }
            if (x instanceof Employee) {
                if (!e.checkUniqueIDemp_edit(id, ind)) {
                    JOptionPane.showMessageDialog(null, "Copy ID");
                } else {
                    if (flag) {
                        boolean edit = true;
                        String name = jTextField1.getText().trim();
                        String password = jTextField3.getText();

                        if (e.employees.get(ind).getId() == id && e.employees.get(ind).getName().equals(name)
                                && e.employees.get(ind).getPassword().equals(password)) {
                            JOptionPane.showMessageDialog(null, "No Changes Made");
                            edit = false;
                        }
                        if (edit) {
                            e.employees.get(ind).setId(id);
                            e.employees.get(ind).setName(name);
                            e.employees.get(ind).setPassword(password);

                            if (e.saveEmpToFile()) {
                                JOptionPane.showMessageDialog(null, "Succesfully Edited");
                            } else {
                                JOptionPane.showMessageDialog(null, "An Error occured. Could not edit employee");
                            }

                            empArray[ind] = e.employees.get(ind).getName();

                            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(empArray));

                            jComboBox1.setSelectedIndex(ind);
                            jTextField1.setText(e.employees.get(ind).getName());
                            jTextField2.setText(e.employees.get(ind).getId() + "");
                            jTextField3.setText(e.employees.get(ind).getPassword() + "");
                        }
                    }

                }
            }
            else if(x instanceof Staff){
                if (!e.checkUniqueIDstf_edit(id, ind)) {
                    JOptionPane.showMessageDialog(null, "Copy ID");
                } else {
                    if (flag) {
                        boolean edit = true;
                        String name = jTextField1.getText().trim();
                        String password = jTextField3.getText();

                        if (e.staffs.get(ind).getId() == id && e.staffs.get(ind).getName().equals(name)
                                && e.staffs.get(ind).getPassword().equals(password)) {
                            JOptionPane.showMessageDialog(null, "No Changes Made");
                            edit = false;
                        }
                        if (edit) {
                            e.staffs.get(ind).setId(id);
                            e.staffs.get(ind).setName(name);
                            e.staffs.get(ind).setPassword(password);

                            if (e.saveStaffToFile()) {
                                JOptionPane.showMessageDialog(null, "Succesfully Edited");
                            } else {
                                JOptionPane.showMessageDialog(null, "An Error occured. Could not edit employee");
                            }

                            stfArray[ind] = e.staffs.get(ind).getName();

                            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(stfArray));

                            jComboBox1.setSelectedIndex(ind);
                            jTextField1.setText(e.staffs.get(ind).getName());
                            jTextField2.setText(e.staffs.get(ind).getId() + "");
                            jTextField3.setText(e.staffs.get(ind).getPassword() + "");
                        }
                    }

                }
            }
                

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()
                || jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields");
        } else {
            int ind = jComboBox1.getSelectedIndex();
            int id = -1;
            boolean flag = true;
            try {
                id = Integer.parseInt(jTextField2.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ID should only consist of digits");
                flag = false;
            }
            if (flag) {
                String name = jTextField1.getText().trim();
                String password = jTextField3.getText();
                boolean del = true;
                for (int i = 0; i < e.employees.size(); i++) {
                    if (e.employees.get(i).getId() == id) {
                        if (e.employees.get(i).getName().equals(name) && e.employees.get(i).getPassword().equals(password)) {
                            e.employees.remove(i);
                            JOptionPane.showMessageDialog(null, "Successfully Removed");
                        } else {
                            JOptionPane.showMessageDialog(null, "Do not change any information of the user ID you want to remove");
                            del = false;
                        }
                        break;
                    }
                }
                if (del) {
                    e.saveEmpToFile();
                }

                String[] tempArray = new String[e.employees.size()];

                for (int i = 0; i < e.employees.size(); i++) {
                    tempArray[i] = e.employees.get(i).getName();
                }

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(tempArray));

            }

        }


    }//GEN-LAST:event_jButton3ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editEmployeeAndStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editEmployeeAndStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editEmployeeAndStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editEmployeeAndStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editEmployeeAndStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
