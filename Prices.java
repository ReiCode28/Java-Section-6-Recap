import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        double[][] arr = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        for (int i = 0; i < arr.length; i++){
            switch (i) {
                case 0: System.out.print("\tBaking: "); break;
                case 1: System.out.print("\tBeverage: "); break;
                case 2: System.out.print("\tCereals: "); break;
            }
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        // System.out.println("Baking: " + Arrays.toString(arr[0]));
        // System.out.println("Beverage: " + Arrays.toString(arr[1]));
        // System.out.println("Cereals: " + Arrays.toString(arr[2]));

        
    }
}