public class Main {
    public static int maximumValue = 20;
    public static int minimumValue = 10;
    private double numberToGuess = (Math.random() * ((maximumValue - minimumValue) + 1)) + minimumValue;

    static Player player1 = new Player();
    static Player player2 = new Player();


    public static void main(String[] args) {
        player1.name = "Antonio";
        player2.name = "Francisco";

        Game guessingGame = new Game();
        int VictoriesP1 = 0;
        int VictoriesP2 = 0;
        while (VictoriesP1< 3 && VictoriesP2< 3 ) {
            Player RoundWinner = guessingGame.runGame(maximumValue, minimumValue, player1, player2);
            if (RoundWinner.name == "Antonio") {
                VictoriesP1 += 1;
            } else {
                VictoriesP2 += 1;
            }
            System.out.println(player1.name + " " + VictoriesP1 + " " + player2.name + " " + VictoriesP2);
        }
        if (VictoriesP1 == 3) {
            System.out.println(player1.name + " wins the game!");
        }
        if (VictoriesP2 == 3) {
            System.out.println(player2.name + " wins the game!");
        }
    }
}