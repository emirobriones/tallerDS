public class DatabaseConnection {
    // Instancia única estática de la clase
    private static DatabaseConnection instancia;

    // Constructor privado para evitar instanciación directa con 'new'
    private DatabaseConnection() {
        System.out.println("-> Conectando a la base de datos central... [Instancia única creada]");
    }

    // Método público global para obtener la única instancia (Thread-safe básico)
    public static synchronized DatabaseConnection getInstancia() {
        if (instancia == null) {
            instancia = new DatabaseConnection();
        }
        return instancia;
    }

    // Método de ejemplo para consultas o actualizaciones
    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando en BD: " + consulta);
    }
}
