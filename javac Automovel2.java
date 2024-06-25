import javax.swing.JOptionPane;

public class Automovel {
    // Atributos
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private boolean motorLigado;

    // Construtor com todos os parâmetros
    public Automovel(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.motorLigado = true; // Motor é inicializado como ligado
    }

    // Métodos para alterar o estado do motor
    public void ligarMotor() {
        this.motorLigado = true;
    }

    public void desligarMotor() {
        this.motorLigado = false;
    }

    // Método para obter informações do automóvel
    public String getInfoAutomovel() {
        String estadoMotor = this.motorLigado ? "Ligado" : "Desligado";
        return "Marca: " + this.marca + "\n" +
               "Modelo: " + this.modelo + "\n" +
               "Ano de Fabricação: " + this.anoFabricacao + "\n" +
               "Estado do Motor: " + estadoMotor;
    }

    // Método main para execução do programa
    public static void main(String[] args) {
        // Criando um objeto Automovel usando o construtor com parâmetros
        Automovel carro = new Automovel("Toyota", "Corolla", 2023);

        // Exibindo as informações do automóvel em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, carro.getInfoAutomovel(), "Informações do Automóvel", JOptionPane.INFORMATION_MESSAGE);
    }
}
