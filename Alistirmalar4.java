
package alistirmalar;


public class Alistirmalar4 {
    
     public static void main(String[] args){
        
        /* Tanımlanan satır sayısı (N) kadar aşağıdaki desenleri konsola çıktı olarak veren 
programları yazınız. Örnek çıktılarda N = 5 olarak verilmiştir, N değeri farklı olduğunda 
çıktılar da ona göre değişmelidir. */
        
        /*SORU 1
        11111
        11111
        11111
        11111
        11111
        */        
        
        int N = 5;
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= N; j++) {
                System.out.print("1");
                
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 2
        11111
        00000
        11111
        00000
        11111
        */
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= N; j++) {
                
                if (i % 2 == 0)
                System.out.print("0");
                
                else
                    System.out.print("1");
                
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 3
        01010
        01010
        01010
        01010
        01010
        */
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= 1; j++) {
                System.out.print("01010");
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 4
        11111
        22222
        33333
        44444
        55555
        */
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= N; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 5
        12345
        12345
        12345
        12345
        12345
        */
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= N; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 6
        1
        22
        333
        4444
        55555
        */
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 7
        1
        12
        123
        1234
        12345
        */
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 8
        11111
        2222
        333
        44
        5
        */
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = N; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 9
        55555
        4444
        333
        22
        1
        */
        
        for (int i = N; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 10
        5
        44
        333
        2222
        11111
        */
        
        for (int i = N; i >= 1; i--) {
            
            for (int j = N; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 11
        12345
        1234
        123
        12
        1
        */
        
        for (int i = N; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
       System.out.println("--------------");
       
       /*SORU 12
       1
       21
       321
       4321
       54321
       */
       
        for (int i = 1; i <= N; i++) {
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 13
        54321
        4321
        321
        21
        1
        */
        
        for (int i = N; i >= 1; i--) {
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 14
        5
        54
        543
        5432
        54321
        */
        
        for (int i = N; i >= 1; i--) {
            
            for (int j = N; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 15
        54321
        5432
        543
        54
        5
        */
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = N; j >= i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 16
        5
        45
        345
        2345
        12345
        */
        
        for (int i = N; i >= 1; i--) {
            
            for (int j = i; j <= N; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 17
        12345
        2345
        345
        45
        5
        */
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = i; j <= N; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 18
        1
        23
        345
        4567
        56789
        */
        
        for (int i = 1; i <= N; i++ ) {
            
            for (int j = i ; j  <= i + (i - 1)  ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 19
        *****
        *****
        *****
        *****
        *****
        */
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------");
        
        /*SORU 20
        *****
        ****
        ***
        **
        *
        */
        
        for (int i = 1; i <= N; i++) {
            
            for (int j = i; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    
}
