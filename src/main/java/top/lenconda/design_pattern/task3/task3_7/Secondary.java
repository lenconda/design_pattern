package top.lenconda.design_pattern.task3.task3_7;

public class Secondary extends Role {
    public Secondary(Role role) {
        this.player = role.player;
        this.point = role.getPoint();
        this.grade = "Secondary";
    }

    public void checkRole(int score) {
        if (point >= 5000) {
            player.setRole(new Final(this));
        } else if (point >= 1000 && point < 5000) {
            player.setRole(new Professional(this));
        } else if (point < 100) {
            player.setRole(new Primary(this));
        }
    }

    public void peekCards() {
        System.out.println("Cannot peek others cards");
    }

    public void changeCards() {
        System.out.println("Cannot change cards");
    }
}
