
package alistirmalar;


public class Alistirmalar5 {
    
    public static void main(String[] args){
        
       /* SORU 1) Aşağıdaki serilerin ilk 15 terimlerinin toplamını bulan ve sonucu ekrana yazdıran 
programı yazınız. */
       
       //A
       final int N = 15;
       double toplam = 0.0;
       double terim = 0.0;
       int payda = 1;
       
        for (int i = 1; i <= N ; i++) {
            
            terim = 1.0 / payda;
            
            toplam+= terim;
            payda *= 3;
        }
        System.out.println("Toplam: " + toplam);
        
        System.out.println("--------------");
        
        //B
        toplam = 0.0;
        payda = 1;
        terim = 0.0;
        
        for (int i = 1; i <= N; i++) {
            
            terim= 7.0 / payda;
            
            toplam += terim;
            payda *= 3;
        }
        System.out.println("Toplam: " + toplam);
        
        System.out.println("--------------");
        
        //C
        toplam = 0.0;
        payda = 1;
        terim = 0.0;
        double pay = 1.0;
        
        for (int i = 1; i <= N; i++) {
            
            terim = pay / payda;
            
            toplam += terim;
            pay *= 2;
            payda *= 3;
        }
        System.out.println("Toplam: " + toplam);
        
        System.out.println("--------------");
        
        //D
        toplam = 0.0;
        payda = 1;
        terim = 0.0;
        int isaret = 1;
        
        for (int i = 1; i <= N; i++) {
            
            terim = isaret * (1.0 / payda);
            
            toplam += terim;
            payda *= 2;
            isaret *= -1;
        }
        System.out.println("Toplam: " + toplam);
        
        System.out.println("--------------");
        
        //E
        toplam = 0.0;
        pay = 1.0;
        payda = 1;
        terim = 0.0;
        isaret = 1;
        
        for (int i = 1; i <= N; i++) {
            
            terim = isaret * (pay / payda);
            
            toplam += terim;
            pay *= 2;
            payda *= 3;
            isaret *= -1;
        }
        System.out.println("Toplam: " + toplam);
        
        System.out.println("--------------");
        
       /*SORU 2) Tanımlanan satır sayısı (N) kadar aşağıdaki desenleri konsola çıktı olarak veren 
programları yazınız. Örnek çıktılarda N = 5 olarak verilmiştir, N değeri farklı olduğunda 
çıktılar da ona göre değişmelidir. */
       
       /*SORU 1
       1
       3 3
       5 5 5
       7 7 7 7
       9 9 9 9 9
       */
       
        for (int i = 1; i <= 9; i += 2) {
            
            for (int j = 1; j <= i; j += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 2
        0 1 2 3 4 5 
        0 1 2 3 4 
        0 1 2 3 
        0 1 2
        0 1
        */
        
        for (int i = 5; i > 0; i--) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 3
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1
        */
        
        for (int i = 1; i <= 5; i++) {
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 4
        1
        2 4
        3 6 9
        4 8 12 16
        5 10 15 20 25
        */
        
        for (int i = 1; i <= 5; i++) {
            
            for (int j = i; j <= i*i; j += i) {
                System.out.print(j + " ");
            }
           
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 5
        1
        0 1 
        1 0 1
        0 1 0 1 
        1 0 1 0 1
        */
        
        for (int i = 5; i >= 1; i--) {
            
            for (int j = i ; j <= 5; j++) {
                
                if (j % 2 != 0){
                    System.out.print("1 ");
                }
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 6
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */
        
        int sayi = 1;
        
        for (int i = 1; i <= 5; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(sayi +" ");
                 
            sayi++; 
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 7
        1 2 3 4 5
        2 2 3 4 5
        3 3 3 4 5
        4 4 4 4 5
        5 5 5 5 5
        */
        
        for (int i = 1; i <= 5; i++) {
            
            for (int j = 1; j <= 5; j++) {
               
                if(i > j){
                    System.out.print(i);
                }
                else{
                    System.out.print(j);
                }
                
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 8 
        1
        2 1
        4 2 1
        8 4 2 1
        16 8 4 2 1
        */
        
        for (int i = 1; i <= 16; i *= 2) {
            
            for (int j = i; j >= 1 ; j /= 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 9
        10
        10 8
        10 8 6
        10 8 6 4
        10 8 6 4 2
        */
        
        for (int i = 10; i >= 2; i -= 2) {
            
            for (int j = 10; j >= i; j -= 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 10
        0
        0 1
        0 2 4
        0 3 6 9
        0 4 8 12 16
        */
        
        for (int i = 0; i <= 4; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 11
        5
        4 5
        3 4 5
        2 3 4 5
        1 2 3 4 5
        */
        
        for (int i = 5; i >= 1; i--) {
            
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 12
        5 6 7 8 9
        4 5 6 7
        3 4 5
        2 3
        1
        */
        
        for (int i = 5; i >= 1; i--) {
            
            for (int j = i; j <= i*2-1; j++) {
                System.out.print(j + " " );
            }                  
            System.out.println();
        }
    
    
    }
    
}
