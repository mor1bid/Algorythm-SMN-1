import java.util.*;

public class dz1 
{
    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int mylen = work.nextInt();
        Integer ray[] = new Integer[mylen];
        Integer ay[] = new Integer[]{24, 31, 15, 20, 52, 6};
        Random rnd = new Random();
        for(int i = 0; i < mylen; i++) 
        {
            int num = rnd.nextInt(11);
            ray[i] = num;
        }
        System.out.println(Arrays.asList(ray));
        pyramidS2(ray);
        work.close();
    }

//     public static void pyramidS1(Integer array[]) 
//     {
//         for(int i = 0; i < array.length/2-1; i++)
//         {
//             // if(array[i] <= array[2*i+1] && array[i] <= array[2*i+2]) 
//             // {
//                 int temp = array[i];
//                 array[i] = array[2*i+2];
//                 array[2*i+2] = array[2*i+1];
//                 array[2*i+1] = temp;
//             // }
//         }
//         System.out.println(Arrays.asList(array));
//         pyramidS2(array);   
//     }
//     public static void pyramidS2(Integer array[]) 
//     {
//         boolean inf;
//         do 
//         {
//             inf = true;
//             for(int i = array.length - 1; i - 1 > 0; i--) 
//             {
//                 for(int j = 0; j<array.length -1; j++) 
//                 {
//                     int temp = array[i+1];
//                     array[i+1] = array[j];
//                     array[j] = temp;
//                     inf = false;
//                 }
//             }
//         }
//         while(!inf);
//         System.out.println(Arrays.asList(array));
//     }
// }

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