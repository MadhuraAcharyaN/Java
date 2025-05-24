public class Main {
    public static void main(String[] args) {
        double km = (100 * 1.609344);

        int highestScore = 50;
        if(highestScore > 25) {
            highestScore = 1000 + highestScore;
        }

        int health = 100;
        if(health < 25 && (highestScore > 1000)) {
            highestScore = highestScore - 1000;
        }
    }
}