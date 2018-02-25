import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-25
 * Time: 13:55
 */
public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> collect = new ArrayList<List<Integer>>();
        ArrayList<Integer> store = new ArrayList<Integer>();
        doCombine(collect, 1, n, k, store);
        return (List<List<Integer>>) collect;
    }

    void doCombine(ArrayList<List<Integer>> collect, int begin, int end, int k, ArrayList<Integer> store) {
        if (store.size() == k) {
            collect.add((List<Integer>) store.clone());
            return;
        }

        for (int i = begin; i <= end; i++) {
            store.add(i);
            doCombine(collect, i + 1, end, k, store);
            store.remove(store.size() - 1);
        }
    }
}
