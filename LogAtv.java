import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class LogAtv {
    public static void main(String[] args) throws IOException {
        System.out.println("Faça uma divizao");
        Scanner Scanner = new Scanner(System.in);
        FileWriter writer = null;
        writer = new FileWriter("output2.txt");

        System.out.println("Digite o primeiro número: ");
        int num1 = Scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = Scanner.nextInt();
        try {
            int resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            writer.write("Erro ao dividir por zero: " + e.getMessage());
        } finally {
            System.out.println("Operação finalizada.");
        }
        writer.close();
        Scanner.close();
    }

}
