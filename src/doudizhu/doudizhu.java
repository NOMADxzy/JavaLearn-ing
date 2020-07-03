package doudizhu;

import LIST.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class doudizhu {
    private static HashMap<Integer,String> allcards = new HashMap<>();
    public ArrayList<Integer> key = new ArrayList<>();
    public doudizhu(){
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♠","♥","♣","♦"};
        int i=1;
        for (String number:numbers) {
            for(String color:colors){
                allcards.put(i++,color+number);
                key.add(i);
                key.add(i);
            }
        }
        allcards.put(53,"大王");
        allcards.put(54,"小王");
    }
//    public doudizhu(){
//        String s;
//        int i,j;
//        String[] color = {"♠","♥","♣","♦"};
//        for (i=0; i < 48; i++) {
//            StringBuffer buf = new StringBuffer();
//            buf.append(color[(i)%4]);
//            if(i>=32&&i<36) buf.append("J");
//            else if(i>=36&&i<40) buf.append("Q");
//            else if(i>=40&&i<44) buf.append("K");
//            else if(i>=44&&i<48) buf.append("A");
//            else buf.append(Integer.toString((i/4)+3));
//            s = buf.toString();
//            allcards.put(i+1,s);
//        }
//        allcards.put(49,"♠2");
//        allcards.put(50,"♥2");
//        allcards.put(51,"♣2");
//        allcards.put(52,"♦2");
//        allcards.put(53,"小王");
//        allcards.put(54,"大王");
//    }
    public void xipai(){
        key.clear();
        for (int i = 0; i < 54; i++) {
            key.add(i+1);
        }
        Collections.shuffle(key);
    }
    public  void fapai(player player1,player player2,player player3){
        int k = 0;
        for (int i = 0; i < 51; i++) {
            if(i%3==0) player1.card_key[k/3] = key.get(i);
            if(i%3==1) player2.card_key[k/3] = key.get(i);
            if(i%3==2) player3.card_key[k/3] = key.get(i);
            k++;
        }
    }
    public String GetCardByKey(int k){
        return allcards.get(k);
    }

    private void showdipai() {
        System.out.print("底牌:");
        for (int i = 51; i < 54; i++) {
            System.out.print(GetCardByKey(this.key.get(i))+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doudizhu ddz = new doudizhu();
        ddz.xipai();
        player player1 = new player("玩家1");
        player player2 = new player("玩家2");
        player player3 = new player("玩家3");
//        for( int i=1;i<=54;i++) System.out.print(ddz.key.get(i-1)+" ");
        ddz.fapai(player1,player2,player3);

        System.out.println();
        System.out.print(player1.getName()+":");
        player1.show_card(ddz);
        System.out.print(player2.getName()+":");
        player2.show_card(ddz);
        System.out.print(player3.getName()+":");
        player3.show_card(ddz);
        ddz.showdipai();
    }
}
