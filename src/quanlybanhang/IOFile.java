/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybanhang;

import Object.KhachHang;
import Object.NhanVien;
import Object.SanPham;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class IOFile {
     public void ghiNV(ArrayList <NhanVien> listNV){
        try (PrintWriter pw = new PrintWriter(new File("NV.TXT"))){
            for(NhanVien nv: listNV){
                pw.println(nv.getiD());
                pw.println(nv.getHoTen());
                pw.println(nv.getsDT());
                pw.println(nv.getPasswords());
                pw.println(nv.geteMail());
                pw.println(nv.getDiaChi());
             


                
            }
        } catch (Exception e) {
            System.err.println("Eror!");
        }
    }
    
    public ArrayList docNV(){
        ArrayList<NhanVien> listNV = new ArrayList<>();
        try(Scanner sc = new Scanner(new File("NV.TXT"))) {
            while(sc.hasNext()){
                NhanVien nv = new NhanVien();
                nv.setiD(sc.nextLine());
                nv.setHoTen(sc.nextLine());
                nv.setsDT(sc.nextLine());
                nv.setPasswords(sc.nextLine());
                nv.seteMail(sc.nextLine());
                nv.setDiaChi(sc.nextLine());

                
                listNV.add(nv);
            }
        } catch (Exception e) {
            System.err.println("Eror!");
        }
        return listNV;
    }
        
        
         public void ghiSP(ArrayList <SanPham> listSP){
        try (PrintWriter pw = new PrintWriter(new File("SP.TXT"))){
            for(SanPham sp: listSP){
                pw.println(sp.getMaSP());
                pw.println(sp.getTenSP());
                pw.println(sp.getSoLuong());
                pw.println(sp.getDonGia());
               
             


                
            }
        } catch (Exception e) {
            System.err.println("Eror!");
        }
    }
    
    public ArrayList docSP(){
        ArrayList<SanPham> listSP = new ArrayList<>();
        try(Scanner sc = new Scanner(new File("SP.TXT"))) {
            while(sc.hasNext()){
                SanPham sp = new SanPham();
                sp.setMaSP(sc.nextLine());
                sp.setTenSP(sc.nextLine());
                sp.setSoLuong(Integer.parseInt(sc.nextLine()) );
                sp.setDonGia(Integer.parseInt(sc.nextLine()));
                

                
                listSP.add(sp);
            }
        } catch (Exception e) {
            System.err.println("Eror!");
        }
        return listSP;
    }
    
    
    
      public void ghiKH(ArrayList <KhachHang> listKH){
        try (PrintWriter pw = new PrintWriter(new File("KH.TXT"))){
            for(KhachHang kh: listKH){
                pw.println(kh.getMaKH());
                pw.println(kh.getHoTen());
                pw.println(kh.getsDT());
                pw.println(kh.geteMail());
                pw.println(kh.getDiaChi());
               
             


                
            }
        } catch (Exception e) {
            System.err.println("Eror!");
        }
    }
    
    public ArrayList docKH(){
        ArrayList<KhachHang> listKH = new ArrayList<>();
        try(Scanner sc = new Scanner(new File("KH.TXT"))) {
            while(sc.hasNext()){
                KhachHang kh = new KhachHang();
                kh.setMaKH(sc.nextLine());
                kh.setHoTen(sc.nextLine());
                kh.setsDT(sc.nextLine());
                kh.seteMail(sc.nextLine());
                kh.setDiaChi(sc.nextLine());

                

                
                listKH.add(kh);
            }
        } catch (Exception e) {
            System.err.println("Eror!");
        }
        return listKH;
    }
        
        
    }

