package top.lenconda.design_pattern.task3.task3_7;

public class Primary extends Role {
    public Primary(Role role) {
        this.player = role.player;
        this.point = role.getPoint();
        this.grade = "Primary";
    }

    public Primary(Player player) {
        this.point = 0;
        this.player = player;
        this.grade = "Primary";
    }

    public void checkRole() {
        if (point >= 5000) {
            player.setRole(new Final(this));
        } else if (point >= 1000 && point < 5000) {
            player.setRole(new Professional(this));
        } else if (point >= 100) {
            player.setRole(new Secondary(this));
        }
    }

    public void peekCards() {
        System.out.println("Cannot peek others cards");
    }

    public void changeCards() {
        System.out.println("Cannot change cards");
    }

    public void doubleScore(int score, String result) {
        System.out.println("Cannot add doubled score when winning games");
    }
}
