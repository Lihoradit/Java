import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int i= getRandomInt();
        //Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = Integer.toBinaryString(i).length();
        System.out.println(String.valueOf(n));
        StructureArrayMultiple(i,n);
        StructureArrayNONMultiple(i,n);

    }

    //Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    static void StructureArrayMultiple(int args1, int args2) {
        int temp = 0;
        for (int k = args1; k < Short.MAX_VALUE; k++) {
            if (k % args2 == 0) {
                temp++;

            }
        }
        int[] m1 = new int[temp];
        int index=0;
        for (int k = args1; k < Short.MAX_VALUE; k++) {
            if (k % args2 == 0) {
                m1[index] = k;
                index++;
            }

        }
        ShowArray(m1);
    }
    static void StructureArrayNONMultiple(int args1, int args2) {
        int temp1 = 0;
        for (int k = args1; k < Short.MAX_VALUE; k++) {
            if (k % args2 != 0) {
                temp1++;

            }
        }
        int[] m2 = new int[temp1];
        int index=0;
        for (int k = args1; k < Short.MAX_VALUE; k++) {
            if (k % args2 != 0) {
                m2[index] = k;
                index++;
            }

        }
        ShowArray(m2);
    }
    static void ShowArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
        //Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        static int getRandomInt(){
        Random random= new Random();
            int i = new Random().nextInt(0, 2000);
            System.out.println(String.valueOf(i));
            return i;
        }

}