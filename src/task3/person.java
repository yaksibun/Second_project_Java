package task3;

import java.util.HashMap;
import java.util.Map;

public class person {
    public Map getinfo(String name, int age, String married, String homeland){
        Map<String,String> person_info = new HashMap<>();
        person_info.put("Name",name);
        person_info.put("Age",String.valueOf(age));
        person_info.put("Married",married);
        person_info.put("Homeland",homeland);

        return person_info;
    }
}
