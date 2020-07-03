package CastleGame;

import CastleGame.Room;

import java.util.*;

public class Game {
    private Room currentRoom;
    private  HashMap<String,Handler> handlers = new HashMap<>();

    public Game() {
        handlers.put("go",new HandlerGo(this));
        handlers.put("bye",new HandlerBye(this));
        handlers.put("help",new HandlerHelp(this));
        createRooms();
    }

    public void createRooms() {
        Room outside,lobby,pub,study,bedroom;

        //创造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");

        // 初始化房间的出口
        outside.setExits("east",lobby);
        outside.setExits("south",study);
        outside.setExits("west",pub);
        lobby.setExits("west",outside);
        pub.setExits("north",outside);
        pub.setExits("east",bedroom);
        bedroom.setExits("west",study);
        study.setExits("north",outside);
        study.setExits("east",bedroom);
        currentRoom = outside;        //从城堡门外开始
    }

    private void printWelcome()
    {
        System.out.println();
        System.out.println("欢迎来到城堡!");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入'help'");
        System.out.println();
        showPrompt();
    }

//  以下为用户命令


    public void goRoom(String direction){
        Room nextRoom = currentRoom.getExit(direction);


        if(nextRoom == null){
            System.out.println("那里没有门！");
        }
        else{
            currentRoom = nextRoom;
            showPrompt();
        }
    }

    public void showPrompt(){
        System.out.println("你在"+ currentRoom);
        System.out.println("出口有：");

        System.out.println(currentRoom.getExitDesc());
        System.out.println();
    }
    public void run(){
        Scanner in = new Scanner(System.in);
        while (true){
            String line = in.nextLine();
            String[] words = line.split(" ");
            if(handlers.get(words[0])==null){
                System.out.println("无效命令");
            }
            else {
                if(words.length==1) handlers.get(words[0]).docmd(words[0]);
                else if(words.length==2) handlers.get(words[0]).docmd(words[1]);
                else System.out.println("无效命令");
            }

        }
    }

    public static void main(String[] args) {

        Game game = new Game();
        game.printWelcome();
        game.run();
    }
}
