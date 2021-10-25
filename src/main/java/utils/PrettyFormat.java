package utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class PrettyFormat {
    //Pretty formatted data

    private static String datePrettyFormat(long timeInUnix) {
        LocalDateTime ldt = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(timeInUnix),
                TimeZone.getDefault().toZoneId()
        );

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm");
        return dtf.format(ldt);
    }
}
