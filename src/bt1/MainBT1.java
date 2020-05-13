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
public class MainBT1 {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
 HoaDon hoadon = new HoaDon.Builder().setHeader( new HoaDonHeader("3819233", "28/03/1999", "NGuyen Truong Giang"))
        .addDSHD( new ChiTietHoaDon("Banh mi", 10, 33000, 5))
        .build();
        System.out.println(hoadon.toString());
    }
}
