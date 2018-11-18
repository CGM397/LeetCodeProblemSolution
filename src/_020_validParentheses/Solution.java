package _020_validParentheses;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

    private HashMap<Character, Character> map;
    public Solution(){
        this.map = new HashMap<>();
        this.map.put(')','(');
        this.map.put(']','[');
        this.map.put('}','{');
    }

    public boolean isValid(String s) {
        Stack<Character> store = new Stack<>();
        if(s == null || s.equals(""))
            return true;
        else{
            for(int i = 0; i < s.length();i++){
                if(this.map.containsKey(s.charAt(i))){
                    char topElement = store.empty() ? '#' : store.pop();
                    if(topElement != this.map.get(s.charAt(i)))
                        return false;
                }
                else
                    store.push(s.charAt(i));
            }
        }
        return store.isEmpty();
    }
}
