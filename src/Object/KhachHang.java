/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author admin
 */
public class KhachHang {
     private String maKH;
    private String hoTen;
    private String sDT;
    private String eMail;
    private String diaChi;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, String sDT, String eMail, String diaChi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.sDT = sDT;
        this.eMail = eMail;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoten) {
        this.hoTen = hoten;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
     public Object[] toObject(){
        return new Object[]{
            this.getMaKH(),this.getHoTen(),this.getsDT(),this.geteMail(),this.getDiaChi()
        };
        }

    public void setMaKH(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
