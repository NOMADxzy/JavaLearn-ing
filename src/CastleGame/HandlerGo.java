package CastleGame;

public class HandlerGo extends Handler {
    public HandlerGo(Game game) {
        super(game);
    }

    @Override
    public void docmd(String dir) {
        game.goRoom(dir);
    }
}
