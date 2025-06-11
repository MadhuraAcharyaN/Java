public class MethodOverloading {
    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score " + newScore );
        calculateScore(75);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore( int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("No player name, No score");
        return 0;
    }

//    public static void calculateScore() {
//        System.out.println("No player name, No score");
//
//    }
}
