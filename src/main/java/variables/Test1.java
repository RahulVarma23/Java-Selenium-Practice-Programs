package variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("All", "Active", "Inactive");
		List<String> l2 = Arrays.asList("Internal", "External");
		List<String> l3 = Arrays.asList("intial", "ongoing");
		List<String> l4 = Arrays.asList("Account", "UserId");

		List<List<String>> lists = new ArrayList<>();
		lists.add(l1);
		lists.add(l2);
		lists.add(l3);
		lists.add(l4);

		List<List<String>> result =new ArrayList<>();
        cartesianProduct(lists, 0, new String[lists.size()], result);
        System.out.println(result);

	}

	public static void cartesianProduct(List<List<String>> lists, int level, String[] cp, List<List<String>> result) {
        if (level == lists.size()) {
            List<String> tempresult =new ArrayList<>();
            for (String x : cp){
                tempresult.add(x);
            }
            result.add(tempresult);
            return;
        }
        for (int i = 0; i < lists.get(level).size(); i++) {
            cp[level] = lists.get(level).get(i);
            cartesianProduct(lists, level + 1, cp,result);
        }
    }
}
