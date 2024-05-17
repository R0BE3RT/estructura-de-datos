public class fibonacci_iterativo {

    public static int calcularFibonacci(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int numero = 20; // Puedes modificar este número por cualquier otro que desees calcular
        int resultado = calcularFibonacci(numero);
        System.out.println("El número de Fibonacci en la posición " + numero + " es: " + resultado);
    }
}
