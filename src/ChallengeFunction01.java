public class ChallengeFunction01 {

    public static void main(String[] args) {

        int highestScorePosition = calculateHighestScorePosition(999);
        displayHighestScorePosition("Tim", highestScorePosition);

    }

    public static void displayHighestScorePosition(String name, int highestScorePosition) {
        System.out.println(name + " managed to get into position " + highestScorePosition + " on highest score list");
    }

    public static int calculateHighestScorePosition(int playerScore) {
            int position = 4;
            if(playerScore >= 1000) {
                 position = 1;
            }else if(playerScore >= 500 ) {
                position = 2;
            }else if(playerScore >= 100 ) {
                position = 3;
            }
            return position;
    }


}
