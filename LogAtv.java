import java.io.FileWriter;
import java.io.IOException;

public class LogAtv {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("output.txt");

            writer.write("Olá, mundo!");
            
            System.out.println("Mensagem escrita no arquivo com sucesso.");
        } catch (IOException e) {
            
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        } finally {
            try {
                
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
               
                System.err.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }
}