// 1.
import java.util.*;
import java.util.concurrent.atomic.*;
public class smn1 
{

    public static void main(String[] args) 
    {
        System.out.println("1. Введите число: ");
        System.out.println('\n');
        Scanner work = new Scanner(System.in);
        int mynum = work.nextInt();
        AtomicInteger co = new AtomicInteger(0);
        List<Integer> avDi = findAvailableDivider(mynum);
        for (int integer : avDi) 
        {
            System.out.println(integer);
        }
        System.out.println("\n2.\n");
        List<Integer> siNum = findSimpleNumbers(mynum);
        for (int integer : siNum) 
        {
            System.out.println(integer);
        }
        System.out.println("\n3.\n");
        int fiNum = fiby(mynum, co);
        System.out.println("Fib number: " + fiNum);
        System.out.println("Counter: " + co.get());
        work.close();
    }

    public static List<Integer> findAvailableDivider(int number) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= number; i++) 
        {
            if (number % i == 0) 
            {
                res.add(i);
            }
        }
        return res;
    }

// 2.
public static List<Integer> findSimpleNumbers(int number) 
{
    int co = 0;
    List<Integer> res = new ArrayList<>();
    for (int i = 1; i <= number; i++) 
    {
        boolean sim = true;
        for (int j = 2; j < i; j++) 
        {
            co++;
            if (i % j == 0) 
            {
                sim = false;
            }
        }
        if (sim) 
        {
            res.add(i);
        }
    }
    // for (int i = 2; i <= number; i++) 
    // {
    //     if (i % i == 0 && i % 1 == 0) 
    //     {
    //         res.add(i);
    //     }
    // }
    System.out.println("Counter: " + co); //Сокращение вывода
    return res;
}
public static int fiby(int number, AtomicInteger co) 
{
    co.incrementAndGet();
    if(number == 1) 
    {
        return 0;
    }
    else if (number == 2)
    {
        return 1;
    }
    return fiby(number - 1, co) + fiby(number - 2, co);
}

}