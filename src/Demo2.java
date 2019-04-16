public class Demo2 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(new Shape(){

            @Override
            public void getType(){
                System.out.println("Rectagle");
            }
        });
        rec.show();
    }
}
