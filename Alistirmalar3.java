
package alistirmalar;


public class Alistirmalar3 {
    
    public static void main(String[] args){
        
        /*SORU 1) 1’den N’e kadar olan tüm tamsayıların küpünü konsola yazdıran programı yazınız. */
        
        int n = 6;
        
        
        for (int i = 1; i <= n; i++){
            System.out.println(i*i*i);
        }
        System.out.println("---------------------");
        
        
        /*SORU 2) 1’den N’e kadar olan tüm tamsayıların faktöriyelini konsola yazdıran bir program yazınız. */
        
        int n1 = 5;
        int faktoriyel = 1;
        
        for (int i = 1; i <= n1; i++){
            faktoriyel = faktoriyel * i;
            
        }
        System.out.println("Faktöriyel: " + faktoriyel);
        
        System.out.println("---------------------");
        
        
        /*SORU 3) Tanımlanan bir tamsayı değeri için çarpım tablosu oluşturan ve konsola yazdıran 
programı yazınız. */
        
        int sayi = 7;
        int carpim = 1;
        
        for (int i = 1; i <= 10; i++) {
            carpim = sayi * i;
            System.out.println(sayi + "*"  + i + " = " + carpim);
        }
        System.out.println("---------------------");
        
        
        /*SORU 4) Tanımlanan başlangıç ve bitiş sayıları arasındaki tüm tamsayıların toplamını ve 
ortalamasını konsola yazdıran programı yazınız. */
        
        int baslangic = 3;
        int bitis = 15;
        int toplam = 0;
        
        for ( int i = baslangic + 1; i < bitis; i++){
           toplam = toplam + i;
        }
        System.out.println("Sayıların toplamı: " + toplam);
         
        System.out.println("---------------------");
         
         
         /*SORU 5) Tanımlanan taban (a) ve üs (b) değerlerine göre ab ‘yi hesaplayan ve konsola 
yazdıran programı yazınız.*/
        
        int a = 3;
        int b = 4;
        int sonuc = 1;
         
        for (int i =1; i <= b; i++){
            sonuc = sonuc * a ;
         }
        System.out.println("Sonuç: " + sonuc);
        
        System.out.println("---------------------");
        
        
        /*SORU 6) Tanımlanan iki tamsayının en büyük ortak bölenini (EBOB) bulan ve konsola 
yazdıran programı yazınız.  */
        
        int sayi1 = 60;
        int sayi2 = 84;
        int ebob = 1;
        int kucuk ;
        
            if (sayi1 > sayi2)
                kucuk = sayi1;
            else
                kucuk = sayi2;
        
        for (int i = 1; i <= kucuk; i++){
            if (sayi1 % i == 0 && sayi2 % i == 0 ){
                ebob = i;   
                
            }
                
        }
        System.out.println("EBOB: " + ebob);
        
        System.out.println("---------------------");
        
        
        /*SORU 7) Tanımlanan iki tamsayının en küçük ortak katını (EKOK) bulan ve konsola 
yazdıran programı yazınız.*/
        
        int sayiA = 14;
        int sayiB = 20;
        int ekok = 1;
        int buyuk;
           
        if (sayiA > sayiB)
            buyuk = sayiA;
        else
            buyuk = sayiB;
        
        for (int i = buyuk; ; i++) {
            if (i % sayiA == 0 && i % sayiB == 0){
                ekok = i;
                break;
            }
        }
        System.out.println("EKOK: " + ekok);
        
        System.out.println("---------------------");
        
        
        /*SORU 8) Tanımlanan bir tamsayının tüm pozitif bölenlerini konsola yazdıran programı 
yazınız.*/
        
        int tamSayi = 100;
        
        for (int i = 1; i <= tamSayi; i++) {
            if (tamSayi % i == 0){
            
             System.out.println(i);
            } 
        }
        System.out.println("---------------------");
        
        
        /*SORU 9) Kullanıcıdan bir tam sayı N değeri girmesini isteyen ve konsola Fibonacci serisinin 
N terimini yazan programı yazınız.
    F0 = 0,  
    F1 = 1,  
    FN = FN-1 + FN-2 
    Fibonacci serisi: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, … */
        
        int deger1 = 0, deger2 = 1;
        int yeniDeger;
        int nDegeri = 6;
       
        System.out.println(deger1);
        System.out.println(deger2);
        
        for (int i = 0; i < nDegeri; i++) {
            yeniDeger = deger1 + deger2;
            System.out.println(yeniDeger);
            deger1 = deger2;
            deger2 = yeniDeger;
        }
        System.out.println("---------------------");
        
        
        /*SORU 10) Kullanıcıdan bir tam sayı N değeri girmesini isteyen ve konsola Fibonacci 
serisinin N’inci terimini yazan programı yazınız. 
N = 5 ? “5. Terim = 3” 
N = 9 ?  “9. Terim = 21” */
        
        int N = 7; 

        int sayiX = 0;
        int sayiY = 1;
        int sonrakiSayi;
        
        for (int i = 2; i <= N; i++) {
            sonrakiSayi = sayiX + sayiY;
            sayiX = sayiY;
            sayiY = sonrakiSayi;
        }

        System.out.println(N + ". Terim = " + sayiX);
        
        System.out.println("---------------------");
        
        
        /*SORU 11) Kullanıcıdan bir tam sayı girmesini isteyen ve girilen tam sayının asal sayı olup 
olmadığını kontrol eden bir program yazınız. (Pozitif tamsayılardan sadece 1’e ve kendisine 
tam bölünebilen sayılara asal sayı denir.) 
27 ?  “Asal değildir.” 
13 ?  “Asal sayıdır.” */
        
        int sayiQ = 37;
        
        for (int i = 2; i < sayiQ; i++) {
            if (sayiQ % i == 0){
                System.out.println("Asal sayı değildir.");
                break;  
            }
            if (i == sayiQ - 1){
                System.out.println("Asal sayıdır.");
            }
        }
        System.out.println("---------------------");
        
        
        //SORU 12) 1 ile 1000 arasındaki tüm asal sayıları konsola yazdıran programı yazınız.
       
        for (int sayiL = 2; sayiL <= 1000; sayiL++) { 
    boolean asal = true;  

    for (int i = 2; i < sayiL; i++) {
        if (sayiL % i == 0) {
            asal = false;  
            break;        
        }
    }

    if (asal) {  
        System.out.println(sayiL);
    }
}
        System.out.println("---------------------");
        
        
        /*SORU 13) Tanımlanan iki tamsayının aralarında asal olup olmadığını kontrol eden programı 
yazınız. (İki sayının 1 dışında pozitif ortak böleni yoksa bu iki sayı aralarında asaldır.) */
        
        int sayiN = 3; 
        int sayiM = 8;
        int yuksekDeger ;
        
        if (sayiN > sayiM)
            yuksekDeger = sayiN;
        else
            yuksekDeger = sayiM;
        
        for (int i = 2; i <= yuksekDeger; i++) {
            if (sayiN % i == 0 && sayiM % i == 0) {
                System.out.println("Aralarında asal değildir.");
            break;
        }
            if (i == yuksekDeger) { 
            System.out.println("Aralarında asaldır.");
        }
    }
        System.out.println("---------------------");
        
        
        /*SORU 14) Tanımlanan bir sayının tüm asal çarpanlarını konsola yazdıran programı yazınız.*/
        
        int sayiF = 160;
        
        for (int i = 2; i <= sayiF; i++) {
            if (sayiF % i == 0 ){
                System.out.print(i+ " "  );
                sayiF = sayiF / i;
                i--;
                }
            }
                
        System.out.println("\n---------------------");
        
        
        /*SORU 15) Aşağıdaki formülü kullanarak serinin ilk 10000 terimi ile PI sayısının değerini 
hesaplayan programı yazınız.*/
        
        int x = 10000;
        double toplamDeger = 0.0;
        double pi;
        
        for (int i = 0; i < x; i++) {
            
            double payda = 2 * i + 1;
            
            if (i % 2 == 0)
                toplamDeger = toplamDeger + (1.0 / payda);
            else
                toplamDeger = toplamDeger - (1.0 / payda);
            
            
            }
        pi = 4 * toplamDeger;
            System.out.println("Pi'nin Değeri: " + pi);
            
        System.out.println("---------------------");
        
        
        /*SORU 16) Aşağıdaki formülü kullanarak serinin ilk 10000 terimi ile e sayısının değerini 
hesaplayan programı yazınız.*/
        
        double e = 1.0;
        double faktoriyelDegeri = 1.0;
        
        for (int i = 1; i < 10000; i++) {
            
            faktoriyelDegeri = faktoriyelDegeri * i;
            
            e += 1.0 /  faktoriyelDegeri;
            
        }
            System.out.println("e'nin Değeri : " + e);
            

    }
    
}
