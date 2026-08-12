public class TestFactorial {

    public static void main(String[] args) {

        int result = Main.calculate(5);

        if (result == 120) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
            System.exit(1);
        }
    }
}