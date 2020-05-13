/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author Giang Tien Ty
 */
public class HoaDon {
    HoaDonHeader header;
    ArrayList<ChiTietHoaDon> ds;

    protected HoaDon(Builder builder){
        this.header = builder.header;
        this.ds = builder.ds;
    }
    @Override
    public String toString(){
        String str = header.toString();
        for(int i=0;i<ds.size();i++){
            str += ds.get(i).toString();
        }
        return str;
    }
    public static class Builder{
        HoaDonHeader header;
        ArrayList<ChiTietHoaDon> ds;
        public Builder(){
            this.ds = new ArrayList<>();
        }
        public Builder setHeader(HoaDonHeader header){
            this.header = header;
            return this;
        }
        public Builder addDSHD(ChiTietHoaDon ct){
            this.ds.add(ct);
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
