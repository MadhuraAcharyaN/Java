public class MethodoverloadingChallenge2 {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));



    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return "Invalid data for seconds";
        }


        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0) {
            return "Invalid data for minutes";
        }

        if(seconds < 0 || seconds > 59) {
            return "Invalid data for seconds";
        }

        int hours = minutes / 60;
        int reminingMin = minutes % 60;

        return hours + "h " + reminingMin + "m " + seconds + "s";
    }
}
