import java.util.Scanner;
class Human extends Animal {
    // 新增屬性
    private String gender;

    // 建構子
    public Human(String name, double height, double weight, double speed, String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    // 覆寫show方法
    public void show() {
        super.show();
        System.out.println("性別：" + gender);
    }
}