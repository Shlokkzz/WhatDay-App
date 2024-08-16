package androidsamples.java.whatday;

import androidx.annotation.NonNull;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Represents the date to be set, whether it is a valid date, and the message with error status or the day of the week.
 */
public class DateModel {

    private static String message;

    // correct format for num
    private static boolean isNum(String num){
        try{
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    private static boolean checkValidity(int year,int month,int date){
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.YEAR,year);
        int totalDaysMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int totalDaysYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        if(totalDaysMonth<date){
            if(date==29) {
                if (totalDaysYear != 366) {
                    message = "February of " + year + " does not have 29 days";
                    return false;
                }
            }
            else{
                message = "This month does not have "+date+" days";
                return false;
            }
        }
        return true;
    }

    private static void findDay(int day){
        switch (day) {
            case 1:
                message = "Sunday";
                break;
            case 2:
                message = "Monday";
                break;
            case 3:
                message = "Tuesday";
                break;
            case 4:
                message = "Wednesday";
                break;
            case 5:
                message = "Thursday";
                break;
            case 6:
                message = "Friday";
                break;
            case 7:
                message = "Saturday";
                break;
        }
    }
  /**
   * Initializes the {@link DateModel} with the given year, month, and date.
   * If the date is not valid, it sets the appropriate error message.
   * If it is valid, it sets the appropriate day of the week message.
   *
   * @param yearStr  a {@code String} representing the year, e.g., "1947"
   * @param monthStr a {@code String} representing the month, e.g., "8"
   * @param dateStr  a {@code String} representing the date, e.g., "15"
   */
  public static void initialize(String yearStr, String monthStr, String dateStr) {
    // TODO implement the method to match the description
    Calendar calendar = Calendar.getInstance();
    calendar.setLenient(false);

    if(!isNum(yearStr) || !isNum(monthStr) || !isNum(dateStr)){
        message = "Enter values in a proper numeric format";
        return ;
    }
    // check year
    int year = Integer.parseInt(yearStr);
    if(year<=0){
        message = "Invalid year";
        return ;
    }
    // check month
    int month = Integer.parseInt(monthStr);
    if(month<=0 || month>12){
        message = "Invalid month";
        return ;
    }
    // check date
    int date = Integer.parseInt(dateStr);
    if(date<=0 || date>31){
        message = "Invalid date";
        return ;
    }
    // check validity
    if(!checkValidity(year,month,date)){
        return ;
    }
    // set calendar with correct values
    calendar.set(year,month-1,date);
    // find the day
    int day = calendar.get(Calendar.DAY_OF_WEEK);
    findDay(day);
  }

  /**
   * Retrieves the message from the {@link DateModel}.
   * It can be an error message like "February of 2019 does not have 29 days"
   * or a success message like "Friday".
   *
   * @return the message from the model
   */
  @NonNull
  public static String getMessage() {
    // TODO implement the method to match the description
    return message;
  }
}
