package Grooming;
public class AttedenceTraacker {
    public static void main(String[] args) {
        String[] ids = {"Lmr1", "Lmr2", "Lmr3", "Lrnr4"};
        String[] times = {"09:00-17:00", "08:45-17:30", "09:00-17:35", "09:15-17:30"};

        int maxMinutes = -1;
        String maxId = "";

        for (int i = 0; i < ids.length; i++) {
            String[] parts = times[i].split("-");
            String[] inTime = parts[0].split(":");
            String[] outTime = parts[1].split(":");

            int inMinutes = Integer.parseInt(inTime[0]) * 60 + Integer.parseInt(inTime[1]);
            int outMinutes = Integer.parseInt(outTime[0]) * 60 + Integer.parseInt(outTime[1]);

            int duration = outMinutes - inMinutes;

            if (duration > maxMinutes) {
                maxMinutes = duration;
                maxId = ids[i];
            }
        }

        int hours = maxMinutes / 60;
        int minutes = maxMinutes % 60;

        System.out.println(maxId + ", " + hours + "." + String.format("%02d", minutes));
    }
}
