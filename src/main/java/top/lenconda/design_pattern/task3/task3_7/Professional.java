package top.lenconda.design_pattern.task3.task3_7;

public class Professional extends Role {
    public Professional(Role role) {
        this.player = role.player;
        this.point = role.getPoint();
        this.grade = "Professional";
    }

    public void checkRole() {
        if (point >= 5000) {
            player.setRole(new Final(this));
        } else if (point < 1000 && point >= 100) {
            player.setRole(new Secondary(this));
        } else if (point < 100) {
            player.setRole(new Primary(this));
        }
    }

    public void peekCards() {
        System.out.println("Cannot peek others cards");
    }
}
