public class ChallengeIfElseStatement {
    public static void main(String[] args) {



//        gameOver = true;
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score was :" + finalScore);
//        }

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final score: " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
//        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final score: " + calculateScore(gameOver, score, levelCompleted, bonus));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
//            System.out.println("Your final score was :" + finalScore);
        }
        return finalScore;
    }
}
