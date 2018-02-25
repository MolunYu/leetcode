import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-12-07
 * Time: 11:06
 */
public class Solution93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> collect = new ArrayList<String>();
        if (s.length() < 4) return collect;

        for (int i = 0; i < 3 && i < s.length() - 3; i++) {
            if (s.length() - i - 1 > 9) continue;

            String part1 = s.substring(0, i + 1);
            if (Integer.valueOf(part1) < 256) {
                for (int j = i + 1; j < i + 4 && j < s.length() - 2; j++) {
                    if (s.length() - j - 1 > 6) continue;

                    String part2 = s.substring(i + 1, j + 1);
                    if (Integer.valueOf(part2) < 256) {
                        for (int k = j + 1; k < j + 4 && k < s.length() - 1; k++) {
                            if (s.length() - k - 1 > 3) continue;

                            String part3 = s.substring(j + 1, k + 1);
                            String part4 = s.substring(k + 1, s.length());
                            if (Integer.valueOf(part3) < 256 && Integer.valueOf(part4) < 256) {
                                String result = part1 + '.' + part2 + '.' + part3 + '.' + part4;
                                if (s.charAt(k + 1) != '0' || (s.charAt(k + 1) == '0' && k + 1 == s.length() - 1))
                                    collect.add(result);
                            }

                            if (s.charAt(j + 1) == '0') break;
                        }
                    }

                    if (s.charAt(i + 1) == '0') break;
                }
            }

            if (s.charAt(0) == '0') break;
        }

        return collect;
    }
}
