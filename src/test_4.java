import java.util.*;
import java.text.*;

public class test_4 {
    public static void main(String[] args){
        //2.21 Задание 4. Строки, циклы, условные операторы, (списки и мапы по желанию).
        System.out.println("Введите строку: ");      //Запрашиваем строку
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Введите подстроку: "); //Запрашиваем подстроку
        String st = in.nextLine();

        //Проверка строки
        if(str ==null||str.length()==0)

        {
            System.err.println("Ошибка. Пустая строка!");
        }
        else

        {
            //Считаем кол-во подстрок в строке.
            int index = 0, count = 0;
            while (true) {
                index = str.indexOf(st, index);
                if (index != -1) {
                    count++;
                    index += st.length();
                } else {
                    break;
                }
            }
            System.out.printf("Подстрока %s в строке %s встречается %d раз(а) \n", st, str, count); //Выводим ответ
        }

        System.out.println("Введите строку: ");      //Запрашиваем строку
        String stkaka = in.nextLine();
        String tLc = stkaka.toLowerCase(); //переводим в нижний регистр
        String s1 = tLc.replace("кака", "*вырезано_цензурой*"); //Ищем и заменяем все вхождения подстроки в строку
        String s2 = s1.replace("бяка", "*вырезано_цензурой*"); //Ищем и заменяем все вхождения подстроки в строку
        System.out.printf("Результат: %s\n",s2); //Выводим результат

        //как я понял, в задании №4.3 нужно преобразовать строку с датой с помощью методов класса string, а уж в следующем задание нужно использовать специализированные классы
        System.out.println("Введите строку с датой формата dd.mm.yyyy:");
        String sd = in.nextLine();
        //Обрабатываем день
        char[] day=new char[2 - 0];
        sd.getChars(0, 2, day, 0);
        String day_ = new String(day);
        //Обрабатываем месяц
        char[] month=new char[5 - 3];
        sd.getChars(3, 5, month, 0);
        String month_ = new String(month);
        //Обрабатываепм год
        char[] year=new char[10 - 6];
        sd.getChars(6, 10, year, 0);
        String year_ = new String(year);
        //Формируем строку нужного формата и выводим
        String date_str =year_+"-"+month_+"-"+day_;
        System.out.println("Преобразованая строка с датой: "+ date_str);

        //распарсим строку и переведем в класс Дата и преобразуем его формат
        SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
        Date datapr;
        try {
            datapr= ft.parse(sd);
            SimpleDateFormat newformat_ = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("Преобразованая с помощью классов  SimpleDateFormat и Data:  " + newformat_.format(datapr));
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
        in.close();
    }
}
