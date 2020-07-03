package CastleGame;

public class HandlerBye extends Handler {
    public HandlerBye(Game game) {
        super(game);
    }

    @Override
    public void docmd(String dir) {
        System.out.println("感谢您的光临。再见！");
    }
}
