public class HighScoreTwo {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        
        System.out.println("\nHere are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(i+1 + ". " + scores[i]);
        }
    
        int highScore = 0;
        int seat = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
                seat = i + 1;
            }
        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Impressive!");
        System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");
    }
    
    public static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
}
