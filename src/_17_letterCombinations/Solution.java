package _17_letterCombinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private ArrayList<String> res = new ArrayList<>();
    private ArrayList<String> strs = new ArrayList<>();
    private String one = "";

    public List<String> letterCombinations(String digits) {
        if(digits.equals(""))
            return res;
        String two = "abc";
        String three = "def";
        String four = "ghi";
        String five = "jkl";
        String six = "mno";
        String seven = "pqrs";
        String eight = "tuv";
        String nine = "wxyz";
        ArrayList<String> store = new ArrayList<>();
        store.add("zero");
        store.add("one");
        store.add(two);
        store.add(three);
        store.add(four);
        store.add(five);
        store.add(six);
        store.add(seven);
        store.add(eight);
        store.add(nine);
        for(int i = 0; i < digits.length(); i++)
            strs.add(store.get(Integer.parseInt(digits.charAt(i)+"")));
        recursive(0);
        return res;
    }

    private void recursive(int pos){
        if(pos == strs.size()){
            res.add(one);
            return;
        }
        for(int i = 0; i < strs.get(pos).length(); i++){
            one += strs.get(pos).charAt(i);
            recursive(pos + 1);
            one = one.substring(0, one.length() - 1);
        }
    }
}
