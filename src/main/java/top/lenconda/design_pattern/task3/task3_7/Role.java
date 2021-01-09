package top.lenconda.design_pattern.task3.task3_7;

public abstract class Role {
    protected Player player; // 游戏账户
    protected int point; // 剩余积分分数
    protected String grade; // 游戏账户等级

    public abstract void checkRole();

    public void play(int score, String result) {
        if (result.equals("win")) {
            this.point += score;
            checkRole();
        } else if (result.equals("lose")) {
            this.point -= score;
            checkRole();
        }

        System.out.println("Points remaining: " + this.point + ", current grade：" + player.getRole().grade);
    }

    public void doubleScore(int score, String result) {
        if (result.equals("win")) {
            this.point += 2 * score;
            checkRole();
        } else if (result.equals("lose")) {
            this.point -= score;
            checkRole();
        }

        System.out.println("Points remaining: " + this.point + ", current grade：" + player.getRole().grade);

    }

    public void changeCards() {
        System.out.println(player.getName() + " changed cards");
    }

    public void peekCards() {
        System.out.println(player.getName() + " peeked others cards");
    }

    public int getPoint() {
        return point;
    }

    public String getGrade() {
        return grade;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
