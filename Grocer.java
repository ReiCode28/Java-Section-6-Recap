public class Grocer {
    public static void main(String[] args) {

        String[] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nDo you sell coffee?");
        for (int i = 0; i < aisle.length; i++){
            if (aisle[i].equalsIgnoreCase("coffee")){
               System.out.println("\nWe have " + aisle[i] + " in aisle: " + i);
               break; 
            }
            
            
        }
        
        /* An array that stores each aisle:
             apples – bananas – candy – chocolate – coffee – tea
            The for loop searches through the array and if it has what 
            the customer is looking for, it will print the aisle location
        */
    
    }
}
