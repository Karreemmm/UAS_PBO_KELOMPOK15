/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harga;
import dough.Variasi;
/**
 *
 * @author lenovo
 */
public class HargaBahan extends BeratKemasan {
    public double hargaTepung(){
        return this.tepungTerigu() / this.beratTepung;
    }
    
    public double hargaGulaPasir(){
        return this.gulaPasir() / this.beratGulaPasir;
    }
    
    public double hargaButter(){
        return this.butter() / this.beratButter;
    }
    
    public double hargaEsBatu(){
        return this.esBatu() / this.beratEsBatu;
    }
    
    public double hargaRagi(){
        return this.ragi() / this.beratRagi;
    }
    
    public double hargaSusuBubuk(){
        return this.susuBubuk() / this.beratSusuBubuk;
    }
    
    public double hargaSusuCair(){
        return this.susuCair() / this.beratSusuCair;
    }
    
    public double hargaTelur(){
        return this.telur() / this.beratTelur;
    }
    
    public double hargaKeju(){
        return this.keju() / this.beratKeju;
    }
    
    public double hargaCoklat(){
        return this.coklat() / this.beratCoklat;
    }
    
    public double hargaKrim(){
        return this.krim() / this.beratKrim;
    }
    
    public double hargaSelai(){
        return this.selai() / this.beratSelai;
    }
    
    public double hargaSosis(){
        return this.sosis() / this.beratSosis;
    }
    
    public double hargaBeef(){
        return this.beef() / this.beratBeef;
    }
    
    public double hargaBawang(){
        return this.bawang() / this.beratBawang;
    }
}
