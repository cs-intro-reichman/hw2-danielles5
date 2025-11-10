public class TimeCalc {
    public static void main(String[] args) {

        // recieves input as HH:MM and number of minutes to add
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addMinutes = Integer.parseInt(args[1]);

        // calculates the new hour and new minute values needed based off of the input
        int totalMinutes = (hours * 60) + minutes + addMinutes;
        int totalHours = totalMinutes / 60;
        int newHourTime = totalHours % 24; 
        int newMinutesTime =  totalMinutes - (totalHours * 60);

        // accounts for correct formatting of time when printing
        String formatCheckHour = (newHourTime < 10) ? "0" + newHourTime : "" + newHourTime;
        String formatCheckMin = (newMinutesTime < 10) ? "0" + newMinutesTime : "" + newMinutesTime;

        System.out.println(formatCheckHour + ":" + formatCheckMin);
    }
}
