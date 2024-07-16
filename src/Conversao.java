import java.util.Scanner;

public class Conversao {
    private double cotacao, valor;

    Scanner entrada = new Scanner(System.in);

    public Conversao(Double cotacao) {
        this.cotacao = cotacao;
    }

    public double getValor() {
        return valor;
    }

    public double realizarConversao() {
        boolean valido;

        do {
            System.out.println("Digite o valor que deseja converter:");
            try {
                valido = true;
                valor = entrada.nextDouble();
            } catch (Exception e) {
                valido = false;
                System.out.println("Valor inválido. Utilize Valores numéricos!");
                entrada.nextLine();
            }
        } while (valido==false);

        return valor * cotacao;
    }
}