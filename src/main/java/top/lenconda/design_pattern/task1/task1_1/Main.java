package top.lenconda.design_pattern.task1.task1_1;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while (!str.equals("exit")) {
            System.out.print("Enter type: ");
            str = scanner.nextLine();
            NvWa nvWa = new NvWa();
            Person person = nvWa.make(str);
            person.play();
        }
    }
}
