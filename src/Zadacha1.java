import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        otrArray();
    }
    private static void otrArray (){
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do{System.out.println("Введите число(для завершения введите 100):");
            list.add(scanner.nextInt());
        }
        while (list.get(list.size()-1) != 100);
        list.remove(list.size()-1);

        int count = 0;
        for(Integer el:list){
            if (el<0) count++;
        }

        System.out.println("Количество отрицательных чисел: " + count);
    }
}