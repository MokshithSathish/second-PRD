
public class label {

    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 2; i++) {
            inner:
            for (int j = 1; j <= 2; j++) {
                if (i == 2) {
                    break outer;
                }
                System.out.println("i : " + i + "j: " + j);
            }

        }
    }
}
