import java.util.Scanner;

public class GrocerTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");

        String response = scan.nextLine();
        
        scan.close();
        
        for (int i = 0; i < store.length; i++) {
            if(store[i].equals(response)){
                System.out.println("\nWe have " + store[i] + " in aisle: " + i);
                break;
            } else {
                System.out.println("Sorry, we do not have " + response);
                break;
            }
        }
    }
}
