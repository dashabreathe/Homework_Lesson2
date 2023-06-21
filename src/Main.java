
/* Посчитать, сколько элементов имеет массив company (чтоб не с 0 считал, а с 1)
Вывести первый, второй и последний элементы */

public class Main {
    public static void main(String[] args) {
        int company[] = {5, 99, 0, 4, 72, 101, 2, 29, 3333, 58, 80};
        System.out.println("Количество элементов массива равно " + company.length);
        System.out.println("Первый элемент массива " + company[0]);
        System.out.println("Второй элемент массива " + company[1]);
        System.out.println("Последний элемент массива " + company[company.length - 1]);
    }
}
