import javax.swing.JOptionPane;

public class AgenciaAutomoveis {
    public static void main(String[] args) {
        // Solicitar os dados do automóvel ao usuário
        String marca = JOptionPane.showInputDialog(null, "Digite a marca do automóvel:");
        String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do automóvel:");
        String anoStr = JOptionPane.showInputDialog(null, "Digite o ano de fabricação do automóvel:");
        int anoFabricacao = Integer.parseInt(anoStr); // Convertendo para inteiro

        // Criando um objeto Automovel com os dados informados pelo usuário
        Automovel carro = new Automovel(marca, modelo, anoFabricacao);

        // Exibindo as informações do automóvel em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, carro.getInfoAutomovel(), "Informações do Automóvel", JOptionPane.INFORMATION_MESSAGE);
    }
}
