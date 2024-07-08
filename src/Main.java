import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        System.out.println("Jayaraj");
        Map<String,Integer> map = new HashMap<>();
        map.put("jayaraj", 23);
        map.put("paul", 23);
        map.put("vino", 244);
        map.put("sudh", 2);
        System.out.println(map);
        Map.Entry<Integer, List<String>> integerListEntry = map.entrySet().
                stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(1);
        System.out.println(integerListEntry);
    }
}
