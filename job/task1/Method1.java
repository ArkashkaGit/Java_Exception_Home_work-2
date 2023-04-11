package task1;

import java.util.Scanner;

public class Method1 {

    public void method() {
        int x = 0;
        while (x != 1) {
            System.out.println("введите число:");
            Scanner scan = new Scanner(System.in);
            String num = scan.nextLine();

            try {
                float number = Float.parseFloat(num);
                System.out.println(number);
                System.out.println("Молодец ты ввёл число!!!");
                x = 1;

            } catch (Exception NumberFormat) {
                System.out.println("Exception NumberFormat: вы ввели строку, попробуйте ещё раз!!!");
            }
        }
    }
}
