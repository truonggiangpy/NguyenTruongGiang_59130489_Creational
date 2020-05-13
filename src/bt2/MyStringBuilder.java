/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Giang Tien Ty
 */
public class MyStringBuilder {
        String chuoi;
    public MyStringBuilder(String string){
        this.chuoi = string;    
    }
    public MyStringBuilder addString(String string){
        chuoi += string;
        return this;
    }
    public MyStringBuilder addFloat(float fl){
        chuoi += fl;
        return this;
    }
    public MyStringBuilder addbool(boolean bl){
        chuoi += bl;
        return this;
    }

    @Override
    public String toString() {
        return chuoi; //To change body of generated methods, choose Tools | Templates.
    }

}
