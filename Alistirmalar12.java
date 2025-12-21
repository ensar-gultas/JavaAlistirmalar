
package alistirmalar;

import java.util.Scanner;


public class Alistirmalar12 {
    
    public static void main(String[] args) {
        
        
        /*SORU 1) Bir matristeki negatif elemanların toplamını bulan ve sonucu konsola yazdıran 
programı yazınız. */
        
        int [][] matris1 = { {1, -3, -8} ,
                             {4, -6, 7}  ,
                             {-15, 23, 39} };
           
        int negatifToplam = 0;                     
        
        for(int [] dizi : matris1){
            for(int eleman : dizi){
                if(eleman < 0){
                    negatifToplam += eleman;
                }
            }
        }
        System.out.println("Negatif elemanların toplamı: " + negatifToplam);
        
        /*SORU 2) Bir matristeki tek elemanların toplamını bulan ve sonucu konsola yazdıran 
programı yazınız*/
        
        int [][] matris2 = { {1, 2, 3} ,
                             {4, 5, 6} ,
                             {7, 8, 9} };
        
        int tekToplam = 0;
        
        for(int [] dizi : matris2){
            for(int eleman : dizi){
                if(eleman % 2 != 0){
                    tekToplam += eleman;
                }
            }
        }
        System.out.println("Tek elemanların toplamı: " + tekToplam);
        
        /*SORU 3) Bir matrisin tüm elemanlarının ortalamasını hesaplayan ve sonucu konsola 
yazdıran programı yazınız.*/
        
        int [][] matris3 = { {1, 2, 3} ,
                             {4, 5, 6} ,
                             {7, 8, 9} };
        
        int toplam = 0;
        int sayac = 0;
        
        for(int [] dizi : matris3){
            for(int eleman : dizi){
                toplam += eleman;
                sayac ++;
            }
        }
        double ortalama = ((double)toplam / sayac);
        System.out.println("Elemanların ortalaması: " + ortalama);
        
        /*SORU 4) Bir matristeki çift elemanların adetini bulan ve sonucu konsola yazdıran programı 
yazınız.*/
        
        int [][] matris4 = { {1, 2, 3} ,
                             {4, 5, 6} ,
                             {7, 8, 9} };
        
        int ciftSayaci = 0;
        
        for(int [] dizi : matris4){
            for(int eleman : dizi){
                if(eleman % 2 == 0){
                    ciftSayaci++;
                }
            }
        }
        System.out.println("Çift eleman sayısı: " + ciftSayaci);
        
        /*SORU 5) Bir matrisin en büyük elemanını bulan ve sonucu konsola yazdıran programı 
yazınız.*/
        
        int [][] matris5 = { {11, 34, 81} ,
                             {45, 68, 27} ,
                             {51, 19, 24} };
        
        int max = matris5[0][0];
        
        for(int [] dizi : matris5){
            for(int eleman : dizi){
                if(eleman > max){
                    max = eleman;
                }
            }
        }
        System.out.println("En büyük eleman: " + max);
        
        /*SORU 6) Bir matriste kullanıcıdan alınan değerin olup olmadığını kontrol eden, varsa 
konsola indeksini, yoksa “Aranan değer yoktur” yazan programı yazınız.*/
        
        Scanner input = new Scanner(System.in);
        
        int [][] matris6 = { {1, 2, 3} ,
                             {4, 5, 6} ,
                             {7, 8, 9} };
        
        System.out.print("Bir değer giriniz: ");
        int deger = input.nextInt();
                
        boolean varMi = false;
        
        for (int i = 0; i < matris6.length; i++) {
            
            for (int j = 0; j < matris6[i].length; j++) {
                
                if(deger == matris6[i][j]){
                    System.out.println("Değerin indeksi: " + "[" + i + "][" + j + "]");
                    varMi = true;
                    break;
                }
            }
        }
        if(varMi == false){
            System.out.println("Aranan değer yoktur");
        }
        
        /*SORU 7) Bir matriste kullanıcıdan alınan değerin kaç defa geçtiğini bulan ve sonucu konsola 
yazdıran programı yazınız.*/
        
        int [][] matris7 = { {1, 1, 2} ,
                             {2, 2, 5} ,
                             {6, 6, 9} };
        
        System.out.print("Bir değer giriniz: ");
        int deger1 = input.nextInt();
        
        int sayac1 = 0;
        
        for(int [] dizi : matris7){
            for(int eleman : dizi){
                if(deger1 == eleman){
                    sayac1++;
                }
            }
        }
        System.out.println("Değerin tekrar sayısı: " + sayac1);
        
        //SORU 8) Bir matrisin sütun sutün toplamlarını konsola yazdıran programı yazınız.
        
        int [][] matris8 = { {1, 2, 3} ,
                             {4, 5, 6} ,
                             {7, 8, 9} };
        
        int sutunToplam = 0;
        
        for (int i = 0; i < matris8.length; i++) {
            sutunToplam = 0;
            
            for (int j = 0; j < matris8.length; j++) {
                
                sutunToplam += matris8[j][i];
            }
            System.out.println(i + ".sütunun toplamı: " + sutunToplam);
        }                
        
        //SORU 9) Bir matrisin satır satır toplamlarını konsola yazdıran programı yazınız.

        int [][] matris9 = { {1, 2, 3} ,
                             {4, 5, 6} ,
                             {7, 8, 9} };
        
        int satirToplam = 0;
        
        for (int i = 0; i < matris9.length; i++) {
            satirToplam = 0;
            
            for (int j = 0; j < matris9[i].length; j++) {
                
                satirToplam += matris9[i][j];
            }
            System.out.println(i + ".satırın toplamı: " + satirToplam);
        }
        
        /*SORU 10) Bir matrisin her satırının maksimum değerini bularak konsola yazdıran programı 
yazınız.*/
        
        int [][] matris10 = { {11, 34, 81} ,
                             {45, 68, 27} ,
                             {51, 19, 24} };
        
        int maxDegeri= matris10[0][0];
        
        for (int i = 0; i < matris10.length; i++) {
            maxDegeri = matris10[i][0];
            
            for (int j = 0; j < matris10[i].length; j++) {
                
                if(matris10[i][j] > maxDegeri){
                    maxDegeri = matris10[i][j];
                }
            }
            System.out.println(i + ".satırın maksimum değeri: " + maxDegeri);
        }
        
        /*SORU 11) Bir matrisin her sütunun minimum değerini bularak konsola yazdıran programı 
yazınız.*/
        
        int [][] matris11 = { {11, 34, 81} ,
                             {45, 68, 27} ,
                             {51, 19, 24} };
        
        int minDegeri = matris11[0][0];
        
        for (int i = 0; i < matris11.length; i++) {
            minDegeri = matris11[0][i];
            
            for (int j = 0; j < matris11.length; j++) {
                
                if(matris11[j][i] < minDegeri){
                    minDegeri = matris11[j][i];
                }
            }
            System.out.println(i + ".sütunun minimum değeri: " + minDegeri);
        }
    }
}
    

