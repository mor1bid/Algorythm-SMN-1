import java.util.*;

public class smn2 
{

    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int mylen = work.nextInt();
        Integer ray[] = new Integer[mylen];
        Random rnd = new Random();
        for(int i = 0; i < mylen; i++) 
        {
            int num = rnd.nextInt(11);
            ray[i] = num;
        }
        System.out.println(Arrays.asList(ray));
        bubbleSort(ray);
        directSort(ray);
        insertSort(ray);
        work.close();
    }

// 1.
    public static void bubbleSort(Integer array[]) 
    {
        boolean fin;
        do 
        {
            fin = true;
            for (int i = 0; i < array.length -1; i++) 
            {
                if (array[i] > array[i+1])
                {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    fin = false;
                }
            }
        }
        while(!fin);
        System.out.println(Arrays.asList(array));
    }

// 2. Оптимальнее
    public static void directSort(Integer array[]) 
    {
        for(int i = 0; i<array.length -1; i++)
        {
            int min = i;
            for(int j = i + 1; j<array.length; j++) 
            {
                if (array[j] < array[min]) 
                {
                    min = j;
                }
            }
            if (i != min) 
            {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        System.out.println(Arrays.asList(array));
    }

// 3.
public static void insertSort(Integer array[]) 
{
    for(int i = 0; i<array.length -1; i++)
    {
        for (int j = i+1; j<array.length; j++) 
        {
            if (array[i] < array[j]) 
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
}
}