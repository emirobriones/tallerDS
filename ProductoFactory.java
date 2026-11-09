public class ProductoFactory {

    // Método fábrica que decide en tiempo de ejecución qué objeto crear
    public static Producto crearProducto(String tipo, String id, String nombre, double precio, double valor1, String valor2) {
        if (tipo == null) {
            return null;
        }
        
        // Dependiendo del tipo, retorna la instancia concreta correspondiente
        if (tipo.equalsIgnoreCase("FISICO")) {
            // valor1 = peso (kg), valor2 = dimensiones (ej: "10x20x5 cm")
            return new ProductoFisico(id, nombre, precio, valor1, valor2);
            
        } else if (tipo.equalsIgnoreCase("DIGITAL")) {
            // valor1 = tamaño (MB), valor2 = formato (ej: "PDF", "ZIP")
            return new ProductoDigital(id, nombre, precio, valor1, valor2);
        }
        
        throw new IllegalArgumentException("Tipo de producto desconocido: " + tipo);
    }
}
