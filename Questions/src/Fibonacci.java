public class Fibonacci {

    private int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n -2);
        }
    }
    private void quest4(int n){
        Fibonacci quest1 = new Fibonacci();
        System.out.println(quest1.fibonacci(n));
    }
    private void quest3(int n){
        Fibonacci quest1 = new Fibonacci();
        for (int i = 0; i < n ; i++) {
            System.out.print( quest1.fibonacci(i) + "\n");
        }
    }
    public static void main(String[] args) {
        Fibonacci quest1 = new Fibonacci();
        quest1.quest3(6);
        quest1.quest4(20);
    }
}
