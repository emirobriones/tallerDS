public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DEL SISTEMA DE PRODUCTOS (PATRONES CREACIONALES) ===");
        
        // 1. Probando el Patrón Singleton para el acceso a datos
        DatabaseConnection db1 = DatabaseConnection.getInstancia();
        DatabaseConnection db2 = DatabaseConnection.getInstancia();
        
        // Verificamos que sea exactamente la misma instancia
        System.out.println("¿db1 y db2 son la misma instancia de BD? " + (db1 == db2));
        db1.ejecutarConsulta("SELECT * FROM productos");
        
        System.out.println("\n------------------------------------------------------------\n");
        
        // 2. Probando el Patrón Factory Method para la creación dinámica de productos
        // Creando un producto físico (ID, Nombre, Precio, Peso, Dimensiones)
        Producto prod1 = ProductoFactory.crearProducto("FISICO", "P001", "Libro de Programación", 25.50, 0.8, "20x15x3 cm");
        
        // Creando un producto digital (ID, Nombre, Precio, Tamaño MB, Formato)
        Producto prod2 = ProductoFactory.crearProducto("DIGITAL", "P002", "E-Book Arquitectura Software", 15.00, 12.5, "PDF");
        
        // Mostrando detalles de los productos creados
        prod1.mostrarDetalles();
        prod2.mostrarDetalles();
    }
}
