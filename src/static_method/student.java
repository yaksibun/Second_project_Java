package static_method;

public class student {
    int id;
    String name;
    static String col = "Najot";
    static int count =0;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
//        count = 0;
    }

    public void getInfo() {
        count +=1;
        System.out.println("Id: "+id+"\nName: "+name+"\nStudy: "+col+"\ncount: "+count);
    }
}
