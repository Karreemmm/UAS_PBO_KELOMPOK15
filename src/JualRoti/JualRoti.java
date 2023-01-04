/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JualRoti;

import rotimanis.*;
import rotitawar.*;
import pizza.*;
import java.util.Scanner;
import dough.Decimal;


/**
 *
 * @author Lenovo
 */
public class JualRoti {

        /**
         * @param args the command line arguments
         */
    public static void main(String[] args) {
            // TODO code application logic here
            char pilih, varian;
            double kebutuhanTepung, kebutuhanGula, kebutuhanButter, kebutuhanRagi, kebutuhanSusuBubuk,
                            kebutuhanSusuCair, kebutuhanTelur, kebutuhanEs;
            Decimal brt;
            Scanner input = new Scanner(System.in);
            
            System.out.println("=== Pilihan Menu ===");
            System.out.println("1. Roti manis");
            System.out.println("2. Roti tawar");
            System.out.println("3. Pizza");
            System.out.print("Pilih (1/2/3) : ");
            
            pilih = input.next().charAt(0);
            switch (pilih) {
                    case '1':
                            System.out.println("=== Roti Manis ===");
                            System.out.println("1. Varian 1");
                            System.out.println("2. Varian 2");
                            System.out.println("3. Varian 3");
                            System.out.print("Pilih (1/2/3) : ");
                            
                            varian = input.next().charAt(0);
                            switch (varian) {
                                    case '1':
                                            System.out.println("=== Varian 1 ===");
                                            // INSTANTIASI PRODUK

                                            RotiManisVar1 rm1 = new RotiManisVar1();

                                            // VARIABEL JUMLAH PESANAN TIAP PRODUK

                                            System.out.print("Jumlah pesanan: ");
                                            
                                            rm1.pesanan = input.nextInt();

                                            // HITUNG KEBUTUHAN TIAP BAHAN

                                            kebutuhanTepung = rm1.hitungTerigu();
                                            kebutuhanGula = rm1.hitungGula();
                                            kebutuhanButter = rm1.hitungButter();
                                            kebutuhanRagi = rm1.hitungRagi();
                                            kebutuhanSusuBubuk = rm1.hitungSusuBubuk();
                                            kebutuhanSusuCair = rm1.hitungSusuCair();
                                            kebutuhanTelur = rm1.hitungTelur();
                                            kebutuhanEs = rm1.hitungEs();

                                            // TAMPILKAN BEBAN DALAM KILOGRAM ATAU GRAM

                                            brt = new Decimal();

                                            // TAMPILKAN HASIL
                                            System.out.println("=== Kebutuhan Bahan ===");
                                            System.out.print("Tepung        = ");
                                            brt.berat(kebutuhanTepung);
                                            System.out.print("Gula          = ");
                                            brt.berat(kebutuhanGula);
                                            System.out.print("Butter        = ");
                                            brt.berat(kebutuhanButter);
                                            System.out.print("Ragi          = ");
                                            brt.berat(kebutuhanRagi);
                                            System.out.print("Susu Bubuk    = ");
                                            brt.berat(kebutuhanSusuBubuk);
                                            System.out.print("Susu Cair     = ");
                                            brt.berat(kebutuhanSusuCair);
                                            System.out.print("Telur         = ");
                                            brt.berat(kebutuhanTelur);
                                            System.out.print("Es Batu       = ");
                                            brt.berat(kebutuhanEs);
                                            System.out.println("----");

                                            // HARGA TIAP VARIAN PRODUK

                                            rm1.harga();
                                            break;
                                    case '2':
                                            System.out.println("=== Varian 2 ===");
                                            // INSTANTIASI PRODUK

                                            RotiManisVar2 rm2 = new RotiManisVar2();

                                            // VARIABEL JUMLAH PESANAN TIAP PRODUK

                                            System.out.print("Jumlah pesanan: ");
                                            rm2.pesanan = input.nextInt();

                                            // HITUNG KEBUTUHAN TIAP BAHAN

                                            kebutuhanTepung = rm2.hitungTerigu();
                                            kebutuhanGula = rm2.hitungGula();
                                            kebutuhanButter = rm2.hitungButter();
                                            kebutuhanRagi = rm2.hitungRagi();
                                            kebutuhanSusuBubuk = rm2.hitungSusuBubuk();
                                            kebutuhanSusuCair = rm2.hitungSusuCair();
                                            kebutuhanTelur = rm2.hitungTelur();
                                            kebutuhanEs = rm2.hitungEs();

                                            // TAMPILKAN BEBAN DALAM KILOGRAM ATAU GRAM

                                            brt = new Decimal();

                                            // TAMPILKAN HASIL
                                            System.out.println("=== Kebutuhan Bahan ===");
                                            System.out.print("Tepung        = ");
                                            brt.berat(kebutuhanTepung);
                                            System.out.print("Gula          = ");
                                            brt.berat(kebutuhanGula);
                                            System.out.print("Butter        = ");
                                            brt.berat(kebutuhanButter);
                                            System.out.print("Ragi          = ");
                                            brt.berat(kebutuhanRagi);
                                            System.out.print("Susu Bubuk    = ");
                                            brt.berat(kebutuhanSusuBubuk);
                                            System.out.print("Susu Cair     = ");
                                            brt.berat(kebutuhanSusuCair);
                                            System.out.print("Telur         = ");
                                            brt.berat(kebutuhanTelur);
                                            System.out.print("Es Batu       = ");
                                            brt.berat(kebutuhanEs);
                                            System.out.println("----");

                                            // HARGA TIAP VARIAN PRODUK

                                            rm2.harga();
                                            break;
                                    case '3':
                                            System.out.println("=== Varian 3 ===");
                                            // INSTANTIASI PRODUK

                                            RotiManisVar3 rm3 = new RotiManisVar3();

                                            // VARIABEL JUMLAH PESANAN TIAP PRODUK

                                            System.out.print("Jumlah pesanan: ");
                                            rm3.pesanan = input.nextInt();

                                            // HITUNG KEBUTUHAN TIAP BAHAN

                                            kebutuhanTepung = rm3.hitungTerigu();
                                            kebutuhanGula = rm3.hitungGula();
                                            kebutuhanButter = rm3.hitungButter();
                                            kebutuhanRagi = rm3.hitungRagi();
                                            kebutuhanSusuBubuk = rm3.hitungSusuBubuk();
                                            kebutuhanSusuCair = rm3.hitungSusuCair();
                                            kebutuhanTelur = rm3.hitungTelur();
                                            kebutuhanEs = rm3.hitungEs();

                                            // TAMPILKAN BEBAN DALAM KILOGRAM ATAU GRAM

                                            brt = new Decimal();

                                            // TAMPILKAN HASIL
                                            System.out.println("=== Kebutuhan Bahan ===");
                                            System.out.print("Tepung        = ");
                                            brt.berat(kebutuhanTepung);
                                            System.out.print("Gula          = ");
                                            brt.berat(kebutuhanGula);
                                            System.out.print("Butter        = ");
                                            brt.berat(kebutuhanButter);
                                            System.out.print("Ragi          = ");
                                            brt.berat(kebutuhanRagi);
                                            System.out.print("Susu Bubuk    = ");
                                            brt.berat(kebutuhanSusuBubuk);
                                            System.out.print("Susu Cair     = ");
                                            brt.berat(kebutuhanSusuCair);
                                            System.out.print("Telur         = ");
                                            brt.berat(kebutuhanTelur);
                                            System.out.print("Es Batu       = ");
                                            brt.berat(kebutuhanEs);
                                            System.out.println("----");

                                            // HARGA TIAP VARIAN PRODUK

                                            rm3.harga();
                                            break;

                                    default:
                                            System.out.println("Pilihan tidak tersedia");
                                            break;
                            }
                            break;
                    case '2':
                            System.out.println("=== Roti Tawar ===");
                            System.out.println("1. Varian 1");
                            System.out.println("2. Varian 2");
                            System.out.print("pilih: ");
                            varian = input.next().charAt(0);

                            switch (varian) {
                                    case '1':
                                            System.out.println("=== Varian 1 ===");
                                            // INSTANTIASI PRODUK

                                            RotiTawarVar1 rt1 = new RotiTawarVar1();

                                            // VARIABEL JUMLAH PESANAN TIAP PRODUK

                                            System.out.print("Jumlah pesanan: ");
                                            rt1.pesanan = input.nextInt();

                                            // HITUNG KEBUTUHAN TIAP BAHAN

                                            kebutuhanTepung = rt1.hitungTerigu();
                                            kebutuhanGula = rt1.hitungGula();
                                            kebutuhanButter = rt1.hitungButter();
                                            kebutuhanRagi = rt1.hitungRagi();
                                            kebutuhanSusuBubuk = rt1.hitungSusuBubuk();
                                            kebutuhanSusuCair = rt1.hitungSusuCair();
                                            kebutuhanTelur = rt1.hitungTelur();
                                            kebutuhanEs = rt1.hitungEs();

                                            // TAMPILKAN BEBAN DALAM KILOGRAM ATAU GRAM

                                            brt = new Decimal();

                                            // TAMPILKAN HASIL
                                            System.out.println("=== Kebutuhan Bahan ===");
                                            System.out.print("Tepung        = ");
                                            brt.berat(kebutuhanTepung);
                                            System.out.print("Gula          = ");
                                            brt.berat(kebutuhanGula);
                                            System.out.print("Butter        = ");
                                            brt.berat(kebutuhanButter);
                                            System.out.print("Ragi          = ");
                                            brt.berat(kebutuhanRagi);
                                            System.out.print("Susu Bubuk    = ");
                                            brt.berat(kebutuhanSusuBubuk);
                                            System.out.print("Susu Cair     = ");
                                            brt.berat(kebutuhanSusuCair);
                                            System.out.print("Telur         = ");
                                            brt.berat(kebutuhanTelur);
                                            System.out.print("Es Batu       = ");
                                            brt.berat(kebutuhanEs);
                                            System.out.println("----");

                                            // HARGA TIAP VARIAN PRODUK

                                            rt1.harga();
                                            break;
                                    case '2':
                                            System.out.println("=== Varian 2 ===");
                                            // INSTANTIASI PRODUK

                                            RotiTawarVar2 rt2 = new RotiTawarVar2();

                                            // VARIABEL JUMLAH PESANAN TIAP PRODUK

                                            System.out.print("Jumlah pesanan: ");
                                            rt2.pesanan = input.nextInt();

                                            // HITUNG KEBUTUHAN TIAP BAHAN

                                            kebutuhanTepung = rt2.hitungTerigu();
                                            kebutuhanGula = rt2.hitungGula();
                                            kebutuhanButter = rt2.hitungButter();
                                            kebutuhanRagi = rt2.hitungRagi();
                                            kebutuhanSusuBubuk = rt2.hitungSusuBubuk();
                                            kebutuhanSusuCair = rt2.hitungSusuCair();
                                            kebutuhanTelur = rt2.hitungTelur();
                                            kebutuhanEs = rt2.hitungEs();

                                            // TAMPILKAN BEBAN DALAM KILOGRAM ATAU GRAM

                                            brt = new Decimal();

                                            // TAMPILKAN HASIL
                                            System.out.println("=== Kebutuhan Bahan ===");
                                            System.out.print("Tepung        = ");
                                            brt.berat(kebutuhanTepung);
                                            System.out.print("Gula          = ");
                                            brt.berat(kebutuhanGula);
                                            System.out.print("Butter        = ");
                                            brt.berat(kebutuhanButter);
                                            System.out.print("Ragi          = ");
                                            brt.berat(kebutuhanRagi);
                                            System.out.print("Susu Bubuk    = ");
                                            brt.berat(kebutuhanSusuBubuk);
                                            System.out.print("Susu Cair     = ");
                                            brt.berat(kebutuhanSusuCair);
                                            System.out.print("Telur         = ");
                                            brt.berat(kebutuhanTelur);
                                            System.out.print("Es Batu       = ");

                                            brt.berat(kebutuhanEs);
                                            System.out.println("----");

                                            // HARGA TIAP VARIAN PRODUK

                                            rt2.harga();
                                            break;

                                    default:
                                            System.out.println("Pilihan tidak tersedia");
                                            break;
                            }
                            break;
                    case '3':
                            System.out.println("=== Pizza ===");
                            // INSTANTIASI PRODUK

                            PizzaVar1 p1 = new PizzaVar1();

                            // VARIABEL JUMLAH PESANAN TIAP PRODUK

                            System.out.print("Jumlah pesanan: ");
                            p1.pesanan = input.nextInt();

                            // HITUNG KEBUTUHAN TIAP BAHAN

                            kebutuhanTepung = p1.hitungTerigu();
                            kebutuhanGula = p1.hitungGula();
                            kebutuhanButter = p1.hitungButter();
                            kebutuhanRagi = p1.hitungRagi();
                            kebutuhanSusuBubuk = p1.hitungSusuBubuk();
                            kebutuhanSusuCair = p1.hitungSusuCair();
                            kebutuhanTelur = p1.hitungTelur();
                            kebutuhanEs = p1.hitungEs();

                            // TAMPILKAN BEBAN DALAM KILOGRAM ATAU GRAM

                            brt = new Decimal();

                            // TAMPILKAN HASIL
                            System.out.println("=== Kebutuhan Bahan ===");
                            System.out.print("Tepung        = ");
                            brt.berat(kebutuhanTepung);
                            System.out.print("Gula          = ");
                            brt.berat(kebutuhanGula);
                            System.out.print("Butter        = ");
                            brt.berat(kebutuhanButter);
                            System.out.print("Ragi          = ");
                            brt.berat(kebutuhanRagi);
                            System.out.print("Susu Bubuk    = ");
                            brt.berat(kebutuhanSusuBubuk);
                            System.out.print("Susu Cair     = ");
                            brt.berat(kebutuhanSusuCair);
                            System.out.print("Telur         = ");
                            brt.berat(kebutuhanTelur);
                            System.out.print("Es Batu       = ");
                            brt.berat(kebutuhanEs);
                            System.out.println("----");

                            // HARGA TIAP VARIAN PRODUK

                            p1.harga();

                            break;

                    default:
                            System.out.println("Maaf input pilihan hanya 1/2/3");
                            break;
            }

       }
}