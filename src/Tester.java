import java.util.Scanner;
public class Tester {

    private static void task1(Scanner sc)
    {
        System.out.println("Insert name: ");
        String name = sc.next();

        System.out.println("Insert email: ");
        String email = sc.next();

        System.out.println("Insert gender: ");
        char gender = sc.next().charAt(0);

        Author author = new Author(name, email, gender);

        System.out.print(author);
    }

    private static void task2(Scanner sc)
    {
        System.out.print("Insert x: ");
        double x = sc.nextDouble();

        System.out.print("Insert y: ");
        double y = sc.nextDouble();

        Ball ball1 = new Ball(x, y);
        Ball ball2 = new Ball();

        System.out.println("Ball_1 = " + ball1);
        System.out.print("Ball_2 = " + ball2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert task number: ");
        int task_num = sc.nextInt();

        switch(task_num)
        {
            case 1:
                task1(sc);
                break;
            case 2:
                task2(sc);
                break;
//            case 3:
//                task3(args);
//                break;
//            case 4:
//                task4();
//                break;
//            case 5:
//                task5(sc);
//                break;
        }
    }
}
