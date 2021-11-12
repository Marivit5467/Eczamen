import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        zadacha();
    }
    private static void zadacha() {
        String[] list = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < list.length; i++) {
            System.out.println("Введите " + " строку:");
            list[i] = scanner.nextLine();
        }

        String a = list[0];

        for(String el:list){
            if(el.length() > a.length()){
                a = el;
            }
        }

        for(String max:list){
            if(max.length() == a.length()){
                System.out.println("Самая длинная строка: " + max);
            }
        }
    }
}
