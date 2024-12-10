import java.io.IOException;

public interface Sistema {
    /**
     * Genera un menu para acceder a los métodos y lectura de archivo
     * @throws IOException
     */
    public void menu() throws IOException;

    /**
     * agrega un instrumento a un contenedor
     */
    public void agregarInstrumento();

    /**
     * reduce el stock de un instrumento y genera una boleta
     */
    public void venderInstrumento();

    /**
     * Accede al inventario y imprime los datos de un instrumento
     */
    public void consultarInventario();

    /**
     * guarda las modificaciones y cierra el programa
     * @throws IOException
     */
    public void cerrar() throws IOException;

    /**
     * lectura de archivo csv
     */
   public void procesarArchivo();

    /**
     * genera una boleta
     * @param operacion
     * @param nombre
     * @param precio
     * @param codigo
     */
    public void generarBoleta(int operacion, String nombre, int precio, String codigo);
}
