package capitulo3.testes;

import capitulo3.modelos.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(15, 03, 2021);
//        String data =  date.displayDate();
        System.out.println(date.displayDate());
    }
}
