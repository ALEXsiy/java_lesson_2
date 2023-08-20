import java.lang.Math;
import java.util.*;

public class test_2 {
    public static void main(String[] args){
        //2.19 Задание 2. Переменные, математические функции, условные операторы
        int a=0,b=0,c=0;   //объявил и проинициализировал  целочисленые переменные
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a:");
        a=in.nextInt(); //считал a
        System.out.print("Введите число b:");
        b=in.nextInt(); //считал b
        System.out.print("Введите число c:");
        c=in.nextInt(); //считал с
        in.close();

        boolean fl =false;
        //Проверка чисел на кратность 5
        String a_=new String();
        String b_ =new String();
        String c_ =new String();
        String st_fl_ =new String();
        if(a%5==0){
             a_ ="a="+a+";";
             fl=true;
        }
        if(b%5==0){
            b_="b="+b+";";
            fl=true;
        }
        if(c%5==0){
           c_ = "c="+c+";";
           fl=true;
        }
        //Проверка наличия числа кратного 5
        if(!fl)
            st_fl_="Нет значений кратных 5!";

        String res_str = String.join(" ",a_,b_,c_,st_fl_ );
        System.out.println( res_str);

        System.out.println("Int(a/b): "+(a/b)); //Вывел на консоль значение от целочисленного деления a на b (результат - целое число)
        System.out.println("Double(a/b): "+((double)a/b)); //Вывел на консоль значение от деления a на b (результат - число с плавающей запятой)
        System.out.println("Ceil(a/b): "+Math.ceil((double)a/b)); //Вывел на консоль значение от деления a на b, округленного до ближайшего целого в большую сторону
        System.out.println("Floor(a/b): "+Math.floor((double)a/b)); //Вывел на консоль значение от деления a на b, округленного до ближайшего целого в меньшую сторону
        System.out.println("Round(a/b): "+Math.round((double)a/b)); //Вывел на консоль значение от деления a на b, округленного до ближайшего целого математическим округлением
        System.out.println("b%c="+(b%c)); //вывел на консоль остаток от деления b на c
        System.out.println("Min(a,b)="+Math.min(a,b)); //Вывел на консоль наименьшее значение из a и b
        System.out.println("Max(b,c)="+Math.max(b,c)); //Вывел на консоль наибольшее значение из b и c
    }
}
