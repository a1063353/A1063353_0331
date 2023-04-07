import java.util.Scanner;
class Animal {
    // 屬性
    private String name;
    private double height;
    private double weight;
    private double speed;

    // 建構子
    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    // 顯示屬性
    public void show() {
        System.out.println("名稱：" + name);
        System.out.println("身高：" + height + " 公分");
        System.out.println("體重：" + weight + " 公斤");
        System.out.println("速度：" + speed + " 公尺/秒");
    }

    // 計算跑步距離
    public double distance(int x, double y) {
        return Math.pow(y, x) * speed;
    }

    // 方法多載：計算跑步距離（僅輸入時間）
    public double distance(int x) {
        return distance(x, 1.0);
    }

    // 歡迎訊息
    public static void showInfo() {
        System.out.println("歡迎進入冰雪奇緣系統。");
    }
}


