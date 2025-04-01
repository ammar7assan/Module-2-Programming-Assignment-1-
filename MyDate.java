import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    // Data fields
    private int year;
    private int month; // 0-based: 0=January, 1=February, ...
    private int day;

    /**
     * No-argument constructor
     * Creates a MyDate object for the current date.
     */
    public MyDate() {
        // Get current time in milliseconds from Unix epoch
        long currentTimeMillis = System.currentTimeMillis();
        setDate(currentTimeMillis);
    }

    /**
     * Constructs a MyDate object with a specified
     * elapsed time (in milliseconds since January 1, 1970).
     *
     * @param elapsedTime the milliseconds since epoch
     */
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    /**
     * Constructs a MyDate object with the specified year, month, and day.
     *
     * @param year the year (e.g., 2025)
     * @param month the month (0-based, 0 = January)
     * @param day the day of the month
     */
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Gets the year of this MyDate.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the month of this MyDate (0-based).
     *
     * @return the month (0 = January, 11 = December)
     */
    public int getMonth() {
        return month;
    }

    /**
     * Gets the day of this MyDate.
     *
     * @return the day of the month
     */
    public int getDay() {
        return day;
    }

    /**
     * Updates the date of this MyDate based on the given
     * elapsed time since January 1, 1970, in milliseconds.
     *
     * @param elapsedTime the milliseconds since epoch
     */
    public void setDate(long elapsedTime) {
        // Create a GregorianCalendar and set the time
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);

        // Extract the year, month, and day of month
        this.year = cal.get(Calendar.YEAR);
        this.month = cal.get(Calendar.MONTH); // 0-based
        this.day = cal.get(Calendar.DAY_OF_MONTH);
    }
}
