package entity;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.TimeZone;

public class Booking implements Serializable {
    private String id;
    private String ulogin;
    private List<Passenger> pList;
    private Routes r;

    public Booking(String ulogin, List<Passenger> pList, Routes r) {
        this.ulogin = ulogin;
        this.pList = pList;
        this.r = r;
    }

    public Booking() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUlogin() {
        return ulogin;
    }

    public void setUlogin(String ulogin) {
        this.ulogin = ulogin;
    }

    public List<Passenger> getpList() {
        return pList;
    }

    public void setpList(List<Passenger> pList) {
        this.pList = pList;
    }

    public Routes getR() {
        return r;
    }

    public void setR(Routes r) {
        this.r = r;
    }

    private static int randInt(int min, int max) {
        return (int) (Math.random()*(max - min + 1) + min);
    }

    private static String idGenerator() {
        char randomCapChar = (char) randInt(65, 90);
        String id =
                "BK" + String.valueOf(randInt(100, 1000)) + randomCapChar;
        return id;
    }

    private String listToStr(List<Passenger> lp) {
        StringBuilder sb = new StringBuilder();
        for (Passenger p : lp) {
            String name = p.name;
            String surname = p.surname;
            sb.append(name)
                    .append(" ")
                    .append(surname)
                    .append(", ");
        }

        String s = sb.toString();
        return s.substring(0, s.length() - 2);
    }

    private static String datePrettyFormat(long timeInUnix) {
        LocalDateTime ldt = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(timeInUnix),
                TimeZone.getDefault().toZoneId()
        );

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm");
        return dtf.format(ldt);
    }
}
