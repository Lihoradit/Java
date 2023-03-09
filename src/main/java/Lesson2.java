import javax.sound.midi.Soundbank;
import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.SortedMap;

public class Lesson2 {
    public static void main(String[] args) {


        String first="Hello world!";
        String second="!dlrow olleH";
        String tip ="Hello world!";
        //Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        //CompareStr(first,tip);
        //Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        //CompareString(first,second) ;
        //Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        StringBuilder example1 =new StringBuilder();
        example1.append("3")
                .append("+")
                .append("56")
                .append("=59");
        StringBuilder example2 =new StringBuilder();
        example2.append("3")
                .append("-")
                .append("56")
                .append("=-53");
        StringBuilder example3 =new StringBuilder();
        example3.append("3")
                .append("*")
                .append("56")
                .append("=168");
        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        example1.deleteCharAt(4);
        example1.insert(4, "равно");
        System.out.println(example1);
        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        example2.replace(4,5,"Равно");
        System.out.println(example2);
    }
    static void CompareString(String str1, String str2){
        str1= new StringBuilder(str1).reverse().toString();
        if (str1==str2){
            System.out.println("Обе строки одинаковы, но одна из них развернута");
        }
        else {
            System.out.println("Строки разные");
        }
    }
    static void CompareStr(String str1, String str2){
        if( str1==str2){
            System.out.println("Строки одинаковы");
        } else{
            System.out.println("Строки разные");
        }
    }
}
