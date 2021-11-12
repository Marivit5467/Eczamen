import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        zadacha3();
    }
    private static void zadacha3() {
        String[] list = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < list.length; i++) {
            System.out.println("Введите строку:");
            list[i] = scanner.nextLine();
        }

        String stroka = list[0];

        for(String max:list){
            if(max.length() > stroka.length()){
                stroka = max;
            }
        }

        for(String max:list){
            if(max.length() == stroka.length()){
                System.out.println("Самая длинная строка: " + max);
            }
        }
    }
}