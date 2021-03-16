package capitulo3.testes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HeartRatesTest {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);
    }
}
