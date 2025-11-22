
package alistirmalar;


public class Alistirmalar7 {
    
    static int sayininKupu (int sayi){
        
        int sayiKupu = sayi*sayi*sayi;
        
        return sayiKupu;
    }
    
    static int buyukSayiBul (int sayi1, int sayi2, int sayi3){
        
        int buyukSayi ;
        
        if (sayi1 > sayi2 && sayi1 > sayi3)
            buyukSayi = sayi1;
        
        else if (sayi2 > sayi3)
            buyukSayi = sayi2;
        
        else
            buyukSayi = sayi3;
        
        return buyukSayi;
    }
    
    static int degerlerinToplami (int N){
        
        int toplam = 0;
        
        for(int i = 1; i <= N; i++){
            toplam += i;
        }
        return toplam;
    }
    
    static int usHesaplama ( int a , int b){
        
        int usDegeri = 1;
        int sayac = 1;
        
        while( sayac <= b){
            
            usDegeri *= a;
            sayac++;
        }
        return usDegeri;
    }
    
    static int yuzKatiBul (int sayi){
        
        int yuvarlama;
        
        int kalan = sayi % 100;
        
        if(kalan == 0){
            yuvarlama = 0;
        }
        else{
        yuvarlama = 100 - kalan;
        }
        
        return yuvarlama;
    }
    
    static int ebobBulma (int sayi1 , int sayi2){
        
        int ebob = 0;
        int kucukSayi;
        
       if(sayi1 < sayi2){
           kucukSayi = sayi1;
       }
       else{
           kucukSayi = sayi2;
       }
           for (int i = 1; i <= kucukSayi; i++) {
               
               if(sayi1 % i == 0 && sayi2 % i == 0){
                   ebob = i;
               }
            }   
           return ebob;
    }
    
    static int ekokBulma ( int sayi1 , int sayi2){
        
        int ekok = 0;
        
        for (int i = 1; i <= sayi1*sayi2; i++) {
            
            if (i % sayi1 == 0 && i % sayi2 == 0){
                ekok = i;
                break;
            }
        }
        return ekok;
    }
    
    static boolean asalMi (int sayi){
        
        boolean asal = true;
        
        for (int i = 2; i < sayi; i++) {
            
            if (sayi % i == 0){
                asal = false;
                break;
            }
            else{
            }
        }
        return asal;
    }
    
    static int rakamlarToplami (int sayi){
        
        int toplam = 0;
        
        while (sayi != 0){
            int rakam = sayi % 10;
            sayi /= 10;
            toplam += rakam;
        }
        return toplam;
    }
    
    static int islemiBul (int sayi1 , int sayi2 , char operator){
        
        int islem = 0;
        
        if(operator == '+')
            islem = sayi1 + sayi2;
        
        else if (operator == '-')
            islem = sayi1 - sayi2;
        
        else if (operator == '*')
            islem = sayi1 * sayi2;
        
        else if (operator == '/')   
            islem = sayi1 / sayi2;
        
        else
            System.out.println("Geçersiz operatör");
        
        return islem;
    }
    
    public static void main(String[] args){
        
        /*SORU 1) Parametre olarak aldığı bir tamsayının küpünü 
geri döndüren metodu yazınız..*/
        
        int sayiKupu = sayininKupu(3);
        System.out.println("Sayının küpü : " + sayiKupu);
        
        System.out.println("--------------");
        
        /*SORU 2) Üç tamsayı değerini parametre olarak alan ve bu üç sayıdan en büyük olanını geri 
döndüren metodu yazınız.*/
        
        int buyukSayi = buyukSayiBul (28 , 48 , 65);
        System.out.println("En büyük sayı: " + buyukSayi);
        
        System.out.println("--------------");
        
        /*SORU 3) Bir N sayısını parametre olarak alan ve 1’den N’e kadar olan tüm tamsayıları 
hesaplayıp sonucu geri döndüren metodu yazınız.*/
        
        int toplam = degerlerinToplami (10);
        System.out.println("N' e kadar olan sayıların toplamı : " + toplam);
        
        System.out.println("--------------");
        
        /*SORU 4) Bir tamsayı değerini (a) ve üs değerini (b) parametre olarak alan, bu tamsayının 
üssünü (a^b) hesaplayıp geri döndüren metodu yazınız.*/
        
        int usDegeri = usHesaplama (2 , 5);
        System.out.println("a^b: " + usDegeri);
        
        System.out.println("--------------");
        
        /*SORU 5) Bir tamsayıyı parametre olarak alan, bu sayıyı en yakın 100’ün katına yuvarlamak 
için üzerine kaç eklemek gerektiğini bulan ve geri döndüren metodu yazınız. 
        
Örneğin;   sayi = 34 ise 100’e yuvarlamak için 66 gerekir. 
           sayi = 372 ise 400’e yuvarlamak için 28 gerekir.*/
        
        int yuvarlama = yuzKatiBul ( 24937);
        System.out.println("Yuvarlamak için gereken : " + yuvarlama);
        
        System.out.println("--------------");
        
        /*SORU 6) İki tamsayıyı parametre olarak alan ve bu sayıların en büyük ortak bölenini 
(OBEB) bulup geri döndüren metodu yazınız.*/
        
        int ebob = ebobBulma ( 30 , 72);
        System.out.println("EBOB: " + ebob);
        
        System.out.println("--------------");
        
        /*SORU 7) İki tamsayıyı parametre olarak alan ve bu sayıların en küçük ortak katını (OKEK) 
bulup geri döndüren metodu yazınız.*/
        
        int ekok = ekokBulma ( 12 , 46);
        System.out.println("EKOK: " + ekok);
        
        System.out.println("--------------");
        
        /*SORU 8) Parametre olarak aldığı bir tamsayının asal olup olmadığını kontrol eden, asal ise 
true, değilse false şeklinde boolean bir değer döndüren metodu yazınız.*/
        
        boolean asal = asalMi (29);
        System.out.println("Asal sayı mı? : " + asal);
    
        System.out.println("--------------");
        
        /*SORU 9) Parametre olarak aldığı bir tamsayının rakamlarının toplamın bulan ve geri 
döndüren metodu yazınız.*/
    
        int toplam1 = rakamlarToplami (91384);
        System.out.println("Rakamlar toplamı: " + toplam1);
        
        System.out.println("--------------");
        
        /*SORU 10) Parametre olarak iki tamsayı ve karakter tipinde bir operatör alan, bu sayılar 
üzerinde istenen işlemi yapan ve sonucu geri döndüren metodu yazınız.  

Örneğin; sayi1 = 5, sayi2 = 7, operatör = ‘-‘ ise 5 – 7’den sonuç -2 olarak döndürülmeli.
    */
        
        int islem = islemiBul ( 9 , 3 , '*');
        System.out.println("İşlem sonucu: " + islem);
        
    }
    
}
