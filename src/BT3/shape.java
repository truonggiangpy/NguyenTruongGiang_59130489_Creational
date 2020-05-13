/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Giang Tien Ty
 */
public abstract class shape {
    
    private String brush;
    private String paper;
    private String frame;

    protected shape(){}

    protected shape(String brush, String frame, String paper){
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
     public String getBrush(){
         return brush;
     }
     public void setBrush(String brush){
         this.brush = brush;
     }
     public String getPaper(){
        return  paper;
    }
    public void setPaper(String paper){
        this.paper = paper;
    }
    public String getFrame(){
        return frame;
    }
    public void setFrame(String frame){
        this.frame = frame;
    }
    public abstract String draw();
}

