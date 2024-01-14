import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//        Formatta la data ottenendo 01 marzo 2023
//        Stampa sulla console
//        Fai attenzione a usare almeno Java 8
//        Crea dei test per questo esercizio
public class Main {
    public static void main(String[] args) {
        //Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
        String inputString = "2023-03-01T13:00:00Z";
        ZonedDateTime zonedDateTime = OffsetDateTime.parse(inputString).toZonedDateTime();

        // Formatta la data ottenendo 01 marzo 2023 e Stampa sulla console
        String dateFormatted = zonedDateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println(dateFormatted);

    }
}
