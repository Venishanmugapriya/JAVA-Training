import java.util.*;

public class hashMap2
{
public static void main(String[] args) {
ArrayList<Integer> li = new ArrayList<>();
li.add(1);
li.add(12);
List<ArrayList<Integer>> li1 = new LinkedList<>();
li1.add(li);
System.out.println(li1);
HashMap<String, String> map = new HashMap<>();
map.put("name", "Veni");
map.put("age", "21");
Map<String, HashMap<String, String>> map1 = new LinkedHashMap<>();
map1.put("student1", map);
// map.put("name", "Taara");
map1.put("student2", map);
System.out.println(map1);
ArrayList<HashMap<String, String>> li2 = new ArrayList<>();
li2.add(map);
System.out.println(li2);
}
}
