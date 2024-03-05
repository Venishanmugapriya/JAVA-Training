import java.util.*;
public class hashMap1{
public static void main(String[]args){
HashMap<String, String> map = new HashMap<>();
map.put("name", "Veni");
map.put("age", "21");
Map<String, HashMap<String, String>> map1 = new LinkedHashMap<>();
map1.put("student1", map);
map.put("name", "Taara");
map1.put("student2", map);
System.out.println(map1);
}
}


