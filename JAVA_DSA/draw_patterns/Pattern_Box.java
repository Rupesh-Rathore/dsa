public class Pattern_Box {

    /*
    input
    4
    output
    4 4 4 4 4 4 4 
    4 3 3 3 3 3 4 
    4 3 2 2 2 3 4 
    4 3 2 1 2 3 4 
    4 3 2 2 2 3 4 
    4 3 3 3 3 3 4 
    4 4 4 4 4 4 4 

    input
    2
    output
    2 2 2 
    2 1 2 
    2 2 2 
    */
    public static void main(String[] args) {
        int n = 8;
        pattern2(n);
    }

    // * Optimized approach
    static void pattern2(int n){
        int m = n * 2 - 1;
        for (int i = 1; i <= m; i++){
            for ( int j = 1; j <= m; j++){
                int leftDistance = j, rightDistance = m - j + 1, topDistance = i, bottomDistance = m - i + 1;
                int minDistance = Math.min(Math.min(leftDistance , rightDistance) , Math.min(topDistance , bottomDistance));
                System.out.print(1 + n - minDistance + " ");
            }
            System.out.println();
        }
    }

    // ! Brute force approach
    static void pattern(int n){

        for(int i = 0; i < n; i++){
            for (int j = 0; j<i; j++){
                System.out.print(n-j + " ");
            }
            for (int j = i; j < n; j++){
                System.out.print(n-i + " ");
            }
            for (int j = i+1; j < n; j++){
                System.out.print(n-i + " ");
            }
            for (int j = n - i ; j < n ; j++){
                System.out.print( j+1 + " ");
            }
            System.out.println();
        }

        for(int i = n - 2 ; i >= 0; i--){
            for (int j = 0; j<i; j++){
                System.out.print(n-j + " ");
            }
            for (int j = i; j < n; j++){
                System.out.print(n-i + " ");
            }
            for (int j = i+1; j < n; j++){
                System.out.print(n-i + " ");
            }
            for (int j = n - i ; j < n ; j++){
                System.out.print( j+1 + " ");
            }
            System.out.println();
        }
    }
}
