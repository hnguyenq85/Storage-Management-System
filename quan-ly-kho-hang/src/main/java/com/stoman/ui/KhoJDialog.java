/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoman.ui;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.stoman.dao.KhoDAO;
import com.stoman.dao.NhanVienDAO;
import com.stoman.entity.Kho;
import com.stoman.entity.NhanVien;
import com.stoman.utils.Auth;
import com.stoman.utils.MsgBox;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableStringConverter;

/**
 *
 * @author MinhNH
 */
public class KhoJDialog extends javax.swing.JDialog {

    /**
     * Creates new form KhoJDialog
     */
    public KhoJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        pnlThongTinKho = new javax.swing.JPanel();
        lblDiaChi = new javax.swing.JLabel();
        pnlTxtDiaChi = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        lblMaKho = new javax.swing.JLabel();
        txtMaKho = new javax.swing.JFormattedTextField();
        lblTruongKho = new javax.swing.JLabel();
        cboTruongKho = new javax.swing.JComboBox<>();
        lblTimKiem = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        pnlTblKho = new javax.swing.JScrollPane();
        tblKho = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StoMan - Quản lý kho");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnlChucNang.setBorder(javax.swing.BorderFactory.createEmptyBorder(9, 0, 9, 0));
        pnlChucNang.setOpaque(false);
        pnlChucNang.setLayout(new java.awt.GridLayout(1, 0));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnThem);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/cancel.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnXoa);

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/edit-property.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnSua);

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stoman/icons/new-document.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        pnlChucNang.add(btnMoi);

        pnlThongTinKho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin kho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(51, 51, 51))); // NOI18N
        pnlThongTinKho.setOpaque(false);

        lblDiaChi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblDiaChi.setForeground(new java.awt.Color(51, 51, 51));
        lblDiaChi.setText("Địa chỉ");

        txtDiaChi.setColumns(20);
        txtDiaChi.setLineWrap(true);
        txtDiaChi.setRows(3);
        txtDiaChi.setWrapStyleWord(true);
        pnlTxtDiaChi.setViewportView(txtDiaChi);

        lblMaKho.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblMaKho.setForeground(new java.awt.Color(51, 51, 51));
        lblMaKho.setText("Kho số");

        txtMaKho.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lblTruongKho.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblTruongKho.setForeground(new java.awt.Color(51, 51, 51));
        lblTruongKho.setText("Trưởng kho");

        javax.swing.GroupLayout pnlThongTinKhoLayout = new javax.swing.GroupLayout(pnlThongTinKho);
        pnlThongTinKho.setLayout(pnlThongTinKhoLayout);
        pnlThongTinKhoLayout.setHorizontalGroup(
            pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiaChi)
                    .addComponent(lblMaKho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTxtDiaChi)
                    .addGroup(pnlThongTinKhoLayout.createSequentialGroup()
                        .addComponent(txtMaKho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTruongKho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboTruongKho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlThongTinKhoLayout.setVerticalGroup(
            pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaKho)
                    .addComponent(txtMaKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTruongKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTruongKho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlThongTinKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongTinKhoLayout.createSequentialGroup()
                        .addComponent(lblDiaChi)
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addComponent(pnlTxtDiaChi))
                .addContainerGap())
        );

        lblTimKiem.setForeground(new java.awt.Color(51, 51, 51));
        lblTimKiem.setText("Tìm kiếm");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        pnlTblKho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách kho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(51, 51, 51))); // NOI18N
        pnlTblKho.setOpaque(false);

        tblKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKho.setOpaque(false);
        tblKho.setRowHeight(25);
        tblKho.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblKho.getTableHeader().setReorderingAllowed(false);
        tblKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoMouseClicked(evt);
            }
        });
        pnlTblKho.setViewportView(tblKho);
        if (tblKho.getColumnModel().getColumnCount() > 0) {
            tblKho.getColumnModel().getColumn(0).setResizable(false);
            tblKho.getColumnModel().getColumn(1).setResizable(false);
            tblKho.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTblKho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlThongTinKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimKiem))
                    .addComponent(pnlChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(pnlThongTinKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimKiem)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTblKho, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoMouseClicked
        // TODO add your handling code here:
        this.row = tblKho.getSelectedRow();
        this.edit();
    }//GEN-LAST:event_tblKhoMouseClicked

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.timer.stop();
    }//GEN-LAST:event_formWindowClosed

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
            javax.swing.UIManager.setLookAndFeel(new FlatIntelliJLaf());
            javax.swing.UIManager.put("Table.showHorizontalLines", true);
            javax.swing.UIManager.put("Table.showVerticalLines", true);
            javax.swing.UIManager.put("TitlePane.unifiedBackground", true);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuKiemKhoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KhoJDialog dialog = new KhoJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTruongKho;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblMaKho;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JLabel lblTruongKho;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlChucNang;
    private javax.swing.JScrollPane pnlTblKho;
    private javax.swing.JPanel pnlThongTinKho;
    private javax.swing.JScrollPane pnlTxtDiaChi;
    private javax.swing.JTable tblKho;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JFormattedTextField txtMaKho;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private KhoDAO kDAO;
    private NhanVienDAO nvDAO;

    private DefaultTableModel tblModel;
    private int row = -1;

    private void init() {
        setLocationRelativeTo(null);
        
        this.kDAO = new KhoDAO();
        this.nvDAO = new NhanVienDAO();

        this.formatTable();

        this.fillToComboBox();
        this.fillToTable();
        this.updateStatus();
        
        this.timer.start();
    }

    // Tạo tiêu đề và định dạng bảng
    private void formatTable() {
        String header[] = {"MÃ KHO", "ĐỊA CHỈ", "TRƯỞNG KHO"};
        tblModel = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class getColumnClass(int columnIndex) {
                if(tblModel.getRowCount() <= 1) {
                    return String.class;
                }
                if (getValueAt(0, columnIndex) == null) {
                    return Object.class;
                }
                return getValueAt(0, columnIndex).getClass();
            }
        };
        tblKho.setModel(tblModel);

        // Điều chỉnh size column
        tblKho.getColumnModel().getColumn(0).setPreferredWidth(22);
        tblKho.getColumnModel().getColumn(1).setPreferredWidth(130);
        tblKho.getColumnModel().getColumn(2).setPreferredWidth(107);
    }

    // Đổ dữ liệu combobox mã kho
    private void fillToComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTruongKho.getModel();
        model.removeAllElements();
        try {
            List<NhanVien> list = nvDAO.selectTruongKho();
            model.addElement(new NhanVien("Chọn trưởng kho..."));
            for (NhanVien nv : list) {
                model.addElement(nv);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    // Đổ dữ liệu vào bảng
    private void fillToTable() {
        tblModel.setRowCount(0);
        String keyword = txtTimKiem.getText();
        try {
            List<Kho> list = kDAO.selectAll();
            for (Kho k : list) {
                NhanVien tk = nvDAO.selectByID(k.getMaTK());
                tblModel.addRow(new Object[]{
                    k.getMaKho(),
                    k.getDiaChi(),
                    tk == null ? new NhanVien("<none>") : tk
                });
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }

    // Cập nhật trạng thái nút và form
    private void updateStatus() {
        boolean edit = (this.row >= 0);
        
        boolean isTableEmpty = (tblKho.getRowCount() == 0);
        boolean isManager = Auth.isManager();
        
        // Chỉ bật bộ sắp xếp khi bảng có dữ liệu
        tblKho.setAutoCreateRowSorter(!isTableEmpty);
        // Chọn hàng trên bảng
        if (edit) {
            tblKho.setRowSelectionInterval(row, row);
        }
        
        pnlChucNang.setVisible(isManager);
        pnlThongTinKho.setVisible(isManager);
        
        txtMaKho.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        
    }

    // Lấy dữ liệu từ form
    private Kho getForm() {
        Kho k = new Kho();
        NhanVien nv = new NhanVien();
        if (cboTruongKho.getSelectedIndex() == 0) {
            nv.setMaNV(null);
        } else {
            nv = (NhanVien) cboTruongKho.getSelectedItem();
        }
        k.setMaKho(Integer.parseInt(txtMaKho.getText()));
        k.setDiaChi(txtDiaChi.getText());
        int index = this.cboTruongKho.getSelectedIndex();
        if (index != 0) {
            k.setMaTK(((NhanVien) this.cboTruongKho.getSelectedItem()).getMaNV());
        } else {
            k.setMaTK(null);
        }
        return k;
    }

    // Hiển thị dữ liệu lên form
    private void setForm(Kho k, NhanVien nv) {
        txtMaKho.setText(String.valueOf(k.getMaKho()));
        txtDiaChi.setText(k.getDiaChi());
        cboTruongKho.setSelectedItem(nv);
    }

    // Xoá trắng form
    private void clearForm() {
        txtMaKho.setText("");
        txtDiaChi.setText("");
        tblKho.clearSelection();
        cboTruongKho.setSelectedIndex(0);
        this.row = -1;
        this.updateStatus();
    }

    // Hiển thị dữ liệu đang chọn trên bảng lên form
    private void edit() {
        int maKho = (int) tblKho.getValueAt(this.row, 0);
        String maNV = ((NhanVien) tblKho.getValueAt(this.row, 2)).getMaNV();
        Kho k = kDAO.selectByID(maKho);
        NhanVien nv = nvDAO.selectByID(maNV);
        this.setForm(k, nv);
        this.updateStatus();
    }

    // Xác thực dữ liệu trên form
    private boolean isValidated() {
        if (txtMaKho.getText().isEmpty()) {
            MsgBox.alert(this, "Chưa nhập số kho!");
            txtMaKho.requestFocus();
            return false;
        } 
        try {
            int maKho = Integer.parseInt(txtMaKho.getText());
            if(maKho < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            MsgBox.alert(this, "Mã kho phải là số và lớn hơn 0!");
            txtMaKho.requestFocus();
            return false;
        }
        if (txtDiaChi.getText().isEmpty()) {
            MsgBox.alert(this, "Chưa nhập địa chỉ!");
            txtDiaChi.requestFocus();
            return false;
        } 
        if (cboTruongKho.getSelectedIndex() == 0) {
            MsgBox.alert(this, "Chưa chọn trưởng kho!");
            return false;
        }
        return true;
    }

    // Thêm kho mới
    private void insert() {
        if (isValidated()) {
            Kho k = getForm();
            try {
                kDAO.insert(k);
                this.fillToTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại!");
                e.printStackTrace();
            }
        }
    }
    // Cập nhật kho

    private void update() {
        if (isValidated()) {
            Kho k = getForm();
            try {
                kDAO.update(k);
                this.fillToTable();
                MsgBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
                e.printStackTrace();
            }
        }
    }

    // Xoá kho
    private void delete() {
        String message = "Các hàng hoá đang lưu trữ trong kho này cũng sẽ bị xoá!"
                + "\nBạn có muốn tiếp tục xoá không?";
        if (MsgBox.confirm(this, message)) {
            try {
                int maKho = (int) tblKho.getValueAt(this.row, 0);
                kDAO.delete(maKho);
                this.fillToTable();
                this.clearForm();
                MsgBox.alert(this, "Xoá kho thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Xoá kho thất bại!");
                e.printStackTrace();
            }
        }
    }
    
    private void search() {
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblModel);
        tblKho.setRowSorter(sorter);
        
        String keyword = txtTimKiem.getText().toLowerCase();
        
        sorter.setStringConverter(new TableStringConverter() {
            @Override
            public String toString(TableModel model, int row, int column) {
                return model.getValueAt(row, column).toString().toLowerCase();
            }
        });
        
        RowFilter<TableModel, Object> rf = null;
        try {
            rf = RowFilter.regexFilter(keyword.toLowerCase());
        } catch (Exception e) {
            return;
        }
        sorter.setRowFilter(rf);
    }
    
        // Đỗ lại dữ liệu 
        public void refreshForm() {
            this.fillToComboBox();
            this.fillToTable();

            this.timer.restart();
        }

        // sau hai phút tải lại dữ liệu
        private Timer timer = new Timer(120000, (e) -> {
            refreshForm();
        });

}
