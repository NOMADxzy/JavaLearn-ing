package enum_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

enum color{
    RED,BLUE,GREEN,YELLOW;
    private color(){
        System.out.println("构造了"+this.toString());
    }
    public void showinfo(){
        System.out.println("universal color:"+this);
    }
        }
public class enumClass_test {
    public static void main(String[] args) {
        color c = color.BLUE;
        c.showinfo();
    }
}
