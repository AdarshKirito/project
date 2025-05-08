class Pattern1{
    // static void pattern(){
    //     for(int i=1; i<=5; i++){
    //         for(int j=1; j<=5; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // static void pattern(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    // static void pattern(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n-i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // static void pattern1(int n){
    //     for(int i=0; i<n; i++){
    //         //spaces
    //         for(int j=0; j<n-i-1; j++){
    //             System.out.print(" ");
    //         }
    //         //stars
    //         for(int j=0; j<2*i+1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
        
    // }
    // static void pattern(int n){
    //     for(int i=0; i<n; i++){
    //         //spaces
    //         for(int j=0; j<i; j++){
    //             System.out.print(" ");
    //         }
    //         //stars
    //         for(int j=0; j<2*n-(2*i+1); j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
        
    // }

    // static void pattern(int n){
    //     for(int i=1; i<2*n; i++){
    //         if(i<=n){
    //             for(int j=1; j<=i; j++){
    //                 System.out.print("*");
    //             }
    //         }else{
    //             for(int j=1; j<=2*n-i; j++){
    //                 System.out.print("*");
    //             }
    //         }
    //         System.out.println();

    //     }
    // }

    // static void pattern(int n){
    //     int k=0;
    //         for(int i=1; i<2*n; i++){
    //             if(i>n){
    //                 k= 2+k;
    //             }
    //             for(int j=1; j<=i-k; j++){
    //                 System.out.print("*");
    //             }
    //             System.out.println();
    
    //         }
    //     }

    //  static void pattern(int n){
    //     for(int i=1; i<2*n; i++) {
    //         int k = i;
    //         if(i>n){
    //             k= 2*n-i;
    //         }
    //         for(int j=1; j<=k; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

        static void pattern(int n){
            for(int i=1;i<=n;i++){
                int flag =  0;
                if(i%2==0){
                    flag = 0;  
                }
                else{
                    flag = 1;
                }
                for( int j=1;j<=i;j++ ){
                    System.out.print(flag);
                    flag=1-flag;
                }
                System.out.println();
            }

        }


    public static void main(String args[]){
        int n = 5;
        pattern(n);

    }
}