public class SleepIn {
    public Boolean SleepIn(Boolean weekday, Boolean vacation) {
        if (!weekday || vacation) {
            System.out.println("uyku zamani");
            return true;
        }
        System.out.println("calis yatma");
        return false;
    }
}
