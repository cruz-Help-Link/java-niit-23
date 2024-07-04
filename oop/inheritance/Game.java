public abstract class Game {

    abstract playGame();
    abstract scoreBoard();
    
}

public class Monopoly extends Game{
    void playGame() {

    }
    void scoreBoard() {

    }
}
public class Chess extends Game {
    void playGame() {
         
    }
    void scoreBoard() {

    }
}
public class RunGame {
    public static void main(String[] args) {
        Chess cs = new Chess();
        cs.playGame();
    }
}