import java.util.*;
import java.text.*;

public class test_5 {
    public static void main(String[] args){
        // 2.22 Задание 5. Даты. SimpleDateFormat, Calendar, циклы, условные операторы (списки и мапы по желанию).
        //Считаем строку с датой
        Scanner in=new Scanner(System.in);
        System.out.println("Введите дату в формате (dd.MM.yyyy): ");
        String date_str = in.nextLine();
        //Преобразуем строку в Дату
        SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
        Date new_date = new Date();
        Date datepr;
        try {
            datepr= ft.parse(date_str);
            new_date=datepr;
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
        System.out.println("Ваша дата: "+ new_date);
        GregorianCalendar c_date =new GregorianCalendar();
        c_date.setTime(new_date);
        //Прибавим к дате 45 дней
        c_date.add(GregorianCalendar.DAY_OF_MONTH, 45);
        Date date_45 = c_date.getTime();
        System.out.println("Ваша дата +45 дней:  " + date_45);
        c_date.add(GregorianCalendar.DAY_OF_MONTH,-45);
        //Прибавим к нашей дате 10 рабочих дней
        for (int i = 0; i < 10;i++) {
            if (c_date.get(GregorianCalendar.DAY_OF_WEEK) ==GregorianCalendar.SATURDAY || c_date.get(GregorianCalendar.DAY_OF_WEEK) ==GregorianCalendar.SUNDAY)
                i--;
            c_date.add(GregorianCalendar.DAY_OF_MONTH, 1);
        }
        Date date_10=c_date.getTime();
        System.out.println("К вашей дате прибавили 10 рабочих дней: "+date_10);
        //Откатимся к началу года
        int day_first=(int)c_date.get(GregorianCalendar.DAY_OF_YEAR)-1;
        c_date.add(GregorianCalendar.DAY_OF_YEAR,(-1)*day_first);
        Date date_first =c_date.getTime();
        System.out.println("Дата начала года: "+date_first);
        //Считаем ещё одну строку и преобразуем в дату
        System.out.println("Введите ещё одну дату в формате (dd.MM.yyyy): ");
        String date_2 =in.nextLine();
        Date new_date2 = new Date();
        Date datepr2;
        try {
            datepr2= ft.parse(date_2);
            new_date2=datepr2;
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
        System.out.println("Ваша дата: "+ new_date2);
        GregorianCalendar c_date2 =new GregorianCalendar();
        c_date.setTime(new_date2);

        GregorianCalendar start =  new GregorianCalendar();
        start.setTime(new_date);
        GregorianCalendar end = new GregorianCalendar();
        end.setTime(new_date2);
        //Посчитаем кол-во рабочих дней между датами
        int work_days = 0;
        if (start.getTimeInMillis() == end.getTimeInMillis()) {
            System.out.println("Кол-во рабочих дней между датами: "+work_days);
        }
        else {
            if (start.getTimeInMillis() > end.getTimeInMillis()) {
                start.setTime(new_date2);
                end.setTime(new_date);
            }
            do {
                start.add(GregorianCalendar.DAY_OF_MONTH, 1);
                if (start.get(GregorianCalendar.DAY_OF_WEEK) != GregorianCalendar.SATURDAY && start.get(GregorianCalendar.DAY_OF_WEEK) != GregorianCalendar.SUNDAY) {
                    work_days++;
                }
            } while (start.getTimeInMillis() < end.getTimeInMillis());
            work_days--;
            System.out.println("Кол-во рабочих дней между датами: "+work_days);
        }
        in.close();
    }
}
