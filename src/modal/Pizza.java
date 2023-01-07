/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;
import dough.BahanPizza;
/**
 *
 * @author lenovo
 */
public class Pizza extends BahanPizza implements Modal  {
       //  HITUNG MODAL PIZZA
    
    @Override
    public double hitungModal(){
        double modal = this.tepungTerigu() * this.hargaTepung() + this.gulaPasir() * this.hargaGulaPasir() + this.butter() * this.hargaButter() + this.esBatu() * this.hargaEsBatu() + this.ragi() * this.hargaRagi() + (this.susuBubuk() * this.hargaSusuBubuk()) + (this.susuCair() * this.hargaSusuCair()) + (this.telur() * this.hargaTelur());
        return modal;
    }
    
    @Override
    public int beratDough(){
        return 190;
    }
    
    @Override
    public double rotiTiapDough(){
        return this.hitungBahan() / this.beratDough();
    }

     //  HITUNG BANYAKNYA TIAP BAHAN UNTUK PIZZA 
    
    public int pesanan;
 
    @Override
    public double hitungTerigu(){
        double hitung = this.tepungTerigu() / this.rotiTiapDough() * pesanan;
        return hitung;
    }

    @Override
    public double hitungGula() {
        double hitung = this.gulaPasir() / this.rotiTiapDough() * pesanan;
        return hitung;
    }

    @Override
    public double hitungButter() {
        double hitung = this.butter()/ this.rotiTiapDough() * pesanan;
        return hitung;
    }

    @Override
    public double hitungRagi() {
        double hitung = this.ragi() / this.rotiTiapDough() * pesanan;
        return hitung;
    }

    @Override
    public double hitungSusuBubuk() {
        double hitung = this.susuBubuk() / this.rotiTiapDough() * pesanan;
        return hitung;
    }
    
    @Override
    public double hitungSusuCair() {
        double hitung = this.susuCair() / this.rotiTiapDough() * pesanan;
        return hitung;
    }

    @Override
    public double hitungTelur() {
        double hitung = this.telur() / this.rotiTiapDough() * pesanan;
        return hitung;
    }

    @Override
    public double hitungEs() {
        double hitung = this.esBatu() / this.rotiTiapDough() * pesanan;
        return hitung;
    }
    
    public double hitungKeju(){
        double keju = 30 * pesanan;
        return keju;
    }
    
    public double hitungBeef(){
        double beef = 50 * pesanan;
        return beef;
    }
    
    public double hitungSosis(){
        double sosis = 50 * pesanan;
        return sosis;
    }
    
    public double hitungBawang(){
        double bawang = 30 * pesanan;
        return bawang;
    }
}
