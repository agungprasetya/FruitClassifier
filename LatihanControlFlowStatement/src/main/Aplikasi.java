package main;

import pembayaran.Pembayaran;

public class Aplikasi {
    public static void main(String[] args) {
        Pembayaran pembayaran = new Pembayaran();
        
        int nilaiYangDibayarkan;
                
        //test case 1
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(6000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        //test case 2
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(4000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
        //test case 3
        nilaiYangDibayarkan = pembayaran.hitungPembayaran(5000000, 0.05);
        System.out.println(nilaiYangDibayarkan);
        
    }
}
