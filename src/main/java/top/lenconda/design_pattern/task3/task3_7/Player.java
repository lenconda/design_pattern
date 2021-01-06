package top.lenconda.design_pattern.task3.task3_7;

public class Player {
    private Role role;
    private String name;

    public Player(String name) {
        this.name = name;
        this.role = new Primary(this);
        System.out.println("Successfully registered " + this.name);
    }

    public Role getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void play(int score, String result) {
        role.play(score, result);
    }

    public void doubleScore(int score, String result) {
        role.doubleScore(score, result);
    }

    public void changeCards() {
        role.changeCards();
    }

    public void peekCards() {
        role.peekCards();
    }
}
