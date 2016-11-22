/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.views.student;

import com.client.manager.constants.WebMethods;
import com.client.manager.constants.WindowSize;
import com.client.manager.constants.WindowUtility;
import com.client.manager.dto.ClazzDTO;
import com.client.manager.dto.StudentDTO;
import com.client.manager.views.LoadingScreen;
import com.client.service.Clazz;
import com.client.service.Student;
import com.marksmana.info.Information;
import com.marksmana.info.SingleInformation;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giang
 */
public class AddStudentFrame extends javax.swing.JPanel {

    private List<StudentDTO> students = new ArrayList<>();
    private Clazz clazz;
    private DefaultComboBoxModel mCombo = new DefaultComboBoxModel();
    private DefaultTableModel mInfo, mStudents;
    private int currentSelection = -1;
    private int mode;

    public AddStudentFrame(int mode) {
        this.mode = mode;
        initComponents();
        mStudents = (DefaultTableModel) tblStudents.getModel();
        mInfo = (DefaultTableModel) tblInfo.getModel();
        setInputMode();

        btnRemoveInfo.setEnabled(false);
        initComboBox();
    }

    public AddStudentFrame(int mode, Clazz clazz) {
        this.mode = mode;
        this.clazz = clazz;
        initComponents();
        mStudents = (DefaultTableModel) tblStudents.getModel();
        mInfo = (DefaultTableModel) tblInfo.getModel();
        setInputMode();

        btnRemoveInfo.setEnabled(false);
        cboClass.setModel(mCombo);
        mCombo.addElement(clazz.getName());
        cboClass.setEnabled(false);
    }

    public static void showDialog(JFrame owner) {
        JDialog dia = new JDialog(owner, "Thêm học sinh", true);
        dia.setSize(WindowSize.NORMAL_WINDOW.getDimension());
        dia.setResizable(true);
        dia.setLocationRelativeTo(owner);
        int mode = WindowUtility.showConfirm(owner, "Thêm học sinh", "Số lượng học sinh bạn muốn thêm:", new String[]{"Một học sinh", "Nhiều học sinh"});
        dia.add(new AddStudentFrame(mode));
        if (mode > 0) {
            dia.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            dia.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    super.windowClosing(e);
                    int ch = WindowUtility.showConfirm(dia, "Đóng cửa sổ", "Bạn có thực sự muốn hủy bỏ việc thêm học sinh?", new String[]{"Không", "Có"});
                    if (ch == 1) {
                        dia.dispose();
                    }
                }
            });
        } else {
            dia.setSize(new Dimension(dia.getSize().width, (int) (dia.getSize().height / 1.5)));
            dia.setResizable(false);
        }
        dia.setVisible(true);
    }

    public static void showDialog(JFrame owner, Clazz clazz) {
        JDialog dia = new JDialog(owner, "Thêm học sinh", true);
        dia.setSize(WindowSize.NORMAL_WINDOW.getDimension());
        dia.setResizable(true);
        dia.setLocationRelativeTo(owner);
        int mode = -1;
        mode = WindowUtility.showConfirm(owner, "Thêm học sinh", "Số lượng học sinh bạn muốn thêm:", new String[]{"Một học sinh", "Nhiều học sinh"});
        if (mode < 0) {
            dia.dispose();
            return;
        }
        dia.add(new AddStudentFrame(mode, clazz));
        dia.setVisible(true);
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
        cboClass = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        btnAddInfo = new javax.swing.JButton();
        btnRemoveInfo = new javax.swing.JButton();
        separatorMain = new javax.swing.JSeparator();
        btnAddToList = new javax.swing.JButton();
        lblTblStudents = new javax.swing.JLabel();
        pnlStudents = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        btnCancelChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        jLabel1.setText("Họ tên:");

        jLabel2.setText("Lớp học:");

        cboClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClassActionPerformed(evt);
            }
        });

        jLabel3.setText("Thông tin:");

        tblInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jScrollPane1.setViewportView(tblInfo);

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

        btnAddToList.setText("Thêm vào danh sách");
        btnAddToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToListActionPerformed(evt);
            }
        });

        lblTblStudents.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lblTblStudents.setText("Danh sách học sinh chuẩn bị thêm");

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Học sinh", "Lớp học"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        pnlStudents.setViewportView(tblStudents);

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSubmit.setText("Thêm học sinh");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancelChange.setText("Hủy thay đổi");
        btnCancelChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelChangeActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separatorMain)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(btnRemoveInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(lblTblStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSubmit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddToList)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveInfo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddToList)
                    .addComponent(btnCancelChange)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorMain, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTblStudents)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        switch (mode) {
            case 0:
                StudentDTO student = new StudentDTO();
                try {
                    returnStudentDTO(student);
                    if (WebMethods.addStudent(student.getStudent()) == 0) {
                        WindowUtility.showMessage(this, "Lỗi", "Thêm học sinh lỗi", WindowUtility.ERROR);
                    } else {
                        WindowUtility.showMessage(this, "Thành công", "Thêm học sinh thành công", WindowUtility.DEFAULT);
                        resetForm();
                    }
                } catch (Exception e) {
                    WindowUtility.showMessage(this, "Lỗi", "Hãy nhập thông tin đầy đủ", WindowUtility.ERROR);
                    return;
                }

                break;
            case 1:
                List<Student> studentObject = new ArrayList<>();
                if (students.size() > 0) {
                    for (StudentDTO s : students) {
                        studentObject.add(s.getStudent());
                    }
                }
                students = new ArrayList<>();
                List<Student> errors = WebMethods.addStudentsList(studentObject);
                if (errors.size() > 0) {
                    for (Student er : errors) {
                        students.add(new StudentDTO(er));
                    }
                    WindowUtility.showMessage(this, "Lỗi", "Danh sách bị lỗi", WindowUtility.ERROR);
                }
                refreshStudentTable();
                resetForm();
                break;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

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
        tblInfo.getCellEditor(tblInfo.getSelectedRow(), tblInfo.getSelectedColumn()).stopCellEditing();
        if (tblInfo.getSelectedRow() >= 0) {
            mInfo.removeRow(tblInfo.getSelectedRow());
            btnRemoveInfo.setEnabled(false);
        }
    }//GEN-LAST:event_btnRemoveInfoActionPerformed

    private void btnAddInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInfoActionPerformed
        // TODO add your handling code here:
        mInfo.addRow(new String[]{"", ""});
        btnRemoveInfo.setEnabled(false);
    }//GEN-LAST:event_btnAddInfoActionPerformed

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        // TODO add your handling code here:
        if (tblStudents.getSelectedRow() >= 0) {
            resetForm();
            // ... have to minus one: STT starts from 1 instead of 0
            currentSelection = Integer.parseInt(mStudents.getValueAt(tblStudents.getSelectedRow(), 0).toString()) - 1;
            try {
                StudentDTO s = students.get(currentSelection);
                txtName.setText(s.getName());
                if (clazz == null) {
                    mCombo.setSelectedItem(s.getClassId());
                }
                for (SingleInformation si : s.getInfo()) {
                    mInfo.addRow(new String[]{si.getKey(), si.getValue()});
                }
            } catch (Exception ex) {
                //ignore
            }
            btnAddToList.setText("Sửa thông tin");
            btnCancelChange.setVisible(true);
            btnDelete.setVisible(true);
        }
    }//GEN-LAST:event_tblStudentsMouseClicked

    private void btnAddToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToListActionPerformed
        // TODO add your handling code here:
        tblInfo.getCellEditor(tblInfo.getSelectedRow(), tblInfo.getSelectedColumn()).stopCellEditing();
        StudentDTO s = new StudentDTO();
        returnStudentDTO(s);
        if (currentSelection >= 0) {
            // replace on table
            students.remove(currentSelection);
            students.add(currentSelection, s);
        } else {
            // add new
            students.add(s);
        }

        refreshStudentTable();
        resetForm();
    }//GEN-LAST:event_btnAddToListActionPerformed

    private void cboClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClassActionPerformed
        // TODO add your handling code here:
        try {
            ClazzDTO dto = (ClazzDTO) mCombo.getElementAt(cboClass.getSelectedIndex());
            clazz = dto.getClazz();
        } catch (Exception ex) {
            // ignore
        }
    }//GEN-LAST:event_cboClassActionPerformed

    private void btnCancelChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelChangeActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btnCancelChangeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (tblStudents.getSelectedRow() >= 0) {
            StudentDTO stu = students.get(tblStudents.getSelectedRow());
            students.remove(stu);
            refreshStudentTable();
        }
        resetForm();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddInfo;
    private javax.swing.JButton btnAddToList;
    private javax.swing.JButton btnCancelChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRemoveInfo;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cboClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTblStudents;
    private javax.swing.JScrollPane pnlStudents;
    private javax.swing.JSeparator separatorMain;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void initComboBox() {
        mCombo = new DefaultComboBoxModel();
        cboClass.setModel(mCombo);
        new Thread(() -> {
            LoadingScreen load = new LoadingScreen("Đang tải...");
            load.setVisible(true);
            List<Clazz> classes = WebMethods.getClasses();
            for (Clazz c : classes) {
                mCombo.addElement(new ClazzDTO(c));
            }
            load.dispose();
        }).start();
    }

    private void setInputMode() {
        btnCancelChange.setVisible(false);
        btnDelete.setVisible(false);
        switch (mode) {
            case 0:
                btnAddToList.setVisible(false);
                lblTblStudents.setVisible(false);
                tblStudents.setVisible(false);
                tblStudents.setEnabled(false);
                separatorMain.setVisible(false);
                pnlStudents.setVisible(false);
                break;
            case 1:
                btnSubmit.setEnabled(false);
                break;
        }
    }

    private void resetForm() {
        txtName.setText("");
        txtName.requestFocus();
        mInfo.setRowCount(0);
        btnRemoveInfo.setEnabled(false);
        currentSelection = -1;
        btnAddToList.setText("Thêm vào danh sách");
        btnCancelChange.setVisible(false);
        btnDelete.setVisible(false);
    }

    private void refreshStudentTable() {
        mStudents.setRowCount(0);

        int index = 1;
        for (StudentDTO s : students) {
            mStudents.addRow(new Object[]{
                index,
                s.getName(),
                s.getClassId().getName()
            });
            index++;
        }

        if (students.size() > 0) {
            btnSubmit.setEnabled(true);
            btnSubmit.setText("Thêm " + students.size() + " học sinh");
        } else {
            btnSubmit.setEnabled(false);
            btnSubmit.setText("Thêm học sinh");
        }
    }

    private void returnStudentDTO(StudentDTO s) {
        s.setClassId(clazz);
        if (txtName.getText().length() > 0) {
            s.setName(txtName.getText());
        } else {
            txtName.requestFocus();
        }
        Information i = new Information();
        for (int j = 0; j < tblInfo.getRowCount(); j++) {
            if (mInfo.getValueAt(j, 0).toString().length() > 0) {
                i.add(new SingleInformation(mInfo.getValueAt(j, 0).toString(), mInfo.getValueAt(j, 1).toString()));
            }
        }
        try {
            s.setInfo(i);
        } catch (Exception ex) {
        }
    }
}
