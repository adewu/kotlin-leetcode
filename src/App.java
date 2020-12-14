import easy.*;
import hard.MaximumGap_164;
import hard.SplitArrayConsecutiveSubsequences_659;
import medium.*;

import java.util.*;

public class App {

    public static void main(String[] args) {
        GroupAnagrams_49 o = new GroupAnagrams_49();
        o.exe();
    }

    public List<List<String>> groupAnagrams1(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
