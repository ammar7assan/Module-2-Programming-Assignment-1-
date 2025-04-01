public class TestMyDate {
    public static void main(String[] args) {
        // Create a MyDate object for the current date
        MyDate date1 = new MyDate();

        // Display its year, month, and day
        System.out.println("date1 -> year: " + date1.getYear() 
            + ", month: " + date1.getMonth() 
            + ", day: " + date1.getDay());

        // Create a MyDate object for the given elapsed time
        long elapsedTime = 34355555133101L;
        MyDate date2 = new MyDate(elapsedTime);

        // Display its year, month, and day
        System.out.println("date2 -> year: " + date2.getYear() 
            + ", month: " + date2.getMonth() 
            + ", day: " + date2.getDay());
    }
}
