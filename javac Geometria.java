// SuperClasse Figura
abstract class Figura {
    // Método abstrato para calcular a área
    public abstract double calcularArea();
}
// SubClasse Quadrado
class Quadrado extends Figura {
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Método para calcular a área do quadrado
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
// SubClasse Retangulo
class Retangulo extends Figura {
    private double base;
    private double altura;

    // Construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular a área do retângulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
// SubClasse Triangulo
class Triangulo extends Figura {
    private double base;
    private double altura;

    // Construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular a área do triângulo
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
// Classe Geometria com o método main
public class Geometria {
    public static void main(String[] args) {
        // Criando objetos das figuras geométricas
        Figura figura1 = new Quadrado(5); // Quadrado de lado 5
        Figura figura2 = new Retangulo(4, 6); // Retângulo de base 4 e altura 6
        Figura figura3 = new Triangulo(3, 7); // Triângulo de base 3 e altura 7

        // Calculando as áreas
        double areaFigura1 = figura1.calcularArea();
        double areaFigura2 = figura2.calcularArea();
        double areaFigura3 = figura3.calcularArea();

        // Exibindo os resultados no console
        System.out.println("Área da Figura 1: " + areaFigura1);
        System.out.println("Área da Figura 2: " + areaFigura2);
        System.out.println("Área da Figura 3: " + areaFigura3);
    }
}
