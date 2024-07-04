public class Pyramid {
    public static void main(String[] args) {
        int lines = 5;

        for (int i = 0; i<= lines; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println("");
            
        }
        int rows = 5;

        for (int k = rows; k>=1; --k) {
            for (int l = 1; l <= k; ++l) {
            System.out.print(l + " ");
            }
        System.out.println("");
        }
        int col = 9, z = 0;
        for (int i = 1; i < col; ++i, z = 0) {
            for (int s = 1; s<=col-i; ++s) {
                System.out.print(" ");
            }
            while (z != 2 * i - 1) {
            System.out.print("5");
                ++z;
            }
            System.out.println("");
        }
    }
    
}
