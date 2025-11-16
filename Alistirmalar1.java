
package alistirmalar;


public class Alistirmalar1 {
    
    public static void main(String[] args) {
        
    
         /*SORU 1) Doğum yılı ve boy (metre), kilo (kg), cinsiyet (E veya K şeklinde bir harf), öğrenci 
numarası değerlerini tutan değişkenleri tanımlayınız, bu değişkenlere değerler atayınız ve 
değişkenleri alt alta konsola yazdıran JAVA programını yazdırınız.*/
 
        int dogumYili = 2000;
        double boy = 1.78;
        double kilo = 78.5;
        char cinsiyet = 'E';
        long ogrenciNumarasi = 284649198489489L;
        
        System.out.println("Doğum yılı: " + dogumYili );
        System.out.println("Boy: " + boy + " metre");
        System.out.println("Kilo: " + kilo + " kg");
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("Öğrenci Numarası: " + ogrenciNumarasi);
        
        System.out.println("---------------------------------");
        
        
        //SORU 2) Üç tamsayının toplamını bulan ve konsola yazdıran JAVA programını yazınız.
        
        int sayi1 = 64;
        int sayi2 = 93;
        int sayi3 = 89;
        int toplam = sayi1 + sayi2 + sayi3;
        
        System.out.println("Toplam: " + toplam );
        
        System.out.println("---------------------------------");
        
        
        //SORU 3) Bir tamsayının karesini ve küpünü konsola yazdıran JAVA programını yazınız.
        
        int sayi = 5;
        int sayininKaresi = sayi*sayi;
        int sayininKupu = sayi*sayi*sayi;
        
        System.out.println("Sayının Karesi: " + sayininKaresi );
        System.out.println("Sayının Küpü: " + sayininKupu);
        
        System.out.println("---------------------------------");
        
        
        //SORU 4) İki tamsayının ortalamasını bulan ve konsola yazdıran JAVA programını yazınız.
        
        int ortalamasayi1 = 8;
        int ortalamasayi2 = 17;
        double ortalama = (double) (ortalamasayi1 + ortalamasayi2)/2;
        
        System.out.println("Sayıların Ortalaması: " + ortalama);
        
        System.out.println("---------------------------------");
        
        
        /*SORU 5) Aşağıdaki formüle göre bir Celsius değerinin Kelvin cinsinden karşılığını 
hesaplayarak konsola yazdıran JAVA programını yazdırınız. 
        K = °C + 273.15 
*/
        double celsiusDegeri = 50.0;
        double kelvinDegeri = celsiusDegeri + 273.15;
        
        System.out.println(celsiusDegeri + " Celsius = " + kelvinDegeri + " Kelvin ");
        
        System.out.println("---------------------------------");
        
        
        /*SORU 6) Yukarıdaki formüle göre bir Kelvin değerinin Celcius cinsinden karşılığını 
hesaplayarak konsola yazdıran JAVA programını yazdırınız.*/
        
        double kelvinDegeri1 = 347.15;
        double celsiusDegeri1 = kelvinDegeri1-273.15;
        
        System.out.println(kelvinDegeri1 + " Kelvin = " + celsiusDegeri1 + " Celsius ");
               
        System.out.println("---------------------------------");
        
        
        /*SORU 7) Bir ürünün fiyatının %18 KDV eklendikten sonraki KDV’li fiyatını hesaplayan ve 
konsola yazdıran JAVA programını yazınız. */
        
        double urunFiyati = 287.50;
        double kdvFiyati = (urunFiyati*18)/100;
        double kdvliUrunFiyati = urunFiyati + kdvFiyati;
        
        System.out.println("KDV'li Fiyat: " + kdvliUrunFiyati + " TL");
        
        System.out.println("---------------------------------");
        
        
        /*SORU 8) Faturanın KDV’li toplam tutarı ve faturanın KDV tutarı bilgilerini kullanarak, 
KDV oranının yüzde kaç olduğunu hesaplayan ve konsola yazdıran JAVA programını 
yazınız. */
        
        double kdvliToplamTutar = 363;
        double kdvTutarı = 63;
        double kdvsizFiyat = kdvliToplamTutar - kdvTutarı;
       double kdvOrani = (kdvTutarı*100)/kdvsizFiyat;
       
       System.out.println("KDV Oranı: " + "%" + kdvOrani);
        
       System.out.println("---------------------------------");
       
       
       /*SORU 9) Yükseklik ve yarıçap uzunluklarına göre bir silindirin hacmini hesaplayan ve 
sonucu konsola yazdıran JAVA programını yazınız. */
       
       //Silindirin Hacmini Hesaplayan Formül: Hacim = Pi * (yarıçap * yarıçap) * yükseklik
       
       int yukseklik = 10;
       int yarıcap = 5;
       double pi = 3.14;
       double hacim = pi*(yarıcap*yarıcap)*yukseklik;
       
       System.out.println("Silindirin Hacmi: "+ hacim);
       
       System.out.println("---------------------------------");
       
       
       /*SORU 10) Dolar miktarına ve dolar kuruna göre, dövizin Türk Lirası karşılığını hesaplayarak 
konsola yazdıran JAVA programını yazınız. */
       
       int dolarMiktari = 100;
       double dolarKuru = 41.90;
       double LiraKarsiligi = dolarMiktari*dolarKuru;
       
       System.out.println("100 Dolar: " + LiraKarsiligi + " TL");
       
       System.out.println("---------------------------------");
       
       
       /*SORU 11) Aşağıdaki formüle göre oC (santigrat derece) değerine karşılık gelen oF  
(Fahrenheit) değerini hesaplayan ve konsola yazdıran JAVA programını yazınız. 
    Fahrenheit = Celsius × (9 / 5) + 32 */
       
       double celsius = 76.0;
       double fahrenheit = (( celsius*9 ) /5 ) + 32;
       
       System.out.println(celsius + " Celsius" + " = " + fahrenheit + " Fahrenheit" );
               
       System.out.println("---------------------------------");


       /*SORU 12) Aşağıdaki formüle göre V1 (ilk hız), V2 (son hız) ve t (süre) değerlerine göre, bir 
aracın ivmesini hesaplayan ve konsola yazdıran JAVA programını yazınız.
    a = V2 - V1 / t   */

       int V1 = 20;
       int V2 = 130;
       int t = 40;
       double ivme = (double) (V2 - V1)/t ;
       
       System.out.println("Aracın İvmesi: " + ivme);
       
       System.out.println("---------------------------------");
       
       
       /*SORU 13) Aşağıdaki formüle göre bir aracın hız (m/s) ve hareket süresi (s) değerlerine göre 
bu aracın bu sürede kaç metre yol aldığını hesaplayıp konsola yazdıran JAVA programını 
yazınız. 
    Hız = Toplam yol / Toplam zaman   */
       
       int aracHizi = 80;
       int hareketSuresi = 25;
       int toplamYol = aracHizi*hareketSuresi;
      
       System.out.println("Araç " + hareketSuresi + " saniyede " + toplamYol + " metre yol alır.");
       
       System.out.println("---------------------------------");
       
       
        /*SORU 14) Yukarıdaki formüle göre bir aracın aldığı yol ve hareket süresi değerlerine göre 
bu aracın hızını hesaplayıp konsola yazdıran JAVA programını yazınız.*/
       
       int aracinAldigiYol = 2000;
       int hareketSuresi1 = 25;
       int hiz = aracinAldigiYol/hareketSuresi1;
       
       System.out.println("Aracın hızı: " + hiz);
       
       System.out.println("---------------------------------");
       
       
       /*SORU 15) Aşağıdaki formüle göre kilometre cinsinden bir mesafenin mil cinsinden 
karşılığını hesaplayarak konsola yazdıran JAVA programını yazınız
    mil = KM / 1.60934     */
       
       double km = 9.5;
       double katsayi = 1.60934;
       double mil = km/katsayi;
       
       System.out.println( km + " KM = " + mil + " MİL");
       
       System.out.println("---------------------------------");
       
       
       /*SORU 16) Yukarıdaki formüle göre mil cinsinden bir mesafenin kilometre cinsinden 
karşılığını hesaplayarak konsola yazdıran JAVA programını yazınız. */
       
       double mil1 = 4.7;
       double katsayi1 = 1.60934;
       double km1 = mil1*katsayi1;
       
       System.out.println(mil1 + " MİL = " + km1 + " KM");
       
       System.out.println("---------------------------------");
       
       
       /*SORU 17) Bir ürünün birim fiyatı ve satın alınan adet bilgilerine göre toplam maliyetini 
hesaplayan ve konsola yazdıran JAVA programını yazınız.  */
       
       
       double birimFiyati = 3.75;
       int alinanAdet = 1500;
       double maliyet = birimFiyati*alinanAdet;
       
       System.out.println("Toplam Maliyet: " + maliyet + " TL");
       
       System.out.println("---------------------------------");
       
       
        /*SORU 18) Bir ürünün kilogram fiyatı ve satın alınan gramaj bilgilerine göre toplam 
maliyetini hesaplayıp konsola yazdıran JAVA programını yazınız. */
        
        int kgFiyati = 17;
        double alinanGramaj = 4500;
        double toplamMaliyet =kgFiyati* (alinanGramaj/1000);
        
        System.out.println("Toplam Maliyet: " + toplamMaliyet + " TL");
        
        System.out.println("---------------------------------");
        
        
        /*SORU 19) İki tamsayıdan, birinci sayının son rakamının ikinci sayının son rakamına 
bölümünden kalanı konsola yazdıran JAVA programını yazınız.*/
        
        int tamSayi = 19;
        int tamSayi1 = 12;
        int kalan = tamSayi % 10;
        int kalan1 = tamSayi1 % 10;
        int tamSayiKalan = kalan % kalan1;
        
        System.out.println("Kalan: " + tamSayiKalan);
        
        System.out.println("---------------------------------");
        
        
        /*SORU 20) Vize, final, quiz ve proje notunu kullanarak bir öğrencinin dönem sonu ağırlıklı 
notunu hesaplayan ve konsola yazdıran JAVA programını yazınız. (Vize %25, quiz %10, 
proje %5 ve final %60 oranında dönem sonu notuna etki etmektedir.)   */
        
        
        int vize = 70;
        int finalSonucu = 80;
        int quiz = 90;
        int proje = 100;
        double notOrtalama = (  (vize*25/100.0) + (finalSonucu*60/100.0) + (quiz*10/100.0) + (proje*5/100.0) );
        
        System.out.println("Not Ortalaması: " + notOrtalama);   
        
        System.out.println("---------------------------------");
        
        
        /* SORU 21)  Virgüllü bir sayının virgülden sonraki kısmını konsola yazdıran JAVA 
programını yazınız. */
        
        double virgulluSayi = 6.53041;
        double virgulSonrasi = virgulluSayi % 1;
        
        System.out.println("Virgül Sonrası Kısım: " + virgulSonrasi);
        
        System.out.println("---------------------------------");
        
        
        /*SORU 22) Birden fazla basamaklı bir sayının birler basamağını bulan ve konsola yazdıran 
JAVA programını yazınız. */
        
        int basamakliSayi = 8458959;
        int birlerBasamagi = basamakliSayi % 10;
        
        System.out.println("Birler Basamağı: " + birlerBasamagi);
        
        System.out.println("---------------------------------");
        
        
        /*SORU 23) Üç basamaklı bir sayının rakamlarının toplamını bulan ve konsola yazdıran JAVA 
programını yazınız. */
        
        int ucBamasakliSayi = 259;
        int birler = ucBamasakliSayi % 10;
        int onlar  = (ucBamasakliSayi / 10) % 10;
        int yuzler = ucBamasakliSayi / 100;
        int rakamlarToplami = birler + onlar + yuzler;
        
        System.out.println("Rakamlar Toplamı: " + rakamlarToplami);
        
        System.out.println("---------------------------------");
        
        
        //SORU 24) İki basamaklı bir sayının rakamlarını terse çeviren JAVA programını yazınız. 
        
        int ikiBasamakliSayi = 38;
        int birlerBasamagi1 = ikiBasamakliSayi % 10;
        int onlarBasamagi1 = ikiBasamakliSayi / 10;
        int yeniSayi = (birlerBasamagi1 * 10) + onlarBasamagi1;
        
        System.out.println("İki Basamaklı Sayı: " + yeniSayi);
        
        System.out.println("---------------------------------");
        
        
        //SORU 25) İki değişkenin değerini birbiriyle değiştiren JAVA programını yazınız.  
        
       int a = 5;
       int b = 9;
       int c = a;
       a = b;
       b = c;
       
       System.out.println("A:" + a + " B:" + b);
       
       System.out.println("---------------------------------");
       
       
       /*SORU 26) İki iç açısı bilinen bir üçgenin üçüncü iç açısını bulan ve konsola yazdıran JAVA 
programını yazınız. */
       
       int aci1 = 65;
       int aci2 = 35;
       int aci3 = 180 - (aci1 + aci2);
       
       System.out.println("Bulunan Açı: " + aci3);
       
       System.out.println("---------------------------------");
       
       
       /*SORU 27) Aşağıdaki kodun çıktısını programı çalıştırmadan tahmin ediniz.
       
           int i = 50 + 20; 
                int j = i - 10; 
                int k = j * 2; 
                double l = k / 6; 
                
                System.out.println("i = " + i); 
                System.out.println("j = " + j); 
                System.out.println("k = " + k); 
                System.out.println("l = " + l);
       */
       
       System.out.println("i = 70" ); 
       System.out.println("j = 60" ); 
       System.out.println("k = 120" ); 
       System.out.println("l = 20" );
       
       System.out.println("---------------------------------");
       
       
       /*SORU 28) Toplam dakika miktarı değerini aşağıdaki örnekte olduğu gibi saat ve dakika 
cinsinden konsola yazan JAVA programını yazınız. */
       
       int dakika = 471;
       int saat = dakika/60;
       int dk = dakika % 60;
       
       System.out.println( dakika + " Dakika: " + saat + " saat " + dk + " dakika");
       
       System.out.println("---------------------------------");
       
       
       /*SORU 29) Şu anki toplam nüfus ve yıllık nüfus artış yüzdesi bilgilerine göre 3 yıllık nüfus 
projeksiyonu yapan programı yazınız. */
       
       int toplamNufus = 85000000;
       int yillikArtis = 4;
       int yil1 = ((toplamNufus * yillikArtis) / 100) + toplamNufus;
       int yil2 = ((yil1 * yillikArtis) / 100) + yil1;
       int yil3 = ((yil2 * yillikArtis) / 100) + yil2;
       
       System.out.println("Bir sene sonra nüfus " + yil1 + " iki sene sonra nüfus " + yil2 + " üç yıl sonraki nüfus " + yil3 +" olmalıdır.");
       
        System.out.println("---------------------------------");
        
        
        /*SORU 30) Bir aracın gideceği mesafe (km), bir litre benzin ile kaç km yol gittiği ve benzinin 
litre fiyatı bilgilerine göre, bu mesafenin araç sahibine kaç TL'ye malolacağını hesaplayan ve 
konsola yazdıran JAVA programını yazınız. */
        
        double mesafe = 375;
        double kmBasiYakilanBenzin = 12;
        double benzinFiyati = 50;
        double toplamMasraf = (mesafe / kmBasiYakilanBenzin) * benzinFiyati;
        
        System.out.println("Toplam Maliyet: " + toplamMasraf + " TL");
    
}
    }