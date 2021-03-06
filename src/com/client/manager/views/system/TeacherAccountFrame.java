/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.views.system;

import com.client.manager.Application;
import com.client.manager.constants.ConfirmOption;
import com.client.manager.constants.WebMethods;
import com.client.manager.constants.WindowUtility;
import com.client.manager.views.LoadingScreen;
import com.client.service.Teacher;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HuongUD
 */
public class TeacherAccountFrame extends javax.swing.JPanel {

    private List<Teacher> teachers = new ArrayList<>();
    private Teacher teacher;
    private DefaultTableModel mInfo;

    /**
     * Creates new form TeacherAccountFrame
     */
    public TeacherAccountFrame() {
        initComponents();
        mInfo = (DefaultTableModel) tblInfo.getModel();
        initTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        btnResetPass = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnBlock = new javax.swing.JButton();

        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnResetPass.setText("Đặt lại mật khẩu");
        btnResetPass.setEnabled(false);
        btnResetPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPassActionPerformed(evt);
            }
        });

        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MS", "Họ tên", "Tài khoản"
            }
        ));
        tblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInfo);

        lblSearch.setText("Tìm kiếm");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnBlock.setText("Chặn tài khoản");
        btnBlock.setEnabled(false);
        btnBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBlock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResetPass))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnResetPass)
                    .addComponent(btnBlock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void tblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInfoMouseClicked
        // TODO add your handling code here:
        if (tblInfo.getSelectedRow() >= 0) {
            btnBlock.setEnabled(true);
            btnResetPass.setEnabled(true);
            teacher = teachers.get(tblInfo.getSelectedRow());
        }
    }//GEN-LAST:event_tblInfoMouseClicked

    private void btnResetPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPassActionPerformed
        // TODO add your handling code here:
        String pass = WindowUtility.showInputPrompt(this, "Đặt lại mật khẩu", "Nhập mật khẩu bạn muốn đặt lại:");
        if (pass != null) {
            if (pass.length() >= 5) {
                teacher.setPass(pass);
                WebMethods.updateTeacher(teacher);
            } else {
                WindowUtility.showMessage(this, "Đặt lại mật khẩu", "Mật khẩu phải chứa ít nhất 5 kí tự", WindowUtility.WARNING);
                return;
            }
            JOptionPane.showMessageDialog(this, "Đặt lại mật khẩu thành công!");
        }
    }//GEN-LAST:event_btnResetPassActionPerformed

    private void btnBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlockActionPerformed
        // TODO add your handling code here:
        ConfirmOption conf = WindowUtility.showConfirm(this, "Chặn tài khoản", "Bạn thực sự muốn chặn tài khoản này?\nBạn có thể bỏ chặn bằng cách đặt lại mật khẩu mới.");
        if (conf.equals(ConfirmOption.YES)) {
            teacher.setPass("");
            WebMethods.updateTeacher(teacher);
        }
    }//GEN-LAST:event_btnBlockActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        mInfo.setRowCount(0);
        new Thread(() -> {
            LoadingScreen load = new LoadingScreen("Đang tìm kiếm...");
            load.setVisible(true);
            String searchName = txtSearch.getText().toLowerCase();

            for (Teacher t : teachers) {
                if (t.getUsername().toLowerCase().contains(searchName)) {
                    mInfo.addRow(new Object[]{t.getId(), t.getName(), t.getUsername()});
                }
            }
            load.dispose();
        }).start();
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlock;
    private javax.swing.JButton btnResetPass;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        mInfo.setRowCount(0);
        new Thread(() -> {
            LoadingScreen load = new LoadingScreen("Đang tải...");
            load.setVisible(true);

            teachers = WebMethods.getTeachers();
            for (Teacher t : teachers) {
                mInfo.addRow(new Object[]{t.getId(), t.getName(), t.getUsername()});
            }
            load.dispose();
        }).start();
    }
}
