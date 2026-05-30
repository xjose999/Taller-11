abstract class Figura {
    // 1. Método abstracto (no lleva cuerpo {})
    public abstract double calcularArea();

    // 3. Método para mostrar el área usando el método abstracto
    public void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
    }
}