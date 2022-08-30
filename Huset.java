// Подключаем библиотеку
import java.util.Scanner;

public class Huset {

    public static void main(String[] args){

        // Подключаем сканер
        Scanner in = new Scanner(System.in);

        // Подключаем переменные
        int a;
        int par;
        int etaj;

        // Вввод номера квартиры
        System.out.print("Введите номер квартиры");
        a = in.nextInt();

        par = ( a - 1) / 36 + 1; // Находим парадную
        etaj = ( a - 36 * ( par - 1 ) - 1) / 4 + 1; // Находим этаж


        if ( a > 0 && a <= 180  ){
            System.out.println("Этаж: " + etaj );
            System.out.println("Порадная: " + par );
        }else {
            System.out.println("Квартира не найдена");
        }
    }
}

