
/* Линейный поиск
-- Перебираем каждый элемент массива по очереди, чтобы найти нужный нам. */

public class LinearSearch {
    public static void main(String[] args) {
        String [] animals = {"cat", "dog", "fox", "wolf", "elephant", "tiger", "lion", "cow"};
        String targetAnimal = "tiger";
        findAnimal(animals, targetAnimal);
    }

    static void findAnimal(String animalsArray[], String myAnimal) {
        boolean found = false;
        int index = -1;
        for (int i = 0; i < animalsArray.length; i++) {
            if (animalsArray[i].equals(myAnimal)) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Животное " + myAnimal + " найдено в массиве под индексом " + index);
        } else {
            System.out.println("В массиве не найдено животное " + myAnimal);
        }
    }
}
