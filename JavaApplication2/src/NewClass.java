/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prase
 */
public class NewClass {
    public static void main(String[] args) {
    int angkaBulan = 6;
    String bulan;
    switch (angkaBulan) 
    {
        case 1 -> bulan = "Januari";
        case 2 -> bulan = "Februari";
        case 3 -> bulan = "Maret";
        case 4 -> bulan = "April";
        case 5 -> bulan = "Mei";
        case 6 -> bulan = "Juni";
        case 7 -> bulan = "Juli";
        case 8 -> bulan = "Agustus";
        case 9 -> bulan = "September";
        case 10 -> bulan = "Oktober";
        case 11 -> bulan = "November";
        default -> bulan = "Desember";
    }
    System.out.println("Bulan ke-" + angkaBulan + " adalah bulan " + bulan);
        
    }
}
