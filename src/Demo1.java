public class Demo1 {
    public static void main(String[] args) {
        Anony obj1 = new Anony();
        Anony obj = new Anony(){
            String name = "mehran";
            public String getName(){
                return name;
            }
        };
        System.out.println(obj.getName());
        System.out.println(obj1.getName());
    }
}
