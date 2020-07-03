package DataBase;

public class CD extends Item{
    private String arttist;

    public CD(String title, String artist, int numberofTracks, int playingTime, String comment) {
        super(title,numberofTracks,playingTime,comment);
        this.arttist = artist;
    }
    public void print(){
        System.out.printf("%-5s","CD");
        super.print();
        System.out.printf("%-5s\n",arttist);
    }

//    @Override
//    public boolean equals(Object obj) {
//        CD cc = (CD)obj;
//        return arttist.equals(cc.arttist);
//    }
}
