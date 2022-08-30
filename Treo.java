// Подключение библиотеки
import java.util.Scanner;

public class Treo {
    public static void main(String[] args) {

        // Подключение сканера
        Scanner in = new Scanner(System.in);

        // Переменные
        int a;
        int b;
        int c;

        // Ввод сторон
        System.out.print("Введите сторону А:");
        a = in.nextInt();
        System.out.print("Введите сторону В:");
        b = in.nextInt();
        System.out.print("Введите сторону С:");
        c = in.nextInt();

        // Проверка на введёные данные
        if( a + b > c && a + c > b &&  b + c > a){
            System.out.println("Верно");
        }else{
            System.out.println("Не верно.");
        }

    }
}
