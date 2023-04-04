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
        pyramidS(ay);
        work.close();
    }

    public static void pyramidS(Integer array[]) 
    {
        for(int i = 0; i<array.length/2-1; i++)
        {
            if(array[i] <= array[2*i+1] && array[i] <= array[2*i+2]) 
            {
                int temp = array[i];
                array[i] = array[2*i+2];
                array[2*i+2] = temp;
                array[2*i+1] = array[i];
            }
        }
        System.out.println(Arrays.asList(array));    
    }
}
