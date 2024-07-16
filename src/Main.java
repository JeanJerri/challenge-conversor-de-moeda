public class Main {
    public static void main(String[] args) {
        int escolha = -1;
        double resultado;

        Menu menu = new Menu();

        while (escolha != 0) {
            menu.mostrar_menu();
            escolha = menu.getEscolha();

            if (escolha != 0) {
                try {
                    Moedas moedas = new Moedas(menu.getMoeda1(), menu.getMoeda2());

                    Conversao conversao = new Conversao(moedas.obterCotacao());
                    resultado = conversao.realizarConversao();

                    System.out.printf("\nValor %.2f [%s] corresponde ao valor final de =>>> %.2f [%s]\n",
                            conversao.getValor(), menu.getMoeda1(), resultado, menu.getMoeda2());
                } catch (Exception e) {
                    System.out.println("Erro ao obter dados da API.");
                }
            }
        }
        System.out.println("Saindo do programa...");
    }
}