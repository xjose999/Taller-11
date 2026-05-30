// 2. Clase derivada Gerente
class Gerente extends Empleado {
    double salarioBase;
    double bono;

    public double calcularSalario() {
        return salarioBase + bono;
    }
}