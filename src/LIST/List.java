package LIST;

public class List {
    protected  int Listlength=0;
    protected ListNode firstNode;
    public  List(){}
    public List(int x){
        ListNode currentNode;
        int t = x%10;
        x/=10;
        currentNode =new ListNode(t);
        this.firstNode = currentNode;
        Listlength++;
        while (x>0){
            t = x%10;
            x/=10;
            ListNode newnode = new ListNode(t);
            currentNode.next = newnode;
            currentNode = newnode;
            Listlength++;
        }
    }
    public void show(){
        ListNode p = this.firstNode;
        for(int i=0;i<this.Listlength;i++){
            System.out.print(p.getval()+" ");
            p= p.next;
        }
    }
}
