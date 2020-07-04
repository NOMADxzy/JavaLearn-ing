package Stack;

import java.util.LinkedList;

public class stack {
    private LinkedList<Character> bracket_stack = new LinkedList<>();
    public char getTop(){
        return  bracket_stack.getLast();
    }
    public void addBracket(char c){
        bracket_stack.addLast(c);
    }
    public char pop(){
        return bracket_stack.removeLast();
    }
    public int getSize(){
        return bracket_stack.size();
    }
}
