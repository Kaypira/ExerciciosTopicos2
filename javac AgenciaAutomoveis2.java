import javax.swing.JOptionPane;

public class AgenciaAutomoveis {
    public static void main(String[] args) {
        // Variável para armazenar os automóveis cadastrados
        StringBuilder listaAutomoveis = new StringBuilder();

        // Variável para controlar a quantidade de automóveis cadastrados
        int quantidadeAutomoveis = 0;

        // Loop para cadastrar vários automóveis
        while (true) {
            // Solicitar os dados do automóvel ao usuário
            String marca = JOptionPane.showInputDialog(null, "Digite a marca do automóvel (ou digite 'fim' para encerrar):");
            
            // Verificar se o usuário deseja encerrar o cadastro
            if (marca == null || marca.equalsIgnoreCase("fim")) {
                break;
            }
            
            String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do automóvel:");
            String anoStr = JOptionPane.showInputDialog(null, "Digite o ano de fabricação do automóvel:");
            int anoFabricacao = Integer.parseInt(anoStr); // Convertendo para inteiro

            // Criando um objeto Automovel com os dados informados pelo usuário
            Automovel carro = new Automovel(marca, modelo, anoFabricacao);

            // Adicionando as informações do automóvel à lista
            listaAutomoveis.append("Automóvel ").append(quantidadeAutomoveis + 1).append(":\n");
            listaAutomoveis.append(carro.getInfoAutomovel()).append("\n\n");

            // Incrementando a quantidade de automóveis cadastrados
            quantidadeAutomoveis++;
        }

        // Exibindo todas as informações dos automóveis cadastrados em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, listaAutomoveis.toString(), "Lista de Automóveis Cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }
}
