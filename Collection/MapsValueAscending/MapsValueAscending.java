import java.util.*;
public class MapsValueAscending{
public static void main(String[]args){
Map<String,Integer> map = new HashMap<>();
map.put("A",10);
map.put("B",5);
map.put("C",15);
List<Integer> Valuearr = new ArrayList<>();
for(Map.Entry<String,Integer> entry : map.entrySet()){
Valuearr.add(entry.getValue());
}
Collections.sort(Valuearr);
Map<String,Integer> sortedMap = new LinkedHashMap<>();
for (Integer value :Valuearr){
for(Map.Entry<String,Integer> entry : map.entrySet()){
if (value == entry.getValue()){
sortedMap.put(entry.getKey(),entry.getValue());
}
}
}
System.out.println("Sorted Map: "+sortedMap);
}
}