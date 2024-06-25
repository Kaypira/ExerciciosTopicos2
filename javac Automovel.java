import javax.swing.JOptionPane;

public class Automovel {
    // Atributos
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private boolean motorLigado;

    // Construtor sem parâmetros (default)
    public Automovel() {
        // Valores padrão
        this.marca = "Marca não definida";
        this.modelo = "Modelo não definido";
        this.anoFabricacao = 0;
        this.motorLigado = false; // Motor começa desligado
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
        // Criando um objeto Automovel usando o construtor sem parâmetros
        Automovel carro = new Automovel();

        // Modificando o estado do automóvel (ligando o motor)
        carro.ligarMotor();

        // Exibindo as informações do automóvel em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, carro.getInfoAutomovel(), "Informações do Automóvel", JOptionPane.INFORMATION_MESSAGE);
    }
}
