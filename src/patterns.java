public class patterns {
    public static void main(String[] args) {
//1.  *****
//    *****
//    *****
//    *****
//    *****
//        solidrectangle(5);
//        2.      *
//                **
//                ***
//                ****
//                *****
//        half_pyrmd(10);
//        3.      *****
//                ****
//                ***
//                **
//                *
//       inverted_pyrmd(5);

//        4.      ****
//                *  *
//                *  *
//                *  *
//                ****
//        hollowrectangle(5);
//   5.      *
//        **
//       ***
//      ****
//     *****
//        inverted_helfpyramind(5);

//        6.      *****
//                ****
//                ***
//                **
//                *
//        invert_360(5);
//  7.    1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        triangle(5);
//        8.inverted above one
//        pyrmd_numbers(5);
// 9.    1
//       2  3
//       4  5  6
//       7  8  9  10
//       11 12 13 14 15
//        floydes_triangle(5);
//10.    1
//       0 1
//       1 0 1
//       0 1 0 1
//       1 0 1 0 1
//        triangle_01(8);

// 11.            *        *
//                **      **
//                ***    ***
//                ****  ****
//                **********
//                ****  ****
//                ***    ***
//                **      **
//                *        *
//        butterfly(5);
//        12.solid_rhombus(5);
//   13.    *****
//         *   *
//        *   *
//       *   *
//      *****
//        hollow_rhombus(5);
//       14.number_pyramid
//        number_pyrmaid(5);
//    15. 1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        numbers(5);
//     16. 1
//        212
//        32123
//        4321234
//        palondromic(4);
//    17.  *
//        * *
//       * * *
//      * * * *
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
//        diamond(5);
//18.      hollow diamond
//        hollow_daimond(5);
// 19.    *
//       ***
//      *****
//     *******
//    *********
//        half_diamond(5);
//20. *********
//     *******
//      *****
//       ***
//        *
//        inverted_half_diamond(5);
//     21. *
//        * *
//       * * *
//      * * * *
//     * * * * *
//        half_daimond_spaces(5);

//        22.    * * * * *
//                * * * *
//                 * * *
//                  * *
//                   *
//        inverted_half_dia(5);
//   23     *****
//           ****
//            ***
//             **
//              *
//        half_p(5);
//    *    24.
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
//        pattern(5);
//     * * * * * 25.
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//        damru(5);
//    26   *
//        * *
//       *   *
//      *     *
//     *********
//        pattern(5);
//     *********   27.
//      *     *
//       *   *
//        * *
//         *
//        half_hollow_dia(5);
//      28.        1
//               1   1
//             1   2   1
//           1   3   3   1
//        1   4   6   4   1
//        pascal(5);
//      **********    29.
//      ****  ****
//      ***    ***
//      **      **
//      *        *
//      *        *
//      **      **
//      ***    ***
//      ****  ****
//      **********
//        pattern(5);
//       *        * 30.
//       **      **
//       * *    * *
//       *  *  *  *
//       *   **   *
//       *   **   *
//       *  *  *  *
//       * *    * *
//       **      **
//       *        *
//        hollow_butterfly(5);
//        A 31.
//        A B
//        A B C
//        A B C D
//        A B C D E
//        alphabet(5);
//        E   32.
//        D E
//        C D E
//        B C D E
//        A B C D E
//        reverse(5);
//        1      1 33.
//        12    21
//        123  321
//        12344321
        number_pyramib(5);

    }
//    static void solidrectangle(int n){
//        int m=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void half_pyrmd(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
   /* static void inverted_pyrmd(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
     /*static void hollowrectangle(int n){
         int col=4;
         for(int i=1;i<=n;i++){
             for(int j=1;j<=col;j++){
                 if(i==1||j==1||i==n||j==col){
                     System.out.print("*");

                 }else{
                     System.out.print(" ");
                 }

             }
             System.out.println();
         }
     }*/
    /*static void inverted_helfpyramind(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
//    static void invert_360(int n){
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=n-1;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void triangle(int n){
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void pyrmd_numbers(int n){
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void floydes_triangle(int n){
//        int num=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }
//    }
//    static void triangle_01(int n ){
//
//        for(int i=1;i<n;i++){
//            for(int j =1;j<=i;j++){
//                int sum=i+j;
//                if(sum%2==0){
//                    System.out.print("1 ");
//                }else{
//                    System.out.print("0 ");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//    static void butterfly(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int spaces=2*(n-i);
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            int spaces=2*(n-i);
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//    }
//    static void solid_rhombus(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void hollow_rhombus(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=n;j++){
//                if(i==1||i==n||j==1||j==n){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }System.out.println();
//
//        }
//
//    }
//    static void number_pyrmaid(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//    }
//    static void numbers(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void palondromic(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            for(int j=2;j<=i;j++){
//                System.out.print(j);
//            }System.out.println();
//
//        }
//    }
//    static void diamond(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//        for (int i = n - 1; i >=1; i--) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void hollow_daimond(int n){
//
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                if(j==1||j==2*i-1){
//                    System.out.print("*");
//
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>=1;i--) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2*i-1; j++) {
//                if (i == 1 || j == 1 || j == 2*i-1) {
//                    System.out.print("*");
//
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//
//    }
//    static void half_diamond(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void inverted_half_diamond(int n){
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void half_daimond_spaces(int n){
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j =1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void inverted_half_dia(int n){
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void half_p(int n){
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern(int n){
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void damru(int n){
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }

//    static void pattern(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                if(j==1||j==2*i-1||i==n){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }System.out.println();
//        }
//
//    }
//    static void half_hollow_dia(int n){
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                if(j==1||j==2*i-1||i==n){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//
//            }System.out.println();
//        }
//    }
//    static void pascal(int n){
//        for (int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print(" ");
//            }
//            int num=1;
//            for(int j=0;j<=i;j++){
//
//                System.out.print(num +" ");
//                num=num*(i-j)/(j+1);
//            }
//            System.out.println();
//        }
//    }
//    static void pattern(int n){
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for (int j=1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void hollow_butterfly(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(j==1||j==i){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                if(j==1||j==i){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//
//
//            } System.out.println();
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(j==1||j==i){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                if(j==1||j==i){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//
//
//            } System.out.println();
//        }
//    }
//    static void alphabet(int n){
//        for(int i=1;i<=n;i++){
//            char currentalpha='A';
//            for(int j=1;j<=i;j++){
//
//                System.out.print(currentalpha+" ");
//                currentalpha ++;
//            }
//            System.out.println();
//        }
//    }
//    static void reverse(int n){
//        for(int i=0;i<n;i++){
//            char charcter=(char)('E'-i);
//            for(int j=0;j<=i;j++){
//                System.out.print(charcter+" ");
//                charcter ++;
//            }
//            System.out.println();
//        }
//
//    }
    static void number_pyramib(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }










}
