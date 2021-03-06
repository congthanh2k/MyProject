/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htqlytourdulich;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.microsoft.sqlserver.jdbc.StringUtils;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh
 */
public class QLHT extends javax.swing.JFrame {

    DefaultTableModel tableModeldn;
    DefaultTableModel tableModelTTnv;
    DefaultTableModel tableModelTTtour;
    DefaultTableModel tableModelTTKH;
    DefaultTableModel tableModelTourdulich;

    List<Account> aclist1 = new ArrayList<>();
    List<QlyHDV> aclist2 = new ArrayList<>();
    List<QlyTourBooking> aclist3 = new ArrayList<>();
    List<TTKhachHang> aclist4 = new ArrayList<>();
    List<TourDulich> aclist5 = new ArrayList<>();

    int flagCapnhatDN = 0;
    int flagCapnhatTourBooking = 0;

    /**
     * Creates new form QLHT
     */
    public QLHT() {
        initComponents();

        tableModeldn = (DefaultTableModel) tabledangnhap.getModel();
        showAccount();
        flagCapnhatDN = 0;

        tableModelTTnv = (DefaultTableModel) tableTTnhanvien.getModel();
        showQlyHDV();

        tableModelTTtour = (DefaultTableModel) tableTTTourBooking.getModel();
        showQlyTourBooking();;
        flagCapnhatTourBooking = 0;

        tableModelTTKH = (DefaultTableModel) tablettKhachhang.getModel();
        showTTKhachHang();

        tableModelTourdulich = (DefaultTableModel) tableTourdulich.getModel();
        showTourDulich();

    }

    private void showAccount() {
        aclist1 = AccountModify.findAll();

        tableModeldn.setRowCount(0);

        for (Account acc : aclist1) {
            tableModeldn.addRow(new Object[]{tableModeldn.getRowCount() + 1, acc.getUsername(), acc.getPassword(), acc.getHovaten(), acc.getSdt(), acc.getEmail()});
        }
    }

    private void showQlyHDV() {
        aclist2 = QlyHDVModify.findAll();

        tableModelTTnv.setRowCount(0);

        for (QlyHDV acc : aclist2) {
            tableModelTTnv.addRow(new Object[]{acc.getMaHDV(), acc.getTenHDV(), acc.getSdtHDV(), acc.getDiachiHDV(), acc.getSoCmndHDV(), acc.getNgayCap(), acc.getNoiCap(), acc.getNgaySinh(), acc.getMagiaychungnhanHDV(), acc.getNgaycapgiaychungnhanHDV(), acc.getGhiChu()});
        }
    }

    private void showQlyTourBooking() {
        aclist3 = QlyTourBookingModify.findAll();

        tableModelTTtour.setRowCount(0);

        for (QlyTourBooking acc : aclist3) {
            //chuyen gia tien
//            float amount = acc.getGiaTour();
//            Locale locale = new Locale("vi", "VN");
//            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
//            System.out.println(currencyFormatter.format(amount));

            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
            String firstNumAsString = decimalFormat.format(acc.getGiaTour());

            tableModelTTtour.addRow(new Object[]{tableModelTTtour.getRowCount() + 1, acc.getMaKH(), acc.getMatour(), acc.getMaHDV(), acc.getNgayDi(), acc.getNgayVe(), acc.getNgayDatTour(), acc.getTrangThaiTour(), acc.getNgayThanhToan(), firstNumAsString, acc.getSoLuongNgay(), acc.getGhiChu()});

        }
    }

    private void showTTKhachHang() {
        aclist4 = TTKhachHangModify.findAll();

        tableModelTTKH.setRowCount(0);

        for (TTKhachHang acc : aclist4) {
            tableModelTTKH.addRow(new Object[]{acc.getMaKH(), acc.getTenKH(), acc.getSdtKH(), acc.getEmail(), acc.getDiachiKH(), acc.getNgaySinh()});
        }

    }

    private void showTourDulich() {
        aclist5 = TourDulichModify.findAll();

        tableModelTourdulich.setRowCount(0);

        for (TourDulich acc : aclist5) {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
            String firstNumAsString = decimalFormat.format(acc.getGiaDeXuat());
            tableModelTourdulich.addRow(new Object[]{acc.getMatour(), acc.getTenTour(), acc.getMoTa(), acc.getSoNgay(), firstNumAsString, acc.getDiadiem(), acc.getTrangThaiTour(), acc.getGhichu()});
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

        jTextField7 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btnttKhachhang1Them = new javax.swing.JButton();
        btnttKhachhang1Sua = new javax.swing.JButton();
        btnttKhachhang1Xoa = new javax.swing.JButton();
        btnttKhachhang1Tim = new javax.swing.JButton();
        btnttKhachhang1Lammoi = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tMaKhTTKhachHang = new javax.swing.JTextField();
        tTenKhTTKhachHang = new javax.swing.JTextField();
        tSdtTTKhachHang = new javax.swing.JTextField();
        tEmailTTKhachHang = new javax.swing.JTextField();
        tDiachiTTKhachHang = new javax.swing.JTextField();
        tNgaySinhTTKhachHang = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablettKhachhang = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableTTnhanvien = new javax.swing.JTable();
        btnttNhanvien2Them = new javax.swing.JButton();
        btnttNhanvien2Sua = new javax.swing.JButton();
        btnttNhanvien2Xoa = new javax.swing.JButton();
        btnttNhanvien2Tim = new javax.swing.JButton();
        btnttNhanvien2Lammoi = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tMaHDVTTNhanvien = new javax.swing.JTextField();
        tTenTTNhanvien = new javax.swing.JTextField();
        tSdtTTNhanvien = new javax.swing.JTextField();
        tDiachiTTNhanvien = new javax.swing.JTextField();
        tSoCmndTTNhanvien = new javax.swing.JTextField();
        tNgaycapTTNhanvien = new javax.swing.JTextField();
        tNoicapTTNhanvien = new javax.swing.JTextField();
        tNgaysinhTTNhanvien = new javax.swing.JTextField();
        tGiayCNTTNhanvien = new javax.swing.JTextField();
        tNgayCapgiayCNTTNhanvien = new javax.swing.JTextField();
        tGhichuTTNhanvien = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTTTourBooking = new javax.swing.JTable();
        btnttTourbooking3Them = new javax.swing.JButton();
        btnttTourbooking3Sua = new javax.swing.JButton();
        btnttTourbooking3Xoa = new javax.swing.JButton();
        btnttTourbooking3Tim = new javax.swing.JButton();
        btnttTourbooking3Lammoi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tMaKHTourBooking = new javax.swing.JTextField();
        tMatourTourBooking = new javax.swing.JTextField();
        tMaHDVTourBooking = new javax.swing.JTextField();
        tNgaydiTourBooking = new javax.swing.JTextField();
        tNgayveTourBooking = new javax.swing.JTextField();
        tNgaydattourTourBooking = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        tTrangthaitourTourBooking = new javax.swing.JTextField();
        tNgayThanhtoanTourBooking = new javax.swing.JTextField();
        tGiatourTourBooking = new javax.swing.JTextField();
        tSoluongngayTourBooking = new javax.swing.JTextField();
        tGhichuTourBooking = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTourdulich = new javax.swing.JTable();
        btnTourDulich4Them = new javax.swing.JButton();
        btnTourDulich4Sua = new javax.swing.JButton();
        btnTourDulich4Xoa = new javax.swing.JButton();
        btnTourDulich4Tim = new javax.swing.JButton();
        btnTourDulich4Lammoi = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        tMatourTourDulich = new javax.swing.JTextField();
        tTentourTourDulich = new javax.swing.JTextField();
        tMotaTourDulich = new javax.swing.JTextField();
        tSongayTourDulich = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tGiadexuatTourDulich = new javax.swing.JTextField();
        tDiadiemTourDulich = new javax.swing.JTextField();
        tTrangthaitouTourDulich = new javax.swing.JTextField();
        tGhichuTourDulich = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledangnhap = new javax.swing.JTable();
        btndangnhap5Them = new javax.swing.JButton();
        btndangnhap5Sua = new javax.swing.JButton();
        btndangnhap5Xoa = new javax.swing.JButton();
        btndangnhap5Tim = new javax.swing.JButton();
        btndangnhap5Lammoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tTkhoandangnhap = new javax.swing.JTextField();
        tMatkhaudangnhap = new javax.swing.JTextField();
        tHovatendangnhap = new javax.swing.JTextField();
        tSdtdangnhap = new javax.swing.JTextField();
        tEmaildangnhap = new javax.swing.JTextField();

        jTextField7.setText("jTextField7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("H??? Th???ng Qu???n L??");

        btnttKhachhang1Them.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttKhachhang1Them.setText("L??u");
        btnttKhachhang1Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttKhachhang1ThemActionPerformed(evt);
            }
        });

        btnttKhachhang1Sua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttKhachhang1Sua.setText("S???a");
        btnttKhachhang1Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttKhachhang1SuaActionPerformed(evt);
            }
        });

        btnttKhachhang1Xoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttKhachhang1Xoa.setText("X??a");
        btnttKhachhang1Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttKhachhang1XoaActionPerformed(evt);
            }
        });

        btnttKhachhang1Tim.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttKhachhang1Tim.setText("T??m");
        btnttKhachhang1Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttKhachhang1TimActionPerformed(evt);
            }
        });

        btnttKhachhang1Lammoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttKhachhang1Lammoi.setText("L??m m???i");
        btnttKhachhang1Lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttKhachhang1LammoiActionPerformed(evt);
            }
        });

        jLabel21.setText("M?? kh??ch h??ng:");

        jLabel22.setText("T??n:");

        jLabel23.setText("S??? ??i???n tho???i:");

        jLabel24.setText("Email:");

        jLabel25.setText("?????a ch???:");

        jLabel26.setText("Ng??y sinh:");

        tSdtTTKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSdtTTKhachHangActionPerformed(evt);
            }
        });

        tablettKhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "M?? Kh??ch h??ng", "T??n ", "S??? ??i???n tho???i", "Email", "?????a ch???", "Ng??y sinh"
            }
        ));
        jScrollPane5.setViewportView(tablettKhachhang);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tDiachiTTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tTenKhTTKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tMaKhTTKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tSdtTTKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tEmailTTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tNgaySinhTTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnttKhachhang1Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnttKhachhang1Lammoi)
                    .addComponent(btnttKhachhang1Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnttKhachhang1Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnttKhachhang1Them, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(527, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(tMaKhTTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(tTenKhTTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(tSdtTTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(tEmailTTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(tDiachiTTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnttKhachhang1Them)
                        .addGap(31, 31, 31)
                        .addComponent(btnttKhachhang1Sua)
                        .addGap(29, 29, 29)
                        .addComponent(btnttKhachhang1Xoa)
                        .addGap(28, 28, 28)
                        .addComponent(btnttKhachhang1Tim)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tNgaySinhTTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnttKhachhang1Lammoi)))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Th??ng tin kh??ch h??ng", jPanel2);

        tableTTnhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "M?? HDV", "T??n", "S??t", "?????a ch???", "S??? cmnd", "Ng??y c???p ", "N??i c???p", "Ng??y sinh", "M?? gi???y ch???ng nh???n HDV", "Ng??y c???p gi??y ch???ng nh???n HDV", "Ghi ch??"
            }
        ));
        jScrollPane4.setViewportView(tableTTnhanvien);

        btnttNhanvien2Them.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttNhanvien2Them.setText("L??u");
        btnttNhanvien2Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttNhanvien2ThemActionPerformed(evt);
            }
        });

        btnttNhanvien2Sua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttNhanvien2Sua.setText("S???a");
        btnttNhanvien2Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttNhanvien2SuaActionPerformed(evt);
            }
        });

        btnttNhanvien2Xoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttNhanvien2Xoa.setText("X??a");
        btnttNhanvien2Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttNhanvien2XoaActionPerformed(evt);
            }
        });

        btnttNhanvien2Tim.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttNhanvien2Tim.setText("T??m");
        btnttNhanvien2Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttNhanvien2TimActionPerformed(evt);
            }
        });

        btnttNhanvien2Lammoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttNhanvien2Lammoi.setText("L??m m???i");
        btnttNhanvien2Lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttNhanvien2LammoiActionPerformed(evt);
            }
        });

        jLabel16.setText("M?? HDV:");

        jLabel17.setText("T??n:");

        jLabel18.setText("S??? ??i???n tho???i:");

        jLabel19.setText("?????a ch???:");

        jLabel20.setText("S??? cmnd:");

        jLabel27.setText("Ng??y c???p:");

        jLabel28.setText("N??i c???p:");

        jLabel29.setText("Ng??y sinh:");

        jLabel30.setText("M?? gi???y ch???ng nh???n:");

        jLabel31.setText("Ng??y c???p gi???y ch???ng nh???n:");

        jLabel32.setText("Ghi ch??:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(tSoCmndTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel32))
                                    .addComponent(tNgaycapTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tDiachiTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tSdtTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tTenTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel28)))))
                            .addComponent(jLabel27)
                            .addComponent(jLabel17)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(58, 58, 58)
                                .addComponent(tMaHDVTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tGhichuTTNhanvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNgayCapgiayCNTTNhanvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tGiayCNTTNhanvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNgaysinhTTNhanvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNoicapTTNhanvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnttNhanvien2Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnttNhanvien2Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnttNhanvien2Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnttNhanvien2Them, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnttNhanvien2Lammoi))
                        .addContainerGap(487, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tMaHDVTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(tNoicapTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(tTenTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(tNgaysinhTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(jLabel19)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(tSoCmndTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnttNhanvien2Them)
                        .addGap(32, 32, 32)
                        .addComponent(btnttNhanvien2Sua)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tSdtTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(tGiayCNTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tDiachiTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31)
                                    .addComponent(tNgayCapgiayCNTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnttNhanvien2Tim)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel27)
                                                    .addComponent(tNgaycapTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(51, 51, 51))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(btnttNhanvien2Lammoi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(tGhichuTTNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnttNhanvien2Xoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1324, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Th??ng tin nh??n vi??n", jPanel3);

        tableTTTourBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "M?? kh??ch h??ng", "M?? tour", "M?? HDV", "Ng??y ??i", "Ng??y v??? ", "Ng??y ?????t tour", "Tr???ng th??i tour", "Ng??y thanh to??n", "Gi?? tour(vnd)", "S??? l?????ng ng??y ", "Ghi ch??"
            }
        ));
        jScrollPane3.setViewportView(tableTTTourBooking);

        btnttTourbooking3Them.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttTourbooking3Them.setText("L??u");
        btnttTourbooking3Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttTourbooking3ThemActionPerformed(evt);
            }
        });

        btnttTourbooking3Sua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttTourbooking3Sua.setText("S???a");
        btnttTourbooking3Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttTourbooking3SuaActionPerformed(evt);
            }
        });

        btnttTourbooking3Xoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttTourbooking3Xoa.setText("X??a");
        btnttTourbooking3Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttTourbooking3XoaActionPerformed(evt);
            }
        });

        btnttTourbooking3Tim.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttTourbooking3Tim.setText("T??m");
        btnttTourbooking3Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttTourbooking3TimActionPerformed(evt);
            }
        });

        btnttTourbooking3Lammoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnttTourbooking3Lammoi.setText("L??m m???i");
        btnttTourbooking3Lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnttTourbooking3LammoiActionPerformed(evt);
            }
        });

        jLabel6.setText("M?? kh??ch h??ng:");

        jLabel7.setText("M?? tour:");

        jLabel8.setText("M?? HDV:");

        jLabel9.setText("Ng??y ??i:");

        jLabel10.setText("Ng??y v???:");

        jLabel11.setText("Ng??y ?????t tour:");

        tNgaydiTourBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNgaydiTourBookingActionPerformed(evt);
            }
        });

        tNgayveTourBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNgayveTourBookingActionPerformed(evt);
            }
        });

        jLabel12.setText("Tr???ng th??i tour:");

        jLabel13.setText("Ng??y thanh to??n:");

        jLabel14.setText("Gi?? tour:");

        jLabel15.setText("S??? l?????ng ng??y:");

        jLabel33.setText("Ghi ch??:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Xu???t file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tNgaydiTourBooking)
                            .addComponent(tMaHDVTourBooking)
                            .addComponent(tMatourTourBooking)
                            .addComponent(tMaKHTourBooking)
                            .addComponent(tNgayveTourBooking)
                            .addComponent(tNgaydattourTourBooking, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel33))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tSoluongngayTourBooking, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(tGiatourTourBooking, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNgayThanhtoanTourBooking, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tTrangthaitourTourBooking, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tGhichuTourBooking))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnttTourbooking3Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnttTourbooking3Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnttTourbooking3Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnttTourbooking3Them, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnttTourbooking3Lammoi))
                                .addGap(0, 448, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159))))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tMaKHTourBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(tTrangthaitourTourBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnttTourbooking3Them)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tMatourTourBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(tNgayThanhtoanTourBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tMaHDVTourBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(tGiatourTourBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnttTourbooking3Sua)
                        .addGap(27, 27, 27)
                        .addComponent(btnttTourbooking3Xoa)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tNgaydiTourBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(tSoluongngayTourBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(tNgayveTourBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(tNgaydattourTourBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tGhichuTourBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnttTourbooking3Tim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnttTourbooking3Lammoi)
                        .addGap(1, 1, 1)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1324, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Book Tour", jPanel4);

        tableTourdulich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "M?? tour", "T??n tour", "M?? t???", "S??? ng??y", "Gi?? ????? xu???t(vnd)", "?????a ??i???m", "Tr???ng th??i tour", "Ghi ch??"
            }
        ));
        jScrollPane2.setViewportView(tableTourdulich);

        btnTourDulich4Them.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTourDulich4Them.setText("L??u");
        btnTourDulich4Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTourDulich4ThemActionPerformed(evt);
            }
        });

        btnTourDulich4Sua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTourDulich4Sua.setText("S???a");
        btnTourDulich4Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTourDulich4SuaActionPerformed(evt);
            }
        });

        btnTourDulich4Xoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTourDulich4Xoa.setText("X??a");
        btnTourDulich4Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTourDulich4XoaActionPerformed(evt);
            }
        });

        btnTourDulich4Tim.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTourDulich4Tim.setText("T??m");
        btnTourDulich4Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTourDulich4TimActionPerformed(evt);
            }
        });

        btnTourDulich4Lammoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTourDulich4Lammoi.setText("L??m m???i");
        btnTourDulich4Lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTourDulich4LammoiActionPerformed(evt);
            }
        });

        jLabel34.setText("M?? tour:");

        jLabel35.setText("T??n tour:");

        jLabel36.setText("M?? t???:");

        jLabel37.setText("S??? ng??y:");

        tTentourTourDulich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTentourTourDulichActionPerformed(evt);
            }
        });

        tMotaTourDulich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMotaTourDulichActionPerformed(evt);
            }
        });

        jLabel38.setText("Gi?? ????? xu???t:");

        jLabel39.setText("?????a ??i???m:");

        jLabel40.setText("Tr???ng th??i tour:");

        jLabel41.setText("Ghi ch??:");

        tGiadexuatTourDulich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tGiadexuatTourDulichActionPerformed(evt);
            }
        });

        tGhichuTourDulich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tGhichuTourDulichActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tTentourTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tMatourTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tMotaTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tSongayTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tDiadiemTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addGap(40, 40, 40)
                                        .addComponent(tGiadexuatTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTourDulich4Them, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTourDulich4Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tGhichuTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel40)
                                        .addGap(18, 18, 18)
                                        .addComponent(tTrangthaitouTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTourDulich4Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTourDulich4Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTourDulich4Lammoi)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(tMatourTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(tGiadexuatTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnTourDulich4Them)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(tDiadiemTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(tTentourTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnTourDulich4Sua)))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(tTrangthaitouTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(tMotaTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTourDulich4Xoa))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnTourDulich4Tim)
                        .addGap(26, 26, 26)
                        .addComponent(btnTourDulich4Lammoi))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(tSongayTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(tGhichuTourDulich, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1324, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TourDulich", jPanel5);

        tabledangnhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "T??i kho???n", "M???t kh???u", "H??? v?? t??n", "S??? ??i???n tho???i", "Email"
            }
        ));
        jScrollPane1.setViewportView(tabledangnhap);

        btndangnhap5Them.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btndangnhap5Them.setText("L??u");
        btndangnhap5Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhap5ThemActionPerformed(evt);
            }
        });

        btndangnhap5Sua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btndangnhap5Sua.setText("S???a");
        btndangnhap5Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhap5SuaActionPerformed(evt);
            }
        });

        btndangnhap5Xoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btndangnhap5Xoa.setText("X??a");
        btndangnhap5Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhap5XoaActionPerformed(evt);
            }
        });

        btndangnhap5Tim.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btndangnhap5Tim.setText("T??m");
        btndangnhap5Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhap5TimActionPerformed(evt);
            }
        });

        btndangnhap5Lammoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btndangnhap5Lammoi.setText("L??m m???i");
        btndangnhap5Lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhap5LammoiActionPerformed(evt);
            }
        });

        jLabel1.setText("T??i kho???n:");

        jLabel2.setText("M???t kh???u:");

        jLabel3.setText("H??? v?? t??n:");

        jLabel4.setText("S??? ??i???n tho???i:");

        jLabel5.setText("Email:");

        tTkhoandangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTkhoandangnhapActionPerformed(evt);
            }
        });

        tMatkhaudangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMatkhaudangnhapActionPerformed(evt);
            }
        });

        tHovatendangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tHovatendangnhapActionPerformed(evt);
            }
        });

        tSdtdangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSdtdangnhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tMatkhaudangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tEmaildangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tTkhoandangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tHovatendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSdtdangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndangnhap5Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndangnhap5Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndangnhap5Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndangnhap5Them, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndangnhap5Lammoi))
                .addContainerGap(560, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tTkhoandangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndangnhap5Them))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tMatkhaudangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndangnhap5Sua))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tHovatendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndangnhap5Xoa))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tSdtdangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndangnhap5Tim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tEmaildangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndangnhap5Lammoi))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Th??ng tin t??i kho???n", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1329, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndangnhap5TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhap5TimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndangnhap5TimActionPerformed

    private void btndangnhap5XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhap5XoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndangnhap5XoaActionPerformed

    private void tSdtdangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSdtdangnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSdtdangnhapActionPerformed

    private void tHovatendangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tHovatendangnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tHovatendangnhapActionPerformed

    private void tTkhoandangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTkhoandangnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTkhoandangnhapActionPerformed

    private void tMatkhaudangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMatkhaudangnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMatkhaudangnhapActionPerformed

    private void btndangnhap5SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhap5SuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndangnhap5SuaActionPerformed

    private void btnTourDulich4SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTourDulich4SuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTourDulich4SuaActionPerformed

    private void btnTourDulich4XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTourDulich4XoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTourDulich4XoaActionPerformed

    private void btnTourDulich4TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTourDulich4TimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTourDulich4TimActionPerformed

    private void btnttTourbooking3SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttTourbooking3SuaActionPerformed
        // TODO add your handling code here:
        int selectTTourbooking = tableTTTourBooking.getSelectedRow();
        if (selectTTourbooking >= 0) {
            QlyTourBooking ttTourbooking = aclist3.get(selectTTourbooking);

            int option1 = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n s???a tour n??y?");
            //System.out.println("option" + option);
            if (option1 == 0) {

                String trangthaitour = Integer.toString(ttTourbooking.TrangThaiTour);
                String soluongngay = String.valueOf(ttTourbooking.SoLuongNgay);
                DecimalFormat decimalFormat = new DecimalFormat("#");
                String giatour = decimalFormat.format(ttTourbooking.GiaTour);
                tMaKHTourBooking.setText(ttTourbooking.MaKH);
                tMatourTourBooking.setText(ttTourbooking.Matour);
                tMaHDVTourBooking.setText(ttTourbooking.MaHDV);
                tNgaydiTourBooking.setText(ttTourbooking.NgayDi);
                tNgayveTourBooking.setText(ttTourbooking.NgayVe);
                tNgaydattourTourBooking.setText(ttTourbooking.NgayDatTour);
                tTrangthaitourTourBooking.setText(trangthaitour);
                tNgayThanhtoanTourBooking.setText(ttTourbooking.NgayThanhToan);
                tGiatourTourBooking.setText(giatour);
                tSoluongngayTourBooking.setText(soluongngay);
                tGhichuTourBooking.setText(ttTourbooking.GhiChu);

                flagCapnhatTourBooking = 1;
            }
        }
    }//GEN-LAST:event_btnttTourbooking3SuaActionPerformed

    private void btnttTourbooking3XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttTourbooking3XoaActionPerformed
        // TODO add your handling code here:
        int selectTTourbooking = tableTTTourBooking.getSelectedRow();
        if (selectTTourbooking >= 0) {
            QlyTourBooking ttkh = aclist3.get(selectTTourbooking);

            int option = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n x??a tour n??y?");
            //System.out.println("option" + option);
            if (option == 0) {
                QlyTourBookingModify.delete(ttkh.getIDQlyTour());
                showQlyTourBooking();
            }
        }
    }//GEN-LAST:event_btnttTourbooking3XoaActionPerformed

    private void btnttTourbooking3TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttTourbooking3TimActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Nh???p m?? tour mu???n t??m");
        if (input != null && input.length() > 0) {
            aclist3 = QlyTourBookingModify.find(input);

            tableModelTTtour.setRowCount(0);

            for (QlyTourBooking acc : aclist3) {
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
                String firstNumAsString = decimalFormat.format(acc.getGiaTour());

                tableModelTTtour.addRow(new Object[]{tableModelTTtour.getRowCount() + 1, acc.getMaKH(), acc.getMatour(), acc.getMaHDV(), acc.getNgayDi(), acc.getNgayVe(), acc.getNgayDatTour(), acc.getTrangThaiTour(), acc.getNgayThanhToan(), firstNumAsString, acc.getSoLuongNgay(), acc.getGhiChu()});

            }
        } else {

        }
    }//GEN-LAST:event_btnttTourbooking3TimActionPerformed

    private void btnttKhachhang1SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttKhachhang1SuaActionPerformed
        // TODO add your handling code here:
        int selectTTKH = tablettKhachhang.getSelectedRow();
        if (selectTTKH >= 0) {
            TTKhachHang ttkh = aclist4.get(selectTTKH);

            int option = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n s???a kh??ch h??ng n??y?");
            //System.out.println("option" + option);
            if (option == 0) {
                tMaKhTTKhachHang.setText(ttkh.MaKH);
                tTenKhTTKhachHang.setText(ttkh.TenKH);
                tSdtTTKhachHang.setText(ttkh.SdtKH);
                tEmailTTKhachHang.setText(ttkh.Email);
                tDiachiTTKhachHang.setText(ttkh.DiachiKH);
                tNgaySinhTTKhachHang.setText(ttkh.NgaySinh);
                flagCapnhatDN = 1;
            }
        }

    }//GEN-LAST:event_btnttKhachhang1SuaActionPerformed

    private void btnttKhachhang1XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttKhachhang1XoaActionPerformed
        // TODO add your handling code here:
        int selectTTKH = tablettKhachhang.getSelectedRow();
        if (selectTTKH >= 0) {
            TTKhachHang ttkh = aclist4.get(selectTTKH);

            int option = JOptionPane.showConfirmDialog(this, "B???n c?? mu??n x??a kh??ch h??ng n??y?");
            //System.out.println("option" + option);
            if (option == 0) {
                TTKhachHangModify.delete(ttkh.getMaKH());
                showTTKhachHang();
            }
        }

    }//GEN-LAST:event_btnttKhachhang1XoaActionPerformed

    private void btnttKhachhang1TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttKhachhang1TimActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Nh???p t??n kh??ch h??ng mu???n t??m");
        if (input != null && input.length() > 0) {
            aclist4 = TTKhachHangModify.find(input);

            tableModelTTKH.setRowCount(0);

            for (TTKhachHang acc : aclist4) {
                tableModelTTKH.addRow(new Object[]{acc.getMaKH(), acc.getTenKH(), acc.getSdtKH(), acc.getEmail(), acc.getDiachiKH(), acc.getNgaySinh()});
                System.out.println(acc.getTenKH());
            }
        } else {

        }
    }//GEN-LAST:event_btnttKhachhang1TimActionPerformed

    private void btnttNhanvien2TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttNhanvien2TimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnttNhanvien2TimActionPerformed

    private void btnttNhanvien2XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttNhanvien2XoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnttNhanvien2XoaActionPerformed

    private void btnttNhanvien2SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttNhanvien2SuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnttNhanvien2SuaActionPerformed

    private void tNgayveTourBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNgayveTourBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNgayveTourBookingActionPerformed

    private void tNgaydiTourBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNgaydiTourBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNgaydiTourBookingActionPerformed

    private void tSdtTTKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSdtTTKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSdtTTKhachHangActionPerformed

    private void btnttKhachhang1LammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttKhachhang1LammoiActionPerformed
        // TODO add your handling code here:
        tMaKhTTKhachHang.setText("");
        tTenKhTTKhachHang.setText("");
        tSdtTTKhachHang.setText("");
        tEmailTTKhachHang.setText("");
        tDiachiTTKhachHang.setText("");
        tNgaySinhTTKhachHang.setText("");
        flagCapnhatDN = 0;

        showTTKhachHang();
    }//GEN-LAST:event_btnttKhachhang1LammoiActionPerformed

    private void btnttNhanvien2LammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttNhanvien2LammoiActionPerformed
        // TODO add your handling code here:
        tMaHDVTTNhanvien.setText("");
        tTenTTNhanvien.setText("");
        tSdtTTNhanvien.setText("");
        tDiachiTTNhanvien.setText("");
        tSoCmndTTNhanvien.setText("");
        tNgaycapTTNhanvien.setText("");
        tNoicapTTNhanvien.setText("");
        tNgaysinhTTNhanvien.setText("");
        tGiayCNTTNhanvien.setText("");
        tNgayCapgiayCNTTNhanvien.setText("");
        tGhichuTTNhanvien.setText("");

        showQlyHDV();
    }//GEN-LAST:event_btnttNhanvien2LammoiActionPerformed

    private void btnttTourbooking3LammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttTourbooking3LammoiActionPerformed
        // TODO add your handling code here:
        tMaKHTourBooking.setText("");
        tMatourTourBooking.setText("");
        tMaHDVTourBooking.setText("");
        tNgaydiTourBooking.setText("");
        tNgayveTourBooking.setText("");
        tNgaydattourTourBooking.setText("");
        tTrangthaitourTourBooking.setText("");
        tNgayThanhtoanTourBooking.setText("");
        tGiatourTourBooking.setText("");
        tSoluongngayTourBooking.setText("");
        tGhichuTourBooking.setText("");
        flagCapnhatTourBooking = 0;

        showQlyTourBooking();
    }//GEN-LAST:event_btnttTourbooking3LammoiActionPerformed

    private void btnTourDulich4LammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTourDulich4LammoiActionPerformed
        // TODO add your handling code here:
        tMatourTourDulich.setText("");
        tTentourTourDulich.setText("");
        tMotaTourDulich.setText("");
        tSongayTourDulich.setText("");
        tGiadexuatTourDulich.setText("");
        tDiadiemTourDulich.setText("");
        tTrangthaitouTourDulich.setText("");
        tGhichuTourDulich.setText("");

        showTourDulich();
    }//GEN-LAST:event_btnTourDulich4LammoiActionPerformed

    private void btndangnhap5LammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhap5LammoiActionPerformed
        // TODO add your handling code here:
        tTkhoandangnhap.setText("");
        tMatkhaudangnhap.setText("");
        tHovatendangnhap.setText("");
        tSdtdangnhap.setText("");
        tEmaildangnhap.setText("");

        showAccount();
    }//GEN-LAST:event_btndangnhap5LammoiActionPerformed

    private void tGiadexuatTourDulichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tGiadexuatTourDulichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tGiadexuatTourDulichActionPerformed

    private void tMotaTourDulichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMotaTourDulichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMotaTourDulichActionPerformed

    private void tGhichuTourDulichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tGhichuTourDulichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tGhichuTourDulichActionPerformed

    private void tTentourTourDulichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTentourTourDulichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTentourTourDulichActionPerformed

    private void btnttKhachhang1ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttKhachhang1ThemActionPerformed
        // TODO add your handling code here:

        String makh = tMaKhTTKhachHang.getText();
        String tenkh = tTenKhTTKhachHang.getText();
        String sdtkh = tSdtTTKhachHang.getText();
        String email = tEmailTTKhachHang.getText();
        String diachi = tDiachiTTKhachHang.getText();
        String ngaysinh = tNgaySinhTTKhachHang.getText();

        TTKhachHang ttkh = new TTKhachHang(makh, tenkh, sdtkh, email, diachi, ngaysinh, flagCapnhatDN);
        int flagCheckLoi = 0;
        if (makh.equals("") || tenkh.equals("") || sdtkh.equals("") || email.equals("") || diachi.equals("") || ngaysinh.equals("")) {
            JOptionPane.showMessageDialog(this, "Th??m kh??ng th??nh c??ng.\nH??y nh???p ?????y ????? th??ng tin.");
        }
        String emailcheck = tEmailTTKhachHang.getText();
        EmailCheck validator = new EmailCheck();
        if (validator.validate(emailcheck)) {
            //System.out.println("Email h???p l???");
            flagCheckLoi = 0;
        } else {
            JOptionPane.showMessageDialog(this, "Email kh??ng h???p l???.");
            flagCheckLoi = 1;
        }

        if (!StringUtils.isNumeric(sdtkh)) {
            JOptionPane.showMessageDialog(this, "S??? ??i???n tho???i ch??? bao g???m ch??? s??? t??? 0-9.");
            flagCheckLoi = 1;
        }

        if (flagCheckLoi == 0) {
            try {
                TTKhachHangModify.insert(ttkh);
            } catch (ParseException ex) {
                Logger.getLogger(QLHT.class.getName()).log(Level.SEVERE, null, ex);
            }
            showTTKhachHang();
            JOptionPane.showMessageDialog(this, "L??u th??nh c??ng");
            tMaKhTTKhachHang.setText("");
            tTenKhTTKhachHang.setText("");
            tSdtTTKhachHang.setText("");
            tEmailTTKhachHang.setText("");
            tDiachiTTKhachHang.setText("");
            tNgaySinhTTKhachHang.setText("");
            flagCapnhatDN = 0;
        }
    }//GEN-LAST:event_btnttKhachhang1ThemActionPerformed

    private void btnttNhanvien2ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttNhanvien2ThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnttNhanvien2ThemActionPerformed

    private void btnTourDulich4ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTourDulich4ThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTourDulich4ThemActionPerformed

    private void btndangnhap5ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhap5ThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndangnhap5ThemActionPerformed

    private void btnttTourbooking3ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnttTourbooking3ThemActionPerformed

        String makh = tMaKHTourBooking.getText();
        String matour = tMatourTourBooking.getText();
        String mahdv = tMaHDVTourBooking.getText();
        String ngaydi = tNgaydiTourBooking.getText();
        String ngayve = tNgayveTourBooking.getText();
        String ngaydattuor = tNgaydattourTourBooking.getText();

        //int trangthaitour = Integer.parseInt(tTrangthaitourTourBooking.getText());
        String ngaythanhtoan = tNgayThanhtoanTourBooking.getText();

        int trangthaitour = 0;
        float giatour = 0;
        int soluongngay = 1;

        //  System.out.print("tt fuck" + tTrangthaitourTourBooking.getText());
        if (tTrangthaitourTourBooking.getText() != null && tTrangthaitourTourBooking.getText().length() > 0) {
            try {
                trangthaitour = Integer.parseInt(tTrangthaitourTourBooking.getText());
            } catch (Exception e) {

                System.out.print("NO DATA tTrangthaitourTourBooking");
            }
        }

        if (tGiatourTourBooking.getText() != null && tGiatourTourBooking.getText().length() > 0) {
            try {
                giatour = Float.parseFloat(tGiatourTourBooking.getText());
            } catch (Exception e) {

                System.out.print("NO DATA tGiatourTourBooking");
            }
        }

        if (tSoluongngayTourBooking.getText() != null && tSoluongngayTourBooking.getText().length() > 0) {
            try {
                soluongngay = Integer.parseInt(tSoluongngayTourBooking.getText());
            } catch (Exception e) {

                System.out.print("NO DATA tSoluongngayTourBooking");
            }
        }

        String ghichu = tGhichuTourBooking.getText();

        QlyTourBooking Qlytourbooking = new QlyTourBooking(makh, matour, mahdv, ngaydi, ngayve, ngaydattuor, trangthaitour, ngaythanhtoan, giatour, soluongngay, ghichu, flagCapnhatTourBooking);
        int flagCheckLoi = 0;
        if (makh.equals("") || matour.equals("") || mahdv.equals("") || ngaydi.equals("") || ngayve.equals("") || ngaydattuor.equals("") || tTrangthaitourTourBooking.getText().equals("") || ngaythanhtoan.equals("") || tGiatourTourBooking.getText().equals("") || tSoluongngayTourBooking.getText().equals("") || ghichu.equals("")) {
            JOptionPane.showMessageDialog(this, "L??u kh??ng th??nh c??ng.\nH??y nh???p ?????y ????? th??ng tin.");
        }

        if (!StringUtils.isNumeric(tTrangthaitourTourBooking.getText())) {
            JOptionPane.showMessageDialog(this, "Tr???ng th??i tour ch??? ???????c nh???p b???ng s??? (1-0).");
            flagCheckLoi = 1;
        }
        if (!StringUtils.isNumeric(tGiatourTourBooking.getText())) {
            JOptionPane.showMessageDialog(this, "Gi?? tour ch??? nh???p ???????c b???ng s???.");
            flagCheckLoi = 1;
        }

        if (!StringUtils.isNumeric(tSoluongngayTourBooking.getText())) {
            JOptionPane.showMessageDialog(this, "S??? l?????ng ng??y ch??? ???????c nh???p b???ng s???.");
            flagCheckLoi = 1;
        }

        if (flagCheckLoi == 0) {
            QlyTourBookingModify.insert(Qlytourbooking);
            showQlyTourBooking();
            JOptionPane.showMessageDialog(this, "L??u th??nh c??ng");
            tMaKHTourBooking.setText("");
            tMatourTourBooking.setText("");
            tMaHDVTourBooking.setText("");
            tNgaydiTourBooking.setText("");
            tNgayveTourBooking.setText("");
            tNgaydattourTourBooking.setText("");
            tTrangthaitourTourBooking.setText("");
            tNgayThanhtoanTourBooking.setText("");
            tGiatourTourBooking.setText("");
            tSoluongngayTourBooking.setText("");
            tGhichuTourBooking.setText("");

            flagCapnhatTourBooking = 0;
        }
    }//GEN-LAST:event_btnttTourbooking3ThemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("src\\out_file\\HelloWorld.pdf"));
            document.open();
            PdfPTable table = new PdfPTable(6);
            PdfPTable table2 = new PdfPTable(7);

//            PdfPCell header1 = new PdfPCell(new Paragraph("ID"));
//            PdfPCell header2 = new PdfPCell(new Paragraph("Ma Khach Hang"));
//            PdfPCell header3 = new PdfPCell(new Paragraph("Ma Tour"));
//            PdfPCell header4 = new PdfPCell(new Paragraph("Ma HDV"));
//            PdfPCell header5 = new PdfPCell(new Paragraph("Ngay Di"));
//            PdfPCell header6 = new PdfPCell(new Paragraph("Ngay Ve"));
//
//            table.addCell(header1);
//            table.addCell(header2);
//            table.addCell(header3);
//            table.addCell(header4);
//            table.addCell(header5);
//            table.addCell(header6);
            table.addCell(new Paragraph("ID"));
            table.addCell(new Paragraph("Ma Khach Hang"));
            table.addCell(new Paragraph("Ma Tour"));
            table.addCell(new Paragraph("Ma HDV"));
            table.addCell(new Paragraph("Ngay Di"));
            table.addCell(new Paragraph("Ngay Ve"));

            table2.addCell(new Paragraph("ID"));
            table2.addCell(new Paragraph("Ngay dat tour"));
            table2.addCell(new Paragraph("Trang thai tour"));
            table2.addCell(new Paragraph("Ngay thanh toan"));
            table2.addCell(new Paragraph("Gia tour"));
            table2.addCell(new Paragraph("So luong ngay"));
            table2.addCell(new Paragraph("Ghi chu"));

            for (QlyTourBooking acc : aclist3) {
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
                String giatour = decimalFormat.format(acc.getGiaTour()) + "VND";

//                float amount = acc.getGiaTour();
//                Locale locale = new Locale("vi", "VN");
//                NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
//                String priceStr = currencyFormatter.format(amount);
//                   
//                System.out.println(priceStr );
//
//                String s = Float.toString(amount);
                table.addCell(String.valueOf(acc.getIDQlyTour()));
                table.addCell(acc.getMaKH());
                table.addCell(acc.getMatour());
                table.addCell(acc.getMaHDV());
                table.addCell(acc.getNgayDi());
                table.addCell(acc.getNgayVe());

                table2.addCell(String.valueOf(acc.getIDQlyTour()));
                table2.addCell(acc.getNgayDatTour());
                table2.addCell(String.valueOf(acc.getTrangThaiTour()));
                table2.addCell(acc.getNgayThanhToan());
                table2.addCell(giatour);
                table2.addCell(String.valueOf(acc.getSoLuongNgay()));
                table2.addCell(acc.getGhiChu());

            }

            document.add(table);
            document.add(new Paragraph(" "));
            JOptionPane.showMessageDialog(this, "???? xu???t file");
            document.add(table2);
            document.close();
        } catch (DocumentException | FileNotFoundException ex) {
            Logger.getLogger(QLHT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(QLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLHT ql = new QLHT();
                ql.setLocationRelativeTo(null);
                ql.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTourDulich4Lammoi;
    private javax.swing.JButton btnTourDulich4Sua;
    private javax.swing.JButton btnTourDulich4Them;
    private javax.swing.JButton btnTourDulich4Tim;
    private javax.swing.JButton btnTourDulich4Xoa;
    private javax.swing.JButton btndangnhap5Lammoi;
    private javax.swing.JButton btndangnhap5Sua;
    private javax.swing.JButton btndangnhap5Them;
    private javax.swing.JButton btndangnhap5Tim;
    private javax.swing.JButton btndangnhap5Xoa;
    private javax.swing.JButton btnttKhachhang1Lammoi;
    private javax.swing.JButton btnttKhachhang1Sua;
    private javax.swing.JButton btnttKhachhang1Them;
    private javax.swing.JButton btnttKhachhang1Tim;
    private javax.swing.JButton btnttKhachhang1Xoa;
    private javax.swing.JButton btnttNhanvien2Lammoi;
    private javax.swing.JButton btnttNhanvien2Sua;
    private javax.swing.JButton btnttNhanvien2Them;
    private javax.swing.JButton btnttNhanvien2Tim;
    private javax.swing.JButton btnttNhanvien2Xoa;
    private javax.swing.JButton btnttTourbooking3Lammoi;
    private javax.swing.JButton btnttTourbooking3Sua;
    private javax.swing.JButton btnttTourbooking3Them;
    private javax.swing.JButton btnttTourbooking3Tim;
    private javax.swing.JButton btnttTourbooking3Xoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField tDiachiTTKhachHang;
    private javax.swing.JTextField tDiachiTTNhanvien;
    private javax.swing.JTextField tDiadiemTourDulich;
    private javax.swing.JTextField tEmailTTKhachHang;
    private javax.swing.JTextField tEmaildangnhap;
    private javax.swing.JTextField tGhichuTTNhanvien;
    private javax.swing.JTextField tGhichuTourBooking;
    private javax.swing.JTextField tGhichuTourDulich;
    private javax.swing.JTextField tGiadexuatTourDulich;
    private javax.swing.JTextField tGiatourTourBooking;
    private javax.swing.JTextField tGiayCNTTNhanvien;
    private javax.swing.JTextField tHovatendangnhap;
    private javax.swing.JTextField tMaHDVTTNhanvien;
    private javax.swing.JTextField tMaHDVTourBooking;
    private javax.swing.JTextField tMaKHTourBooking;
    private javax.swing.JTextField tMaKhTTKhachHang;
    private javax.swing.JTextField tMatkhaudangnhap;
    private javax.swing.JTextField tMatourTourBooking;
    private javax.swing.JTextField tMatourTourDulich;
    private javax.swing.JTextField tMotaTourDulich;
    private javax.swing.JTextField tNgayCapgiayCNTTNhanvien;
    private javax.swing.JTextField tNgaySinhTTKhachHang;
    private javax.swing.JTextField tNgayThanhtoanTourBooking;
    private javax.swing.JTextField tNgaycapTTNhanvien;
    private javax.swing.JTextField tNgaydattourTourBooking;
    private javax.swing.JTextField tNgaydiTourBooking;
    private javax.swing.JTextField tNgaysinhTTNhanvien;
    private javax.swing.JTextField tNgayveTourBooking;
    private javax.swing.JTextField tNoicapTTNhanvien;
    private javax.swing.JTextField tSdtTTKhachHang;
    private javax.swing.JTextField tSdtTTNhanvien;
    private javax.swing.JTextField tSdtdangnhap;
    private javax.swing.JTextField tSoCmndTTNhanvien;
    private javax.swing.JTextField tSoluongngayTourBooking;
    private javax.swing.JTextField tSongayTourDulich;
    private javax.swing.JTextField tTenKhTTKhachHang;
    private javax.swing.JTextField tTenTTNhanvien;
    private javax.swing.JTextField tTentourTourDulich;
    private javax.swing.JTextField tTkhoandangnhap;
    private javax.swing.JTextField tTrangthaitouTourDulich;
    private javax.swing.JTextField tTrangthaitourTourBooking;
    private javax.swing.JTable tableTTTourBooking;
    private javax.swing.JTable tableTTnhanvien;
    private javax.swing.JTable tableTourdulich;
    private javax.swing.JTable tabledangnhap;
    private javax.swing.JTable tablettKhachhang;
    // End of variables declaration//GEN-END:variables
}
