import java.lang.*;
import java.util.*;

public class test_1 {
    public static void main(String[] args){
        //2.18 Задание 1. Базовый опыт создания исполняемой Java-программы: потоки ввода-вывода System.in и System.out.
        System.out.println("Как тебя зовут? "); //Вывел надпись на консоль
        Scanner in =new Scanner(System.in); //Применим класс Scanner, чтобы взять с потока ввода данные
        String name = in.nextLine(); //Считал строку, которую ввёл пользователь
        System.out.printf("Привет, %s!",name); //Вывел надпись на консоль
        in.close();
    }
}
