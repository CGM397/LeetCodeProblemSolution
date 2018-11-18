package _012_integerToRoman;

public class Solution {
    public String intToRoman(int num) {
        String res = "";

        for(int i = 0; i < num/1000; i++)
            res += 'M';
        num = num%1000;

        if(num/100 == 4)
            res += "CD";
        else if(num/100 == 9)
            res += "CM";
        else if(num >= 100 && num <= 399)
            res += "CCC".substring(0, num/100);
        else if(num >= 500 && num < 900)
            res += "DCCC".substring(0, (num-400)/100);
        num = num%100;

        if(num/10 == 4)
            res += "XL";
        else if(num/10 == 9)
            res += "XC";
        else if(num >= 10 && num <= 39)
            res += "XXX".substring(0, num/10);
        else if(num >= 50 && num < 90)
            res += "LXXX".substring(0, (num-40)/10);
        num = num%10;

        if(num == 4)
            res += "IV";
        else if(num == 9)
            res += "IX";
        else if(num >= 1 && num <= 3)
            res += "III".substring(0, num);
        else if(num >= 5 && num < 9)
            res += "VIII".substring(0, num - 4);

        return res;
    }
}