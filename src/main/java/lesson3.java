import java.math.MathContext;
import java.sql.SQLOutput;
import java.util.*;

public class lesson3 {
    public static void main(String[] args) {
        ArrayList<Integer> list= ListCreate();
        System.out.println("Изначальный список значений:"+list);
        MergeSortList(list);
        FindMinMax(list);
        ArrayList<Integer> list1 =ListCreate();
        ArrayList<Integer> list2 = ListCreate();
        DoubleList(list1,list2);
//        Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        long begin = System.currentTimeMillis();
        ArrayList<Integer> rofl= new ArrayList<>();
        int n=0;
        String temp="0";
        while (n!=9999)
        {
            temp+="0";
            n++;
        }
        rofl.add(Integer.parseInt(temp));
        System.out.println(rofl);
        long end= System.currentTimeMillis();
        System.out.println(end-begin);
//        Повторить пятый пункт но с LinkedList.
        long begin1 = System.currentTimeMillis();
        LinkedList<Integer> link= new LinkedList<>();
        int k=0;
        String temp1="0";
        while (k!=9999)
        {
            temp+="0";
            k++;
        }
        link.add(Integer.parseInt(temp1));
        System.out.println(link);
        long end1= System.currentTimeMillis();
        System.out.println(end1-begin1);
    }
//    Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
    static void DoubleList(ArrayList list1, ArrayList list2){
        System.out.println(list1);
        System.out.println(list2);
        list2.removeAll(list1);
        list1.add(list2);
        System.out.println(list1);

    }
//    Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    static void FindMinMax(ArrayList list){
        int max=0;
        int min=90;
        for (int i = 0; i < list.size(); i++) {
            if((int)list.get(i)>max){
                max= (int)list.get(i);
            }
            if ((int)list.get(i)<min) {
                min=(int)list.get(i);
            }
        }
        System.out.println("Макимальное значение списка:"+max);
        System.out.println("Минимальное значение списка:"+min);
    }
    static ArrayList ListCreate()
    {
        ArrayList<Integer> num =new ArrayList();
        for (int i = 0; i <5; i++) {
            num.add(new Random().nextInt(0,10));
        }
        return num;
    }
    //Пусть дан произвольный список целых чисел, удалить из него чётные числа
    //+Реализовать алгоритм сортировки списков слиянием
    static void MergeSortList(ArrayList list)
    {
        Collections.sort(list);
        System.out.println("Отсортированный список:"+list);
        for (int i = 0; i < list.size(); i++) {
            if((int)list.get(i)%2==0){
                list.remove(i);
                i=i-1;
            }
        }
        System.out.println("Список без четных чисел:" +list);
    }

}

