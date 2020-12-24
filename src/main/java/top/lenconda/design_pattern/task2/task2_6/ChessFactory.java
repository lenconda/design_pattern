package top.lenconda.design_pattern.task2.task2_6;

import java.util.ArrayList;

public class ChessFactory {
    private static ChessFactory chessFactory = null;
    private final ArrayList<Chess> blackChessList = new ArrayList<Chess>();
    private final ArrayList<Chess> whiteChessList = new ArrayList<Chess>();

    private ChessFactory() {
        Chess blackChess = new BlackChess("black");
        blackChessList.add(blackChess);
        Chess whiteChess = new WhiteChess("white");
        whiteChessList.add(whiteChess);
    }

    public static ChessFactory getChessFactory() {
        if (chessFactory == null) {
            chessFactory = new ChessFactory();
        }
        return chessFactory;
    }

    public Chess getChess(String color) {
        if (color.equalsIgnoreCase("black")) {
            return (Chess) blackChessList.get(0);
        } else if (color.equalsIgnoreCase("white")) {
            return (Chess) whiteChessList.get(0);
        } else {
            return null;
        }
    }

    public int getBlackChess(){
        return blackChessList.size();
    }

    public int getWhiteChess(){
        return whiteChessList.size();
    }
}
