public class Game {

    public static Player runGame(int maximumValue,int minimumValue, Player player1, Player player2) {
        Player lastPlayer = null;
        int attempt = 0;
        int numberToGuess = (int) (Math.random() * ((maximumValue - minimumValue) + 1)) + minimumValue;
        System.out.println("The number to guess is " + numberToGuess);
        while (numberToGuess != attempt) {
            if (lastPlayer == player1) {
                attempt = player2.generateGuess();
                System.out.println("Player 2 guesses " + attempt);
                lastPlayer = player2;
            } else {
                attempt = player1.generateGuess();
                System.out.println("Player 1 guesses " + attempt);
                lastPlayer = player1;
            }
        }
        return lastPlayer;
    }
}