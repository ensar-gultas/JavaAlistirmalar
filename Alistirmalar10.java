package alistirmalar;

import java.util.Scanner;


public class Alistirmalar10 {
    
    public static void main(String[] args) {
        
        /*SORU 1) Bir tamsayı dizisindeki tüm elemanların karesini konsola yazdıran programı 
yazınız*/
        
        int [] dizi1 = {1,2,3,4,5,6,7,8,9};
        
        System.out.print("Sayıların karesi: ");
        
        for (int i = 0; i < dizi1.length; i++) {
            
        int sayiKaresi = dizi1[i]*dizi1[i]; 
        
        System.out.print(sayiKaresi + " ");
        }
        
        /*SORU 2) Bir tamsayı dizisindeki tek sayıları 1 artıran, çift sayıları 2 azaltan (orijinal dizi 
üzerinde) programı yazınız. 
Örneğin; [3, 7, 2, 6, 5, 8] dizi son durumda [4, 8, 0, 4, 6, 6] haline gelmelidir.*/
        
        int [] dizi2 = {1,2,4,5,6,7,9};
        
        System.out.print("\nYeni dizi: ");
        
        for (int i = 0; i < dizi2.length; i++) {
            
            if(dizi2[i] % 2 == 0){
                dizi2[i] -= 2;
            }
            else{
                dizi2[i] += 1;
            }
            System.out.print(dizi2[i] + " ");
        }
        
        /*SORU 3) Bir tamsayı dizisindeki maksimum ve minimum değerlerin farkını bulan programı 
yazınız.*/
        
        int [] dizi3 = {2,5,-9,12,43,-15,67};
        
        int max = dizi3[0];
        int min = dizi3[0];
        
        for (int i = 0; i < dizi3.length; i++) {
            
            if(max < dizi3[i]){
                max = dizi3[i];
            }
            if(min > dizi3[i]){
                min = dizi3[i];
            }
        }
        int fark = max - min;
        System.out.println("\nMax - Min: " + fark);
        
        /*SORU 4) Bir tamsayı dizisinde art arda gelen elemanlar arasındaki en büyük farkı bulan 
programı yazınız.*/
        
        int [] dizi4 = {12,6,9,14,22,29,35};
        
        int degerlerFarki = 0;
        
        for (int i = 0; i < dizi4.length-1; i++) {
            
            int araFark = dizi4[i] - dizi4[i+1];
            
            if(araFark < 0){
                araFark = araFark * -1;
            }
            if(degerlerFarki < araFark){
                degerlerFarki = araFark;
            }
        }
        System.out.println("Değerler farkı: " + degerlerFarki);
        
        /*SORU 5) Bir virgüllü sayı dizisinin ortalamasından daha küçük olan elemanlarını konsola 
yazdıran programı yazınız.*/
        
        double [] dizi5 = {1.2, 3.7, 4.5, 1.9, 7.4, 9.1};
        
        double toplam = 0.0;
        System.out.print("Ortalamadan küçük olanlar: ");
        
        for (int i = 0; i < dizi5.length; i++){
            toplam += dizi5[i];
        }
        double ortalama = toplam / dizi5.length;
        
        for (int i = 0; i < dizi5.length; i++) {
            
            if(dizi5[i] < ortalama){
                System.out.print(dizi5[i] + "  ");
            }
        }
         
        /*SORU 6) Bir tamsayı dizisinin elemanlarından 0’a en yakın olanını bulan programı yazınız.*/
        
        int [] dizi6 = {7,9,11,-5,-9,4,-3,6};
        
        int enYakin = dizi6[0];
        int minUzaklik;

        if (dizi6[0] < 0)
            minUzaklik = -dizi6[0];
        else
            minUzaklik = dizi6[0];

        for (int i = 0; i < dizi6.length; i++) {

            int uzaklik;
            if (dizi6[i] < 0){
                uzaklik = -dizi6[i];
            }
            else{
                uzaklik = dizi6[i];
            }
            if (uzaklik < minUzaklik) {
                minUzaklik = uzaklik;
                enYakin = dizi6[i];
            }
        }
        System.out.println("\n0'a en yakın olan sayı: " + enYakin);
        
        /*SORU 7) Bir tamsayı dizisinde tekrar etmeyen tüm elemanları konsola yazdıran programı 
yazınız.*/
        
        int [] dizi7 = {1,1,2,3,4,4,5,5,6,6,7,8,8,9};
        
        System.out.print("Tekrar etmeyenler: ");
        
        for (int i = 0; i < dizi7.length; i++) {
            int sayac = 0;
            
            for (int j = 0; j < dizi7.length; j++) {
                
                if(dizi7[i] == dizi7[j]){
                    sayac++;
                }
            }
            if(sayac == 1){
                System.out.print(dizi7[i] + " ");
            }
        }
        
        /*SORU 8) Bir tamsayı dizisinde kullanıcının girdiği bir değeri arayan, konsola “Aranan 
eleman dizide var” veya “Aranan eleman dizide yok” yazdıran programı yazınız.*/
        
        Scanner input = new Scanner(System.in);
            
        System.out.print("\nBir eleman giriniz: ");
        int eleman = input.nextInt();
        
        int [] dizi8 = {1,4,6,9,14,76,32,24,47};
        
        boolean varMi = false;
        
        for (int sayi : dizi8){
            if(sayi == eleman){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println("Aranan eleman dizide var");
        }
        else{
            System.out.println("Aranan eleman dizide yok");
        }
        
        /*SORU 9) Bir tamsayı dizisinde kullanıcının girdiği bir değerin kaç kez geçtiğini bulan ve 
sonucu konsola yazdıran programı yazınız.*/
        
        System.out.print("Bir sayı giriniz: ");
        int deger = input.nextInt();
        
        int [] dizi9 = {1,4,5,6,7,5,8,2,1,9,3,9,4,5};
        
        int adet = 0;
        
        for (int sayi : dizi9){
            if(sayi == deger){
                adet++;
            }
        }
        System.out.println("Sayı " + adet + " kere tekrar ediyor");
        
        /*SORU 10) Bir tamsayı dizisinde en yüksek ardışık olarak tekrarlama sayısını bulan, bu 
elemanı ve ardışık tekrar sayısını konsola yazdıran programı yazınız. 
Örneğin; [3, 6, 2, 2, 2, 2, 3, 3, 5, 5, 5, 3, 3, 3] dizisinde  2 değeri 4 kez art arda tekrarlamış*/
        
        int [] dizi10 = {1,1,2,2,2,3,3,4,4,4,4,4,5,5,6,7,7,7};
        
        int cokTekrar = 0;
        int tekrar = 1;
        int tekrarEdenSayi = dizi10[0];
        
        for (int i = 0; i < dizi10.length-1; i++){
            
            if(dizi10[i] == dizi10[i+1]){
                tekrar++;
            }
            else{
                tekrar = 1;
            }
            if(tekrar > cokTekrar){
                cokTekrar = tekrar;
                tekrarEdenSayi = dizi10[i];
            }
        }
        System.out.println("En çok tekrar eden: " + tekrarEdenSayi + " değeri " + cokTekrar + " kez tekrarlanmış");

        /*SORU 11) Bir tamsayı dizisinin elemanlarını sırasını ters çeviren (orijinal dizi üzerinde) 
programı yazınız.  
Örneğin; [3, 5, 7, 2, 1] dizisi son durumda [1, 2, 7, 5, 3] haline gelmelidir*/
        
        int [] dizi11 = {3,5,12,25,46};
        
        System.out.print("Yeni dizi: ");
        for (int i = 0; i < dizi11.length/2; i++) {
            
        int temp = dizi11[i];
        dizi11[i] = dizi11[dizi11.length - 1 - i];
        dizi11[dizi11.length - 1 - i] = temp;
        }
        for (int i = 0; i < dizi11.length; i++) {
            System.out.print(dizi11[i] + " ");
        }
        
        /*SORU 12) Bir tamsayı dizisindeki tüm elemanları 1 sağa kaydıran (orijinal dizi üzerinde) 
programı yazınız. (En sondaki eleman en başa geçmelidir) 
Örneğin; [5, 7, 2, 1, 0, 6] dizisi son durumda [6, 5, 7, 2, 1, 0] haline gelmelidir */
        
        int [] dizi12 = {2,7,9,13,19,21};
        
        int sonDeger = dizi12[dizi12.length-1];
        for (int i = dizi12.length-1; i >= 0; i--) {
            
            if(i == 0){
                dizi12[i] = sonDeger;
            }
            else{
                dizi12[i] = dizi12[i-1];
            }
        }
        System.out.print("\nYeni dizi: ");
        for (int i = 0; i < dizi12.length; i++) {
            System.out.print(dizi12[i] + " ");
        }
    }
}
