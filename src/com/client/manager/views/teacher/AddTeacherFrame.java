/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.views.teacher;

import com.client.manager.constants.WindowSize;
import com.client.manager.dto.TeacherDTO;
import com.client.manager.views.LoadingScreen;
import com.client.service.Clazz;
import com.marksmana.info.Information;
import com.marksmana.info.SingleInformation;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giang
 */
public class AddTeacherFrame extends javax.swing.JPanel {

    private List<Clazz> clazz;
    private DefaultTableModel mClass, mInfo;
    private Information info = new Information();
    private TeacherDTO t;

    /**
     * Creates new form AddTeacherFrame
     */
    private AddTeacherFrame() {
        initComponents();
        initData();
        btnRemoveInfo.setEnabled(false);
    }
    
    public AddTeacherFrame(TeacherDTO t) {
        this.t = t;
        initComponents();
        btnAddTeacher.setText("Lưu thay đổi");
        initData();
    }
    
    public AddTeacherFrame(List<Clazz> clazz) {
        this.clazz = clazz;
        initComponents();
        initClasses();
    }
    
    public static void showDialog(JFrame owner) {
        JDialog dia = new JDialog(owner, "Thêm giáo viên mới", true);
        dia.setSize(WindowSize.NORMAL_WINDOW.getDimension());
        dia.setResizable(false);
        dia.setLocationRelativeTo(owner);
        dia.add(new AddTeacherFrame());
        dia.setVisible(true);
    }
    
    public static void showDialog(JFrame owner, List<Clazz> clazz) {
        JDialog dia = new JDialog(owner, "Thêm giáo viên mới", true);
        dia.setSize(WindowSize.SMALL_WINDOW.getDimension());
        dia.setResizable(false);
        dia.setLocationRelativeTo(owner);
        dia.add(new AddTeacherFrame());
        dia.setVisible(true);
    }
    
    public static void showDialog(JFrame owner, TeacherDTO teacher) {
        JDialog dia = new JDialog(owner, "Sửa giáo viên", true);
        dia.setSize(WindowSize.SMALL_WINDOW.getDimension());
        dia.setResizable(false);
        dia.setLocationRelativeTo(owner);
        dia.add(new AddTeacherFrame());
        dia.setVisible(true);
    }
    
    private void initData() {
        new Thread(() -> {
            LoadingScreen load = new LoadingScreen("Đang tải...");
            load.setVisible(true);
            // init models
            mInfo = (DefaultTableModel) tblInfo.getModel();
            mInfo.setRowCount(0);
            mClass = (DefaultTableModel) tblClass.getModel();
            initClasses();
            // get info to form
            getTeacherInfo();
            // end
            load.dispose();
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClass = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        btnAddInfo = new javax.swing.JButton();
        btnRemoveInfo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnAddTeacher = new javax.swing.JButton();

        jLabel1.setText("Họ tên:");

        txtName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtNameInputMethodTextChanged(evt);
            }
        });

        jLabel2.setText("Lớp chủ nhiệm:");

        tblClass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lớp", "Lựa chọn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
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
        jScrollPane1.setViewportView(tblClass);

        jLabel3.setText("Thông tin:");

        tblInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Thông tin", "Dữ liệu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblInfo);

        btnAddInfo.setText("+");
        btnAddInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInfoActionPerformed(evt);
            }
        });

        btnRemoveInfo.setText("-");
        btnRemoveInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveInfoActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên đăng nhập:");

        btnAddTeacher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddTeacher.setText("Thêm giáo viên");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(btnRemoveInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtUsername)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 240, Short.MAX_VALUE)
                        .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveInfo)
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtNameInputMethodTextChanged
        // TODO add your handling code here:
        String[] str = txtName.getText().trim().split(" ");
        if (str.length>=2) {
            String username = str[str.length-1].toLowerCase();
            for (int i = str.length-2; i >= 0; i--) {
                username += str[i].toLowerCase().toCharArray()[0];
            }
            txtUsername.setText(username);
        }
    }//GEN-LAST:event_txtNameInputMethodTextChanged

    private void btnAddInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInfoActionPerformed
        // TODO add your handling code here:
        mInfo.addRow(new String[]{"", ""});
        btnRemoveInfo.setEnabled(false);
    }//GEN-LAST:event_btnAddInfoActionPerformed

    private void tblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInfoMouseClicked
        // TODO add your handling code here:
        if (tblInfo.getSelectedRow() >= 0) {
            btnRemoveInfo.setEnabled(true);
        } else {
            btnRemoveInfo.setEnabled(false);
        }
    }//GEN-LAST:event_tblInfoMouseClicked

    private void btnRemoveInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveInfoActionPerformed
        // TODO add your handling code here:
        mInfo.removeRow(tblInfo.getSelectedRow());
        btnRemoveInfo.setEnabled(false);
    }//GEN-LAST:event_btnRemoveInfoActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddTeacherActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddInfo;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnRemoveInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblClass;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void initClasses() {
    }
    
    private void getTeacherInfo() {
        if (t!=null) {
            txtName.setName(t.getName());
            txtUsername.setText(t.getUsername());
            try {
                for (SingleInformation si : t.getInfo()) {
                    mInfo.addRow(new String[] {si.getKey(), si.getValue()});
                }
            } catch (Exception ex) {
                // ignore
            }
        }
    }
}
