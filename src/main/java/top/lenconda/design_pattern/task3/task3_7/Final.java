package top.lenconda.design_pattern.task3.task3_7;

public class Final extends Role {
    public Final(Role role) {
        this.player = role.player;
        this.point = role.getPoint();
        this.grade = "Final";
    }

    public void checkRole(int score) {
        if (point < 5000 && point >= 1000) {
            player.setRole(new Professional(this));
        } else if (point < 1000 && point >= 100) {
            player.setRole(new Secondary(this));
        } else if (point < 100) {
            player.setRole(new Primary(this));
        }
    }
}
