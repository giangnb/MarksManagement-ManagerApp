/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.views.account;

import com.client.manager.Application;
import com.client.manager.constants.WebMethods;
import javax.swing.JOptionPane;

/**
 *
 * @author LeDat
 */
public class AccountPasswordFrame extends javax.swing.JPanel {

    /**
     * Creates new form SystemInfoFrame
     */
    public AccountPasswordFrame() {
        initComponents();
        txtUserName.setText(Application.ACCOUNT.getId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOldPassword = new javax.swing.JLabel();
        lblNewPassword = new javax.swing.JLabel();
        lblRetypePassword = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        txtNewPassword = new javax.swing.JPasswordField();
        txtOldPassword = new javax.swing.JPasswordField();
        txtRetypePassword = new javax.swing.JPasswordField();
        lblOldPassword1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();

        lblOldPassword.setText("Mật khẩu hiện tại:");

        lblNewPassword.setText("Mật khẩu mới:");

        lblRetypePassword.setText("Nhập lại mật khẩu:");

        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnChangePassword.setText("Đổi mật khẩu");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        lblOldPassword1.setText("Tài khoản:");

        txtUserName.setEditable(false);
        txtUserName.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRetypePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(lblOldPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRetypePassword)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(txtOldPassword)
                    .addComponent(txtUserName))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnChangePassword)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btnChangePassword)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        String oldPass, newPass, rePass;
        oldPass = new String(txtOldPassword.getPassword());
        newPass = new String(txtNewPassword.getPassword());
        rePass = new String(txtRetypePassword.getPassword());

        if (!newPass.equals(rePass)) {
            JOptionPane.showConfirmDialog(this, "Sai mật khẩu xác nhận", "Lỗi!", JOptionPane.DEFAULT_OPTION);
        } else if (newPass.length() < 5) {
            JOptionPane.showConfirmDialog(this, "Mậu khẩu tối thiểu 5 kí tự", "Lỗi!", JOptionPane.DEFAULT_OPTION);
        } else if(oldPass.equals(newPass)) {
            JOptionPane.showConfirmDialog(this, "Mật khẩu mới phải khác mật khẩu cũ", "Lỗi!", JOptionPane.DEFAULT_OPTION);
        } else if (WebMethods.adminLogin(Application.ACCOUNT.getId(), oldPass) == null) {
            JOptionPane.showConfirmDialog(this, "Mật khẩu cũ không đúng", "Lỗi!", JOptionPane.DEFAULT_OPTION);
        } else {
            Application.ACCOUNT.setPass(newPass);
            WebMethods.updateAdmin(Application.ACCOUNT);
            JOptionPane.showConfirmDialog(this, "Đổi mật khẩu thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
        
        txtOldPassword.setText("");
        txtNewPassword.setText("");
        txtRetypePassword.setText("");
    }//GEN-LAST:event_btnChangePasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblOldPassword;
    private javax.swing.JLabel lblOldPassword1;
    private javax.swing.JLabel lblRetypePassword;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JPasswordField txtRetypePassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
