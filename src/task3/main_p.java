package task3;

import java.util.Map;

public class main_p {
    public static void main(String[] args) {
        person p1 = new person();
        Map<String, String> person1 = p1.getinfo("Temur", 22, "no", "Uzbekistan");

        System.out.println("Person1");
        for(String key : person1.keySet()){
            System.out.println(key + " : " + person1.get(key));
        }

        person p2 = new person();
        Map<String, String> person2 = p2.getinfo("Javohir", 23,"no", "Uzbekistan");
        System.out.println("Person2");
        for (String key : person2.keySet()){
            System.out.println(key + " : " + person2.get(key));
        }

    }
}
