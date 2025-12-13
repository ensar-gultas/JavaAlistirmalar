
package alistirmalar;


public class Alistirmalar8 {
    
    /*SORU 1) Parametre olarak aldığı sayı kadar konsola “Merhaba dünya” yazdıran metodu 
recursive olarak yazınız. */
    
    static void yazdir (int a){
        
        if(a > 0){
            yazdir(a-1);
        System.out.println("Merhaba Dünya");
        }
    }
    
    /*SORU 2) Parametre olarak aldığı N değerine göre Fibonacci serisinin N’inci terimini geri 
döndüren metodu recursive olarak yazınız. 
Fibonacci Serisi: 0,1,1,2,3,5,13,21,34.....

N = 5  3 döndürülmeli  
N = 9  21 döndürülmeli */
    
    static int fibonacci(int N){
        
        if (N == 1){
            return 0;
        }   
        else if (N == 2){
            return 1;
        }
        else{
            return fibonacci(N-1) + fibonacci(N-2);
        }
    }
    
    /*SORU 3) Parametre olarak aldığı bir sayının rakamlarını recursive olarak parçalayıp tek tek 
konsola yazdıran metodu yazınız. 
Örneğin; 5674 için 5 6 7 4 gibi rakamları soldan sağa doğru konsola yazdırmalıdır.*/
    
    static void rakamParcala(int sayi){
        
        if(sayi > 0){
            rakamParcala(sayi/10);
            sayi %= 10;
            System.out.print(sayi + " ");
        }
    }
    
    /*SORU 4) Parametre olarak aldığı bir sayının rakamlarının toplamını recursive olarak bulan 
ve geri döndüren metodu yazınız. */
    
    static int rakamlarToplami(int sayi){
        
        if (sayi == 0){
            return 0;
        }
        else{
            return (sayi % 10) + rakamlarToplami(sayi / 10);
        }
    }
    
    /*SORU 5) Parametre olarak aldığı bir sayının kaç basamaklı olduğunu recursive olarak bulan 
ve geri döndüren metodu yazınız.*/
    
    static int basamakBul(int sayi){
        
        if(sayi < 10){
            return 1;
        }
        
        return 1 + basamakBul(sayi / 10);
    }
    
    /*SORU 6) Parametre olarak aldığı N değerine göre aşağıdaki serinin ilk N teriminin toplamını 
hesaplayan ve geri döndüren metodu recursive olarak yazınız.*/
    
    static double terimToplamı(int N){
        
        if(N == 0){
            return 0;
        }
        return 1.0/N + terimToplamı(N-1);
    }
    
    /*SORU 7) Parametre olarak aldığı bir sayının en büyük basamağındaki rakamı recursive 
olarak bulup geri döndüren metodu yazınız*/
    
    static int enBuyukBasamak(int sayi){
        
        if(sayi < 10){
            return sayi;
        }
        return enBuyukBasamak(sayi / 10);
    }
    
    /*SORU 8) Parametre olarak iki tamsayı alan ve bu iki tamsayı arasındaki tüm sayıların 
toplamını recursive olarak hesaplayıp geri döndüren metodu yazınız.*/
    
    static int sayilarToplami(int a, int b){
        
        if(a+1 >= b){
            return 0;
        }   
        else{
            return (a+1) + sayilarToplami(a + 1, b);
        }
    }
    
    /*SORU 9) İki tamsayı değerini parametre olarak alan ve çarpma operatörünü (*) kullanmadan 
bu iki sayının çarpımını recursive olarak hesaplayıp sonucu geri döndüren metodu yazınız. */
    
    static int carpimHesapla(int a, int b){
        
        if(b == 0){
            return 0;
        }
        else{
            return a + carpimHesapla(a, b - 1);
        }
    }
    
    /*SORU 10) İki tamsayı değerini parametre olarak alan, bölme (/) ve mod (%) operatörlerini 
kullanmadan birinci sayının ikinci sayıya bölümünden kalanı recursive olarak hesaplayıp geri 
döndüren metodu yazınız.*/
    
    static int kalanBul(int a, int b){
        
        if(b > a){
            return a;
        }
        else{
            return kalanBul(a - b, b);
        }
    }
    
    public static void main(String[] args) {
        
        yazdir(5);
        
        int sonuc = fibonacci(7);
        System.out.println("Fibonacci değeri: " + sonuc);
        
        rakamParcala(9734);
        
        int toplam = rakamlarToplami(654);
        System.out.println("\nToplam: " + toplam);
        
        int basamakSonuc = basamakBul(65168);
        System.out.println("Basamak sayısı: " + basamakSonuc);
        
        double toplamDeger = terimToplamı(5);
        System.out.println("Terim toplamı: " + toplamDeger);
        
        int basamak = enBuyukBasamak(29846);
        System.out.println("En büyük basamak: " + basamak);
        
        int toplamSonuc = sayilarToplami(5,10);
        System.out.println("Toplam sonuç: " + toplamSonuc);
        
        int carpimSonuc = carpimHesapla(4, 5);
        System.out.println("Çarpım sonucu: " + carpimSonuc);
        
       int kalanDeger = kalanBul(20, 6);
        System.out.println("Kalan: " + kalanDeger);
    }
    
}
