public class DemoColor {

    public static void main(String[] args) {
        Color c1 = new Color() {
            String color = "red";
            @Override
            public void getColor() {
                System.out.println(color);
            }
        };
        c1.getColor();
    }
}
