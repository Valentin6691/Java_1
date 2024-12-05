// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

// import java.util.Scanner;

// public class HW1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int res = 1;
//         for(int i = 1; i < n + 1; i++){
//             res = res * i;
//         }
//         System.out.print(res);
//     }
    
// }
// 2. Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.List;

public class HW1 {

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        boolean a = true;
        for(int i = 1; i < 1000; i++) {
            for(int j = 2; j < i/2; j++) {
                if(i % j == 0) {
                    a = false;
                    break;
                }
            }
            if(a) {
                s.add(i);
            }
            else {
                a = true;
            }
        }
        System.out.println(s);
    }
}