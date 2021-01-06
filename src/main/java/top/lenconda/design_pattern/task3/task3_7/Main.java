package top.lenconda.design_pattern.task3.task3_7;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Volkswagen");
        player.play(10, "win");
        player.play(20, "win");
        player.play(10, "lose");
        player.play(10, "lose");
        player.changeCards();
        player.peekCards();
        player.doubleScore(10, "win");
        System.out.println();

        player.play(100, "win");
        player.changeCards();
        player.peekCards();
        player.doubleScore(10, "win");
        System.out.println();

        player.play(400, "win");
        player.play(800, "win");
        player.changeCards();
        player.peekCards();
        player.doubleScore(100, "win");
        System.out.println();

        player.play(1600, "win");
        player.play(3200, "win");
        player.changeCards();
        player.peekCards();
        player.doubleScore(1000, "win");
        System.out.println();
    }
}
