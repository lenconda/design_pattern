package top.lenconda.design_pattern.task2.task2_6;

public class Main {
    public static void main(String args[]) {
        Chess chess1, _chess1, chess2, _chess2;
        ChessFactory chessFactory = ChessFactory.getChessFactory();

        chess1 = chessFactory.getChess("black");
        chess1.display(new Position(5,5));
        _chess1 = chessFactory.getChess("black");
        _chess1.display(new Position(5,6));

        chess2 = chessFactory.getChess("white");
        chess2.display(new Position(4,5));
        _chess2 = chessFactory.getChess("white");
        _chess2.display(new Position(3,5));

        System.out.println("Total black chess: " + chessFactory.getBlackChess());
        System.out.println("Total white chess: " + chessFactory.getWhiteChess());
    }
}
