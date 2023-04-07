class Snow extends Human {
    // 新增屬性
    private boolean hasFrozenSkill;

    // 建構子
    public Snow(String name, double height, double weight, double speed, String gender, boolean hasFrozenSkill) {
        super(name, height, weight, speed, gender);
        this.hasFrozenSkill = hasFrozenSkill;
    }

    // 覆寫show方法
    public void show() {
        super.show();
        System.out.println("是否具有冰凍技能：" + (hasFrozenSkill ? "是" : "否"));
    }

    // 覆寫distance方法
    public double distance(int x, double y) {
        return super.distance(x, y) * (hasFrozenSkill ? 2 : 1);
    }

    // 方法多載：計算跑步距離（僅輸入時間）
    public double distance(int x) {
        return distance(x, 1.0);
    }
}