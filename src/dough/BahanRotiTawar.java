/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dough;
import harga.HargaBahan;
/**
 *
 * @author lenovo
 */
public class BahanRotiTawar extends HargaBahan implements BahanUtama {
    
    public int tepungTerigu(){
        return 1000;
    }
    
    public int gulaPasir(){
        return 125;
    }
    
    public int butter(){
        return 100;
    }

    public int ragi(){
        return 20;
    }

    public int susuBubuk(){
        return 250;
    }

    public int susuCair(){
        return 200;
    }

    public int telur(){
        return 70;
    }

    public int esBatu(){
        return 300;
    }
    
    @Override
    public int hitungBahan(){
        int total = this.tepungTerigu() + this.gulaPasir() + this.butter() + this.esBatu() + this.ragi() + this.susuBubuk() + this.susuCair() + this.telur();
        return total;
    }
}
