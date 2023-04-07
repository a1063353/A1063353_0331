
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Animal.showInfo();

        Animal[] animals = {
                new Animal("雪寶", 160, 50, 10),
                new Animal("驢子", 150, 80, 8),
                new Human("阿克漢斯", 180, 75, 12, "男"),
                new Human("安那", 165, 55, 11, "女"),
                new Snow("冰雪女王", 170, 60, 15, "女", true)
        };

        for (Animal animal : animals) {
            animal.show();
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        for (Animal animal : animals) {
            System.out.print("請輸入" + animal.getClass().getSimpleName() + "的奔跑時間（分）：");
            double time = scanner.nextDouble();
            System.out.print("請輸入" + animal.getClass().getSimpleName() + "的奔跑時間（分）：");
            double time1 = scanner.nextDouble();
            }
}}