/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NhanVien {
    private String iD;
    private String hoTen;
    private String sDT;
    private String passwords;
    private String eMail;
    private String diaChi;
    Scanner sc = new Scanner (System.in);
  
    public NhanVien(String iD, String hoTen, String sDT,String passwords, String eMail,String diaChi) {
        this.iD = iD;
        this.hoTen = hoTen;
        this.sDT = sDT;
        this.passwords=passwords;
        this.eMail = eMail;
        this.diaChi= diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public NhanVien() {
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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
    public void nhapTT(){
      
    }
    public void inTT(){
        System.out.printf("|%6s|%18s|%13s|%22s|%10s|\n",getiD(),getHoTen(),getsDT(),geteMail(),getDiaChi());
        System.out.println("+------+------------------+-------------+----------------------+----------+");
        
    }
    public Object[] toObject(){
        return new Object[]{
            this.getiD(),this.getHoTen(),this.getsDT(),this.getPasswords(),this.geteMail(),this.getDiaChi()
        };
        }

    public void setiD(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

