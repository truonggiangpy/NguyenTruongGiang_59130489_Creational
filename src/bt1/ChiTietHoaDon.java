/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Giang Tien Ty
 */
public class ChiTietHoaDon {
    String sanPham;
    int soLuong;
    double donGia;
    int chietKhau;

    public ChiTietHoaDon(String sP, int sL, double donGia, int chietKhau){
        this.sanPham = sP;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.soLuong = sL;
    }

    @Override
    public String toString(){
        return "Chi tiết sản phẩm " + "\n" 
                + "San pham: " + sanPham + "\t" + "So luong: "+ soLuong + "\t" + "Don gia: " + donGia + "\t" + "Chiet khau: " + chietKhau + "\t";
    }
}
