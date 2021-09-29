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
public class TTKhachHang {

    String MaKH, TenKH, SdtKH, Email, DiachiKH, NgaySinh;
    int flagCapnhatDN;

    public TTKhachHang(String MaKH, String TenKH, String SdtKH, String Email, String DiachiKH, String NgaySinh, int flagCapnhatDN) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.SdtKH = SdtKH;
        this.Email = Email;
        this.DiachiKH = DiachiKH;
        this.NgaySinh = NgaySinh;
        this.flagCapnhatDN = flagCapnhatDN;
    }

    public TTKhachHang() {
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getSdtKH() {
        return SdtKH;
    }

    public void setSdtKH(String SdtKH) {
        this.SdtKH = SdtKH;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiachiKH() {
        return DiachiKH;
    }

    public void setDiachiKH(String DiachiKH) {
        this.DiachiKH = DiachiKH;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public int getflagCapnhatDN() {
        return flagCapnhatDN;
    }

    public void setflagCapnhatDN(int flagCapnhatDN) {
        this.flagCapnhatDN = flagCapnhatDN;
    }
}
