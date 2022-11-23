import java.util.Scanner;

public class Main {

    public static void task1(Scanner sc)
    {
        System.out.println("Insert array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int sum = 0;

        for(int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();

            sum += array[i];
        }
        System.out.print("Array average value: ");
        System.out.print(sum / size);
    }

    public static void task2(Scanner sc)
    {
        System.out.print("Insert array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        int sum = 0, min = 0x7FFFFFFF, max = 0x80000000;

        int i = 0;
        while(i < size)
        {
            array[i] = sc.nextInt();
            if(array[i] > max)
                max = array[i];
            if(array[i] < min)
                min = array[i];

            sum += array[i];

            i++;
        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
        System.out.println("Array sum: " + sum);
    }

    public static void task3(String[] args)
    {
        for(int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }

    public static void task4()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.print("1/" + i);
            if(i < 10)
                System.out.print(" + ");
        }
    }

    public static void task5(Scanner sc)
    {
        System.out.print("Insert number: ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i = 2; i <= num; i++)
            fact *= i;

        System.out.print("Factorial of " + num + " = " + fact);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert task number: ");
        int task_num = sc.nextInt();

        switch(task_num)
        {
            case 1:
                task1(sc);
                break;
            case 2:
                task2(sc);
                break;
            case 3:
                task3(args);
                break;
            case 4:
                task4();
                break;
            case 5:
                task5(sc);
                break;
        }
    }
}
