package DataBase;

public class DVD extends Item {
    private String director;
    public DVD(String title, String director, int numberofTracks, int playingTime, String comment) {
        super(title,numberofTracks,playingTime,comment);
        this.director = director;
    }
    public void print(){
        System.out.printf("%-5s","DVD");
        super.print();
        System.out.printf("%-5s\n",director);
    }
}
