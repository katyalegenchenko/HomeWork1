import com.sun.org.apache.xpath.internal.functions.FuncStringLength;

import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {
        System.out.println(stringToInt("6d75"));
        //System.out.println();
    }

    //1.1 Если а - четное, посчитать....
    public static double abc(double a, double b, double c) {
        double res = 0;
        double sumAC = a + c;
        double sumBC = b + c;

        if (a % 2 == 0) {
            res = a * (b / c);
        }

        if (sumAC % 2 == 0) {
            res = Math.pow(a, c);
        }

        if (sumBC % 2 == 0) {
            res = Math.pow(a, c);
        } else {
            res = a + b - c;
        }
        return res;
    }

    //1.2 Точка с координатами
    public static String xy(int x, int y) {
        String res = "";
        if (x > 0 & y > 0) {
            res = "Первая четверть";
        }

        if (x < 0 & y > 0) {
            res = "Вторая четверть";
        }

        if (x < 0 & y < 0) {
            res = "Третья четверть";
        }
        if (x > 0 & y < 0) {
            res = "Четвертая четверть";
        }
        return res;
    }

    //2.1 Вычислить факториал числа
    public static int factorial(int x) {
        int res = 1;

        for (int i = 1; i <= x; i++) {
            res *= i;
        }
        return res;
    }

    //2.2 Вывести заданное число в обратном порядке
    public static int reverseNum(int a) {
        int reverse = 0;

        while (a != 0) {
            reverse = reverse * 10 + (a % 10);
            a = a / 10;
        }

        return reverse;
    }

    //3.1 Поменять местами первую и вторую часть массива
    public static void reverseAray() {
        int[] n = {1, 2, 3, 4};

        int n1 = n[0];
        int n2 = n[1];
        int n3 = n[2];
        int n4 = n[3];

        n[0] = n3;
        n[1] = n4;
        n[2] = n1;
        n[3] = n2;

        String array = Arrays.toString(n);
        System.out.println(array);
    }

    //3.2 Отсортировать массив пузырьком
    public static void arrayBubble(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    //4.1 Целое число в строку
    public static String intToString(int a) {
        String str = Integer.toString(a);
        return str;
    }

    //4.2 Строку в целое число
    public static int stringToInt(String a) {
        int b = Integer.parseInt(a);
        return b;
    }

    //4.3 Самое короткое слово в строке
    public static String(String text) {
        int n = minLengthInString(text);
    }

    public static int minLengthInString(String text) {
        String [] textEd = text.split("[\\s.,?!-]+");

        FuncStringLength comparator = new FuncStringLength();

        Arrays.sort(textEd,comparator);

        return textEd[0].length();
    }
}
