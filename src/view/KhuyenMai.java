/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import Service.KhuyenMai_SerVice;
import static java.awt.image.ImageObserver.ERROR;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class KhuyenMai extends javax.swing.JPanel {

    /**
     * Creates new form KhuyenMai
     */
    DefaultTableModel model  = new DefaultTableModel();
    private final KhuyenMai_SerVice KMservice = new KhuyenMai_SerVice();
    
    public KhuyenMai() {
        initComponents();
        cboTilekm.addItem( "0.1");
        cboTilekm.addItem( "0.15");
        cboTilekm.addItem( "0.2");
        cboTilekm.addItem( "0.3");
        cboTilekm.addItem( "0.4");
        cboTilekm.addItem( "0.5");
        cboTilekm.addItem( "0.6");
        cboTilekm.addItem( "0.7");
        cboTilekm.addItem( "0");
        model = (DefaultTableModel) tblKhuyenMai.getModel();
        LoadTable();
        if (tblKhuyenMai.getRowCount() > 0 ) {
            tblKhuyenMai.setRowSelectionInterval(0, 0);
            showDetail();
            
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhuyenMai = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaKM = new javax.swing.JTextField();
        txtTenChuongTrinh = new javax.swing.JTextField();
        txtDieuKien = new javax.swing.JTextField();
        txtNgayBD = new javax.swing.JTextField();
        txtNgayKT = new javax.swing.JTextField();
        tbnThem = new javax.swing.JButton();
        tbnSua = new javax.swing.JButton();
        tbnXoa = new javax.swing.JButton();
        tbnMoi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboTilekm = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(252, 223, 223));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Khuyến Mãi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        tblKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KM", "Tên chương trình", "Điều kiện ", "Ngày bắt đầu", "Ngày kết thúc", "Tỉ lệ KM"
            }
        ));
        tblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhuyenMaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhuyenMai);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã khuyến mại");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên chương trình");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Điều kiện");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày bắt đầu");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ngày kết thúc");

        tbnThem.setBackground(new java.awt.Color(252, 223, 223));
        tbnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-30.png"))); // NOI18N
        tbnThem.setText("   Thêm");
        tbnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnThemActionPerformed(evt);
            }
        });

        tbnSua.setBackground(new java.awt.Color(252, 223, 223));
        tbnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-update-32.png"))); // NOI18N
        tbnSua.setText("  Sửa");
        tbnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnSuaActionPerformed(evt);
            }
        });

        tbnXoa.setBackground(new java.awt.Color(252, 223, 223));
        tbnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-delete-30.png"))); // NOI18N
        tbnXoa.setText("Delete");
        tbnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnXoaActionPerformed(evt);
            }
        });

        tbnMoi.setBackground(new java.awt.Color(252, 223, 223));
        tbnMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-eraser-30.png"))); // NOI18N
        tbnMoi.setText("Mới");
        tbnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnMoiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tỉ lệ KM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaKM)
                            .addComponent(txtTenChuongTrinh)
                            .addComponent(txtDieuKien)
                            .addComponent(txtNgayBD)
                            .addComponent(txtNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(cboTilekm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbnThem)
                            .addComponent(tbnXoa))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbnMoi)
                            .addComponent(tbnSua))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tbnMoi, tbnSua, tbnThem, tbnXoa});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenChuongTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDieuKien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboTilekm)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbnThem)
                            .addComponent(tbnSua))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbnXoa)
                            .addComponent(tbnMoi))
                        .addGap(37, 37, 37))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tbnMoi, tbnSua, tbnThem, tbnXoa});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhuyenMaiMouseClicked
        // TODO add your handling code here:
        try {
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi click form" + ERROR + e);
        }
    }//GEN-LAST:event_tblKhuyenMaiMouseClicked

    private void tbnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnThemActionPerformed
        // TODO add your handling code here:
        try {
            //check form
            if (txtMaKM.getText().equalsIgnoreCase("")
                    || txtTenChuongTrinh.getText().equalsIgnoreCase("")
                    || txtDieuKien.getText().equalsIgnoreCase("")
                    || txtNgayBD.getText().equalsIgnoreCase("")
                    || txtNgayKT.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ MaKM, TenChuongTrinh, DieuKien, NgayBatDau, NgayKetThuc");
                return;
            }
            if (checkTrungMaKM(txtMaKM.getText())) {
                JOptionPane.showMessageDialog(this, "Mã KM đã có rồi, không thêm được");
                return;
            }

            model.KhuyenMai km = getKhuyenMaiFormInput();
            if (KMservice.addKhuyenMai(km) != null) {
                JOptionPane.showMessageDialog(this, "thêm thành công");
                LoadTable();
            } else {
                JOptionPane.showMessageDialog(this, "Không thêm được dòng nào");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi thêm");
        }
    }//GEN-LAST:event_tbnThemActionPerformed

    private void tbnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnSuaActionPerformed
        // TODO add your handling code here:
        try {
            //check form
            if (txtMaKM.getText().equalsIgnoreCase("")
                    || txtTenChuongTrinh.getText().equalsIgnoreCase("")
                    || txtDieuKien.getText().equalsIgnoreCase("")
                    || txtNgayBD.getText().equalsIgnoreCase("")
                    || txtNgayKT.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ Masv, TenChuongTrinh, DieuKien, NgayBatDau, NgayKetThuc");
                return;
            }

            model.KhuyenMai km = getKhuyenMaiFormInput();
            if (KMservice.updateKhuyenMai(km) != null) {
                JOptionPane.showMessageDialog(this, "sửa thành công");
                LoadTable();
            } else {
                JOptionPane.showMessageDialog(this, "Không sửa được dòng nào");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi sửa");
        }

    }//GEN-LAST:event_tbnSuaActionPerformed

    private void tbnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnXoaActionPerformed
        // TODO add your handling code here:
        try {
            int chon = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa?");
            if(chon!=JOptionPane.YES_OPTION) return;
            String MaKM = txtMaKM.getText();
            if (KMservice.deleteKhachHang(MaKM) != null) {
                JOptionPane.showMessageDialog(this, "xóa thành công");
                LoadTable();
                if(tblKhuyenMai.getRowCount()>0){
                    tblKhuyenMai.setRowSelectionInterval(0, 0);
                    showDetail();
                }else{
                    clearForm();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Không xóa được dòng nào");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi xóa");
        }
    }//GEN-LAST:event_tbnXoaActionPerformed

    private void tbnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_tbnMoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboTilekm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhuyenMai;
    private javax.swing.JButton tbnMoi;
    private javax.swing.JButton tbnSua;
    private javax.swing.JButton tbnThem;
    private javax.swing.JButton tbnXoa;
    private javax.swing.JTextField txtDieuKien;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JTextField txtTenChuongTrinh;
    // End of variables declaration//GEN-END:variables

    private void LoadTable() {
        ArrayList<model.KhuyenMai> list = KMservice.getAllKhuyenMai();
        model.setRowCount(0);
        for (model.KhuyenMai km : list) {
            model.addRow(new Object[]{
                km.getMaKM(),
                km.getTenChươngTrinh(),
                km.getDieukien(),
                km.getNgayBatDau(),
                km.getNgayKetThuc(),
                km.getTile()
            });
        }
        
    }

    private void showDetail() {
        int index = tblKhuyenMai.getSelectedRow();
        txtMaKM.setText(tblKhuyenMai.getValueAt(index, 0).toString());
        txtTenChuongTrinh.setText(tblKhuyenMai.getValueAt(index, 1).toString());
        txtDieuKien.setText(tblKhuyenMai.getValueAt(index, 2).toString());
        txtNgayBD.setText(tblKhuyenMai.getValueAt(index, 3).toString());
        txtNgayKT.setText(tblKhuyenMai.getValueAt(index, 4).toString());
        cboTilekm.setSelectedItem(tblKhuyenMai.getValueAt(index, 5).toString());
   }
    
    private model.KhuyenMai getKhuyenMaiFormInput() {
        model.KhuyenMai km = new model.KhuyenMai();
        km.setMaKM(txtMaKM.getText());
        km.setTenChươngTrinh(txtTenChuongTrinh.getText());
        km.setDieukien(txtDieuKien.getText());
        km.setNgayBatDau(txtNgayBD.getText());
        km.setNgayKetThuc(txtNgayKT.getText());
        km.setTile(Float.parseFloat(cboTilekm.getSelectedItem().toString()));
        return km;
    }

    private boolean checkTrungMaKM(String MaKM) {
        for (int i = 0; i < tblKhuyenMai.getRowCount() - 1; i++) {
            if (tblKhuyenMai.getValueAt(i, 0).toString().equalsIgnoreCase(MaKM)) {
                return true;
            }
        }
        return false;
    }

    private void clearForm() {
        txtMaKM.setText("");
        txtTenChuongTrinh.setText("");
        txtDieuKien.setText("");
        txtNgayBD.setText("");
        txtNgayKT.setText("");
        cboTilekm.getSelectedItem();
    }
}
