/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza;
import modal.Pizza;
import harga.Interface;
/**
 *
 * @author lenovo
 */
public class PizzaVar1 extends Pizza implements Interface {
    String nama = "Pizza";
    
    @Override
    public double topping() {
        double keju  = this.hargaKeju()* 30;
        double sosis  = this.hargaSosis()* 50;
        double beef  = this.hargaBeef()* 50;
        double bawang  = this.hargaBawang()* 30;
        double harga = keju + sosis + beef + bawang;
        return harga;
    }

    @Override
    public double filling() {
        double harga = 0;
        return harga;
    }

    @Override
    public double modal() {
        double hargaVariasi = this.filling() + this.topping();
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
