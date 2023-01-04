/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotitawar;
import harga.Interface;
import modal.RotiTawar;
/**
 *
 * @author lenovo
 */
public class RotiTawarVar2 extends RotiTawar implements Interface{
    String nama = "Roti Tawar varian 2";


    public double topping() {
        double harga = 0;
        return harga;
    }

    public double filling() {
        double keju = this.hargaKeju() *80;
        double harga= keju;
        return harga;
    }

    public double modal() {
        double hargaVariasi = this.filling();
        double hargaBahan = this.hitungModal() / this.rotiTiapDough();
        double modalTotal = hargaBahan + hargaVariasi;
        return modalTotal;
    }

    public double hargaVarian() {
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
