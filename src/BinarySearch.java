/* Бинарный поиск
-- Используется для поиска определённого элемента в уже отсортированном (по возрастанию) массиве чисел.
-- Делим массив пополам и находим середину. Сравниваем срединный элемент с заданным искомым элементом.
-- Если срединный элемент меньше искомого, направляемся вправо, где расположены большие элементы.
-- Если срединный элемент большего искомого, направляемся влево, где расположены меньшие элементы.
-- Продолжаем, пока необходимый элемент не будет найден.
-- Если массив отсортирован по убыванию, соответственно, движемся наоборотю */

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 8, 17, 22, 34, 56, 77, 80, 82, 95, 103, 508, 669, 926, 1040};
        int targetNumber = 5;
        findNumber(numbers, targetNumber);
    }

    static void findNumber(int[] array, int number) {
        boolean found = false;
        int index = -1;
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            int midNumber = array[midIndex];
            if (midNumber < number) {
                leftIndex = midIndex + 1;
            } else if (midNumber > number) {
                rightIndex = midIndex - 1;
            } else if (midNumber == number) {
                found = true;
                index = midIndex;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + number + " найдено в массиве под индексом " + index);
        } else {
            System.out.println("В массиве не найдено число " + number);
        }

    }
}

