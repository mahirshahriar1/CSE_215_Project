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
            for (int i = 0; i < e.employees.size(); i++) {
                System.out.println(e.employees.get(i).getId());
            }

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select employee");

        jLabel2.setText("Name");

        jLabel3.setText("Id");

        jLabel4.setText("Password");

        jButton2.setText("save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(216, 216, 216)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, 159, Short.MAX_VALUE)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2)
                                .addComponent(jTextField3)))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(97, Short.MAX_VALUE))
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
