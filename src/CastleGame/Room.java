package CastleGame;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String,Room> exits = new HashMap<String, Room>();
//    private String description;
//    private Room northExit;
//    private Room southExit;
//    private Room eastExit;
//    private Room westExit;

    public Room(String description)
    {
        this.description = description;
    }

    public void setExits(String dir,Room room)
    {
        exits.put(dir,room);
    }

//    @Override
//    public String toString()
//    {
//        return exits.get();
//    }
    public String getExitDesc(){
        StringBuffer sb1 = new StringBuffer();
        for(String key:exits.keySet()){
            sb1.append(key);
            sb1.append(" ");
        }
        return sb1.toString();
     }

     public Room getExit(String direction){
        Room ret = null;
         ret = exits.get(direction);
         return ret;
     }

    @Override
    public String toString() {
        return this.description;
    }
}
