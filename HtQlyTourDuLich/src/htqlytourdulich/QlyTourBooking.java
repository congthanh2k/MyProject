/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htqlytourdulich;

/**
 *
 * @author Thanh
 */
public class QlyTourBooking {

    int IDQlyTour;
    String MaKH, Matour, MaHDV, NgayDi, NgayVe, NgayDatTour;
    int TrangThaiTour;
    String NgayThanhToan;
    Float GiaTour;
    int SoLuongNgay;
    String GhiChu;
    int flagCapnhatTourBooking = 0;

    public QlyTourBooking(int IDQlyTour, String MaKH, String Matour, String MaHDV, String NgayDi, String NgayVe, String NgayDatTour, int TrangThaiTour, String NgayThanhToan, Float GiaTour, int SoLuongNgay, String GhiChu, int flagCapnhatTourBooking) {
        this.IDQlyTour = IDQlyTour;
        this.MaKH = MaKH;
        this.Matour = Matour;
        this.MaHDV = MaHDV;
        this.NgayDi = NgayDi;
        this.NgayVe = NgayVe;
        this.NgayDatTour = NgayDatTour;
        this.TrangThaiTour = TrangThaiTour;
        this.NgayThanhToan = NgayThanhToan;
        this.GiaTour = GiaTour;
        this.SoLuongNgay = SoLuongNgay;
        this.GhiChu = GhiChu;
        this.flagCapnhatTourBooking = flagCapnhatTourBooking;
    }

    public QlyTourBooking() {
    }

    public QlyTourBooking(String MaKH, String Matour, String MaHDV, String NgayDi, String NgayVe, String NgayDatTour, int TrangThaiTour, String NgayThanhToan, Float GiaTour, int SoLuongNgay, String GhiChu, int flagCapnhatTourBooking) {
        this.MaKH = MaKH;
        this.Matour = Matour;
        this.MaHDV = MaHDV;
        this.NgayDi = NgayDi;
        this.NgayVe = NgayVe;
        this.NgayDatTour = NgayDatTour;
        this.TrangThaiTour = TrangThaiTour;
        this.NgayThanhToan = NgayThanhToan;
        this.GiaTour = GiaTour;
        this.SoLuongNgay = SoLuongNgay;
        this.GhiChu = GhiChu;
        this.flagCapnhatTourBooking = flagCapnhatTourBooking;
    }

    public int getIDQlyTour() {
        return IDQlyTour;
    }

    public void setIDQlyTour(int IDQlyTour) {
        this.IDQlyTour = IDQlyTour;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMatour() {
        return Matour;
    }

    public void setMatour(String Matour) {
        this.Matour = Matour;
    }

    public String getMaHDV() {
        return MaHDV;
    }

    public void setMaHDV(String MaHDV) {
        this.MaHDV = MaHDV;
    }

    public String getNgayDi() {
        return NgayDi;
    }

    public void setNgayDi(String NgayDi) {
        this.NgayDi = NgayDi;
    }

    public String getNgayVe() {
        return NgayVe;
    }

    public void setNgayVe(String NgayVe) {
        this.NgayVe = NgayVe;
    }

    public String getNgayDatTour() {
        return NgayDatTour;
    }

    public void setNgayDatTour(String NgayDatTour) {
        this.NgayDatTour = NgayDatTour;
    }

    public int getTrangThaiTour() {
        return TrangThaiTour;
    }

    public void setTrangThaiTour(int TrangThaiTour) {
        this.TrangThaiTour = TrangThaiTour;
    }

    public String getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(String NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public Float getGiaTour() {
        return GiaTour;
    }

    public void setGiaTour(Float GiaTour) {
        this.GiaTour = GiaTour;
    }

    public int getSoLuongNgay() {
        return SoLuongNgay;
    }

    public void setSoLuongNgay(int SoLuongNgay) {
        this.SoLuongNgay = SoLuongNgay;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getflagCapnhatTourBooking() {
        return flagCapnhatTourBooking;
    }

    public void setflagCapnhatTourBooking(int GhiChu) {
        this.flagCapnhatTourBooking = flagCapnhatTourBooking;
    }

}
