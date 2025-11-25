package application;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

    private static final DateTimeFormatter fmtDate = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
    private static final DateTimeFormatter fmtHour = DateTimeFormatter.ofPattern("HH:mm").withZone(ZoneId.systemDefault());

    public static void main(String[] args) {

        Instant localDay = Instant.now();

        System.out.println("Bem vindo ao relógio do mundo, aqui em baixo está informações sobre datas e horários do mundo:");
        System.out.println();

        hourOf("Máquina local", ZoneId.systemDefault().toString(), localDay);
        hourOf("Portugal", "Portugal", localDay);
        hourOf("Japão", "Japan", localDay);
        hourOf("Alemanha", "Europe/Berlin", localDay);
        hourOf("Brasil", "America/Sao_Paulo", localDay);
        hourOf("Reino Unido", "Europe/London", localDay);
        hourOf("Estados Unidos", "America/New_York", localDay);
    }

    public static void hourOf(String local, String zoneID, Instant moment) {
        LocalDateTime dateTimeLocal = LocalDateTime.ofInstant(moment, ZoneId.of(zoneID));

        System.out.println("Local: " + local);
        System.out.println(" Data: " + fmtDate.format(dateTimeLocal));
        System.out.println(" Hora: " + fmtHour.format(dateTimeLocal));
        System.out.println();
    }
}
