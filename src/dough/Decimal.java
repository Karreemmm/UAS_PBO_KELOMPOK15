/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dough;
import java.text.DecimalFormat;
public class Decimal {
    DecimalFormat df = new DecimalFormat("#");
    
    public void berat(double x){
        
        if (x >= 1000){
            double hasil = x / 1000;
            System.out.println(df.format(hasil) + " kilogram");
        }else{
            System.out.println(df.format(x) + " gram");
        }
    }
}