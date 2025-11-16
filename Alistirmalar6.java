
package alistirmalar;


public class Alistirmalar6 {
    
    public static void main(String[] args){
        
        /*SORU 1) Tanımlanan bir tamsayı N değerinden 1’e kadar geriye doğru tüm tamsayıları while 
döngüsü ile yazdıran programı yazınız. */
        
        int sayi = 8;
        while (sayi >= 1){
           
            System.out.print(sayi + " " );
             sayi--;
        }
        
        System.out.println("\n--------------");
        
        /*SORU 2) Tanımlanan başlangıç ve bitiş değerleri arasındaki tüm çift sayıları while döngüsü 
ile toplayan ve sonucu konsola yazan programı yazınız.*/
        
        int baslangic = 34 , bitis = 51;
        int toplam = 0;
        int i = baslangic;
        
        while ( i <= bitis ){
            
            if (i % 2 == 0){
            toplam += i;    
            i++;
            }
            else{
                i++;
            }
        }
        System.out.println(toplam);
        
        System.out.println("--------------");
        
        /*SORU 3) Tanımlanan bir tamsayının en büyük basamağını while döngüsü ile bulan ve 
konsola yazdıran programı yazınız. */
        
        int sayi1 = 48151981;
        
        while (sayi1 >= 10){
            
            sayi1 /= 10;
        }
        System.out.println(sayi1);
        
        System.out.println("--------------");
        
        /* SORU 4) İkilik tabanda bir değer olarak tanımlanan sayının onluk tabandaki karşılığını while 
döngüsü ile hesaplayan ve konsola yazdıran bir program yazınız.*/
        
        int sayiA = 100100;
        int ikiUssu = 1;
        int toplam1 = 0;
        
        while (sayiA > 0 ){
            
            int rakam = sayiA % 10;
            
            toplam1 += ikiUssu * rakam;
            
            ikiUssu*= 2;
            sayiA /= 10;
        }
        System.out.println(toplam1);
        
        System.out.println("--------------");
        
        /*SORU 5) Tanımlanan bir tamsayının asal olup olmadığını while döngüsü ile kontrol eden 
programı yazınız. */
        
        int tamSayi = 37;
        int sayac = 2;
        String asalMi = "Asal sayıdır.";
        
        while (sayac < tamSayi){
            
            if (tamSayi % sayac == 0){
                asalMi = "Asal sayı değildir.";
                break;
            }
                sayac++;
        }
        System.out.println(asalMi);
        
        System.out.println("--------------");
        
        /*SORU 6) Çarpma operatörünü (*) kullanmadan, tanımlanan iki tamsayı değerinin çarpımını while 
döngüsü ile hesaplayan ve sonucu konsola yazdıran programı yazınız.*/
        
        int x = 4, y = 5;
        int sayac2 = 1;
        int toplamDeger = 0;
        
        while ( sayac2 <= y){
            
            toplamDeger += x;
            sayac2++;
        }
        System.out.println("a x b: " + toplamDeger);
        
        System.out.println("--------------");
        
        /*SORU 7) Bölme operatörünü (/) kullanmadan, tanımlanan a sayısının b sayısına bölümünü 
while döngüsü ile hesaplayan ve sonucu konsola yazdıran programı yazınız. */
        
        int a = 60, b = 12;
        int sayac3 = 0;
        
        while( a >= b ){
            
            a -= b;
            sayac3++;
        }
        System.out.println("a/b: " + sayac3);
        
        System.out.println("--------------");
        
        /*SORU 8) Mod ve bölme operatörünü (% ve /) kullanmadan, tanımlanan c sayısının d sayısına 
bölümünden kalanı while döngüsü ile hesaplayan ve sonucu konsola yazdıran programı 
yazınız. */
        
        int c = 27, d = 7;
        int kalan = 0;
        
        while ( c >= d){
            
            c -=  d;
        }
        System.out.println("c%d: " + c);
        
        
    }
 }   