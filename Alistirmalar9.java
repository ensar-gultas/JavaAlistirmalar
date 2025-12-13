
package alistirmalar;

import java.util.Scanner;


public class Alistirmalar9 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*SORU 1) Kullanıcıdan 3 tamsayı değer girmesini isteyen, bu üç sayının ortalamasını bulan ve 
sonucu konsola yazdıran programı yazınız.*/
        
        
        int toplam = 0;
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Sayıyı giriniz: ");
            int sayi = input.nextInt();
            toplam += sayi;
        }
        double ortalama = toplam/3.0;
        System.out.println("Sayıların ortalaması: " + ortalama);
        
        /*SORU 2) Kullanıcıdan bir sayı girmesini isteyen ve bu sayının negatif mi, pozitif mi yoksa 
sıfır mı olduğunu konsola yazdıran programı yazınız.*/
        
        System.out.print("Sayıyı giriniz:");
        int sayi1 = input.nextInt();
        
        if(sayi1 > 0){
            System.out.println("Sayı pozitif");
        }
        else if(sayi1 < 0){
            System.out.println("Sayı negatif");
        }
        else{
            System.out.println("Sayı sıfır");
        }
        
        /*SORU 3) Kullanıcıya aşağıdaki örnekte olduğu gibi bir işlem menüsü sunan, kullanıcıdan bir 
işlem seçmesini ve iki sayı girmesini isteyen, kullanıcının girdiği sayılar üzerinde seçtiği 
işlemi yapıp sonucu konsola yazdıran programı yazınız.  
Örnek;            
1- Toplama 
2- Çıkarma 
3- Bölme 
4- Çarpma 
5- Mod alma 
Yapmak istediğiniz işlemin numarasını giriniz: 3 
İlk sayıyı giriniz: 9 
İkinci sayıyı giriniz: 2 
Sonuç: 4.5 */
        
        System.out.print("İlk sayıyı giriniz: ");
        double sayiA = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double sayiB = input.nextDouble();
        
        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Bölme");
        System.out.println("4- Çarpma");
        System.out.println("5- Mod alma");
        System.out.print("Yapmak istediğin işlemin numarasını gir: ");
        
        
        double islem = input.nextDouble();
        
        if(islem == 1){
            islem = sayiA + sayiB;
        }
        else if(islem == 2){
            islem = sayiA - sayiB;
        }
        else if(islem == 3){
            islem = sayiA / sayiB;
        }
        else if(islem == 4){
            islem = sayiA * sayiB;
        }
        else if(islem == 5){
            islem = sayiA % sayiB;
        }
        else{
            System.out.println("İşlem için girilen değer 1-5 arasında olmalıdır.");
        }
        System.out.println("Sonuç: " + islem);
        
        /*SORU 4) Kullanıcıdan tekrar tekrar sayı girmesini isteyen ve toplam 100 veya üzeri 
olduğunda duran, toplamı ve sayı adetini konsola yazdıran programı yazınız.*/
        
        int toplamDeger = 0;
        int sayac = 0;
        
        while(toplamDeger < 100){
            System.out.print("Sayı giriniz: ");
            int sayi = input.nextInt();
            toplamDeger += sayi;
            sayac++;
        }
        System.out.println("Toplam :" + toplamDeger + " Sayı adedi: " + sayac);
        
        /*SORU 5) Kullanıcıdan tekrar tekrar sayı girmesini isteyen ve kullanıcı 0 girdiğinde duran, 
toplamı ve sayı adetini konsola yazdıran programı yazınız.*/
        
        int toplam1 = 0;
        int sayac1 = 0;
        
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        while (sayi != 0) {           
            toplam1 += sayi;
            sayac1++;

            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();  
        }
        
        System.out.println("Toplam :" + toplam1 + " Sayı adedi: " + sayac1);
    
        /*SORU 6) Kullanıcıdan elindeki ürünün maliyetini ve satış fiyatını girmesini isteyen, girilen 
değerlere göre kullanıcının bu alışverişte kâr mı, zarar mı ettiğini kontrol eden, sonucu kâr 
veya zarar oranıyla birlikte konsola yazdıran programı yazınız. 
Örneğin; Maliyet: 800, Satış: 1420 girilirse konsola “%77.5 kar” yazmalıdır.*/ 
        
        System.out.print("Maliyet fiyatını giriniz: ");
        int maliyet = input.nextInt();
        System.out.print("Satış fiyatını giriniz: ");
        int satis = input.nextInt();
        
        int karZarar = satis - maliyet;
        double karZararOrani = ((double)karZarar / maliyet)*100;
        
        if(satis > maliyet){
            System.out.println("Kar-Zarar Oranı: " + "%" + karZararOrani + " kar");
        }
        else{
            System.out.println("Kar-Zarar Oranı: " + "%" + karZararOrani + " zarar");
        }   
        
        /*SORU 7) Kullanıcıdan iki sayı girmesini isteyen, girilen sayılardan hangisinin 0’a daha yakın 
olduğunu konsola yazdıran programı yazınız. 
Örneğin; 
5 ve 19 girilirse konsola 5 yazdırılmalıdır. -10 ve 13 girilirse konsola -10 yazdırılmalıdır.*/
        
        System.out.print("Sayı giriniz: ");
        int sayiX = input.nextInt();
        System.out.print("Sayı giriniz: ");
        int sayiY = input.nextInt();
        
        int uzaklikX = sayiX - 0;
        int uzaklikY = sayiY - 0;
        
        if(sayiX < 0){
            uzaklikX = sayiX * -1;
        }
        if(sayiY < 0){
            uzaklikY = sayiY * -1;
        }
        if(uzaklikX > uzaklikY){
            System.out.println("0' a daha yakın olan sayı: " + sayiY);
        }
        else{
            System.out.println("0'a daha yakın olan sayı: " + sayiX);
        }
        
        /*SORU 8) Kullanıcıya aşağıdaki örnekte olduğu gibi alanını hesaplamak istediği geometrik 
cismin hangisi olduğunu soran, kullanıcının seçtiği geometrik cisme göre kullanıcıdan gerekli 
değerleri girmesini isteyen, girilen değerlere göre seçilen cismin alanını hesaplayan ve 
sonucu konsola yazdıran programı yazınız. 
Örnek1; 
Örnek2; 
1- Dikdörtgen 
2- Üçgen 
3- Daire 
Alanını hesaplamak istediğiniz cismin numarasını giriniz: 2 
Yüksekliği giriniz: 5 
Taban uzunluğunu giriniz: 3 
Alan = 7.5 
1- Dikdörtgen 
2- Üçgen 
3- Daire 
Alanını hesaplamak istediğiniz cismin numarasını giriniz: 3 
Yarıçapı giriniz: 5 
Alan = 28.26 */
        
        System.out.println("1- Dikdörtgen");
        System.out.println("2- Üçgen");
        System.out.println("3- Daire");
        System.out.print("Alanını hesaplamak istediğiniz cismin numarasını giriniz: ");
        
        double cisim = input.nextDouble();
        
        if(cisim == 1){
            System.out.print("Kısa kenarı giriniz: ");
            double kisaKenar = input.nextDouble();
            System.out.print("Uzun kenarı giriniz: ");
            double uzunKenar = input.nextDouble();
            
            double alan = kisaKenar*uzunKenar;
            System.out.println("Alan: " + alan);
        }
        else if(cisim == 2){
            System.out.print("Taban uzunluğunu giriniz: ");
            double taban = input.nextDouble();
            System.out.print("Yüksekliği giriniz: ");
            double yukseklik = input.nextDouble();
            
            double alan = (taban*yukseklik)/2;
            System.out.println("Alan: " + alan);
        }
        else if(cisim == 3){
            System.out.print("Yarıçapı giriniz: ");
            double yaricap = input.nextDouble();
            
            double alan = 3.14*(yaricap*yaricap);
            System.out.println("Alan: " + alan);
        }
        else{
            System.out.println("Seçilen cisim 1-3 değerleri arasında olmalıdır");
        }
        
        /*SORU 9) Kullanıcıdan sırasıyla Matematik, Web, Giriş ve Programlama derslerinden aldığı 
0-100 arasındaki (sınırlar dâhil) notları girmesini isteyen, girilen notlardan en büyük olanı, en 
küçük olanı ve tüm notların ortalamasını konsola yazdıran, son olarak tüm notların ortalaması 
70 ve üzeri ise konsola “Başarılı” değilse “Başarısız” yazdıran programı yazınız. */
       
       String [] dersler = {"Matematik", "Web", "Giriş", "Programlama"};
       int [] notlar = new int[4];
      
       int toplamNot = 0;
       
        for (int i = 0; i < dersler.length; i++) {
            System.out.print(dersler[i] + " notunu giriniz: ");
            int girilenNot = input.nextInt();
            
            if(girilenNot < 0 || girilenNot > 100){
                System.out.println("Not 0-100 arasında olmalı");
                i--;
                continue;
            }
            else{
                notlar[i] = girilenNot;
                toplamNot += girilenNot;
            }
        }
        
        int max = notlar[0];
        int min = notlar[0];
        
        for (int i = 0; i < notlar.length; i++) {
            if(max < notlar[i]){
                max = notlar[i];
            }
            if(min > notlar[i]){
                min = notlar[i];
            }
        }
        double notlarOrtalama = toplamNot/4.0;
        
        System.out.println("En yüksek not: " + max);
        System.out.println("En küçük not: " + min);
        System.out.println("Notların ortalaması: " + notlarOrtalama);
        if(notlarOrtalama >= 70){
            System.out.println("Başarılı");
        }
        else{
            System.out.println("Başarısız");
        }
        
        /*SORU 10) Kullanıcıdan bir başlangıç değeri, bir bitiş değeri ve artış miktarı girmesini 
isteyen, başlangıç değerinden bitiş değerine kadar artış miktarı kadar artırarak elde edilen 
sayıları ve bunların toplamını ekrana yazdıran programı yazınız. (Eğer başlangıç değeri bitiş 
değerinden küçük ve artış miktarı negatif girilirse ya da başlangıç değeri bitiş değerinden 
büyük ve artış miktarı pozitif girilirse uyarı veriniz!) 
Örnek;  
Başlangıç = 15 
Bitiş = 29 
Artış miktarı = 4  
15, 19, 23, 27 
Toplam = 84 */
        
        System.out.print("Başlangıç değeri giriniz: ");
        int baslangic = input.nextInt();
        System.out.print("Bitiş değeri giriniz: ");
        int bitis = input.nextInt();
        System.out.print("Artış miktarını giriniz: ");
        int artisMiktari = input.nextInt();
        
        if((baslangic < bitis && artisMiktari < 0) || (baslangic > bitis && artisMiktari > 0)){
            System.out.println("Uyarı!");
        }
        else{
        int degerlerToplami = 0;
        
        System.out.print("Elde edilen sayılar: ");
        for (int i = baslangic; i <= bitis; i += artisMiktari){
            System.out.print(i + " ");
            degerlerToplami += i;
        }
        System.out.println("\nSayıların toplamı : " + degerlerToplami);     
        }
    }
}