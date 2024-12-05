// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

// import java.util.Scanner;

// public class Java_HW1 {
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

// import java.util.ArrayList;
// import java.util.List;

// public class Java_HW1 {

//     public static void main(String[] args) {
//         List<Integer> s = new ArrayList<>();
//         boolean a = true;
//         for(int i = 1; i < 1000; i++) {
//             for(int j = 2; j < i/2; j++) {
//                 if(i % j == 0) {
//                     a = false;
//                     break;
//                 }
//             }
//             if(a) {
//                 s.add(i);
//             }
//             else {
//                 a = true;
//             }
//         }
//         System.out.println(s);
//     }
// }

// 3. Реализовать простой калькулятор

// import java.util.Scanner;

// public class Java_HW1 {
//     public static void main(String[] args) {
//         System.out.println("Calculator ready enter expression:\n enter 'exit' for leave");
//         Scanner sc = new Scanner(System.in);
//         int a = 0;
//         int b = 0;
//         String op = "";
//         do {
//             String input = sc.next();
//             if (input.equals("exit")) {
//                 break;
//             }
//             String[] strings = input.split("\\W");
//             String[] operator = input.split("\\w");
//             try {
//                 a = Integer.parseInt(strings[0]);
//                 b = Integer.parseInt(strings[1]);
//                 op = operator[operator.length - 1];
//                 System.out.println("Result = " + operation(a, b, op));
//             } catch (Exception e) {
//                 System.out.println("Error input try again");
//             }
//         } while (true);
//     }

//     private static int operation(int a, int b, String op) {
//         switch (op) {
//             case "*":
//                 return a * b;
//             case "+":
//                 return a + b;
//             case "-":
//                 return a - b;
//             case "/":
//                 return a / b;
//             default:
//                 return 0;
//         }
//     }
// }

// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
// могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
// восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет.

public class Java_HW1 {

    public static void main(String[] args) {
    String equation = "6? + ?9 = 99";
    String[] parts = equation.split(" ");
    
    // Извлекаем части уравнения
    String q = parts[0]; // "2?"
    String w = parts[2]; // "?5"
    String e = parts[4]; // "69"
    
    // Ищем решение
    boolean foundSolution = false;
    for (int i = 0; i <= 99; i++) {
    // Заменяем знак вопроса на текущую цифру
    String qCandidate = q.replace('?', (char)('0' + i / 10)).replace('?', (char)('0' + i % 10));
        for (int j = 0; j <= 99; j++) {
        String wCandidate = w.replace('?', (char)('0' + j / 10)).replace('?', (char)('0' + j % 10));
        // Проверяем, является ли e числом
            if (isValidNumber(e)) {
            int qVal = Integer.parseInt(qCandidate);
            int wVal = Integer.parseInt(wCandidate);
            int eVal = Integer.parseInt(e);
            
                if (qVal + wVal == eVal) {
                System.out.println("Нашли решение: " + qVal + " + " + wVal + " = " + eVal);
                foundSolution = true;
                }
            }
            if(foundSolution) {
                break;
            }
        }
        if(foundSolution) {
            break;
        }
    }
    
    if (!foundSolution) {
        System.out.println("Решение не найдено.");
        }
    }
    
    private static boolean isValidNumber(String value) {
    // Проверяем, что строка содержит только числа
    try {
        Integer.parseInt(value);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
   }
    }