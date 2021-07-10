/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.ui;

/**
 *
 * @author Huy
 */
public class StoManJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StoManJFrame
     */
    public StoManJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnNhapXuat = new javax.swing.JButton();
        btnKiemKho = new javax.swing.JButton();
        btnDoiTac = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        cboThongTin = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboLoaiHang = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHangTonKho = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        btnDongHo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniDoiMK = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniThoat = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniHangHoa = new javax.swing.JMenuItem();
        mniDoiTac = new javax.swing.JMenuItem();
        mniKho = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mniPhieuNhapXuat = new javax.swing.JMenuItem();
        mniPhieuKiemKho = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniNhanVien = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StoMan - Stroge Manager System");

        jToolBar1.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/logout-rounded-left.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDangXuat);

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/close.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setFocusable(false);
        btnThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnThoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnThoat);
        jToolBar1.add(jSeparator1);

        btnNhapXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/up-down-arrow.png"))); // NOI18N
        btnNhapXuat.setText("Nhập/Xuất");
        btnNhapXuat.setFocusable(false);
        btnNhapXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhapXuat.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnNhapXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNhapXuat);

        btnKiemKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/warehouse.png"))); // NOI18N
        btnKiemKho.setText("Kiểm kho");
        btnKiemKho.setFocusable(false);
        btnKiemKho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKiemKho.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnKiemKho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnKiemKho);

        btnDoiTac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/handshake.png"))); // NOI18N
        btnDoiTac.setText("Quản lý đối tác");
        btnDoiTac.setFocusable(false);
        btnDoiTac.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoiTac.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnDoiTac.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDoiTac);
        jToolBar1.add(jSeparator2);

        cboThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/info.png"))); // NOI18N
        cboThongTin.setText("Thông tin");
        cboThongTin.setFocusable(false);
        cboThongTin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cboThongTin.setMargin(new java.awt.Insets(2, 10, 2, 10));
        cboThongTin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(cboThongTin);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/user-manual.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHuongDan);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tổng quan", jPanel1);

        jLabel1.setText("Loại hàng hoá");

        tblHangTonKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblHangTonKho);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboLoaiHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hàng tồn kho", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Xuất theo quý", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nhập theo quý", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cán cân xuất nhập", jPanel5);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new java.awt.BorderLayout());

        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/info-squared.png"))); // NOI18N
        lblTrangThai.setText("Hệ thống quản lý kho hàng");
        lblTrangThai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jPanel6.add(lblTrangThai, java.awt.BorderLayout.CENTER);

        btnDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/alarm-clock.png"))); // NOI18N
        btnDongHo.setText("11:20AM");
        btnDongHo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jPanel6.add(btnDongHo, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel6, java.awt.BorderLayout.PAGE_END);

        mnuHeThong.setText("Hệ thống");

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/login.png"))); // NOI18N
        mniDangNhap.setText("Đăng nhập");
        mnuHeThong.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/logout-rounded-left.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator3);

        mniDoiMK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/password-reset.png"))); // NOI18N
        mniDoiMK.setText("Đổi mật khẩu");
        mnuHeThong.add(mniDoiMK);
        mnuHeThong.add(jSeparator4);

        mniThoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/close.png"))); // NOI18N
        mniThoat.setText("Thoát");
        mnuHeThong.add(mniThoat);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");

        mniHangHoa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniHangHoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/cardboard-box.png"))); // NOI18N
        mniHangHoa.setText("Hàng hoá");
        mnuQuanLy.add(mniHangHoa);

        mniDoiTac.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDoiTac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/handshake.png"))); // NOI18N
        mniDoiTac.setText("Đối tác");
        mnuQuanLy.add(mniDoiTac);

        mniKho.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/warehouse.png"))); // NOI18N
        mniKho.setText("Kho");
        mnuQuanLy.add(mniKho);
        mnuQuanLy.add(jSeparator6);

        mniPhieuNhapXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniPhieuNhapXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/compare.png"))); // NOI18N
        mniPhieuNhapXuat.setText("Phiếu nhập xuất");
        mnuQuanLy.add(mniPhieuNhapXuat);

        mniPhieuKiemKho.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniPhieuKiemKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/attendance.png"))); // NOI18N
        mniPhieuKiemKho.setText("Phiếu kiểm kho");
        mnuQuanLy.add(mniPhieuKiemKho);
        mnuQuanLy.add(jSeparator5);

        mniNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/name-tag.png"))); // NOI18N
        mniNhanVien.setText("Nhân viên");
        mnuQuanLy.add(mniNhanVien);

        jMenuBar1.add(mnuQuanLy);

        mnuTroGiup.setText("Trợ giúp");

        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/user-manual.png"))); // NOI18N
        mniHuongDan.setText("Hướng dẫn sử dụng");
        mnuTroGiup.add(mniHuongDan);

        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/info.png"))); // NOI18N
        mniGioiThieu.setText("Giới thiệu phần mềm");
        mnuTroGiup.add(mniGioiThieu);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(StoManJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoManJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoManJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoManJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoManJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiTac;
    private javax.swing.JLabel btnDongHo;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKiemKho;
    private javax.swing.JButton btnNhapXuat;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cboLoaiHang;
    private javax.swing.JButton cboThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMK;
    private javax.swing.JMenuItem mniDoiTac;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHangHoa;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKho;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenuItem mniPhieuKiemKho;
    private javax.swing.JMenuItem mniPhieuNhapXuat;
    private javax.swing.JMenuItem mniThoat;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JTable tblHangTonKho;
    // End of variables declaration//GEN-END:variables
}
