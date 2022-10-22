public class RandomNumbers {
    public static void main(String[] args) {
        // 2D array with 100 rows and 10 columns.
        int[][] randomArr = new int[100][10];


        /**
         *  nested loop populated with random numbers then 
         * updating array into print2Darray
         */

        for(int i = 0; i < randomArr.length; i++){
            for(int j = 0; j < randomArr[i].length; j++){
                randomArr[i][j] = randomNumber();
            }
            print2DArray(randomArr);
        } 
    }

    /** 
     * Inside the function:
     *    1. returning a random number between 1 and 100. 
     */

    public static int randomNumber(){
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    } 


    /** 
     * Inside the function:
     *
     *   1. prints the array such that:
     *        • Each row takes up one line.
     *        • There's a space between each value.
     */

    public static void print2DArray(int[][] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    } 
}
