public class TestException5 {
    public static void main(String args[]) {
        try {
            String s = null;
            if (s == null){
                throw new NullPointerException();
            }
        } catch(NullPointerException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
