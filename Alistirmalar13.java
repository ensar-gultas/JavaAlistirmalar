
package alistirmalar;


public class Alistirmalar13 {
    
    static boolean matrisKontrol(int [][]matris , int N){
                
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                
                if(matris[i][j] == N){
                    return true;
                }
            }
        }
        return false;
    }
    
    static int matrisSayac(int [][] matris, int N){
        
        int sayac = 0;
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                
                if(matris[i][j] == N){
                    sayac++;
                }
            }
        }
        return sayac;
    }
    
    static int maxMinFarki(int [][] matris){
        
        int max = matris[0][0];
        int min = matris[0][0];
                
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                
                if(max < matris[i][j]){
                    max = matris[i][j];
                }
                if(min > matris[i][j]){
                    min = matris[i][j];
                }
            }
        }
        return max - min;
    }
    
    static int satirlarToplami(int [][] matris){
        
        int maxSatir = 0;
        
        for (int i = 0; i < matris.length; i++) {
            int satirToplami = 0;
            for (int j = 0; j < matris[i].length; j++) {
                
                satirToplami += matris[i][j];                
                }
                if(satirToplami > maxSatir){
                    maxSatir = satirToplami;
            }
        }
        return maxSatir;
    }
    
    static int satirKontrol(int [][] matris){
        
        int satirSayac = 0;
        
        for (int i = 0; i < matris.length; i++) {
            boolean ayniMi = true;
            for (int j = 0; j < matris[i].length; j++) {
                
                if(matris[i][0] != matris[i][j]){
                    ayniMi = false;
                    break;
                }
            }
            if(ayniMi == true){
                satirSayac++;
            }
        }
        return satirSayac;
    }
    
    static void asalKontrol(int [][] matris){
        
        System.out.print("Asal sayılar: ");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                boolean asalMi = true;
                
                if(matris[i][j] < 2){
                    asalMi = false;
                }
                for (int k = 2; k < matris[i][j]; k++) {
                    
                    if(matris[i][j] % k == 0){
                        asalMi = false;
                        break;
                    }
                }
                if(asalMi == true){
                    System.out.print(matris[i][j] + " ");
                }
            }
        }
    }
    
    static int sifiraYakinBul(int [][] matris){
        
        int enYakin = matris[0][0];
        int minUzaklik = Math.abs(matris[0][0]);
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                
                int uzaklik = Math.abs(matris[i][j]);
                
                if(uzaklik < minUzaklik){
                    minUzaklik = uzaklik;
                    enYakin = matris[i][j];
                }
            }
        }
        return enYakin;
    }
    
    static int enBuyukKosegen(int [][] matris){
        
        int max = matris[0][0];
        
        for (int i = 0; i < matris.length; i++) {
            
            int deger = matris[i][i];
            
            if(deger > max){
                max = matris[i][i];
            }
        }
        return max;
    }
    
    static int [][] matrisleriTopla(int [][] matris1, int [][] matris2){
        
        int [][] sonMatris = new int [matris1.length][matris1[0].length];
        
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[i].length; j++) {
                
                sonMatris[i][j] = matris1[i][j] + matris2[i][j];
            }
        }
        return sonMatris;
    }
    
    static int [][] matrislerCarpimi(int [][] matris1, int [][] matris2){
        
        int [][] sonMatris = new int [matris1.length][matris1[0].length];
        
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[i].length; j++) {
                
                
                for (int k = 0; k < matris1[0].length; k++) {
                    
                    sonMatris[i][j] += matris1[i][k] * matris2[k][j];
                }
            }
        }
        return sonMatris;
    }
    
    static int [][] transpoze(int [][] matris){
        
        int [][] yeniMatris = new int [matris[0].length][matris.length];
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                
                yeniMatris[j][i] = matris[i][j];
            }
        }
        return yeniMatris;
    } 
    
    static int maxBul(int [][] matris1, int [][] matris2){
        
        int max1 = matris1[0][0];
        int max2 = matris2[0][0];
        
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[i].length; j++) {
                if(max1 < matris1[i][j]){
                    max1 = matris1[i][j];
                }
            }
        }
        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                if(max2 < matris2[i][j]){
                    max2 = matris2[i][j];
                }
            }
        }
        if(max1 > max2){
            return 1;
        }
        else if(max1 < max2){
            return 2;
        }
        else{
            return 3;
        }
    }
    
    static int ciftSatir(int [][] matris){
        
        int toplam = 0;
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                
                if(i % 2 == 0){
                    toplam += matris[i][j];
                }
            }
        }
        return toplam;
    }
    
    static int tekSatir(int [][] matris){
        
        int min = matris[1][0];
                
        for (int i = 0; i < matris.length; i++) {
            if(i % 2 != 0){
                
            for (int j = 0; j < matris[i].length; j++) {
                if(min > matris[i][j]){
                    min = matris[i][j];
                    }
                }
            }
        }
        return min;
    }
    
    static int yanYanaTekrar(int [][] matris){
        
        int maxTekrar = 0;
        
        for (int i = 0; i < matris.length; i++) {
            int tekrar = 1;
            for (int j = 0; j < matris[i].length-1; j++) {
                                
                if(matris[i][j] == matris[i][j+1]){
                    tekrar++;
                }
                else{
                    tekrar = 1;
                }
                if(tekrar > maxTekrar){
                    maxTekrar = tekrar;
                }
            }
        }
        return maxTekrar;
    }
    
    static int ortalamaHesapla(int [][] matris){
        
        double maxOrt = 0.0;
        int maxIndeks = 0;
        
        for (int i = 0; i < matris.length; i++) {
            int toplam = 0;
            for (int j = 0; j < matris[i].length; j++) {
                toplam += matris[i][j];
                
                }
                double ortalama = ((double)toplam / matris[0].length);
                
                if(maxOrt < ortalama){
                    maxOrt = ortalama;
                    maxIndeks = i;
            } 
        }
        return maxIndeks;
    }
    
    static int ortUzeri(int [][] matris){
        
        int toplam = 0;
        int sayac = 0;
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                toplam += matris[i][j];
                sayac++;
            }
        }
        double ortalama = ((double)toplam / sayac);
        int yuksekler = 0;
        
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if(matris[i][j] > ortalama){
                    yuksekler++;
                }
            }
        }   
        return yuksekler;
    }  
    
    static boolean birimMatris(int [][] matris){
                
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                        
                if(i == j && matris[i][j] != 1){
                    return false;
                }
                if(i != j && matris[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        /*SORU 1) Bir matrisi ve bir tamsayıyı parametre olarak alan, bu sayının matriste olup 
olmadığını kontrol eden, varsa true, yoksa false geri döndüren metodu yazınız.*/
        
        int [][] matris1 = { {1, 2, 3}, 
                             {4, 5, 6}, 
                             {7, 8, 9} };
        
        boolean  sonuc = matrisKontrol(matris1, 5);
        System.out.println("Sayı var mı: " + sonuc);
       
        
        /*SORU 2) Bir matrisi ve bir tamsayıyı parametre olarak alan, bu sayının matriste kaç defa 
geçtiğini geri döndüren metodu yazınız.*/
        
        int [][] matris2 = { {1, 9, 4}, 
                             {7, 4, 5},
                             {1, 6, 8},
                             {5, 7, 2} };
        
        int tekrarSayisi = matrisSayac(matris2, 7);
        System.out.println("Tekrar sayısı: " + tekrarSayisi);
        
        
        /*SORU 3) Bir matrisi parametre olarak alan, bu matrisin en büyük elemanı ile en küçük 
elemanı arasındaki farkı geri döndüren metodu yazınız. */
        
        int [][] matris3 = { {17, 94, 43}, 
                             {79, 44, 50},
                             {14, 16, 28},
                             {15, 37, 23} };
        
        int fark = maxMinFarki(matris3);
        System.out.println("Max-Min farkı: " + fark);
        
        
        /*SORU 4) Bir matrisi parametre olarak alan ve satır toplamlarının en büyük değerini geri 
döndüren metodu yazınız.*/
        
        int [][] matris4 = { {17, 94, 43}, 
                             {79, 44, 50},
                             {14, 16, 28},
                             {15, 37, 23},};
        
        int buyukSatir = satirlarToplami(matris4);
        System.out.println("En büyük satır: " + buyukSatir);
        
        
        /*SORU 5) Bir matrisi parametre olarak alan, bu matristeki tüm elemanları aynı olan satırların 
adetini geri döndüren metodu yazınız. 
 7 2 3 9 0 
 4 4 4 4 4  → Tüm elemanları aynı olan satırların sayısı: 2  
 5 8 9 0 3 
 9 9 9 9 9 
*/
        
        int [][] matris5 = { {1, 9, 4}, 
                             {4, 4, 4},
                             {1, 6, 8},
                             {7, 7, 7},
                             {9, 9, 9} };
        
        int ayniSatir = satirKontrol(matris5);
        System.out.println("Aynı satırların adedi: " + ayniSatir);
        
        
        /*SORU 6) Bir matrisi parametre olarak alan ve bu matrisin asal elemanlarını konsola yazdıran 
metodu yazınız.*/
        
        int [][] matris6 = { {17, 94, 43}, 
                             {79, 44, 50},
                             {14, 16, 28},
                             {15, 37, 23} };
        
        asalKontrol(matris6);
        
        
        /*SORU 7) Bir matrisi parametre olarak alan ve bu matrisin 0’a en yakın elemanını bularak 
geri döndüren metodu yazınız.*/
        
        int [][] matris7 = { {17, 94, 43}, 
                             {79, 44, 50},
                             {14, 16, 28},
                             {15, 37, 23} };
        
        int enYakin = sifiraYakinBul(matris7);
        System.out.println("\n0'a en yakın eleman: " + enYakin);
        
        
        /*SORU 8) Bir kare matrisi parametre olarak alan, bu matrisin birincil köşegeni üzerindeki en 
büyük elemanı geri döndüren metodu yazınız.*/
        
        int [][] matris8 = { {17, 94, 43}, 
                             {79, 44, 50},
                             {15, 37, 23} };
        
        int enBuyuk = enBuyukKosegen(matris8);
        System.out.println("En büyük köşegen: " + enBuyuk);
        
        
        /*SORU 9) Satır ve sütun boyutları eşit olan iki matrisi parametre olarak alan, bu iki matrisi 
toplayıp, sonuç matrisini geri döndüren metodu yazınız.*/
        
        int [][] matrisA = { {0, 1},    
                             {2, 3},
                             {4, 5} };
        
        int [][] matrisB = { {6, 7},    
                             {8, 9},
                             {10, 11} };
        
        int [][] yeni = matrisleriTopla(matrisA, matrisB);
        
        for (int i = 0; i < yeni.length; i++) {
            for (int j = 0; j < yeni[i].length; j++) {
                System.out.print("[" + yeni[i][j] + "]\t");
            }
            System.out.println();
        }
        System.out.println();
        
        /*SORU 10) İki matrisi parametre olarak alan, bu iki matrisin çarpımıyla elde edilen sonuç 
matrisini geri döndüren metodu yazınız.*/
        
        int [][] matrisX = { {0, 1},    
                             {2, 3}};
        
        int [][] matrisY = { {6, 7},    
                             {8, 9}};
                              
        
        int [][] yeniMatris = matrislerCarpimi(matrisX, matrisY);
        
        for (int i = 0; i < yeniMatris.length; i++) {
            for (int j = 0; j < yeniMatris[i].length; j++) {
                
                System.out.print("[" + yeniMatris[i][j] + "]\t");
            }
            System.out.println();
        }
        System.out.println();
        
        /*SORU 11) Bir matrisi parametre olarak alan, bu matrisin transpozesini geri döndüren metodu 
yazınız.*/
        
        int [][] matris11 = { {1, 2},
                              {3, 4},
                              {5, 6},
                              {7, 8},
                              {9, 10} };
                
        int [][] sonMatris = transpoze(matris11);
        
        for (int i = 0; i < sonMatris.length; i++) {
            for (int j = 0; j < sonMatris[0].length; j++) {
                
                System.out.print(sonMatris[i][j] + " ");
            }
            System.out.println();
        }
        
        /*SORU 12) A ve B şeklinde iki matrisi parametre olarak alan, A maksimum elemanı B 
matrisinin maksimum elemanından büyükse 1, tam tersi şeklindeyse 2, iki matrisin 
maksimum elemanları eşitse 3 değerini geri döndüren metodu yazınız.*/
        
        int [][] matrisC = { {0, 1},    
                             {2, 3}};
        
        int [][] matrisD = { {6, 7},    
                             {8, 9}};
        
        int max = maxBul(matrisC, matrisD);
        System.out.println("Değer: " + max);
        
        /*SORU 13) Bir matrisi parametre olarak alan ve bu matrisin çift indeks değerine sahip 
satırlarındaki elemanların toplamını bulan ve sonucu geri döndüren metodu yazınız.*/
        
        int [][] matris13 = { {1, 2},
                              {3, 4},
                              {5, 6},
                              {7, 8},
                              {9, 10} };
        
        int ciftToplam = ciftSatir(matris13);
        System.out.println("Çift satırların toplamı: " + ciftToplam);
        
        /*SORU 14) Bir matrisi parametre olarak alan, bu matrisin tek indeks değerine sahip 
satırlardaki minimum elemanı bulan ve geri döndüren metodu yazınız.*/
        
        int [][] matris14 = { {1, 2},
                              {3, 4},
                              {5, 6},
                              {7, 8},
                              {9, 10} };
        
        int tekIndeks = tekSatir(matris14);
        System.out.println("Tek satırdaki min: " + tekIndeks);
        
        /*SORU 15) Parametre olarak aldığı bir matrisin satırlarındaki elemanların maksimum yan 
yana tekrar etme sayısını geri döndüren metodu yazınız. Metod aşağıdaki matris için 3 
değerini return etmelidir.*/
        
        int [][] matris15 = { {1, 2, 3}, 
                              {4, 4, 6},
                              {5, 6, 7},
                              {7, 8, 9} };
        
        int matrisTekrar = yanYanaTekrar(matris15);
        System.out.println("Yan yana max tekrar: " + matrisTekrar);
        
        /*SORU 16) Bir matrisi parametre olarak alan ve bu matristeki en büyük ortalamaya sahip 
satırın indeksini geri döndüren metodu yazınız.*/
        
        int [][] matris16 = { {17, 94, 43}, 
                             {79, 44, 50},
                             {15, 37, 23} };
        
        int maxSatirOrt = ortalamaHesapla(matris16);
        System.out.println("Ortalaması max olan satır: " + maxSatirOrt);
        
        /*SORU 17) Bir matrisi parametre olarak alan ve bu matrisin ortalamasının üzerindeki 
elemanların sayısını geri döndüren metodu yazınız.*/
        
        int [][] matris17 = { {1, 2},
                              {3, 4},
                              {5, 6},
                              {7, 8},
                              {9, 10} };
        
        int yuksekElemanlar = ortUzeri(matris17);
        System.out.println("Ortalama üzerindekiler: " + yuksekElemanlar);
        
        /*SORU 18) Bir matrisi parametre olarak alan ve bu matrisin birim matris olup olmadığını 
kontrol eden, birim matris ise true, değilse false geri döndüren metodu yazınız. (Birim matris 
köşegeni üzerindeki elemanları 1, diğer tüm elemanları 0 olan kare matrislere denir)*/
        
        int [][] matris18 = { {1, 0, 0}, 
                              {0, 1, 0},
                              {0, 0, 1} };
        
        boolean birimSonuc = birimMatris(matris18);
        System.out.println("Birim matris mi: " + birimSonuc);
    }  
}
