/**
 * Created with IntelliJ IDEA.
 * Description:inToRoman
 * User: System_ID
 * Date: 2017-10-13
 * Time: 21:33
 */
public class Solution12 {
    public String intToRoman(int num) {
        String[][] roman = {
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };

        String result = roman[3][num / 1000] + roman[2][(num / 100) % 10] + roman[1][(num / 10) % 10] + roman[0][(num) % 10];

        return result;
    }
}
