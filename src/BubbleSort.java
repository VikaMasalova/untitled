public class BubbleSort
{

    // Статичний метод бульбашкового сортування
    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // Обмін
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        // Довжина масиву задається при виклику
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("До сортування:");
        printArray(array);

        bubbleSort(array);   // виклик статичного методу

        System.out.println("Після сортування:");
        printArray(array);
    }

    public static void printArray(int[] arr)
    {
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}