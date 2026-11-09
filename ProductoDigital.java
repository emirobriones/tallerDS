public class ProductoDigital extends Producto {
    private double tamanoMB;      // En Megabytes
    private String formato;       // Ej: "PDF", "ZIP", "MP4"

    public ProductoDigital(String id, String nombre, double precio, double tamanoMB, String formato) {
        super(id, nombre, precio);
        this.tamanoMB = tamanoMB;
        this.formato = formato;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[Producto Digital] ID: " + id + " | Nombre: " + nombre + 
                           " | Precio: $" + precio + " | Tamaño: " + tamanoMB + "MB | Formato: " + formato);
    }
}
