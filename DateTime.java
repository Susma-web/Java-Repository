import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTime {
public static void main(String[] args) {
LocalDate objDate = LocalDate.now();
System.out.println(objDate);
LocalTime objTime = LocalTime.now();
System.out.println(objTime);
LocalDateTime objDT = LocalDateTime.now();
System.out.println(objDT);
System.out.println("Before Formatting : " + objDT);
DateTimeFormatter objFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
String formatted = objDT.format(objFormat);
System.out.println("After Formatting : " + formatted);
DateTimeFormatter objFormatType = DateTimeFormatter.ofPattern("yyyy-MM-dd mm:HH:ss");
String formattedType = objDT.format(objFormatType);
System.out.println("After Formatting : " + formattedType);
DateTimeFormatter objFormatSlash = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
String formattedSlash = objDT.format(objFormatSlash);
System.out.println("After Formatting : " + formattedSlash);
DateTimeFormatter objFormatMonth = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
String formattedMonth = objDT.format(objFormatMonth);
System.out.println("After Formatting : " + formattedMonth);
DateTimeFormatter objFormatDay = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
String formattedDay = objDT.format(objFormatDay);
System.out.println("After Formatting : " + formattedDay);
}
}