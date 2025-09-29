package week2.pr1.variables.exercises.expression;

public class DisplayingTheCurrentTime {

    public static void main(String[] args) {

        long current_milli_seconds, total_seconds, total_minutes, total_hours;
        int seconds, minutes, hours;

        current_milli_seconds = System.currentTimeMillis();
        total_seconds = current_milli_seconds / 1000;
        seconds = (int) total_seconds % 60;
        total_minutes = total_seconds / 60;
        minutes = (int) total_minutes % 60;
        total_hours = total_minutes / 60;
        hours = (int) total_hours % 24 + 7;

        System.out.printf("Current time is %d:%d:%d", hours, minutes, seconds);

    }
}