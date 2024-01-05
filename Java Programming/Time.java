import java.time.*;
import java.time.format.DateTimeFormatter;
public class Time {
    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now();
        LocalTime myLocalTimeObj = LocalTime.now();
        LocalDateTime myLocalDateTimeObj = LocalDateTime.now();
        System.out.println(myObj);
        System.out.println(myLocalTimeObj);
        System.out.println(myLocalDateTimeObj);

        DateTimeFormatter myFormatterObj = DateTimeFormatter.ofPattern("E - MMM - dd- YYYY");
        String formateDate = myLocalDateTimeObj.format(myFormatterObj);
        System.out.println(formateDate);
    }
}

