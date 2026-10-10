import java.util.Arrays;

public class JaggedArray
{

    public static void main(String[] args)
    {
        // Створюємо нерівну матрицю
        int[][] arr = new int[5][];
        arr[0] = new int[]{5, -3, 8};
        arr[1] = new int[]{12, -7, 4, -1, 9, 0, -15};
        arr[2] = new int[]{-2, 6};
        arr[3] = new int[]{10, -4, 3, -8, 1};
        arr[4] = new int[]{-11, 7, -5, 2};

        // 1. Сортуємо кожен рядок
        for (int i = 0; i < arr.length; i++)
        {
            Arrays.sort(arr[i]);
        }

        // 2. Друкуємо всю матрицю
        System.out.println("Відсортована матриця:");
        printMatrix(arr);

        // 3. Друкуємо тільки від’ємні значення (з break)
        System.out.println("\nТільки від’ємні значення:");
        printNegative(arr);
    }

    public static void printMatrix(int[][] matrix)
    {
        for (int[] row : matrix)
        {
            for (int value : row)
            {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void printNegative(int[][] matrix)
    {
        for (int[] row : matrix)
        {
            for (int value : row)
            {
                if (value >= 0)
                {
                    break;          // як тільки зустріли невід’ємне — виходимо з рядка
                }
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}