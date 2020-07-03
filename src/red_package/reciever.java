package red_package;

public class reciever extends user {
    public reciever(String name, double money) {
        super(name, money);
    }
    public void recieve(double x){
        this.money+=x;
    }
}
