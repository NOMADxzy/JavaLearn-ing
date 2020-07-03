package DataBase;

public class Item {
    private String title;
    private int numberofTracks;
    private int playingTime;
    private boolean gotIt = false;
    private String comment;

    public Item(String title, int numberofTracks, int playingTime, String comment) {
        this.title = title;
        this.numberofTracks= numberofTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public void print() {
        System.out.printf("%-8s",title+":");
    }
}
