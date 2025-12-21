
package alistirmalar;


public class Alistirmalar11 {
    
    //SORU 2
    static boolean degerAra1(int [] degerler,int a){
        
        boolean varMi = false;
        
        for(int aranan : degerler){
            if (aranan == a){
                varMi = true;
                break;
            }
        }
        return varMi;
    }
    
    //SORU 3
    static int degerAra2(int [] degerler,int x){
        
        int dondur = -1;
        for (int i = 0; i < degerler.length; i++) {
            if(degerler[i] == x){
                dondur = i;
                break;
            }
        }
        return dondur;
    }
    
    //SORU 4 
    static int degerAra3(int [] degerler,int a){
        
        int sayac = 0;
        
        for(int aranan : degerler){
            if(aranan == a){
                sayac++;
            }
        }
        return sayac;
    }
    
    //SORU 5
    static boolean palindromeKontrol(int [] ilkDizi){
        
        boolean ayniMi = true;
        
        for (int i = 0; i < ilkDizi.length; i++) {
            
            if(ilkDizi[i] != ilkDizi[ilkDizi.length -1 -i]){
                ayniMi = false;
                break;
            }
        }
        return ayniMi;
    }
    
    static void diziDegistir(int [] ilkDizi){
        
        for (int i = 0; i < ilkDizi.length; i++) {
            
            if(ilkDizi[i] % 2 != 0){
                ilkDizi[i] = 1;
            }
            else{
                ilkDizi[i] = 0;
            }
        }
        System.out.print("Son dizi: ");
        for (int i = 0; i <ilkDizi.length ; i++) {
            System.out.print(ilkDizi[i] + " ");
        }
    }
    
    static boolean dizilerKontrol(int [] dizi1, int [] dizi2){
        
        int boyut1 = dizi1.length;
        int boyut2 = dizi2.length;
       
        if(boyut1 != boyut2){
            return false;
        }
        for (int i = 0; i < dizi1.length; i++) {
            
            if(dizi1[i] != dizi2[i]){
                return false;
            }
        }
        return true;
    }
    
    static int [] dizileriBirlestir(int [] dizi1 , int [] dizi2){
        
        int boyut1 = dizi1.length;
        int boyut2 = dizi2.length;
        int yeniBoyut = dizi1.length + dizi2.length;
        
        int [] yeniDizi = new int[yeniBoyut];
        
        for (int i = 0; i < dizi1.length; i++) {
            yeniDizi[i] = dizi1[i];
        }
        for (int i = 0; i < dizi2.length; i++) {
            yeniDizi[dizi1.length + i] = dizi2[i];
        }
        return yeniDizi;
    }
    
    public static void main(String[] args) {
        
        /*SORU 1) Bir dizinin 3'ün katı olup da 2'nin katı olmayan kaç elemanı olduğunu ve bunların 
ortalamasını hesaplayan programı yazınız.*/
        
        int [] dizi1 = {2,3,7,11,14,18,21,26,34,39};
        
        int toplam = 0;
        int sayac = 0;
        System.out.print("3'ün katı olup, 2'nin katı olmayanlar: ");
        
        for(int sayi : dizi1){
            if(sayi % 3 == 0 && sayi % 2 != 0){
                System.out.print(sayi + " ");
                toplam += sayi;
                sayac++;
            }
        }
        double ortalama = (double)toplam / sayac;
        
        System.out.println("\nOrtalama: " + ortalama );
        
        /*SORU 2) Bir tamsayı dizisini ve bir aranan değeri parametre olarak alan, aranan sayı dizide 
varsa true, yoksa false döndüren metodu yazın.*/
        
        int [] dizi2= {1,4,9,11,16,23,28,35};
        
        boolean varMi = degerAra1(dizi2, 7);
        System.out.println("Aranan değer var mı?: " + varMi);
        
        /*SORU 3) Bir tamsayı dizisini ve bir aranan değeri parametre olarak alan, aranan sayı dizide 
varsa indeksini (birden fazla varsa ilk indeksini), yoksa -1 döndüren metodu yazın.*/
        
        int [] dizi3 = {1,2,3,4,5,6,7,8,9,10};
        
        int geriDondur = degerAra2(dizi3, 6);
        System.out.println("Geri döndürülen değer: " + geriDondur);
        
        /*SORU 4) Bir tamsayı dizisini ve bir aranan değeri parametre olarak alan, aranan sayının 
dizide kaç kez geçtiğini bulan ve sonucu geri döndüren metodu yazın.*/
        
        int [] dizi4 = {1,1,2,2,3,4,4,4,5,5,5,5,6,6,7,8,8};
        
        int tekrar = degerAra3(dizi4, 5);
        System.out.println("Aranan değerin tekrarı: " + tekrar);
        
        /*SORU 5) Bir tamsayı dizisini parametre olarak alan, bu dizinin palindrome dizi olup 
olmadığını kontrol eden ve sonucu boolean türünde geri döndüren metodu yazınız. 
(Palindrome dizi elemanlarının sırasının tam tersi de aynı olan diziye denir.) 
Örneğin;  dizi [ ] = {  2, 7, 12, 42, 12, 7, 2  }; palindrome bir dizidir.*/
        
        int [] dizi5 = {2,5,14,49,14,5,2};
        
        boolean kontrol = palindromeKontrol(dizi5);
        System.out.println("Dizi palindrome'mi?: " + kontrol);
        
        /*SORU 6) Bir dizideki maksimum değerin kaç kez tekrar ettiğini tek bir döngü ile bulan 
programı yazınız.*/
        
        int [] dizi6 = {1,7,25,19,2,14,25,24,1,2,7,19,25,24};
        
        int max = dizi6[0];
        int tekrarSayisi = 0;
        
        for (int i = 0; i < dizi6.length; i++) {
            
            if(max < dizi6[i]){
                max = dizi6[i];
                tekrarSayisi = 0;
            }
            if(max == dizi6[i]){
            tekrarSayisi++;
            }
        }
        System.out.println("Max değerin tekrar sayısı: " + tekrarSayisi);
        
        /*SORU 7) Bir tamsayı dizisini parametre olarak alan, bu tamsayı dizisinin elemanlarının 
küçükten büyüğe doğru sıralı olup olmadığını kontrol eden ve sonucu boolean türünde geri 
döndüren metodu yazınız.*/
        
        int [] dizi7 = {2,5,6,9,12,15,19,24};
        
        boolean siraliMi = true;
        
        for (int i = 0; i < dizi7.length-1; i++) {
            
            if(dizi7[i] > dizi7[i+1]){
                siraliMi = false;
                break;
            }
        }
        System.out.println("Dizi sıralı mı?: " + siraliMi);
        
        /*SORU 8) Bir dizinin elemanlarından asal sayı olanları ve bunların ortalamasını konsola 
yazdıran programı yazınız.*/
        
        int [] dizi8 = {2,4,5,6,8,12,21,29,37,49};
        
        int toplam2 = 0;
        double asalSayac = 0.0;
        
        System.out.print("Asal sayı olanlar: ");
        
        for (int i = 0; i < dizi8.length; i++) {
        
            boolean asalMi = true; 
            
            if(dizi8[i] < 2){
                asalMi = false;
            }
            else{
            for (int j = 2; j < dizi8[i]; j++) {
                
                if(dizi8[i] % j == 0){
                    asalMi = false;
                    break;
                    }
                }
            }
            if(asalMi){
                System.out.print(dizi8[i] + " ");
                toplam2 += dizi8[i];
                asalSayac++;
            }
        }
        double ortalama2 = toplam2 / asalSayac;
        System.out.println("\nAsal sayıların ortalaması: " + ortalama2);
        
        /*SORU 9) Bir dizide en çok tekrar eden elemanı bulan programı yazınız.*/
        
        int [] dizi9 = {1,1,1,2,2,3,4,5,5,5,5,6,6,7,7,7,8,8,9};
        
        int tekrarSayaci = 1;
        int cokTekrar = 0;
        int tekrarEdenSayi = dizi9[0];
        
        for (int i = 0; i < dizi9.length-1; i++) {
            
            if(dizi9[i] == dizi9[i+1]){
                tekrarSayaci++;
            }
            else{
                tekrarSayaci = 1;
            }
            if(cokTekrar < tekrarSayaci){
                cokTekrar = tekrarSayaci;
                tekrarEdenSayi = dizi9[i];
            }
        }
        System.out.println("En çok tekrar eden sayı: " + tekrarEdenSayi);
        
        /*SORU 10) Parametre olarak aldığı bir dizideki tek elemanların yerine 1, çift elemanların 
yerine 0 atayan (orijinal dizi üzerinde) metodu yazınız. 
dizi = [3, 7, 2, 6, 4, 3, 8, 1 ] son durumda [1, 1, 0, 0, 0, 1, 0, 1] haline gelmelidir.*/
        
        int [] dizi10 = {1,2,3,4,5,6,7,8,9};
        diziDegistir(dizi10);
        
        /*SORU 11) Parametre olarak aldığı iki dizinin (boyutları ve elemanları dahil) birbirinin aynısı 
olup olmadığını kontrol eden ve sonucu boolean türünde geri döndüren metodu yazınız.*/
        
        int [] diziA = {2,5,7,8,12,16,23,29,35};
        int [] diziB = {2,5,7,8,12,16,23,29,35};
        
        boolean ayniMi = dizilerKontrol(diziA , diziB);
        System.out.println("\nDiziler aynı mı?: " + ayniMi);
        
        /*SORU 12) Parametre olarak aldığı İki diziyi uç uca ekleyerek tek bir büyük dizi oluşturan ve 
bu yeni diziyi geri döndüren metodu yazınız.*/
        
        int [] diziX = {1,2,3,4,5};
        int [] diziY = {6,7,8,9,10};
        
        int [] yeniDizi = dizileriBirlestir(diziX , diziY);
        
        System.out.print("Yeni dizi: ");
        for (int i = 0; i < yeniDizi.length; i++) {
            System.out.print(yeniDizi[i] + " ");
        }
        
        /*SORU 13) Bir dizideki en büyük ikinci değeri bulan programı yazınız. (Maksimum değer 
dizide iki kez geçiyorsa, en büyük ikinci değer de maksimum değerle aynı olmalıdır.)*/
        
        int [] dizi13 = {2,4,6,8,9,5,3,7};
        
        int maxDeger = dizi13[0];
        int ikinciEnBuyuk = dizi13[0];
        
        for (int i = 0; i < dizi13.length; i++) {
            
            if(maxDeger <= dizi13[i]){
                ikinciEnBuyuk = maxDeger;
                maxDeger = dizi13[i];
            }
            else if(dizi13[i] > ikinciEnBuyuk){
                ikinciEnBuyuk = dizi13[i];
            }
        }
        System.out.println("\nİkinci en büyük değer: " + ikinciEnBuyuk);
    }
}
