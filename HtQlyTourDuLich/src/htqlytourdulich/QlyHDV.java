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
public class QlyHDV {

    String MaHDV, TenHDV, SdtHDV, DiachiHDV;
    int SoCmndHDV;
    String NgayCap, NoiCap, NgaySinh, MagiaychungnhanHDV, NgaycapgiaychungnhanHDV, GhiChu;

    public QlyHDV(String MaHDV, String TenHDV, String SdtHDV, String DiachiHDV, int SoCmndHDV, String NgayCap, String NoiCap, String NgaySinh, String MagiaychungnhanHDV, String NgaycapgiaychungnhanHDV, String GhiChu) {
        this.MaHDV = MaHDV;
        this.TenHDV = TenHDV;
        this.SdtHDV = SdtHDV;
        this.DiachiHDV = DiachiHDV;
        this.SoCmndHDV = SoCmndHDV;
        this.NgayCap = NgayCap;
        this.NoiCap = NoiCap;
        this.NgaySinh = NgaySinh;
        this.MagiaychungnhanHDV = MagiaychungnhanHDV;
        this.NgaycapgiaychungnhanHDV = NgaycapgiaychungnhanHDV;
        this.GhiChu = GhiChu;
    }

    public QlyHDV() {
    }

    public String getMaHDV() {
        return MaHDV;
    }

    public void setMaHDV(String MaHDV) {
        this.MaHDV = MaHDV;
    }

    public String getTenHDV() {
        return TenHDV;
    }

    public void setTenHDV(String TenHDV) {
        this.TenHDV = TenHDV;
    }

    public String getSdtHDV() {
        return SdtHDV;
    }

    public void setSdtHDV(String SdtHDV) {
        this.SdtHDV = SdtHDV;
    }

    public String getDiachiHDV() {
        return DiachiHDV;
    }

    public void setDiachiHDV(String DiachiHDV) {
        this.DiachiHDV = DiachiHDV;
    }

    public int getSoCmndHDV() {
        return SoCmndHDV;
    }

    public void setSoCmndHDV(int SoCmndHDV) {
        this.SoCmndHDV = SoCmndHDV;
    }

    public String getNgayCap() {
        return NgayCap;
    }

    public void setNgayCap(String NgayCap) {
        this.NgayCap = NgayCap;
    }

    public String getNoiCap() {
        return NoiCap;
    }

    public void setNoiCap(String NoiCap) {
        this.NoiCap = NoiCap;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getMagiaychungnhanHDV() {
        return MagiaychungnhanHDV;
    }

    public void setMagiaychungnhanHDV(String MagiaychungnhanHDV) {
        this.MagiaychungnhanHDV = MagiaychungnhanHDV;
    }

    public String getNgaycapgiaychungnhanHDV() {
        return NgaycapgiaychungnhanHDV;
    }

    public void setNgaycapgiaychungnhanHDV(String NgaycapgiaychungnhanHDV) {
        this.NgaycapgiaychungnhanHDV = NgaycapgiaychungnhanHDV;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

}
