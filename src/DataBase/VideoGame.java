package DataBase;

public class VideoGame extends Item {
    private int numberofPlayers;
    public VideoGame(String title, int numberofPlayers,int numberofTracks, int playingTime, String comment) {
        super(title, numberofTracks, playingTime, comment);
        numberofPlayers = numberofPlayers;

    }

    @Override
    public void print() {
        System.out.printf("%-5s","VG");
        super.print();
        System.out.printf("%-5d\n",numberofPlayers);
    }
}
