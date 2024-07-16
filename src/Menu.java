import java.util.Scanner;

public class Menu {
    private int escolha;
    private String moeda1, moeda2;

    Scanner entrada = new Scanner(System.in);

    public void mostrar_menu() {
        escolha=-1;
        System.out.println("\nSeja bem-vindo/a ao Conversor de Moeda =)");
        System.out.println("\n*********************************************************************");
        System.out.println("""
                    -Menu:
                    
                    1) Real Brasileiro =>> Boliviano da Bolívia
                    2) Real Brasileiro =>> Peso argentino
                    3) Real Brasileiro =>> Peso chileno
                    4) Real Brasileiro =>> Peso colombiano
                    5) Real Brasileiro =>> Dólar
                    6) Boliviano da Bolívia =>> Real Brasileiro
                    7) Peso argentino =>> Real Brasileiro
                    8) Peso chileno =>> Real Brasileiro
                    9) Peso colombiano =>> Real Brasileiro
                    10) Dólar =>> Real Brasileiro
                    0) Sair""");
        System.out.println("*********************************************************************");

        while (escolha > 10 || escolha < 0) {
            try {
                System.out.println("\nEscolha uma opção válida:");
                escolha = entrada.nextInt();

                if (escolha > 10 || escolha < 0) {
                    System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Opção inválida!");
                entrada.nextLine();
            }
        }
    }

    public int getEscolha() {
        return escolha;
    }

    public String getMoeda1() {
        switch (escolha) {
            case 1, 2, 3, 4, 5: moeda1 = "BRL"; break;
            case 6: moeda1 = "BOB"; break;
            case 7: moeda1 = "ARS"; break;
            case 8: moeda1 = "CLP"; break;
            case 9: moeda1 = "COP"; break;
            case 10: moeda1 = "USD"; break;
        }
        return moeda1;
    }

    public String getMoeda2() {
        switch (escolha) {
            case 1: moeda2 = "BOB"; break;
            case 2: moeda2 = "ARS"; break;
            case 3: moeda2 = "CLP"; break;
            case 4: moeda2 = "COP"; break;
            case 5: moeda2 = "USD"; break;
            case 6, 7, 8, 9, 10: moeda2 = "BRL"; break;
        }
        return moeda2;
    }
}

