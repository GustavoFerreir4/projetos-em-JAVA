public class TimeConversor {

    public static float hoursToSeconds(float timeInHours){
        return timeInHours * (60 * 60);
    }

    public static float minutesToHours(float timeInMinutes){
        return timeInMinutes / 60;
    }

    public static float secondsToHours(float timeInSeconds){
        return timeInSeconds / 60 / 60;
    }
}
