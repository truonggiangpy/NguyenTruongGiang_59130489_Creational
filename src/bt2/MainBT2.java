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
public class MainBT2 {
        public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder("Giang")
        .addFloat(33.2f).addbool(false);
        System.out.println(builder.toString());
    }
}
