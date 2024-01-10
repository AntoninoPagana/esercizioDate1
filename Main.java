import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println("Stringa non formatta: " + data);

        String stringaFormattataShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Stringa formattata in SHORT: " + stringaFormattataShort);

        String stringaFormattataMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Stringa formattata in MEDIUM: " + stringaFormattataMedium);

        String stringaFormattataLong = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Stringa formattata in LONG: " + stringaFormattataLong);

        String stringaFormattataFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Stringa formattata in FULL: " + stringaFormattataFull);
    }
}
