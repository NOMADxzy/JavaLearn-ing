package doudizhu;

import java.util.Arrays;

public class player {
    protected int[] card_key = new int[17];
    private String name;

    public player(String name) {
        this.name = name;
    }
    public void setCard_key(int[] a){
        for (int i = 0; i <17 ; i++) {
            this.card_key[i] = a[i];
        }
    }
    public void sort_card(){
        Arrays.sort(card_key);
    }
    public void show_card(doudizhu ddz){
        this.sort_card();
        for (int i = 0; i < 17; i++) {
            System.out.print(ddz.GetCardByKey(this.card_key[i])+" ");
        }
        System.out.println();
    }
    public String getName(){
        return this.name;
    }
}
