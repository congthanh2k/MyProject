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
public class TourDulich {

    String Matour, TenTour, MoTa;
    int SoNgay;
    Float GiaDeXuat;
    String Diadiem;
    int TrangThaiTour;
    String Ghichu;

    public TourDulich(String Matour, String TenTour, String MoTa, int SoNgay, Float GiaDeXuat, String Diadiem, int TrangThaiTour, String Ghichu) {
        this.Matour = Matour;
        this.TenTour = TenTour;
        this.MoTa = MoTa;
        this.SoNgay = SoNgay;
        this.GiaDeXuat = GiaDeXuat;
        this.Diadiem = Diadiem;
        this.TrangThaiTour = TrangThaiTour;
        this.Ghichu = Ghichu;
    }

    public TourDulich() {
    }

    public String getMatour() {
        return Matour;
    }

    public void setMatour(String Matour) {
        this.Matour = Matour;
    }

    public String getTenTour() {
        return TenTour;
    }

    public void setTenTour(String TenTour) {
        this.TenTour = TenTour;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getSoNgay() {
        return SoNgay;
    }

    public void setSoNgay(int SoNgay) {
        this.SoNgay = SoNgay;
    }

    public Float getGiaDeXuat() {
        return GiaDeXuat;
    }

    public void setGiaDeXuat(Float GiaDeXuat) {
        this.GiaDeXuat = GiaDeXuat;
    }

    public String getDiadiem() {
        return Diadiem;
    }

    public void setDiadiem(String Diadiem) {
        this.Diadiem = Diadiem;
    }

    public int getTrangThaiTour() {
        return TrangThaiTour;
    }

    public void setTrangThaiTour(int TrangThaiTour) {
        this.TrangThaiTour = TrangThaiTour;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }

}
