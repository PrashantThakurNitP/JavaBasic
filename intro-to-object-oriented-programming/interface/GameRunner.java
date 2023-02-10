
public class GameRunner {
    public static void main(String[] args) {

        /*
         * interfaces provide common action between classes and we can have different
         * implementation.
         * with interface it is possible to adopt polymorphism.
         * with help of interface (GamingConsole) implementation we can have multiple
         * implementation like below
         */
        GamingConsole marioGame = new MarioGame();
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();

        GamingConsole chessGame = new ChessGame();
        chessGame.up();
        chessGame.down();
        chessGame.left();
        chessGame.right();

        GamingConsole[] games = { new MarioGame(), new ChessGame() };

        for (GamingConsole game : games) {
            game.up();
            game.down();
            game.left();
            game.right();

        }
        // Polymormphism -> The same code is having two different behavior depending
        // based on object
        // poymorphism can be attained either by interface or by inheritance

    }
}
