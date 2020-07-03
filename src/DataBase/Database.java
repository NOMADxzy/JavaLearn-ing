package DataBase;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item>  listItem = new ArrayList<Item>();
    public void add(Item item){
        listItem.add(item);
    }
    public void list(){
        for(Item item:listItem){
            item.print();
        }
    }
    public static void main(String[] args){
        Database db = new Database();
        DVD dvd = new DVD("变形金刚","迈克尔",10,160,"...");
        CD cd = new CD("晴天之歌","jezhou",3,4,"...");
        VideoGame vg = new VideoGame("部落冲突",2800,4,1000,"...");
        db.add(cd);
        db.add(dvd);
        db.add(vg);
        db.list();
//        CD cd1 = new CD("晴天","周杰伦",3,4,"...");
    }
}
