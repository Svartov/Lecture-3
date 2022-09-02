// Подключаем библиотеку
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // Подключаем ввода с клавиатуры
        Scanner in = new Scanner(System.in);

        // Подключаем переменные и массив
        int number[] = new int[4];
        int MaxNum = number[0];
        int max = 0;


        // Вводим элементы массива
        for(int i = 0; i < 4; i++){
            System.out.print("Enter the number " + i + " : ");
            number[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(number));

        for(int i : number){
            max = max + i;
        }

        if(max > 0) {
                // Находим максимальный элемент из положительных чисел
                for (int j : number) {
                    if (j > MaxNum)
                        MaxNum = j;
            }
        }else if(max < 0){
                // Находим максимальный элемент из отрицательных чисел
                for (int j : number) {
                    if (j < MaxNum)
                        MaxNum = j;
                }
        }
        // Выводим на экран
        System.out.println("Максимальный элемент : " + MaxNum);



    }
}
