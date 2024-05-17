public class fibonacci_recursivo {
    public static void main(String[] args) {
        int n = 15; // Acá se puede modificar el valor de n
        System.out.println("Los primeros " + n + " números de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}