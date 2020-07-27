
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachini Nayanathara
 */
public class Users extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form Users
     */
    public Users() {
        initComponents();
        con=DBconnect.getconnection();
    }

    Users(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewUserBtn = new javax.swing.JButton();
        DeleteUserBtn = new javax.swing.JButton();
        addUserBtn = new javax.swing.JButton();
        UpdateUserBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewUserBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewUserBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewUserBtn.setText("View User");
        viewUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUserBtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 200, 60));

        DeleteUserBtn.setBackground(new java.awt.Color(0, 0, 0));
        DeleteUserBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteUserBtn.setText("Delete User");
        DeleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 200, 60));

        addUserBtn.setBackground(new java.awt.Color(0, 0, 0));
        addUserBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        addUserBtn.setText("Add User");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 200, 60));

        UpdateUserBtn.setBackground(new java.awt.Color(0, 0, 0));
        UpdateUserBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateUserBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateUserBtn.setText("Update User");
        UpdateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUserBtnActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 200, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        AddUser adduser = new AddUser();
        adduser.setVisible(true);
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void UpdateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateUserBtnActionPerformed
        // TODO add your handling code here:
        UpdateUser updateuser = new UpdateUser();
        updateuser.setVisible(true); 
    }//GEN-LAST:event_UpdateUserBtnActionPerformed

    private void viewUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUserBtnActionPerformed
        ViewUser viewuser = new ViewUser();
        viewuser.setVisible(true);
    }//GEN-LAST:event_viewUserBtnActionPerformed

    private void DeleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserBtnActionPerformed
        // TODO add your handling code here:
        DeleteUser deleteuser = new DeleteUser();
        deleteuser.setVisible(true);
    }//GEN-LAST:event_DeleteUserBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteUserBtn;
    private javax.swing.JButton UpdateUserBtn;
    private javax.swing.JButton addUserBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewUserBtn;
    // End of variables declaration//GEN-END:variables

    Object getuid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getusername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
