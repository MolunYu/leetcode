import org.w3c.dom.ls.LSInput;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-11
 * Time: 21:15
 */
public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> collect = new ArrayList<List<String>>();
        HashMap<String, List<String>> element = new HashMap<String, List<String>>();

        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String keyElement = String.valueOf(temp);
            if (element.containsKey(keyElement)) {
                element.get(element).add(strs[i]);
            } else {
                element.put(keyElement, new ArrayList<String>());
            }
        }

        for (Map.Entry<String, List<String>> entry : element.entrySet()) {
            collect.add(entry.getValue());
        }
        return collect;
    }
}
