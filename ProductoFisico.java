public class ProductoFisico extends Producto {
    private double peso;          // En kilogramos
    private String dimensiones;   // Ej: "10x20x5 cm"

    public ProductoFisico(String id, String nombre, double precio, double peso, String dimensiones) {
        super(id, nombre, precio);
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[Producto Físico] ID: " + id + " | Nombre: " + nombre + 
                           " | Precio: $" + precio + " | Peso: " + peso + "kg | Dimensiones: " + dimensiones);
    }
}
