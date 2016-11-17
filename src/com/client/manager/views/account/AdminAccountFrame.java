/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.views.account;

import com.client.manager.Application;
import com.client.manager.constants.ConfirmOption;
import com.client.manager.constants.PasswordUtility;
import com.client.manager.constants.WebMethods;
import com.client.manager.constants.WindowUtility;
import com.client.manager.dto.AdminDTO;
import com.client.manager.views.LoadingScreen;
import com.client.service.Admin;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LeDat
 */
public class AdminAccountFrame extends javax.swing.JPanel {

    private List<AdminDTO> admins = new ArrayList<>();
    private DefaultListModel mList;
    private AdminDTO current;

    /**
     * Creates new form AdminAccountFrame
     */
    public AdminAccountFrame() {
        initComponents();

        initList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        btnAddNew = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAddNew = new javax.swing.JList<>();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        lblProperties = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnAddEdit = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProperties = new javax.swing.JTable();
        txtPass = new javax.swing.JTextField();

        btnAddNew.setText("Thêm mới");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        lstAddNew.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "567", "7", "8", "9", "0", "1", "2", "3", "4", "4", "5", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstAddNew.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAddNewValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstAddNew);

        lblUser.setText("Tên đăng nhập:");

        lblPassword.setText("Mật khẩu:");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        btnReset.setText("Đặt lại");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblProperties.setText("Quyền:");

        btnClear.setText("Xóa");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAddEdit.setText("Sửa");
        btnAddEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEditActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tblProperties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Teacher",  new Boolean(false)},
                {"Class", null},
                {"Student", null},
                {"Admin", null}
            },
            new String [] {
                "Quyền", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblProperties);
        if (tblProperties.getColumnModel().getColumnCount() > 0) {
            tblProperties.getColumnModel().getColumn(0).setResizable(false);
        }

        txtPass.setEditable(false);
        txtPass.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddNew, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblProperties, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addComponent(txtPass)
                    .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddEdit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddNew)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtPass)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(lblProperties, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnClear)
                                    .addComponent(btnAddEdit))))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtUserActionPerformed

    private void btnAddEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEditActionPerformed
        // TODO add your handling code here:
        if (current == null) {
            return;
        }
        if (txtUser.getText().length() > 5) {
            // Dung
            if (txtPass.getText().length() > 0) {
                ConfirmOption conf = WindowUtility.showConfirm(this, "Đổi mật khẩu", "Bạn có thực sự muốn đổi mật khẩu cho tài khoản này?");
                // I'm sorry!
                if (conf.equals(ConfirmOption.YES)) {
                    current.setPass(txtPass.getText());
                }
            }
            current.setId(txtUser.getText());
            String prohibit = "";
            DefaultTableModel mProps = (DefaultTableModel) tblProperties.getModel();
            for (int i = 0; i < tblProperties.getRowCount(); i++) {
                if (!(boolean) mProps.getValueAt(i, 1)) {
                    prohibit += mProps.getValueAt(i, 0).toString().toLowerCase() + ",";
                }
            }
            current.setProhibited(prohibit.split(","));
            int result = 0;
            result = WebMethods.updateAdmin(current.getAdmin());
            if (result > 0) {
                initList();
            } else {
                WindowUtility.showMessage(this, "Lỗi", "Không thể cập nhật thông tin người dùng. Vui lòng thử lại!", WindowUtility.ERROR);
            }
            current = null;
            resetForm();
        } else {
            // sai
            JOptionPane.showMessageDialog(this, "Tên tài khoản ít nhất 5 kí tự.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddEditActionPerformed

    private void lstAddNewValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAddNewValueChanged
        // TODO add your handling code here:
        try {
            current = (AdminDTO) mList.get(lstAddNew.getSelectedIndex());
            txtUser.setText(current.getId());
            String[] prohibit = current.getProhibited();
            DefaultTableModel mProps = (DefaultTableModel) tblProperties.getModel();
            for (int i = 0; i < tblProperties.getRowCount(); i++) {
                mProps.setValueAt(true, i, 1);
                for (String p : prohibit) {
                    if (mProps.getValueAt(i, 0).toString().toLowerCase().equals(p.toLowerCase())) {
                        mProps.setValueAt(false, i, 1);
                        break;
                    }
                }
            }
        } catch (Exception ex) {
            // ignore
            current = null;
            //ex.printStackTrace();
        }
    }//GEN-LAST:event_lstAddNewValueChanged

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtPass.setText(PasswordUtility.genreatePassword(8, PasswordUtility.MEDIUM));
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        // TODO add your handling code here:
        String userId = WindowUtility.showInputPrompt(this, "Quản lý mới", "Nhập tên tài khoản quản lý mới:");
        if (userId != null) {
            if (userId.length() >= 5) {
                Admin a = new Admin();
                a.setId(userId);
                a.setPass("");
                a.setProhibited("admin");
                a.setLastChange(new java.util.Date().getTime());
                a.setLastLogin(0);
                WebMethods.addAdmin(a);
                initList();
                resetForm();
            } else {
                JOptionPane.showMessageDialog(this, "Tên tài khoản ít nhất 5 kí tự.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        // xoa di
        resetForm();
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEdit;
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProperties;
    private javax.swing.JLabel lblUser;
    private javax.swing.JList<String> lstAddNew;
    private javax.swing.JTable tblProperties;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void initList() {
        mList = new DefaultListModel();
        lstAddNew.setModel(mList);
        new Thread(() -> {
            LoadingScreen load = new LoadingScreen("Đang tải...");
            load.setVisible(true);
            List<Admin> list = WebMethods.getAdmins(Application.ACCOUNT);
            for (Admin a : list) {
                admins.add(new AdminDTO(a));
                mList.addElement(new AdminDTO(a));
            }
            load.dispose();
        }).start();

    }

    private void resetForm() {
        txtUser.setText("");
        txtPass.setText("");
        DefaultTableModel mProps = (DefaultTableModel) tblProperties.getModel();
        for (int i = 0; i < tblProperties.getRowCount(); i++) {
            mProps.setValueAt(Boolean.FALSE,i,1);
        }
    }

}
