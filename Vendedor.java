// 2. Clase derivada Vendedor
class Vendedor extends Empleado {
    double sueldoBasico;
    double comision;

    public double calcularSalario() {
        return sueldoBasico + comision;
    }
}
