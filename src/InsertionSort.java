import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++){  // Заполнение массива случайными элементами от 0 до 10
            array[i] = random.nextInt(0,10);
        }

        System.out.println("Подан массив:\n" + Arrays.toString(array) + "\n");
        insertionSort(array);
    }
    
    public static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){  // Сортировка вставкой
            int current = array[i];
            int j = i;
            while(j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }

        String[] sortedArray = new String[array.length];
        for(int i = 0; i < array.length; i++){  // Преобразование инт-массива в стринг-массив
            sortedArray[i] = Integer.toString(array[i]);
        }

        System.out.println("Отсортированный массив:\n" + Arrays.toString(sortedArray) + "\n");

        for(int i = 1; i < array.length; i++){  // Замена дупликатов на "□"
            if(array[i - 1] == array[i]){
                sortedArray[i] = "□";
            }
        }

        System.out.println("Отсортированный массив без повторяющихся элементов:\n"+ Arrays.toString(sortedArray));
    }
}
