// ВЫВОД В КОНСОЛЬ ЧЁТНЫХ ЭЛЕМЕНТОВ МАССИВА
public class Main {
    public static void main(String[] args) {

        int[] array = {6, 117, 44, 5, 32, 81, 9};

        for (int i = 0; i < array.length; i++) {

            int n = array[i];
            // проверка числа на чётность
            if(n % 2 == 0) {
                System.out.println("Число " + n + " четное");
            }
        }
    }
}