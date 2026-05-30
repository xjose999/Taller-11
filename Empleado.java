abstract class Empleado {
    String nombre;

    // 1. Método abstracto (sin cuerpo)
    public abstract double calcularSalario();

    // 3. Método para mostrar detalles usando calcularSalario
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
}