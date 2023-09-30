public class TargetValue {
    public static void main(String[] args) {
        int x = 5;
        for (int i = 0; i < 10; i++) {
            if (i == x) {
                System.out.println("yes");
                break;
            }
        }
    }
}
