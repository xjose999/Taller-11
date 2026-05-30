// 2. Clase derivada Circulo
class Circulo extends Figura {
    double radio;

    public double calcularArea() {
        return 3.1416 * radio * radio;
    }
}