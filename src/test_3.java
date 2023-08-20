import java.lang.Math;
import java.util.*;

public class test_3 {
    public static void main(String[] args){
        //2.20 Задание 3. Массивы, циклы, условные операторы, математические функции, (списки и мапы по желанию)
        int[] array = new int[20]; //Создал массив целочисленных элементов с размером 20
        System.out.print("Array is: ");
        //Заполняю массив рандомными целыми числами от 0 до 15
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random() * 15D);
            System.out.print(array[i]+" ");
        }
        System.out.print("\nПовторяющиеся элементы: \n");
        //Создаю мэп и воспроизвожу счет повторяющихся элементов
        HashMap<Integer,Integer> mhm = new HashMap<Integer, Integer>();
        for(int i=0;i<array.length;i++){
            if(mhm.containsKey(array[i]))
            {
                mhm.put(array[i], mhm.get(array[i]) + 1);;
            }
            else {
                mhm.put(array[i],1);
            }
        }
        //Прохожусь по мэпу и вывожу те пары, у которых значения больше 1 (то бишь число повторяеется в массиве более 1 раза)
        for(Map.Entry<Integer,Integer> entry : mhm.entrySet()) {
            if(entry.getValue()>1)
                System.out.println("Число '" + entry.getKey() + "' встречается " + entry.getValue() + " раза!");
        }
    }
}
