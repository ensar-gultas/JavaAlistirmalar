
package alistirmalar;


public class Alistirmalar2 {
    
    public static void main(String[] args){
        
        /*SORU 1) Bir tamsayının negatif mi, pozitif mi yoksa sıfır mı olduğunu konsola yazdıran 
programı yazınız. */
        
        int sayi = -7;
        
        if (sayi > 0 )
            System.out.println("Sayı pozitiftir.");
        
        else if (sayi<0 )
            System.out.println("Sayı negatiftir.");
        
        else
            System.out.println("Sayı 0'dır.");
        
        System.out.println("---------------------");
        
        /*SORU 2) Sıcaklık değerine göre suyun halini (katı, sıvı veya gaz) konsola yazdıran programı 
yazınız. */
        
        int suyunSicakligi = 72;
        
        if ( suyunSicakligi < 0 )
            System.out.println("Katı haldedir.");
        
        else if ( suyunSicakligi < 100)
            System.out.println("Sıvı haldedir.");
        
        else
            System.out.println("Gaz haldedir.");
        
        System.out.println("---------------------");
        
        
        /*SORU 3) Bir aracın ilk hız ve son hız değerine göre, konsola “Yavaşlıyor”, “Hızlanıyor” 
veya “Sabit Hızda” yazdıran JAVA programını yazınız. */
        
        int ilkHiz = 90;
        int sonHiz = 40;
        
        if( sonHiz < ilkHiz )
            System.out.println("Araç yavaşlıyor.");
        
        else if ( sonHiz > ilkHiz )
            System.out.println("Araç hızlanıyor.");
        
        else
            System.out.println("Araç sabit hızda ilerliyor.");
        
        System.out.println("---------------------");
        
        
        /*SORU 4) Tanımlanan üç açı değeriyle bir üçgen oluşup oluşamayacağını konsola yazdıran 
JAVA programını yazınız. */
        
        int aciA = 65;
        int aciB = 73;
        int aciC = 47;
        int toplam = aciA + aciB + aciC;
        
        if ( toplam == 180)
            System.out.println("Üçgen oluşur.");
        
        else
            System.out.println("Üçgen oluşmaz.");
        
        System.out.println("---------------------");
        
        
        /*SORU 5) Üç tamsayı arasındaki en büyük değeri bulan ve konsola yazdıran JAVA 
programını yazınız. */
        
        int sayiA = 6;
        int sayiB = -9;
        int sayiC = 14;
        
        if (sayiA > sayiB && sayiA > sayiC )
            System.out.println("A sayısı en büyüktür.");
        
        else if (sayiB > sayiA && sayiB > sayiC )
            System.out.println("B sayısı en büyüktür.");
        
        else 
            System.out.println("C sayısı en büyüktür.");
        
        System.out.println("---------------------");
        
        
        /*SORU 6) Üç tamsayı arasındaki en küçük değeri bulan ve konsola yazdıran JAVA 
programını yazınız.*/
        
        int sayiD = 4;
        int sayiE = 7;
        int sayiF = 12;
        
        if (sayiD == sayiE && sayiE == sayiF)
            System.out.println("Tüm sayılar eşittir.");
        
        else if ( sayiD < sayiE && sayiD < sayiF )
            System.out.println("D sayısı en küçüktür.");
        
        else if( sayiE < sayiD && sayiE < sayiF )
            System.out.println("E sayısı en küçüktür.");
            
        else
            System.out.println("F sayısı en küçüktür.");
        
        System.out.println("---------------------");
        
        
        /*SORU 7) Bir öğrencinin vize, ödev ve final notunu kullanarak dönem sonu notunu 
hesaplayan, eğer dönem sonu notu 70 ve üzerindeyse konsola GEÇTİ, değilse KALDI 
yazdıran programı yazınız. 
Dönem sonu notu = 0.3*Vize + 0.2*Ödev + 0.5*Final */
        
        int vizeNotu = 75;
        int odevNotu = 85;
        int finalNotu = 70;
        
        double donemSonuNotu = (vizeNotu * 0.3) + (odevNotu * 0.2) + (finalNotu * 0.5);
        
        if (donemSonuNotu >= 70)
            System.out.println("GEÇTİ");
        else
            System.out.println("KALDI");
        
        System.out.println("---------------------");
        
        
        /* SORU 8) Tanımlanan genel ağırlıklı not ortalaması (GANO) değeri için aşağıdaki aralıklara 
göre uygun harf notunu konsola yazdıran programı yazınız. 
    ? 3.5 ? GANO ? 4.0 ? A 
    ? 3.0 ? GANO < 3.5 ? B 
    ? 2.5 ? GANO < 3.0 ? C 
    ? 2.0 ? GANO < 2.5 ? D 
    ? 1.5 ? GANO < 2.0 ? E 
    ? 0.0 ? GANO < 1.5 ? F 
*/
        double gano = 3.25;
        
        if (gano < 0.0 || gano > 4.0)
            System.out.println("GANO 0.0 - 4.0 ARASINDA OLMALI");
        
        else if (gano >= 3.5 )
            System.out.println("A");
        
        else if (gano >= 3.0)
            System.out.println("B");
        
        else if (gano >= 2.5)
            System.out.println("C");
        
        else if (gano >= 2.0)
            System.out.println("D");
        
        else if (gano >= 1.5)
            System.out.println("E");
        
        else
            System.out.println("F");
        
        System.out.println("---------------------");
        
        
        /*SORU 9) A, B, C, D ve E harf notlarından birinin verildiği bir sistemde, öğrencinin harf 
notuna göre konsola, 
    ? A için “Çok iyi” 
    ? B için “İyi” 
    ? C için “Orta” 
    ? D için “Kötü” 
    ? E için “Çok kötü” 
    yazdıran programı yazınız. */
        
       char harfNotu = 'B';
        
       switch (harfNotu){
           
           case 'A' : System.out.println("Çok iyi");break;
           case 'B' : System.out.println("İyi");break;
           case 'C' : System.out.println("Orta");break;
           case 'D' : System.out.println("Kötü");break;
           case 'E' : System.out.println("Çok kötü");break;
           default : System.out.println("Harf notu A - E arasında olmalı");
           
       }
         System.out.println("---------------------");
         
         
        /*SORU 10) Bir ürünün eski fiyatı ve yeni fiyatına göre, konsola “Bu ürüne %X zam 
gelmiştir” veya “Bu ürüne %X indirim yapılmıştır” ya da “Bu ürünün fiyatı değişmemiştir” 
yazdıran JAVA programını yazınız. */
        
        int eskiFiyat = 150;
        int yeniFiyat = 195;
        int fark = (yeniFiyat - eskiFiyat);
        double oran = ((double)fark / eskiFiyat )* 100;
        
        if (eskiFiyat > yeniFiyat)
            System.out.println("Bu ürüne %" + oran + " indirim yapılmıştır");
        
        else if (eskiFiyat < yeniFiyat)
            System.out.println("Bu ürüne %" + oran + " zam yapılmıştır");
        
        else
            System.out.println("Bu ürünün fiyatı değişmemiştir");
        
         System.out.println("---------------------");
         
         
        /*SORU 11) Switch-case yapısını kullanarak; 0’dan 9’a kadar tanımlanan bir rakamı yazıyla 
konsola yazdıran, eğer bu aralık dışındaysa konsola "Bu bir rakam değildir" şeklinde uyarı 
mesajı yazan programı yazınız. */
        
        int rakam = 7;
         
        switch (rakam){
            case 0: System.out.println("SIFIR");break;   
            case 1: System.out.println("BİR");break;
            case 2: System.out.println("İKİ");break;
            case 3: System.out.println("ÜÇ");break;
            case 4: System.out.println("DÖRT");break;
            case 5: System.out.println("BEŞ");break;
            case 6: System.out.println("ALTI");break;
            case 7: System.out.println("YEDİ");break;
            case 8: System.out.println("SEKİZ");break;
            case 9: System.out.println("DOKUZ");break;
            default:System.out.println("Bu bir rakam değildir");
         }
          System.out.println("---------------------");
          
          
        /*SORU 12) İki basamaklı iki tamsayının, birler basamağındaki rakamların büyüğünü konsola 
yazdıran JAVA programını yazınız. */
          
        int sayi1 = 14;
        int sayi2 = 29;
        int sayi1Kalan = sayi1 % 10;
        int sayi2Kalan = sayi2 % 10;
        
        if (sayi1Kalan > sayi2Kalan)
            System.out.println(sayi1Kalan);
          
        else if (sayi1Kalan < sayi2Kalan )
            System.out.println(sayi2Kalan);
          
        else 
            System.out.println("Birler basamakları eşittir.");
          
           System.out.println("---------------------");
           
           
        /*SORU 13) Zam dönemindeki bir firmada 0-5 yıl arası çalışanlara %20, 6-10 yıl arası 
çalışanlara %25, 11 ve üzeri yıl çalışanlara ise %30 zam yapılacaktır. Buna göre bir çalışanın 
mevcut maaşı ve çalışma yılına göre alacağı yeni maaşı hesaplayan ve konsola yazdıran 
programı yazınız.*/
        
        int mevcutMaas = 50000;
        int calismaYili = 8;
        int yeniMaas = 0;
        
        if (calismaYili >= 11){
             yeniMaas = mevcutMaas + (mevcutMaas * 30) / 100;
            System.out.println("Yeni Maaşı: " + yeniMaas + " TL");
        }
        else if (calismaYili >= 6){
             yeniMaas = mevcutMaas + (mevcutMaas * 25) / 100;
            System.out.println("Yeni Maaşı: " + yeniMaas + " TL");
        }
        else {
             yeniMaas = mevcutMaas + (mevcutMaas * 20) / 100;
        System.out.println("Yeni Maaşı: " + yeniMaas + " TL");
        }
        System.out.println("---------------------");
         
         
        /*  SORU 14) Bir şirket sadece aşağıdaki durumlarda çalışanlarını sigortalamaktadır. 
    ? Çalışan evli ise 
    ? Çalışan evli değilse, erkek ve 30 yaşın üzerindeyse 
    ? Çalışan evli değilse, kadın ve 25 yaşın üzerindeyse 
    Buna göre, bir çalışanın medeni hali, cinsiyeti ve yaşına göre sigortalı olup olmayacağını 
    kontrol eden programı yazınız. */
        
        boolean evliMi = false;
        int yas = 32;
        String cinsiyet = "Erkek";
        
        if ( evliMi )
            System.out.println("Sigortalanabilir");
        
        else if (cinsiyet == "Erkek" && yas > 30)
            System.out.println("Sigortalanabilir");
        
        else if (cinsiyet == "Kadın" && yas > 25)
            System.out.println("Sigortalanabilir");
        
        else
            System.out.println("Sigortalanamaz");
        
        System.out.println("---------------------");
        
        
        /*SORU 15) Okulun kütüphanesinden alınan bir kitap zamanında teslim edilmezse gecikme 
gün sayısına göre öğrenciye ceza kesilmektedir. Gecikme süresi 1 haftaya kadar olursa 
günlük 10 TL, 3 haftaya kadar olursa 100 TL ile birlikte günlük 15 TL, 3 haftadan daha uzun 
olursa da 300 TL ile birlikte günlük 20 TL öğrenciye ceza kesilmektedir. Kütüphaneden 
aldığı kitabı zamanında teslim etmeyen bir öğrencinin, gecikme süresine göre ödemesi 
gereken toplam ceza tutarını hesaplayan programı yazınız. */
        
        int gecikenGun = 24;
        int ceza = 0;
        
        if (gecikenGun < 7){
            ceza = gecikenGun * 10;
        System.out.println(ceza);
        }
        else if (gecikenGun < 21){
            ceza = (gecikenGun * 15) + 100;
            System.out.println(ceza);
        }
        else{
            ceza = (gecikenGun * 20) + 300;
        System.out.println(ceza);
        }
        System.out.println("---------------------");
        
        
        /*SORU 16) Tanımlanan üç kenar uzunluğu ile bir üçgen oluşup oluşamayacağını kontrol 
ederek sonucu konsola yazdıran programı yazınız.  */
        
        int kenarA = 6;
        int kenarB = 9;
        int kenarC = 4;
        
        if (kenarA + kenarB > kenarC && kenarA + kenarC > kenarB && kenarB + kenarC > kenarA)
            System.out.println("Üçgen oluşabilir");
        
        else 
            System.out.println("Üçgen oluşamaz");
        
        System.out.println("---------------------");
        
        
        /*SORU 17) Tanımlanan üç tamsayı değerini kendi aralarında karşılaştırarak küçükten büyüğe 
olacak şekilde konsola yazdıran programı yazınız. */
        
        int sayiX = 9;
        int sayiY = 1;
        int sayiZ = 4;
        
        if (sayiX < sayiY && sayiY < sayiZ )
            System.out.println(sayiX + "," + sayiY + "," + sayiZ);
        
        else if (sayiX < sayiZ && sayiZ < sayiY )
            System.out.println(sayiX + "," + sayiZ + "," + sayiY);
        
        else if(sayiZ < sayiY && sayiY < sayiX )
            System.out.println(sayiZ + "," + sayiY + "," + sayiX);
        
        else if (sayiZ < sayiX && sayiX < sayiY )
            System.out.println(sayiZ + "," + sayiX + "," + sayiY);
        
        else if (sayiY < sayiX && sayiX < sayiZ )
            System.out.println(sayiY + "," + sayiX + "," + sayiZ);
        
        else
            System.out.println(sayiY + "," + sayiZ + "," + sayiX);
        
        System.out.println("---------------------");
        
        
        /*SORU 18) Tanımlanan üç tamsayı değerinin artan sırada mı, azalan sırada mı yoksa sırasız 
mı olduğunu kontrol eden programı yazınız. */
        
        int sayiK = 12;
        int sayiL = 5;
        int sayiM = 37;
        
        if (sayiK < sayiL && sayiL < sayiM)
            System.out.println("ARTAN");
        
        else if (sayiK > sayiL && sayiL > sayiM)
            System.out.println("AZALAN");
        
        else
            System.out.println("SIRASIZ");
        
        System.out.println("---------------------");
        
        
        /*SORU 19) Market rafındaki iki farklı firmaya ait bitter çikolatanın gramaj ve fiyat bilgilerine 
göre fiyat-performans olarak hangi ürünü almanın daha avantajlı olduğunu konsola yazdıran 
programı yazınız. */
        
        int bitter1Fiyati = 60;
        int bitter1Gramaj = 40;
        int bitter2Fiyati = 80;
        int bitter2Gramaj = 110;
        
        double bitter1Oran = (double) bitter1Fiyati / bitter1Gramaj;
        double bitter2Oran = (double) bitter2Fiyati / bitter2Gramaj;
        
        if (bitter1Oran < bitter2Oran)
            System.out.println("Birinci bitter daha avantajlı");
        
        else
            System.out.println("İkinci bitter daha avantajlı");
        
        System.out.println("---------------------");
        
        
        /*SORU 20) Tamsayı olarak tanımlanan iki değer ve karakter tipinde tanımlanan operatöre 
(+, -, *, / veya %) göre, bu iki sayı üzerinde işlem yapan ve sonucu ekrana yazdıran programı 
yazınız. */
        
        int tamSayi1 = 16;
        int tamSayi2 = 5;
        char operator = '%';
        
        switch (operator){
            case '+': System.out.println(tamSayi1 + tamSayi2);break;
            case '-': System.out.println(tamSayi1 - tamSayi2);break;
            case '*': System.out.println(tamSayi1 * tamSayi2);break;
            case '/': 
                 if (tamSayi2 == 0) {
            System.out.println("Sıfıra bölme yapılamaz!");
        } else {
            System.out.println(tamSayi1 / tamSayi2);
        }break;
            case '%':
        if (tamSayi2 == 0) {
            System.out.println("Mod işlemi için bölen sıfır olamaz!");
        } else {
            System.out.println(tamSayi1 % tamSayi2);
        }
        break;

    default:
        System.out.println("Geçersiz operatör! (+, -, *, / veya % olmalı)");
        }
    
}

    }
