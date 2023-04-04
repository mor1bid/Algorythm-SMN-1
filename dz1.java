import java.util.*;

public class dz1 
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
        System.out.println("Процесс сортировки:");
        pyramidS2(ray);
        work.close();
    }

    public static void pyramidS1(Integer numbers[], int root, int bottom) 
    {
        int max;
        boolean done = false;
        while ((root * 2 <= bottom) && (!done))
        {
            if (root * 2 == bottom) 
            {
                max = root * 2;  
            }
            else if (numbers[root * 2] > numbers[root * 2 + 1]) 
            {
                max = root * 2; 
            }
            else 
            {
                max = root * 2 + 1;
            }
            if (numbers[root] < numbers[max])
            {
                int temp = numbers[root];
                numbers[root] = numbers[max];
                numbers[max] = temp;
                root = max;
            }
            else 
            {
                done = true;
            }
        }
        System.out.println(Arrays.asList(numbers));
    }

    public static void pyramidS2(Integer array[]) 
    {
        for(int i = array.length / 2; i >= 0; i--) 
        {
            pyramidS1(array, i, array.length - 1);
        }
        for (int i = array.length - 1; i >= 1; i--) 
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            pyramidS1(array, 0, i - 1);
        }
        System.out.println(Arrays.asList(array));
    }

}