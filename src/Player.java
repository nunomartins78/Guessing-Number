public class Player {
    public String name;
    public int generateGuess () {
       return (int) (Math.random() * ((20 - 10) + 1)) + 10;
    }
}
