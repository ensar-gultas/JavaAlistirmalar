
package alistirmalar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Alistirmalar14 {
    
    static void adetSay(String metin){

        char [] karakterler = metin.toCharArray();
        
        int tersCizgi = 0, ciftTirnak = 0;
        
        for(char karakter : karakterler){
            if(karakter == '\\'){
                tersCizgi++;
            }
            if(karakter == '"'){
                ciftTirnak++;
            }
        }
        System.out.println("Ters çizgi: " + tersCizgi + "| Çift tırnak: " + ciftTirnak);
    }
    
    static void satiraYazdir(String metin){
        
        String [] kelimeler = metin.split(" ");
        
        for(String kelime : kelimeler){
            System.out.println(kelime);
        }
    }
    
    static void yildizYazdir(String metin){
        
        String [] kelimeler = metin.split(" ");
        
        for (int i = 0; i < kelimeler.length; i++) {
            for (int j = 0; j < kelimeler[i].length(); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static String tersCevir(String metin){
        
        String yeniMetin = "";
        
        for (int i = metin.length()-1; i >= 0 ; i--) {
            yeniMetin += metin.charAt(i);
        }
        return yeniMetin;
    }
    
    static boolean palindromeMi(String metin){
        
        boolean ayniMi = true;
        String yeniDizi = "";
        
        for (int i = metin.length()-1; i >= 0; i--) {
            yeniDizi += metin.charAt(i);
        }
        if(!metin.equals(yeniDizi)){
            ayniMi = false;
        }
        return ayniMi;
    }
    
    static char tekrarEtmeyen(String metin){
        
        char [] karakterler = metin.toCharArray();
                
        for (int i = 0; i < karakterler.length; i++) {
            int sayac = 0;
            for (int j = 0; j < karakterler.length; j++) {
                if(karakterler[i] == karakterler[j]){
                    sayac++;
                }
            }
            if(sayac == 1){
                return karakterler[i];
            }
        }
        return ' ';
    }
    
    static int kelimeSayisi(String metin, char harf){
        
        String [] kelimeler = metin.split(" ");
        
        int sayac = 0;
        
        for (int i = 0; i < kelimeler.length; i++) {
            if(kelimeler[i].charAt(0) == harf){
                sayac++;
            }
        }
        return sayac;
    }
    
    static String ilkBuyuk(String metin){
        
        String [] kelimeler = metin.split(" ");
        String yeniMetin = "";
        
        for (int i = 0; i < kelimeler.length; i++) {
            String kelime = kelimeler[i];
            
            String ilkHarf = kelime.substring(0, 1).toUpperCase();
            String kalan = kelime.substring(1);
            
            yeniMetin += ilkHarf + kalan + " ";
        }
        return yeniMetin;
    }
    
    static String tekrarSil(String metin){
        
        String yeniMetin = "";
        
        for (int i = 0; i < metin.length(); i++) {
            
            if(!yeniMetin.contains(metin.charAt(i) + "")){
                yeniMetin += metin.charAt(i);
            } 
        }
        return yeniMetin;
    }
    
    static char cokTekrar(String metin){
        
        char [] karakterler = metin.toCharArray();
        char maxKarakter = '0';
        int max = 0;
        
        for (int i = 0; i < karakterler.length; i++) {
            char karakter = karakterler[i];
            int tekrar = 0;
            for (int j = 0; j < karakterler.length; j++) {
                if(karakter == karakterler[j]){
                    tekrar++;
                }
            }
            if(tekrar > max){
                max = tekrar;
                maxKarakter = karakterler[i];
            }
        }
        return maxKarakter;
    }
    
    static int yanYanaTekrar(String metin){
        
        int maksTekrar = 0;
        int tekrarSayisi = 1;
        
        for (int i = 0; i < metin.length()-1; i++) {
            
            if(metin.charAt(i) == metin.charAt(i+1) ){
                tekrarSayisi++;
            }
            else{
                if(maksTekrar < tekrarSayisi){
                    maksTekrar = tekrarSayisi;
                }
                tekrarSayisi = 1;
            }
        }
        if(maksTekrar < tekrarSayisi){
            maksTekrar = tekrarSayisi;
        }
        return maksTekrar;
    }
    
    static String runYontemi(String metin){
        
    String yeniDizi = "";
    int tekrar = 1;    
    
        for (int i = 0; i < metin.length()-1; i++) {
            if(metin.charAt(i) == metin.charAt(i+1)){
                tekrar++;
            }
            else{
                yeniDizi += "" +  metin.charAt(i) + tekrar;
                tekrar = 1;
            }
        }
        yeniDizi += "" + metin.charAt(metin.length()-1) + tekrar;
        return yeniDizi;
    }
    
    static boolean rotasyon(String metin1, String metin2){
        
        if(metin1.length() != metin2.length()){
            return false;
        }
        
        String yeniMetin1 = metin1 + metin1;
        
        if(!yeniMetin1.contains(metin2)){
            return false;
        }
        return true;
    }
    
    static boolean anagram(String metin1, String metin2){
        
        if(metin1.length() != metin2.length()){
            return false;
        }
        
        for (int i = 0; i < metin1.length(); i++) {
            
            char harf = metin1.charAt(i);
            int sayac1 = 0, sayac2 = 0;
            
            for (int j = 0; j < metin1.length(); j++) {
                
                if(harf == metin1.charAt(j)){
                    sayac1++;
                }
            }
            
            for (int j = 0; j < metin2.length(); j++) {
                
                if(harf == metin2.charAt(j)){
                    sayac2++;
                }
            }
            if(sayac1 != sayac2){
                return false;
            }
        }
        return true;
    }
    
    static boolean email(String metin){
        
        int index1 = 0, index2 = 0;
        int sayac1 = 0;
        boolean noktaVarMi = false;
        
        for (int i = 0; i < metin.length(); i++) {
            
            char karakter = metin.charAt(i);
            
            if(karakter == '@'){
                sayac1++;
                index1 = i;
            }
            
            if(karakter == '.' && i > index1){
                noktaVarMi = true;
                index2 = i;
            }
        }
        if(index1 == 0 || index1 == metin.length()-1 || sayac1 != 1){
                return false;
            }
            if(!noktaVarMi){
                return false;
            }
            if(index2 == 0 || index2 == metin.length()-1){
                return false;
            }
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        
        /*SORU 1) Bir string değeri parametre olarak alan ve bu string’deki ters eğik çizgi ( \ ) ve çift 
tırnakların ( “ ) sayısını bularak konsola yazdıran metodu yazınız. */
        
        String metin1 = "C:\\Projeler\\\"Raporlar\\\"";
        adetSay(metin1);
        
        /*SORU 2) Bir string değeri parametre olarak alan ve bu string’in her bir kelimesini ayrı bir 
satırda konsola yazdıran metodu yazınız.*/
        
        String metin2 = "Bir iki üç dört";
        satiraYazdir(metin2);
        
        /*SORU 3) Bir string değeri parametre olarak alan ve bu string’in her bir kelimesi için ayrı bir 
satırda o kelimedeki karakter sayısı kadar konsola yıldız yazdıran metodu yazınız.*/
        
        String metin3 = "Bir iki üç dört";
        yildizYazdir(metin3);
        
        /*SORU 4) Bir string değeri parametre olarak alan ve bu stringi ters çevrilmiş halini geri 
döndüren metodu yazınız.*/
        
        String metin4 = "Bir iki üç dört";
        
        String sonuc = tersCevir(metin4);
        System.out.println("Ters çevrilmiş hali: " + sonuc);
        
        /*SORU 5) Bir string değeri parametre olarak alan ve bu string palindrome mudur (tersi 
kendisine eşit midir) diye kontrol eden, palindrome ise true değilse false geri döndüren 
metodu yazınız.*/
        
        String metin5 = "iki";
        
        boolean palindromeSonuc = palindromeMi(metin5);
        System.out.println("Palindrome mi: " + palindromeSonuc);
        
        /*SORU 6) Bir string değeri parametre olarak alıp, bu stringdeki ilk tekrar etmeyen karakteri 
geri döndüren metodu yazınız.*/
        
        String metin6 = "11122233455";
        
        char tekrarSonuc = tekrarEtmeyen(metin6);
        System.out.println("İlk tekrar etmeyen: " + tekrarSonuc);
        
        /*SORU 7) Bir string ve bir harfi parametre olarak alan, string’deki o harfle başlayan 
kelimelerin sayısını geri döndüren metodu yazınız.*/
        
        String metin7 = "Bir iki üç dört beş";
        char harf = 'b';
        
        int kelimeAdet = kelimeSayisi(metin7, harf);
        System.out.println("Kelime sayısı: " + kelimeAdet);
        
        /*SORU 8) Bir string değeri parametre olarak alan ve bu string’in her kelimesinin ilk harfini 
büyük harfe çevirip string’i geri döndüren metodu  yazınız.*/
        
        String metin8 = "Bir iki üç dört beş";
        
        String buyukYap = ilkBuyuk(metin8);
        System.out.println("Yeni metin : " + buyukYap);
        
        /*SORU 9) Bir string değeri parametre olarak alan ve bu string’deki tekrar eden karakterleri 
silip string’i geri döndüren metodu yazınız.*/
        
        String metin9 = "1223455677";
        
        String sonMetin = tekrarSil(metin9);
        System.out.println("Yeni metin: " + sonMetin);
        
        /*SORU 10) Bir string değeri parametre olarak alıp, içinde en çok tekrar eden karakteri geri 
döndüren metodu yazınız.*/
        
        String metin10 = "12234555677";
        
        char maxTekrar = cokTekrar(metin10);
        System.out.println("Max tekrar eden karakter: " + maxTekrar);
        
        /*SORU 11) Bir string değeri parametre olarak alan ve bu string içindeki en çok yan yana 
geçen aynı harflerin sayısını geri döndüren metodu yazınız.*/
        
        String metin11 = "122234555677";
        
        int maxTekrarSonuc = yanYanaTekrar(metin11);
        System.out.println("Yan yana max tekrar: " + maxTekrarSonuc);
        
        /*SORU 12) Bir string değeri parametre olarak alan, Run Length Encoding  (RLE) yöntemine 
göre bu stringin sıkıştırılmış halini geri döndüren metodu yazınız. Bu yöntemde yan yana 
tekrar eden aynı karakter bir kez yazılıp, yanına tekrar sayısı yazılır, bu şekilde içinde çok 
fazla yan yana tekrarlar olan metinler sıkıştırılır.*/
        
        String metin12 = "aaabbcddddee";
        
        String runMetin = runYontemi(metin12);
        System.out.println("Run yöntemli metin: " + runMetin);
        
        /*SORU 13) İki string değeri parametre olarak alan, bu iki string’in birbirinin rotasyonu 
(harflerinin sırasının X kadar sağa kaymış hali) olup olmadığını  kontrol eden, eğer öyle ise 
true, değilse false geri döndüren metodu yazınız.*/
        
        String metinA = "ABCD";
        String metinB = "CDAB";
        
        boolean rotasyonMu = rotasyon(metinA, metinB);
        System.out.println("Rotasyon mu:" + rotasyonMu);
        
        /*SORU 14) İki string değeri parametre olarak alan ve bu iki string’in anagram olup olmadığını 
kontrol eden, anagram iseler true, değilseler false geri döndüren metodu yazınız. Anagram 
string’ler, aynı sayıda ve tam olarak aynı karakterlere sahiptir ama karakterlerin yerleri 
farklıdır.*/
        
        String metinC = "enerjik";
        String metinD = "jenerik";
        
        boolean anagramMi = anagram(metinC, metinD);
        System.out.println("Anargam mı: " + anagramMi);
        
        /*SORU 15) Parametre olarak aldığı bir string’in email formatında olup olmadığını kontrol 
ederek true ya da false geri döndüren metodu yazınız.*/
        
        String metin15 = "abc@def.com";
        
        boolean emailMi = email(metin15);
        System.out.println("Email formatında mı: " + emailMi);
        
        
        //DOSYA SORULARI
                
        /*SORU 1) Bir tamsayı dizisi içindeki her elemanı ayrı satırda bir txt dosyasına yazan 
programı yazınız.*/
        
        FileWriter yazici = new FileWriter("deneme.txt");
        
        int [] dizi = {1,2,3,4,5};
        
        for (int i = 0; i < dizi.length; i++) {
            yazici.write(dizi[i] + "\n");
        }
        yazici.close();
        
        //SORU 2) Bir txt dosyasının içeriğini başka bir txt dosyasına yazan programı yazınız.
        
        FileWriter yazici2 = new FileWriter("deneme2.txt");
        File dosya = new File("deneme.txt");
        Scanner okuyucu = new Scanner(dosya);
        
        while(okuyucu.hasNextLine() == true){
            String satir = okuyucu.nextLine();
            
            yazici2.write(satir + "\n");
        }
        okuyucu.close();
        yazici2.close();
        
        //SORU 3) İki txt dosyasını tek bir txt  dosyası içinde birleştiren programı yazınız.
        
        FileWriter yazici3 = new FileWriter("deneme3.txt");
        dosya = new File("deneme.txt");
        okuyucu = new Scanner(dosya);
        
        while(okuyucu.hasNextLine()){
            String satir = okuyucu.nextLine();
            yazici3.write(satir + "\n");
        }
        okuyucu.close();
        
        dosya = new File("deneme2.txt");
        okuyucu = new Scanner(dosya);
        
        while(okuyucu.hasNextLine()){
            String satir = okuyucu.nextLine();
            yazici3.write(satir + "\n");
        }
        okuyucu.close();
        yazici3.close();
        
        /*SORU 4) Bir txt dosyasında kullanıcının girdiği bir kelimeyi arayan ve o kelimenin geçtiği 
satırların numarasını konsola yazdıran programı yazınız.*/
        
        String metin = "Bir iki üç dört beş altı";
        String [] kelimeler = metin.split(" ");
        
        FileWriter yazici4 = new FileWriter("deneme4.txt");
        
        for (int i = 0; i < kelimeler.length; i++) {
            yazici4.write(kelimeler[i] + "\n");
        }
        yazici4.close();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Aranan kelimeyi giriniz: ");
        String aranan = input.nextLine();
        
        dosya = new File("deneme4.txt");
        okuyucu = new Scanner(dosya);
        
        int satirSayaci = 1;
        while(okuyucu.hasNextLine()){
            String satir = okuyucu.nextLine();
            
            if(satir.toLowerCase().contains(aranan.toLowerCase())){
                System.out.println("Kelimenin geçtiği satır: " + satirSayaci);
            }
            satirSayaci++;
        }
        okuyucu.close();
        
        /*SORU 5) Bir txt dosyasında kullanıcının girdiği bir kelimeyi arayan ve o kelimenin dosyada 
kaç kez geçtiğini bulan ve sonucu konsola yazdıran programı yazınız.*/
        
        String yazi = "Bir iki iki üç dört dört dört beş beş";
        String [] kelimeler2 = yazi.split(" ");
        
        FileWriter yazici5 = new FileWriter("deneme5.txt");
        
        for (int i = 0; i < kelimeler2.length; i++) {
            yazici5.write(kelimeler2[i] + "\n");
        }
        yazici5.close();
        
        System.out.print("Bir kelime giriniz: " );
        String girilen = input.nextLine();
        
        dosya = new File("deneme5.txt");
        okuyucu = new Scanner(dosya);
        
        int sayac = 0;
        while(okuyucu.hasNext()){
            String kelime = okuyucu.nextLine();
            
            if(kelime.toLowerCase().equals(girilen.toLowerCase())){
                sayac++;
            }
        }
        System.out.println("Girilen kelime " + sayac + " kez bulunuyor.");
        okuyucu.close();
        
        /*SORU 6) Aşağıdaki gibi bir kaynak dosyasındaki verileri, hedef dosyasına aşağıdaki şekilde 
yazan programı yazınız.*/
        
        String kaynak = "Ali,Demir,1234,BLM,"
                      + "Veli,Çelik,1235,BME,";
        String [] kaynakMetin = kaynak.split(",");
        
        FileWriter yazici6 = new FileWriter("deneme6.txt");
        
        for (int i = 0; i < kaynakMetin.length; i++) {
            yazici6.write(kaynakMetin[i] + "," );
            if(i == 3){
                yazici6.write("\n");
            }
        }
        yazici6.close();
        
        FileWriter yazici6_1 = new FileWriter("deneme6_1.txt");
        
        dosya = new File("deneme6.txt");
        okuyucu = new Scanner(dosya);
        
        while(okuyucu.hasNextLine()){
            String satir = okuyucu.nextLine();
            String [] parcalar = satir.split(",");
            
            yazici6_1.write(parcalar[2] + " - " + parcalar[0].toUpperCase() + " "
                    + parcalar[1].toUpperCase() + ", " + parcalar[3] + "\n");
             
        }
        okuyucu.close();
        yazici6_1.close();
        
        //SORU 7) Bir dosyayı okuyup her bir satırını string dizisine atan programı yazınız.
        
        String diziMetni = "Bir iki üç dört beş altı";
        String [] parca = diziMetni.split(" ");
        
        FileWriter yazici7 = new FileWriter("deneme7.txt");
        for (int i = 0; i < parca.length; i++) {
            yazici7.write(parca[i] + "\n");
        }
        yazici7.close();
        
        dosya = new File("deneme7.txt");
        okuyucu = new Scanner(dosya);
        
        String [] yeniDizi = new String [parca.length];
        int index = 0;
        
        while(okuyucu.hasNextLine()){
            String satir = okuyucu.nextLine();
            
            yeniDizi[index] = satir;
            
            index++;
        }
        okuyucu.close();
        
        System.out.print("Yeni Dizi: ");
        for (int i = 0; i < yeniDizi.length; i++) {
            System.out.print(yeniDizi[i] + " ");
        }
        
        /*SORU 8) Kullanıcıdan dosya adını girmesini isteyip, girilen isimde bir dosya oluşturan, daha 
sonra dosyaya ne yazmak istediğini kullanıcıya sorup, istenilen metni dosyaya yazan 
programı yazınız.*/
        
        System.out.print("\nDosya adı giriniz: ");
        String dosyaAdi = input.nextLine();
        
        FileWriter yazici8 = new FileWriter(dosyaAdi + ".txt");
        
        System.out.print("Dosyaya ne yazmak istersiniz: ");
        String dosyaGirilen = input.nextLine();
        
        yazici8.write(dosyaGirilen);
        yazici8.close();
    }
}
