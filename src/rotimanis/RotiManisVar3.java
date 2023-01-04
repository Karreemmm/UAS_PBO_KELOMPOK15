/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotimanis;
import modal.RotiManis;
import harga.Interface;
/**
 *
 * @author lenovo
 */
public class RotiManisVar3 extends RotiManis implements Interface {
    String nama = "Roti Manis Varian 3";
    
    @Override
    public double topping() {
        double harga = 0;
        return harga;
    }
    
    @Override
    public double filling() {
        double keju = this.hargaKeju() * 10;
        double sosis  = this.hargaCoklat() * 10;
        double harga = keju + sosis;
        return harga;
    }

    @Override
    public double modal() {
        double hargaVariasi = this.filling();
        double hargaBahan = this.hitungModal() / this.rotiTiapDough();
        double modalTotal = hargaBahan + hargaVariasi;
        return modalTotal;
    }
    
    @Override
    public double hargaVarian(){
        double untung = this.modal() * 50/100;
        double harga = this.modal() + untung;
        return harga;
    }
    
    @Override
    public double hargaTotal(){
        double untung = this.modal() * 50/100;
        double harga = (this.modal() + untung) * pesanan;
        return harga;
    }
    
    @Override
    public void harga(){
        System.out.println("Harga 1pcs " + nama  + " = Rp " + (int)hargaVarian());
        System.out.println("Total Harga " + pesanan + "pcs " + nama  + " = Rp " + (int)hargaTotal());
    }

}
