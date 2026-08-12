class Main {

    static int calculate(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int res = calculate(n);

        System.out.println("Factorial Program");
        System.out.println("Factorial of " + n + " = " + res);
    }
}